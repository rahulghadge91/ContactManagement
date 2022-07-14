package com.deloitte.contactmanagement.entity;

import lombok.Data;

import java.util.List;

@Data
public class UserDataDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String password;
}
