package com.cadastroUsuario.cadastroUsuario.identities;

import javax.persistence.*;

@Entity
@Table (name = "tb_department")
public class Department {

    private long id;
    private String nome;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setId(long id) {
        this.id = id;
    }


}
