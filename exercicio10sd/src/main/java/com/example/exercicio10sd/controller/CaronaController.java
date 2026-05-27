package com.example.exercicio10sd.controller;

import com.example.exercicio10sd.model.Carona;
import com.example.exercicio10sd.repository.CaronaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class CaronaController {

    @Autowired
    private  CaronaRepository repository;

    @PostMapping("/oferecer")
    public String oferecerCarona (@RequestParam String motorista, @RequestParam String destino){

        Carona c = new Carona();
        c.setMotorista(motorista);
        c.setDestino(destino);

        repository.save(c);
        return "redirect:/mural";
    }

    @PostMapping("/salvar")
    public String salvar (@ModelAttribute Carona carona){

        repository.save(carona);
    return "redirect:/mural";

    }

    @GetMapping("/mural")
    public ModelAndView verMural (){
        ModelAndView mv = new ModelAndView("mural");
        mv.addObject("caronas", repository.findAll());
        return mv;

    }

    @GetMapping("/deletar/{id}")
    public String deletarCarona (@PathVariable Long id) {

        repository.deleteById(id);
        return "redirect:/mural";
    }

    @GetMapping("/")
    public ModelAndView abrirIndex(@RequestParam(required = false) Long id) {
        ModelAndView mv = new ModelAndView("index");
        if (id != null) {
            mv.addObject("carona", repository.findById(id).get());
        } else {
            mv.addObject("carona", new Carona());
        }
        return mv;
    }

}
