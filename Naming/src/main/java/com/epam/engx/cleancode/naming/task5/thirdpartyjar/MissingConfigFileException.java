package com.epam.engx.cleancode.naming.task5.thirdpartyjar;

public class MissingConfigFileException extends RuntimeException {
	final String message;
    public MissingConfigFileException(String s) {
        super(s);
        this.message = s;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
    
    
}
