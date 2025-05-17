package com.app.accounting.authentication.utils;

import com.app.accounting.commons.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TokenGenerator {


    public String getToken(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Constants.Token.PREFIX);
        stringBuilder.append(Constants.Token.STARTING);
        for (int i =0; i < Constants.Token.LENGTH; i++){
            stringBuilder.append(
                    Constants.Token.ACCEPTABLE_CHARACTERS.charAt(
                            new Random(Constants.Token.LENGTH).nextInt()
                    )
            );
        }
        stringBuilder.append(Constants.Token.POSTFIX);
        return stringBuilder.toString();
    }
}
