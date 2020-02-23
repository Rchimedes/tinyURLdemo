package com.lancewade.tinyurl.repositories;

import com.lancewade.tinyurl.models.Longurl;
import org.springframework.data.repository.CrudRepository;

public interface LongurlRepository extends CrudRepository<Longurl, Long> {
    Iterable<Longurl> findAll();
}
