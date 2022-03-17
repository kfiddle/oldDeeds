package com.example.demo;


import com.example.demo.models.Deed;
import com.example.demo.models.Person;
import com.example.demo.models.PersonOnDeed;
import com.example.demo.repos.DeedRepo;
import com.example.demo.repos.PODRepo;
import com.example.demo.repos.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    DeedRepo deedRepo;

    @Resource
    PersonRepo personRepo;

    @Resource
    PODRepo podRepo;


    @Override
    public void run(String... args) throws Exception {

        personRepo.saveAll(Arrays.asList(new Person("Baker John"), new Person("Baker Nancy"), new Person("Barnes Elias"),
                new Person("Bennett Elizabeth"), new Person("Bennett Samuel"), new Person("Boggs John"),
                new Person("Bogie James A"),
                new Person("Bogie Sally"),
                new Person("Breck Daniel"),
                new Person("Breck Daniel Jr"),
                new Person("Bronston Lucy h.w."),
                new Person("Bronston Thomas"),
                new Person("Bronston W. H."),
                new Person("Butler Francis"),
                new Person("ButlerThomas"),
                new Person("Chenault David A"),
                new Person("Chenault Josiah P"),
                new Person("Chenault Narcissa"),
                new Person("Chenault Susan"),
                new Person("Chenault Telletha"),
                new Person("Chenault Waller"),
                new Person(" Chenault William")));

        deedRepo.saveAll(Arrays.asList(new Deed(LocalDate.of(1793, 4, 2), 100),
                new Deed(LocalDate.of(1796, 4, 12), 147),
                new Deed(LocalDate.of(1797, 3, 7), 100),
                new Deed(LocalDate.of(1846, 1, 5), 241)));




    }
}
