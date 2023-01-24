package com.employee.society.repos;

import com.employee.society.entity.SocietyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocietyRepository extends JpaRepository<SocietyEntity, Long> {

}
