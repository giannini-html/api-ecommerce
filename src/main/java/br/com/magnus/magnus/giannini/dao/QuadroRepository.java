package br.com.magnus.magnus.giannini.dao;

import br.com.magnus.magnus.giannini.entity.Quadro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuadroRepository extends JpaRepository<Quadro, Long> {
}
