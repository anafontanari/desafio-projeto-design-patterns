package spring_boot.desafio_projeto.clientregistration.controller;


import com.example.clientregistration.model.Cliente;
import com.example.clientregistration.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteClienteById(@PathVariable Long id) {
        clienteService.deleteById(id);
    }
}

