package com.dev.api_ecommerce.dto;

public record ClienteResponse(
        Long id,
        String nome,
        String email,
        String cpf,
        Long endereco
) {
}
