package org.example;

public class Perro{
    //atributos
    public String nombre;
    public int edad;
    public String color;
    public boolean vacunado;
    public int numeroPatas;
    public String raza;

    //metodos
    public void ladrar(){
        System.out.println(nombre + " esta ladrando" );
    }
    public void comer(String alimento){
        System.out.println(nombre + " esta comiendo");
    }
    public void correr (){
        System.out.println(nombre +" esta corriendo");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }
    public Perro(String nombre){
        this.nombre = nombre;
    }
}


