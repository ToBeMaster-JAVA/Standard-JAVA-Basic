package week5;

public class Ex11 {
    public static void main() {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("err: " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간 확보 ㄱㄱ");
        } catch (MemoryException me) {
            System.out.println("err: " + me.getMessage());
            me.printStackTrace();
            System.out.println("다시 설치 ㄱㄱ");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치 공간 X");
        if (!enoughMemory())
            throw new MemoryException("메모리 X");
    }

    static void copyFiles() { }
    static void deleteTempFiles() { }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}