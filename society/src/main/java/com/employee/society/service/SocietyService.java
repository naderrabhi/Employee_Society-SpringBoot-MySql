package com.employee.society.service;

import com.employee.society.entity.SocietyEntity;
import com.employee.society.repos.SocietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocietyService {

    @Autowired
    private SocietyRepository societyRepository;

    public SocietyEntity createSociety(SocietyEntity society){
        return societyRepository.save(society);
    }

    public List<SocietyEntity> getAllSociety(){
        return societyRepository.findAll();
    }

    public SocietyEntity getSocietyById(Long id){
        return societyRepository.findById(id).orElse(null);
    }

    public SocietyEntity updateSociety(Long id,SocietyEntity society){
        return societyRepository.save(society);
    }

    public void deleteSociety(Long id){
        societyRepository.deleteById(id);
    }
}
