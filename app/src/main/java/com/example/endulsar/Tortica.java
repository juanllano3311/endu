package com.example.endulsar;

public class Tortica {
    private  String Nombre;
    private String Precio;
    private String capacidad;


    public Tortica(){

    }


    public Tortica(String id, String nombre, String precio, String capacidad) {
        this.id = id;
        Nombre = nombre;
        Precio = precio;
        this.capacidad = capacidad;
    }


    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }


}

