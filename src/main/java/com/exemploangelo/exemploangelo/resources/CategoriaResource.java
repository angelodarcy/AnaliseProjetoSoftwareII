package com.exemploangelo.exemploangelo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController /* Adiciona um anotação*/
@RequestMapping(value="/categorias") /* Adiciona um END Point*/
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET) /* Para esta ser uma função Rest é preciso associar ela é um método Request */
    public String listar() {
        return "Rest está funcionando";
    }
}
