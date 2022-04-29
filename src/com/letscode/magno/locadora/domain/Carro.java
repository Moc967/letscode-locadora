package com.letscode.magno.locadora.domain;

public class Carro implements Comparable<Carro> {

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private double valorDiaria;
    private boolean disponivel;

    public Carro(String placa, String marca, String cor, String modelo, double valorDiaria, boolean disponivel) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", valorDiaria=" + valorDiaria +
                ", disponivel=" + disponivel +
                '}';
    }

    @Override
    public int compareTo(Carro o) {
        return Double.compare(this.valorDiaria, o.valorDiaria);
    }

}
