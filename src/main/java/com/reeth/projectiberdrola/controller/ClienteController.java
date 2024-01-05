package com.reeth.projectiberdrola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.reeth.projectiberdrola.model.Client;
import com.reeth.projectiberdrola.service.ClientService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/clients")
public class ClienteController {

    @Autowired
    private ClientService service;

    @GetMapping
    public List<Client> getClients() {
        return service.getClients();
    }

    @PostMapping("/add")
    public void addClients(@RequestBody Client client) {
        try {
            service.addClients(client);
            System.out.println("Cliente agregado con éxito: " + client.toString());
        } catch (Exception e) {
            System.err.println("Error al agregar el cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @GetMapping("/{dni}")
    public ResponseEntity<Client> getClientByDni(@PathVariable Integer dni) {
        try {
            Client client = service.getClientByDni(dni);

            if (client != null) {
                return ResponseEntity.ok(client);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    @PutMapping("/{dni}")
    public void updateClients(@PathVariable("dni") Integer dni, @RequestBody Client client) {
        service.updateClients(dni, client);
    }

    @DeleteMapping("/{dni}/delete")
    public void deleteClients(@PathVariable("dni") Integer dni) {
        service.deleteClients(dni);
    }
}
