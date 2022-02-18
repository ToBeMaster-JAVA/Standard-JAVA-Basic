# 11. 컬렉션 프레임웍(collections framework)



[관련 velog 주소](https://velog.io/@mandarin913/Java-11-%EC%BB%AC%EB%A0%89%EC%85%98-%ED%94%84%EB%A0%88%EC%9E%84%EC%9B%8D)



## ArrayList 예제

```java
import java.util.*;

class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));
        
        ArrayList list2 = new ArrayList(list1.subList(1,4)); //[4, 2, 0]
        print(list1, list2);
        
        Collections.sort(list1); // [0, 1, 2, 3, 4, 5]
        Collections.sort(list2); // [0, 2, 4]
        print(list1, list2);
        
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // true
        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 인덱스가 3인 곳에 "A"를 추가
        print(list1, list2); //list1 = [0, 1, 2, 3, 4, 5], list2=[0, 2, 4, A, B, C]
        list2.set(3, "AA"); // 인덱스가 3인 곳을 "AA"로 변경
        print(list1, list2); //list1 = [0, 1, 2, 3, 4, 5], list2=[0, 2, 4, AA, B, C]
        
       //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1, list2); //list1 = [0, 2, 4], list2=[0, 2, 4, AA, B, C]
        
        // list2에서 list1에 포함된 객체들을 삭제한다
        for(int i=list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i) // 인덱스가 i인 곳에 저장된 요소를 삭제
        }
        print(list1, list2); //list1 = [0, 2, 4], list2=[AA, B, C]
    }
    
    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
```



## Stack과 Queue예제

```java
import java.util.*;

class Ex11_2 {
    public static void main(String[] args) {
		Stack st = new Stack(); // Stack을 구현하기 위해 Stack 사용
        Queue q = new LiskedList(); // Queue를 구현하기 위해 LinkedList 사용
        
        // stack에 데이터 넣기
        st.push("0");
        st.push("1");
        st.push("2");
        
        // queue에 데이터 넣기
        q.offer("0");
        q.offer("1");
        q.offer("2");
        
        System.out.println("= Stack =");
        while(!st.empty()) {
            System.out.println(st.pop()); // 스택에서 요소 하나를 꺼내서 출력
        }
        
        System.out.println("= Queue =");
        while(!q.isEmpty()) {
            System.out.println(q.poll()); // 큐에서 요소 하나를 꺼내서 출력
        }
    }
}
```



## Stack과 Queue의 활용 예제1

```java
import java.util.*;

class Ex11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:java Ex11_3 \"EXPRESSION\"");
            System.out.println("Example:java Ex11_3 \"((2+3)*1)+3\"");
            System.exit(0);
        }
        
        Stack st = new Stack();
        String expression = args[0];
        
        System.out.println("expression:" + expression);
        
        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                
                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }
            
            if (st.isEmpty()) {
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
        } catch (EmptyStackException e) {
            System.out.println("괄호가 일치하지 않습니다.")
        }
    }
}
```



## Stack과 Queue의 활용 예제2

```java
import java.util.*;

class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        
        while(true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();
                
                if("".equals(input)) continue;
                
                if(input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE +"개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
                    int i=0;
                    save(input); // 입력받은 명령어를 저장하고,
                    
                    LinkedList tmp = (LinkedList)q; //LinkedList의 내용을 보여줌
                    ListIterator it = tmp.listIterator();
                    
                    while(it.hasNext())
                        System.out.println(++i+"."+it.next());
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch(Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }
    
    public static void save(String input) { 
        // queue에 저장한다
        if(!"".equals(input))
            q.offer(input);
        
        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제
        if(q.size() > MAX_SIZE)
            q.remove();
    }
}
```



## Iterator, ListIterator, Enumeration 예제

```java
import java.util.*;

class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        
        Iterator it = list.iterator();
        
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
```



## Arrays의 메서드 예제

```java
import java.util.*;

class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};
        
        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arr2D="+Arrays.deepToString(arr2D));
        
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);
        
        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr3="+Arrays.toString(arr3));
        System.out.println("arr4="+Arrays.toString(arr4));
        System.out.println("arr5="+Arrays.toString(arr5));
        System.out.println("arr6="+Arrays.toString(arr6));
        
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9); // arr=[9, 9, 9, 9, 9]
        System.out.println("arr7="+Arrays.toString(arr7));
        
        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
        System.out.println("arr7="+Arrays.toString(arr7));
        
        for(int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }
        
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        
        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));
        
        char[] chArr = {'A', 'D', 'C', 'B', 'E'};
        
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
        System.out.println("= After sorting =");
        Arrays.sort(chArr);
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));
    }
}
```

