/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2_nombreapellido;

/**
 *
 * @author Apple
 */
public class tortuga {

    public String nombre;
    public int velocidad;
    public int edad;
    public int carrreras_ganadas;
    public int fecha_inicio;
    public int fecha_retiro;

    public tortuga() {
    }

    public tortuga(String nombre, int velocidad, int edad, int carrreras_ganadas, int fecha_inicio, int fecha_retiro) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.edad = edad;
        this.carrreras_ganadas = carrreras_ganadas;
        this.fecha_inicio = fecha_inicio;
        this.fecha_retiro = fecha_retiro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCarrreras_ganadas() {
        return carrreras_ganadas;
    }

    public void setCarrreras_ganadas(int carrreras_ganadas) {
        this.carrreras_ganadas = carrreras_ganadas;
    }

    public int getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(int fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getFecha_retiro() {
        return fecha_retiro;
    }

    public void setFecha_retiro(int fecha_retiro) {
        this.fecha_retiro = fecha_retiro;
    }

    @Override
    public String toString() {
        return "tortuga{" + "nombre=" + nombre + ", velocidad=" + velocidad + ", edad=" + edad + ", carrreras_ganadas=" + carrreras_ganadas + ", fecha_inicio=" + fecha_inicio + ", fecha_retiro=" + fecha_retiro + '}';
    }

}
