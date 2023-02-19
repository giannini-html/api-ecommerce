package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "QUADRO")
@AllArgsConstructor
@NoArgsConstructor
public class Quadro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_quadro;
    private String nome;
    private Long altura;
    private Long largura;
    private Long preco;

}
