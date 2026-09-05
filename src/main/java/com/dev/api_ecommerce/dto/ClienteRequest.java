package com.dev.api_ecommerce.dto;

public record ClienteRequest(
        String nome,
        String email,
        String cpf,
        Long endereco
) {
}
