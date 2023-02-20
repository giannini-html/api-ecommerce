package br.com.magnus.magnus.giannini.dao;

import br.com.magnus.magnus.giannini.entity.Conta;
import br.com.magnus.magnus.giannini.entity.TipoConta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoContaRepository extends JpaRepository<TipoConta, Long> {

}
