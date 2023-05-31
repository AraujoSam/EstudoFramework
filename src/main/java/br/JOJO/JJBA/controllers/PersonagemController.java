package br.JOJO.JJBA.controllers;

import br.JOJO.JJBA.models.Personagens;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/personagens")
public class PersonagemController {

        private static final List<Personagens> personagens = new ArrayList<Personagens>();

    public PersonagemController() {
       personagens.add(new Personagens("Jonathan Joestar",1,"Dio"));
       personagens.add(new Personagens("Joseph Joestar",2, "Pillar men"));
       personagens.add(new Personagens("Jotaro Kujo",3,"Dio"));
       personagens.add(new Personagens("Josuke Higashigata",4,"Yoshigaki Kira"));
       personagens.add(new Personagens("Giorno Giovanna",5,"Diavollo"));
       personagens.add(new Personagens("Joyline Kujo",6,"Pucci"));
    }

    @GetMapping
    public String getPersonnagens(Model model){

        model.addAttribute("personagens", personagens);
        return "personagens";
    }


}
