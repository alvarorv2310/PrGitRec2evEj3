package org.example;

public class Main {
    public static void main(String[] args){
        Vehiculo v1 = new Vehiculo("2334ABC", 33330, 25000.6);
        System.out.println(v1);
        Cliente c1 = new Cliente();
        c1.setNombre("Juan");
        c1.setEdad(25);
        c1.setEdad(c1.getEdad() + 1);
        c1.anadir(v1);
        System.out.println(c1);
    }
}
