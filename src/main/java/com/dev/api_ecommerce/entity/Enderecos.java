package com.dev.api_ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "enderecos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Enderecos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "rua",
            nullable = false,
            length = 150
    )
    private String rua;

    @Column(
            name = "numero",
            nullable = false,
            length = 20
    )
    private String numero;

    @Column(
            name = "cidade",
            nullable = false,
            length = 100
    )
    private String cidade;

    @Column(
            name = "estado",
            nullable = false,
            length = 2
    )
    private String estado;

    @Column(
            name = "cep",
            nullable = false,
            length = 10
    )
    private String cep;
}
