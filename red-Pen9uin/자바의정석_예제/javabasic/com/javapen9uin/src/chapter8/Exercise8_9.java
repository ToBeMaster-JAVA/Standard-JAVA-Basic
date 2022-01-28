package com.javapen9uin.src.chapter8;

import java.lang.*;

class Exercise8_9 {
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
    }
} // end of class Exercise8_9


class UnsupportedFuctionException extends RuntimeException {
    final private int ERR_CODE;

    UnsupportedFuctionException(String msg, int err_code) {
        super(msg);
        ERR_CODE = err_code;
    }

    UnsupportedFuctionException(String msg) {
        this(msg, 100);
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
} // end of class UnsupportedFuctionException