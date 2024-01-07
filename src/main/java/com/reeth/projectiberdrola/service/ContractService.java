package com.reeth.projectiberdrola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reeth.projectiberdrola.model.Contract;
import com.reeth.projectiberdrola.repository.ContractRepository;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> getContracts() {
        return contractRepository.findAllByOrderByIdAsc();
    }

    public void addContracts(Contract contract) {
        contractRepository.save(contract);
    }

    public void updateContracts(Integer id_contrato, Contract contract) {
        if (contractRepository.existsById(id_contrato)) {
            contractRepository.save(contract);
        }
    }

    public void deleteContracts(Integer id_contrato) {
        contractRepository.deleteById(id_contrato);
    }

    public Contract getContractById(Integer id_contrato) {
        return contractRepository.findById(id_contrato).orElse(null);
    }

}
