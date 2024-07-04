package com.parcial_1.parcial_1.service;

import com.parcial_1.parcial_1.dao.BikeDao;
import com.parcial_1.parcial_1.domain.Bike;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeServiceImpl implements BikeService {

    @Autowired
    private BikeDao bikedao;
    
    @Override
    public List<Bike> getBikes() {
        var lista = bikedao.findAll();

        return lista;
    }

    @Override
    public Bike getBike(Bike bike) {
        return bikedao.findById(bike.getIdBike()).orElse(null);
    }

    @Override
    public void save(Bike bike) {
        bikedao.save(bike);
    }

    @Override
    public void delete(Bike bike) {
        bikedao.delete(bike);
    }
}
