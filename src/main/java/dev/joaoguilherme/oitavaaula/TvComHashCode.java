package dev.joaoguilherme.oitavaaula;

import java.util.Objects;

public class TvComHashCode {

    private String marca;
    private float polegadas;

    private float valor;

    public TvComHashCode(String marca, float polegadas, float valor) {
        this.marca = marca;
        this.polegadas = polegadas;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(float polegadas) {
        this.polegadas = polegadas;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    @Override
    public int hashCode() {
        return Objects.hash(marca, polegadas, valor);
    }
}
