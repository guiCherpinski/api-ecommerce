package com.dev.api_ecommerce.repository;

import com.dev.api_ecommerce.entity.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Enderecos , Long> {
}
