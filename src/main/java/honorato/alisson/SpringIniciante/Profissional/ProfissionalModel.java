package honorato.alisson.SpringIniciante.Profissional;



import honorato.alisson.SpringIniciante.Works.WorkModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade DB 
// JPA = java Persistence API
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cadastro_de_profissionais")
public class ProfissionalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String profissão;
    private String email;
    private String gênero;
    private int data_nascimento;
    
    // @ManyToOn - Um profissional pode ter um trabalho
    @ManyToOne
    // Foreing Key ou Chave Estrangeira
    @JoinColumn(name = "works_id")   
    private WorkModel works; 
    
    
}
