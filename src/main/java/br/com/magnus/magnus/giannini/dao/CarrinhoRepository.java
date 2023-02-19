package br.com.magnus.magnus.giannini.dao;

import br.com.magnus.magnus.giannini.entity.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
}
