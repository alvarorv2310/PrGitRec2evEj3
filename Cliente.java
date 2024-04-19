package org.example;

import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Cliente {
    private String nombre;
    private int edad;
    private Vehiculo[] veichulos = new Vehiculo[2];
    void anadir(Vehiculo v){
        veichulos[0] = v;
    }
}