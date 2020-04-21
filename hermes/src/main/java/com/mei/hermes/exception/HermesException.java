package com.mei.hermes.exception;

public class HermesException extends RuntimeException{
    private static final long serialVersionUID = 400330208982435415L;

    public HermesException() {
        super();
    }

    public HermesException(String message) {
        super(message);
    }

    public HermesException(String message, Throwable cause) {
        super(message, cause);
    }

    public HermesException(Throwable cause) {
        super(cause);
    }

}
