package honorato.alisson.SpringIniciante;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entity transforma uma classe em uma entidade DB 
// JPA = java Persistence API
@Entity
@Table(name = "Tb Cadastro de Profissionais")
public class ProfissionalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String profissão;
    private String email;
    private String gênero;
    private int data_nascimento;
   
   
    
    public ProfissionalModel() {
    }


    public ProfissionalModel(String nome, String profissão, String email, String gênero, int data_nascimento) {
        this.nome = nome;
        this.profissão = profissão;
        this.email = email;
        this.gênero = gênero;
        this.data_nascimento = data_nascimento;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getProfissão() {
        return profissão;
    }


    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getGênero() {
        return gênero;
    }


    public void setGênero(String gênero) {
        this.gênero = gênero;
    }


    public int getData_nascimento() {
        return data_nascimento;
    }


    public void setData_nascimento(int data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    

}
