package br.com.exemplo.repositorio;

import br.com.exemplo.entidades.Documento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepositorio extends JpaRepository<Documento,Long> {

}
