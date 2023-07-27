package com.sinav.mongo_sinav.services;

import com.sinav.mongo_sinav.modeller.Sorular;
import com.sinav.mongo_sinav.repository.SoruMongo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SoruService {

    private SoruMongo soruMongo;
    public SoruService(SoruMongo soruMongo) {
        this.soruMongo = soruMongo;

    }


    public  void getSave (Sorular sorular){
        soruMongo.save(sorular);

    }

    public List<Sorular> getSorular(){
        List<Sorular> sorularList =   soruMongo.findAll();
        return  sorularList;
    }


    public Optional<Sorular> getSorularOne(int id){
        Optional<Sorular> sorularOne =   soruMongo.findById(id);
        return  sorularOne;
    }

    public void getDelete(int id){
      soruMongo.deleteById(id);

    }
}
