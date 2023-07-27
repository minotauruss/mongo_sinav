package com.sinav.mongo_sinav.modeller;


import jakarta.persistence.GeneratedValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "soru")
@AllArgsConstructor
public class Sorular {
    @Id
    @GeneratedValue
    private  int id;
    private  String baslik;
    private  String cevap1;
    private  String cevap2;
    private  String cevap3;
    private  String cevap4;
    private  String cevap5;
    private  String konu;

}
