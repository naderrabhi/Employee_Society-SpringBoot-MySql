package com.employee.society.service;

import com.employee.society.entity.EmployeeEntity;
import com.employee.society.entity.SocietyEntity;
import com.employee.society.repos.EmployeeRepository;
import com.employee.society.repos.SocietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private SocietyRepository societyRepository;

    public List<EmployeeEntity> findEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }

    public EmployeeEntity createEmployee(EmployeeEntity employee){
        if (employee.getSocietyId() != null){
            SocietyEntity society = societyRepository.findById(employee.getSocietyId()).orElse(null);
            employee.setSocietyId(society.getId());
        }
        return employeeRepository.save(employee);
    }

    public List<EmployeeEntity> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(Long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeEntity updateEmployee(Long id ,EmployeeEntity employee){
        EmployeeEntity existEmployee = employeeRepository.findById(id).orElse(null);
        if (existEmployee == null) {
            return null;
        }
        if (employee.getSocietyId() != null){
            SocietyEntity society = societyRepository.findById(employee.getSocietyId()).orElse(null);
            existEmployee.setSocietyId(society.getId());
        }
        existEmployee.setName(employee.getName());
        existEmployee.setEmail(employee.getEmail());
        return employeeRepository.save(existEmployee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
