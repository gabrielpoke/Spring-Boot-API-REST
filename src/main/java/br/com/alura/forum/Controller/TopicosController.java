package br.com.alura.forum.Controller;

import br.com.alura.forum.Controller.DTO.TopicoDTO;
import br.com.alura.forum.Models.Curso;
import br.com.alura.forum.Models.Topico;
import br.com.alura.forum.Repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(String nomeCurso){

        if(nomeCurso != null){
            List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
            return TopicoDTO.converter(topicos);
        }
        else{
            List<Topico> topicos = topicoRepository.findAll();
            return TopicoDTO.converter(topicos);
        }
    }
}
