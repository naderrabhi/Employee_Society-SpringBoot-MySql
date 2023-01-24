package com.employee.society.controller;

import com.employee.society.entity.SocietyEntity;
import com.employee.society.service.SocietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/societies")
public class SocietyController {

    @Autowired
    private SocietyService societyService;

    @PostMapping
    public SocietyEntity createSociety(@RequestBody SocietyEntity society){
        return societyService.createSociety(society);
    }

    @GetMapping
    public List<SocietyEntity> getAllSociety(){
        return societyService.getAllSociety();
    }

    @GetMapping("/{id}")
    public SocietyEntity getSocietyById(@PathVariable Long id){
        return societyService.getSocietyById(id);
    }

    @PutMapping("/{id}")
    public SocietyEntity updateSociety(@PathVariable Long id, @RequestBody SocietyEntity society){
        return societyService.updateSociety(id, society);
    }

    @DeleteMapping("/{id}")
    public void deleteSociety(@PathVariable Long id){
        societyService.deleteSociety(id);
    }
}
