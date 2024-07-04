package com.parcial_1.parcial_1.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="bike")
public class Bike implements Serializable {
    
    private static final long serialVersionUID = 11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_bike")
    private Long idBike;
    private String marca;
    private int velocidades;
    private int cilindradaBike;
    private String imagen;
}
