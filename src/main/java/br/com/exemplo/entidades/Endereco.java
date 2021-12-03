package br.com.exemplo.entidades;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ENDERECO")
@SequenceGenerator(name = "ENDERECO_SEQ",
        sequenceName = "ENDERECO_SEQ",
        initialValue = 1, allocationSize = 1)
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENDERECO_SEQ")
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "DS_ENDERECO")
    private String endereco;
}
