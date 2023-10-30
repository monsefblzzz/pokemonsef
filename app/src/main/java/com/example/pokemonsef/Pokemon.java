package com.example.pokemonsef;

public class Pokemon {

    int nombre;
    int vida;
    String tipo;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre=" + nombre +
                ", vida=" + vida +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
