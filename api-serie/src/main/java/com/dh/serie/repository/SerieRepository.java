package com.dh.serie.repository;

import com.dh.serie.model.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends MongoRepository<Serie, Long> {


    List<Serie> findAllByGenre(String genre);

}
