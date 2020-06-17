package com.exemploangelo.exemploangelo.resources;

import com.exemploangelo.exemploangelo.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController /* Adiciona um anotação*/
@RequestMapping(value="/categorias") /* Adiciona um END Point*/
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET) /* Para esta ser uma função Rest é preciso associar ela é um método Request */
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);

        //Mudar o Retorno do método
        return lista;

    }
}
