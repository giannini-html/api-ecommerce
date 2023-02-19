package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity(name = "CARRINHO")
@Table(name = "CARRINHO")
@AllArgsConstructor
@NoArgsConstructor
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_carrinho;
    private Long preco;
    @ManyToOne
    private Usuario cli_cod;
    @OneToMany
    private List<Quadro> quadros;

}
