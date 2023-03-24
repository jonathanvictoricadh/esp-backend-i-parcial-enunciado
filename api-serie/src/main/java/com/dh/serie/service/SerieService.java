package com.dh.serie.service;

import com.dh.serie.model.Serie;
import com.dh.serie.repository.SerieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService {

    private final SerieRepository repository;


    public SerieService(SerieRepository repository) {
        this.repository = repository;
    }

    public List<Serie> getAll() {
        return repository.findAll();
    }

    public List<Serie> getSeriesBygGenre(String genre) {
        return repository.findAllByGenre(genre);
    }

    public String create(Serie serie) {
        repository.save(serie);
        return serie.getId();
    }
}
