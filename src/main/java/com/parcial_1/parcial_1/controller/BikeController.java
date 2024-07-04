package com.parcial_1.parcial_1.controller;

import com.parcial_1.parcial_1.domain.Bike;
import com.parcial_1.parcial_1.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bike")
public class BikeController {

    @Autowired
    private BikeService bikeservice;

    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = bikeservice.getBikes();
        model.addAttribute("bikes", lista);
        model.addAttribute("totalBikes", lista.size());

        return "bike/listado";
    }

    @GetMapping("/eliminar/{idBike}")
    public String eliminar(Bike bike) {
        bikeservice.delete(bike);
        return "redirect:/bike/listado";
    }
}
