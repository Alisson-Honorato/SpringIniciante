package honorato.alisson.SpringIniciante.Works;

import java.util.List;

import honorato.alisson.SpringIniciante.Profissional.ProfissionalModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_works")
public class WorkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    private int salario;

    // @OneToMany - Um trabalho pode ter varios profissionais
    @OneToMany(mappedBy = "works")
    private List<ProfissionalModel> profisionais;

    
}

