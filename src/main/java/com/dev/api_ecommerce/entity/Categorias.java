package com.dev.api_ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "nome",
            nullable = false,
            length = 50
    )
    private String nome;
}
