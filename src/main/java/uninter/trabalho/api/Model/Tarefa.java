package uninter.trabalho.api.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tarefa")

public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_entrega", nullable = false)
    private Date data_entrega;

    @Column(name = "responsavel", nullable = false)
    private String responsavel;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_entrega() {
        return data_entrega;
    }
    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }

    public String getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

}
