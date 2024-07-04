package com.parcial_1.parcial_1.dao;

import com.parcial_1.parcial_1.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeDao 
        extends JpaRepository<Bike,Long>{
    
}
