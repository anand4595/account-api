package com.app.accounting.commons.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
public class ErrorCode{

    public static ErrorCode NULL_ATTRIBUTE = new ErrorCode(1, "The given attribute %s can't be null");


    private final Integer id;
    private final String message;

    public ErrorCode(Integer id, String message){
        this.id = id;
        this.message = message;
    }

}
