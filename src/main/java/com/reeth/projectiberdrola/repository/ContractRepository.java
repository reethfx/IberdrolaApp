package com.reeth.projectiberdrola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.reeth.projectiberdrola.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
    List<Contract> findAllByOrderByIdAsc();
}
