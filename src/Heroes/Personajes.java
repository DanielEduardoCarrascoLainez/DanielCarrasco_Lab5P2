/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heroes;

public class Personajes {
    private String nombre;
    private String poder;
    private String debilidad;
    private int fuerza;
    private int agilidad;
    private int agilidad_M;
    private int HP;
    private String universo;

    public Personajes() {
    }

    public Personajes(String nombre, String poder, String debilidad, int fuerza, int agilidad, int agilidad_M, int HP, String universo) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.agilidad_M = agilidad_M;
        this.HP = HP;
        this.universo = universo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getAgilidad_M() {
        return agilidad_M;
    }

    public void setAgilidad_M(int agilidad_M) {
        this.agilidad_M = agilidad_M;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    @Override
    public String toString() {
        return "Personajes{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", agilidad_M=" + agilidad_M + ", HP=" + HP + ", universo=" + universo + '}';
    }

    
}
