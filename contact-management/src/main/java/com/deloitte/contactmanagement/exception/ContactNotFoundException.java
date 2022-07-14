package com.deloitte.contactmanagement.exception;

public class ContactNotFoundException extends RuntimeException {
    public ContactNotFoundException(Long id) {
        super("Could not found contact " + id);
    }
}
