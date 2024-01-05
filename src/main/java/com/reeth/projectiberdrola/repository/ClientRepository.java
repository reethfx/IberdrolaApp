package com.reeth.projectiberdrola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.reeth.projectiberdrola.model.Client;
 
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findAllByOrderByDniAsc();
 
}
