package com.parcial_1.parcial_1.service;

import com.parcial_1.parcial_1.domain.Bike;
import java.util.List;

public interface BikeService {
    
    //recuperar datos de la tabla bike
    public List<Bike> getBikes();
    
    //Obtener un registro de la tabla bike en un objeto Bike si el idBike existe, si no se devuelve null
    public Bike getBike(Bike bike);
    
    //Crear nuevo registro bike si el objeto Bike NO tiene id y si el bike tiene id, se actualiza
    public void save(Bike bike);
    
    //Eliminar un arbol
    public void delete(Bike bike);
}
