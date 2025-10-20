package uninter.trabalho.api.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import uninter.trabalho.api.Model.Tarefa;
import uninter.trabalho.api.Repository.TarefaRepository;

import java.util.List;

@RestController
public class TarefaController {
    @Autowired
    TarefaRepository tarefaRepository;

    @RequestMapping(
            value = "/",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Tarefa saveTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Tarefa> findAllTarefa() {
        return tarefaRepository.findAll();
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Tarefa findByIdTarefa(@PathVariable("id") int id) {
        return tarefaRepository.findById(id).orElseThrow(()->new NullPointerException("Nenhuma tarefa encontrada."));
    }

    @RequestMapping(
            value = "/",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Tarefa updateTarefa(@RequestBody Tarefa tarefa) {
        Tarefa entity = tarefaRepository.findById(tarefa.getId()).orElseThrow(()->new NullPointerException("Nenhuma tarefa encontrada."));
        entity.setNome(tarefa.getNome());
        entity.setData_entrega(tarefa.getData_entrega());
        entity.setResponsavel(tarefa.getResponsavel());
        return tarefaRepository.save(tarefa);
    }

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.DELETE
    )
    public void deleteTarefa(@PathVariable("id") int id) {
        tarefaRepository.deleteById(id);
    }
}
