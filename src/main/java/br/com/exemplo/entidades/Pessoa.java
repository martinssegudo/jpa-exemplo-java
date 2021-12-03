package br.com.exemplo.entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "TB_PESSOA")
@SequenceGenerator(name = "PESSOA_SEQ",
                   sequenceName = "PESSOA_SEQ",
                   initialValue = 1, allocationSize = 1)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PESSOA_SEQ")
    @Column(name = "ID_PESSOA")
    private Long id;


    @Column(name = "DES_NOME")
    private String nome;

    @Column(name = "NUM_IDADE", nullable = true)
    private int idade;

    @Column(name = "IDF_SEXO")
    private String sexo;


    @OneToMany(cascade = {CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private List<Documento> documentos;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "ID_PESSOA")
    private Endereco endereco;

}
