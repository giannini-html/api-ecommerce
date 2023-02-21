package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarrinhoQuadroId implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carrinho_cod_carrinho", nullable = false, insertable = false, updatable = false)
    private Carrinho carrinho;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quadro_cod_quadro", nullable = false, insertable = false, updatable = false)
    private Quadro quadro;

}
