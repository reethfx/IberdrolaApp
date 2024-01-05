package com.reeth.projectiberdrola.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reeth.projectiberdrola.model.Client;
import com.reeth.projectiberdrola.repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients() {
        return clientRepository.findAllByOrderByDniAsc();
    }

    public void addClients(Client client) {
        clientRepository.save(client);
    }

    public void updateClients(Integer dni, Client client) {
        if (clientRepository.existsById(dni)) {
            clientRepository.save(client);
    }
    }

    public void deleteClients(Integer dni) {
        clientRepository.deleteById(dni);
    }

    public Client getClientByDni(Integer dni) {
        return clientRepository.findById(dni).orElse(null);
    }
}
