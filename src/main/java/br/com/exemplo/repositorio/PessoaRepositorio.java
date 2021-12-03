package br.com.exemplo.repositorio;

import br.com.exemplo.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Long> {
}
