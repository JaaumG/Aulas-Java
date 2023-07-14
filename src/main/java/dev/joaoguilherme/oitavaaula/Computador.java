package dev.joaoguilherme.oitavaaula;

import java.util.Objects;

public class Computador {

    private String marca;
    private String modelo;
    private float valor;

    public Computador(String marca, String modelo, float valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Computador that)) return false;
        return Float.compare(that.valor, valor) == 0 && Objects.equals(marca, that.marca) && Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, valor);
    }
}
