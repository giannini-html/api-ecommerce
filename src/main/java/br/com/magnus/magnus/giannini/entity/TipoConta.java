package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "TIPO_CONTA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_tipo;
    private String nome_tipo;
}
