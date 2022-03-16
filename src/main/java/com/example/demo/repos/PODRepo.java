package com.example.demo.repos;

import com.example.demo.models.PersonOnDeed;
import org.springframework.data.repository.CrudRepository;

public interface PODRepo extends CrudRepository<PersonOnDeed, Long> {


}
