package com.ashokit.persistance;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDtlsRepository extends JpaRepository<ContactDtlsEntity,Serializable>{

}
