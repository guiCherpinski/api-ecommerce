package com.dev.api_ecommerce.repository;

import com.dev.api_ecommerce.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
