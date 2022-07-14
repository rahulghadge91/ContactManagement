package com.deloitte.contactmanagement.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author raghadge
 */
public enum Role implements GrantedAuthority {
    ROLE_ADMIN, ROLE_USER;

    public String getAuthority() {
        return name();
    }
}

