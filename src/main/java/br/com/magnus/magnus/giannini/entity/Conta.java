package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "CONTA")
@AllArgsConstructor
@NoArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_conta;
    private String login;
    private String senha;
    @ManyToOne
    @JoinColumn(nullable = false)
    private TipoConta tipo_conta;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Usuario usuario;
}
