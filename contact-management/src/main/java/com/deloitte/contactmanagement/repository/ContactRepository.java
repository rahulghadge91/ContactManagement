package com.deloitte.contactmanagement.repository;

import com.deloitte.contactmanagement.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author raghadge
 */
public interface ContactRepository extends JpaRepository<Contact,Long> {
    List<Contact> findAll();
    List<Contact> findByUserid(Long userid);
}
