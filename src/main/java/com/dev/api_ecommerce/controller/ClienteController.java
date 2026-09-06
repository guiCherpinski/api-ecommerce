package com.dev.api_ecommerce.controller;

import com.dev.api_ecommerce.Service.ClienteService;
import com.dev.api_ecommerce.dto.ClienteRequest;
import com.dev.api_ecommerce.dto.ClienteResponse;
import com.dev.api_ecommerce.entity.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping()
    public ResponseEntity<ClienteResponse> cadastrarCliente(@RequestBody ClienteRequest cliente){
        ClienteResponse clienteResponse = clienteService.cadastrarCliente(cliente);
        return ResponseEntity.ok(clienteResponse);
    }

    @GetMapping()
    public ResponseEntity<List<ClienteResponse>> listarClientes(){
        return ResponseEntity.ok(clienteService.listarClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> buscarClientePorId(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.buscarClientePorId(id));
    }


}
