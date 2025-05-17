package com.app.accounting.user.models;

import com.app.accounting.commons.exceptions.ApplicationException;
import com.app.accounting.commons.exceptions.ErrorCode;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID id;
    private String email;
    private String password;

    public NullChecker nullChecker(){
        return new NullChecker(this);
    }

    public static class NullChecker {
        private final User user;
        private List<ErrorCode> errorCodes;

        public NullChecker(User user){
            this.user = user;
            this.errorCodes = new ArrayList<>();
        }
        private void addError(String attribute){
            this.errorCodes.add(new ErrorCode(ErrorCode.NULL_ATTRIBUTE.getId(),
                    String.format(ErrorCode.NULL_ATTRIBUTE.getMessage(), attribute)));
        }
        public NullChecker id(){
            if (user.getId() == null){
                this.addError("id");
            }
            return this;
        }

        public NullChecker password(){
            if(user.getPassword() == null){
                this.addError("password");
            }
            return this;
        }

        public NullChecker email() {
            if (user.getEmail() == null){
                this.addError("Email");
            }
            return this;
        }

        public void check(){
            if (!this.errorCodes.isEmpty()){
                throw new ApplicationException(errorCodes);
            }
        }
    }
}
