package com.dev.api_ecommerce.mapper;

import com.dev.api_ecommerce.dto.ClienteRequest;
import com.dev.api_ecommerce.dto.ClienteResponse;
import com.dev.api_ecommerce.entity.Clientes;
import com.dev.api_ecommerce.entity.Enderecos;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Clientes toEntity (ClienteRequest clienteRequest, Enderecos enderecos){
        return Clientes.builder()
                .nome(clienteRequest.nome())
                .email(clienteRequest.email())
                .cpf(clienteRequest.cpf())
                .enderecos(enderecos)
                .build();
    }

    public ClienteResponse toResponse (Clientes cliente){
        return new ClienteResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getCpf(),
                cliente.getEnderecos().getId()
        );
    }

    public List<ClienteResponse> toResponseList (List<Clientes> clientes){
        return clientes.stream().map(this :: toResponse).toList();
    }
}
