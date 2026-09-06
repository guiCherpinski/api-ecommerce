package com.dev.api_ecommerce.Service;

import com.dev.api_ecommerce.dto.ClienteRequest;
import com.dev.api_ecommerce.dto.ClienteResponse;
import com.dev.api_ecommerce.entity.Cliente;
import com.dev.api_ecommerce.entity.Enderecos;
import com.dev.api_ecommerce.mapper.ClienteMapper;
import com.dev.api_ecommerce.repository.ClienteRepository;
import com.dev.api_ecommerce.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteMapper clienteMapper;
    private final ClienteRepository clienteRepository;
    private final EnderecoRepository enderecoRepository;

    public ClienteService(ClienteMapper clienteMapper, ClienteRepository clienteRepository,  EnderecoRepository enderecoRepository) {
        this.clienteMapper = clienteMapper;
        this.clienteRepository = clienteRepository;
        this.enderecoRepository = enderecoRepository;
    }

    public ClienteResponse cadastrarCliente(ClienteRequest clienteRequest){
        if (!enderecoRepository.existsById(clienteRequest.endereco())){
            throw new RuntimeException("id de endereço não encontrado");
        }

        Enderecos endereco = enderecoRepository.findById(clienteRequest.endereco()).orElseThrow(() -> new RuntimeException("Id não encontrado"));

        Cliente entity = clienteMapper.toEntity(clienteRequest, endereco);
        entity = clienteRepository.save(entity);
        return clienteMapper.toResponse(entity);
    }
}
