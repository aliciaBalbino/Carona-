package com.example.exercicio10sd.controller;

import com.example.exercicio10sd.model.Carona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController()
public class CaronaController {

    private List<Carona> muralDeCaronas = new ArrayList<>();

    @PostMapping("/oferecer")
    public String oferecerCarona (@RequestParam String motorista, @RequestParam String destino){

        Carona c = new Carona();
        c.setMotorista(motorista);
        c.setDestino(destino);

    muralDeCaronas.add(c);
    return "<html><body style='font-family:sans-serif; text-align:center; padding:50px;'>" +
            "<h1>✅ Carona publicada!</h1>" +
            "<p>Obrigado, " + motorista + ". Seu anúncio já está no sistema distribuído.</p>" +
            "<a href='/index.html'>Voltar para o início</a>" +
            "</body></html>";
    }

    @GetMapping("/mural")
    public ModelAndView verMural (){
        ModelAndView mv = new ModelAndView("mural");
        mv.addObject("caronas", muralDeCaronas);
        return mv;

    }
}
