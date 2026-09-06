package com.dev.api_ecommerce.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "data_pedido",
            nullable = false
    )
    private LocalDate dataPedido;

    @Column(
            name = "status",
            nullable = false,
            length = 30
    )
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
