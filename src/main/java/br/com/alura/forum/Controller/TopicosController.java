package br.com.alura.forum.Controller;

import br.com.alura.forum.Controller.DTO.TopicoDTO;
import br.com.alura.forum.Models.Curso;
import br.com.alura.forum.Models.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(){
        Topico topico = new Topico("Duvidas","Duvidas com curso de spring",new Curso("Spring","Progamação"));

        return TopicoDTO.converter(Arrays.asList(topico,topico,topico));
    }
}
