package com.sinav.mongo_sinav.controller;


import com.sinav.mongo_sinav.modeller.Sorular;
import com.sinav.mongo_sinav.services.SoruService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
public class SorularController {

    private SoruService soruService;

    public SorularController(SoruService soruService) {
        this.soruService = soruService;
    }

    @PostMapping("/save")
    public String getSave(@RequestBody Sorular sorular){
        soruService.getSave(sorular);
        return "process was succesful";
    }


    @GetMapping("/sorular")
    public List<Sorular> getSorularList (){
        List<Sorular> soruList = soruService.getSorular();
        return  soruList;
    }

    @GetMapping("/soru/{id}")
    public Optional<Sorular> getSorularList (@PathVariable("id") int id){
        Optional<Sorular> soruOne = soruService.getSorularOne(id);
        return  soruOne;
    }

    @DeleteMapping("/delete/{id}")
    public String getDelete ( @PathVariable("id") int id){
        soruService.getDelete(id);
    return  "item was delete";
    }
}
