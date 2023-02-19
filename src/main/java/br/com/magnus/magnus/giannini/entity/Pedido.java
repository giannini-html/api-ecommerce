package br.com.magnus.magnus.giannini.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name = "CARRINHO_QUADRO")
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    @Id
    private Long CARRINHO_cod_carrinho;
    @Id
    private Long QUADRO_cod_quadro;

}
