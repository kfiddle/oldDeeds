package com.example.demo.repos;

import com.example.demo.models.Deed;
import org.springframework.data.repository.CrudRepository;

public interface DeedRepo extends CrudRepository<Deed, Long> {

}
