package honorato.alisson.SpringIniciante.Works;

import java.util.List;

import honorato.alisson.SpringIniciante.Profissional.ProfissionalModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_works")
public class WordModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    private int salario;

    // @OneToMany - Um trabalho pode ter varios profissionais
    @OneToMany(mappedBy = "works")
    private List<ProfissionalModel> profisionais;

    
    public WordModel() {
    }


    public WordModel(Long id, String name, int salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getSalario() {
        return salario;
    }


    public void setSalario(int salario) {
        this.salario = salario;
    }

}

