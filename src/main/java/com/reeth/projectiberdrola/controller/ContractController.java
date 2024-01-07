package com.reeth.projectiberdrola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.reeth.projectiberdrola.model.Contract;
import com.reeth.projectiberdrola.service.ContractService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    private ContractService service;

    @GetMapping
    public List<Contract> getContracts() {
        return service.getContracts();
    }

    @PostMapping("/add")
    public void addContracts(@RequestBody Contract contract) {
        try {
            service.addContracts(contract);
            System.out.println("Cliente agregado con éxito: " + contract.toString());
        } catch (Exception e) {
            System.err.println("Error al agregar el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contract> getContractById(@PathVariable Integer id) {
        try {
            Contract contract = service.getContractById(id);
            if (contract != null) {
                return ResponseEntity.ok(contract);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Contract> getContractToDelete (@PathVariable Integer id) {
        try {
            Contract contract = service.getContractById(id);

            if (contract != null) {
                return ResponseEntity.ok(contract);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    @PutMapping("/{id}")
    public void updateContracts(@PathVariable("id") Integer id, @RequestBody Contract contract) {
        service.updateContracts(id, contract);
    }

    @DeleteMapping("delete/{id}")
    public void deleteContracts(@PathVariable("id") Integer id) {
        service.deleteContracts(id);
    }
}
