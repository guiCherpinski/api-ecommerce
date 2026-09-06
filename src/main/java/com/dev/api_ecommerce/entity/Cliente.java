package com.dev.api_ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "nome",
            nullable = false,
            length = 100
    )
    private String nome;

    @Column(
            name = "email",
            nullable = false,
            length = 100,
            unique = true
    )
    private String email;

    @Column(
            name = "cpf",
            nullable = false,
            length = 14,
            unique = true
    )
    private String cpf;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id")
    private Enderecos enderecos;
}
