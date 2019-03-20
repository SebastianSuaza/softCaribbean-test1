package com.softcaribbean.test1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softcaribbean.test1.domain.ThomCliente;

@Repository
public interface ThomClienteDao extends JpaRepository<ThomCliente, Long> {

}
