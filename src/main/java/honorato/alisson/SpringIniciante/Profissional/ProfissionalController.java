package honorato.alisson.SpringIniciante.Profissional;


import java.beans.JavaBean;
import java.util.List;
import java.util.ArrayList ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@JavaBean
@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

    private List<ProfissionalModel> lista = new ArrayList<>();
    
    @GetMapping
    public List<ProfissionalModel> listarProfissionais() {
        return lista;
    }

    @PostMapping
    public String adicionarProfissional (@RequestBody ProfissionalModel profissional){
        lista.add(profissional);
        return "Profissional adicionado: " + profissional.getNome();
    }

}
