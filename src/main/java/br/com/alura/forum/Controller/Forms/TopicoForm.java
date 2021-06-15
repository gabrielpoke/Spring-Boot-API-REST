package br.com.alura.forum.Controller.Forms;

import br.com.alura.forum.Models.Curso;
import br.com.alura.forum.Models.Topico;
import br.com.alura.forum.Repository.CursoRepository;
import br.com.alura.forum.Repository.TopicoRepository;

public class TopicoForm {

    private String titulo;
    private String mensagem;
    private String nomeCurso;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository repository) {

        Curso curso = repository.findByNome(nomeCurso);

        return new Topico(titulo,mensagem,curso);
    }
}
