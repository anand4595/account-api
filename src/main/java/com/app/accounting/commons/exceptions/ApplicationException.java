package com.app.accounting.commons.exceptions;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ApplicationException extends RuntimeException{
    private final List<ErrorCode> errorCodes;

    public ApplicationException(ErrorCode errorCode){
       errorCodes = new ArrayList<>(){
           {
               add(errorCode);
           }
       };
    }

    public ApplicationException(Integer id, String message){
        this(new ErrorCode(id, message));
    }

    public ApplicationException(List<ErrorCode> errorCodes){
        this.errorCodes = errorCodes;
    }


}
