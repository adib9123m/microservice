package serviceclient.client.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import serviceclient.client.entities.Client;
import serviceclient.client.repository.ClientRepository;

import java.util.List;

public class ClientController {
    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/clients")
    public List findAll() {
        return clientRepository.findAll();
    }
    @GetMapping("/client/{id}")
 public Client findById (@PathVariable Long id) throws Exception{
         return this.clientRepository.findById(id).orElseThrow(()-> new
                Exception("Client inexistnt"));
         }

}

