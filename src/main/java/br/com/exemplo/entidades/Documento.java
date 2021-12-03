package br.com.exemplo.entidades;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_DOCUMENTO")
@SequenceGenerator(name = "DOCUMENTO_SEQ",
        sequenceName = "DOCUMENTO_SEQ",
        initialValue = 1, allocationSize = 1)
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOCUMENTO_SEQ")
    @Column(name = "ID_DOCUMENTO")
    private Long id;

    @Column(name = "DS_TIPO")
    private String tipo;
    @Column(name = "DS_NUMERO")
    private String numero;
}
