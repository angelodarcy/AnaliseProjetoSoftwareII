package com.exemploangelo.exemploangelo.domain;

import java.io.Serializable;
import java.util.Objects;

public class Categoria implements Serializable {

    // Criar os Atributos Básicos
    private Integer id;
    private String nome;

    // Associações

    // Construtores
    public Categoria () {

    }

    // Atalho ALT+Insert
    public Categoria(Integer id, String nome) {
        super();
        this.id = id;
        this.nome = nome;
    }

    //Getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //hashCode e equals (implementação padrão: somente id)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
