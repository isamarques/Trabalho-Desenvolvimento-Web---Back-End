package uninter.trabalho.api.Repository;

import org.hibernate.Internal;
import org.hibernate.type.internal.ImmutableNamedBasicTypeImpl;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import uninter.trabalho.api.Model.Tarefa;

import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
