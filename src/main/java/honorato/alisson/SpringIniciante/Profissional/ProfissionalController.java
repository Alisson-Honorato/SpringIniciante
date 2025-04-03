package honorato.alisson.SpringIniciante.Profissional;


import java.beans.JavaBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@JavaBean

public class ProfissionalController {

    @GetMapping("/boasvindas")

    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota, ai ai essa porta fica dando erro toda hora, tenho que ficar matando toda hora o processo da porta 8080, por que fica sempre aberta.";
    }

}
