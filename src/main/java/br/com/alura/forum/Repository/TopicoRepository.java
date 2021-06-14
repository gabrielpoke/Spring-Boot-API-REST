package br.com.alura.forum.Repository;

import br.com.alura.forum.Models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
