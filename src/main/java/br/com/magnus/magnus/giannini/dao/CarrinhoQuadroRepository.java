package br.com.magnus.magnus.giannini.dao;

import br.com.magnus.magnus.giannini.entity.Carrinho;
import br.com.magnus.magnus.giannini.entity.CarrinhoQuadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoQuadroRepository extends JpaRepository<CarrinhoQuadro, Long> {
}
