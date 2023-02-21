package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "CARRINHO_QUADRO")
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CarrinhoQuadroId.class)
public class CarrinhoQuadro {

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "carrinho_cod_carrinho", nullable = false, insertable = false, updatable = false)
    private Carrinho carrinho;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "quadro_cod_quadro", nullable = false, insertable = false, updatable = false)
    private Quadro quadro;

}
