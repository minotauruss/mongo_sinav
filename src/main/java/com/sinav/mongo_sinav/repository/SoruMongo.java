package com.sinav.mongo_sinav.repository;

import com.sinav.mongo_sinav.modeller.Sorular;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SoruMongo extends MongoRepository<Sorular,Integer> {
}
