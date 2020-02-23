package com.lancewade.tinyurl.services;


import com.lancewade.tinyurl.repositories.LongurlRepository;
import org.springframework.stereotype.Service;

@Service
public class LongurlService {
    private final LongurlRepository longurlRepository;

    public LongurlService(LongurlRepository longurlRepository) {
        this.longurlRepository = longurlRepository;
    }
}
