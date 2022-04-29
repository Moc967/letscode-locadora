package com.letscode.magno.locadora.domain;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Filial {

    public int loja;

    public Stack<String> logLocacao = new Stack<>();

    Carro[] grupoCarro = new Carro[10];
    Queue<Cliente> filaEspera = new ArrayDeque<>();

    public Filial(int loja, Stack<String> logLocacao, Carro[] grupoCarro, Queue<Cliente> filaEspera) {
        this.loja = loja;
        this.logLocacao = logLocacao;
        this.grupoCarro = grupoCarro;
        this.filaEspera = filaEspera;
    }

    public int getLoja() {
        return loja;
    }

    public void setLoja(int loja) {
        this.loja = loja;
    }

    public Stack<String> getLogLocacao() {
        return logLocacao;
    }

    public void setLogLocacao(Stack<String> logLocacao) {
        this.logLocacao = logLocacao;
    }

    public Carro[] getGrupoCarro() {
        return grupoCarro;
    }

    public void setGrupoCarro(Carro[] grupoCarro) {
        this.grupoCarro = grupoCarro;
    }

    public Queue<Cliente> getFilaEspera() {
        return filaEspera;
    }

    public void setFilaEspera(Queue<Cliente> filaEspera) {
        this.filaEspera = filaEspera;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "loja=" + loja +
                ", logLocacao=" + logLocacao +
                ", grupoCarro=" + Arrays.toString(grupoCarro) +
                ", filaEspera=" + filaEspera +
                '}';
    }
}
