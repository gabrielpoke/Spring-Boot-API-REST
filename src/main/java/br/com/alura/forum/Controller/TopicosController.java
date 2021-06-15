package br.com.alura.forum.Controller;

import br.com.alura.forum.Controller.DTO.TopicoDTO;
import br.com.alura.forum.Controller.Forms.TopicoForm;
import br.com.alura.forum.Models.Curso;
import br.com.alura.forum.Models.Topico;
import br.com.alura.forum.Repository.CursoRepository;
import br.com.alura.forum.Repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
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

    @PostMapping
    public void cadastrar(@RequestBody TopicoForm form){

        Topico topico = form.converter(cursoRepository);
        topicoRepository.save(topico);
    }
}
