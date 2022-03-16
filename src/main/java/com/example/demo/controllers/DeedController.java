package com.example.demo.controllers;


import com.example.demo.models.Deed;
import com.example.demo.repos.DeedRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Collection;

@Controller
public class DeedController {

    @Resource
    DeedRepo deedRepo;

    @RequestMapping("/get-all-deeds")
    public Collection<Deed> getAllDeeds() {
        return (Collection<Deed>) deedRepo.findAll();
    }


}
