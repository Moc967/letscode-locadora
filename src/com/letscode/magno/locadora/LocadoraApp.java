package com.letscode.magno.locadora;

import com.letscode.magno.locadora.domain.Carro;
import com.letscode.magno.locadora.domain.Cliente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class LocadoraApp {

    public static Stack<String> logLocacaoF1 = new Stack<>();
    public static Stack<String> logLocacaoF2 = new Stack<>();

    public static void main(String[] args) {

        Carro[] grupoCarro1 = new Carro[10];
        Carro[] grupoCarro2 = new Carro[10];

        grupoCarro1[0] = new Carro("EZN7280", "VW", "Branco Perola", "Tiguan TSI", 570, true);
        grupoCarro1[1] = new Carro("EZN7281", "VW", "Branco Perola", "Tiguan TSI", 570, true);
        grupoCarro1[2] = new Carro("EZN7282", "VW", "Branco Perola", "Tiguan TSI", 570, true);
        grupoCarro1[3] = new Carro("EZN7283", "VW", "Branco Perola", "Tiguan TSI", 670, true);
        grupoCarro1[4] = new Carro("EZN7284", "VW", "Branco Perola", "Tiguan TSI", 670, true);
        grupoCarro1[5] = new Carro("EZN7285", "VW", "Branco Perola", "Tiguan TSI", 670, true);
        grupoCarro1[6] = new Carro("EZN7286", "VW", "Branco Perola", "Tiguan RLINE", 750, true);
        grupoCarro1[7] = new Carro("EZN7287", "VW", "Prata Espacial", "Tiguan RLINE", 750, true);
        grupoCarro1[8] = new Carro("EZN7288", "VW", "Prata Espacial", "Tiguan RLINE", 880, true);
        grupoCarro1[9] = new Carro("EZN7289", "VW", "Preto", "Tiguan RLINE", 880, true);

        grupoCarro2[0] = new Carro("ENZ5180", "Renault", "Prata Espacial", "Duster Dynamique", 370, true);
        grupoCarro2[1] = new Carro("ENZ5181", "Renault", "Prata Espacial", "Duster Dynamique", 450, true);
        grupoCarro2[2] = new Carro("ENZ5182", "Renault", "Prata Espacial", "Duster Dynamique", 450, true);
        grupoCarro2[3] = new Carro("ENZ5183", "Renault", "Prata Espacial", "Duster Intense", 390, true);
        grupoCarro2[4] = new Carro("ENZ5184", "Renault", "Prata Espacial", "Duster Intense", 390, true);
        grupoCarro2[5] = new Carro("ENZ5185", "Renault", "Preto ", "Duster Iconic", 470, true);
        grupoCarro2[6] = new Carro("ENZ5186", "Renault", "Preto", "Duster Iconic", 470, true);
        grupoCarro2[7] = new Carro("ENZ5187", "Renault", "Branco", "Duster Iconic", 470, true);
        grupoCarro2[8] = new Carro("ENZ5188", "Renault", "Branco", "Duster Dynamique", 450, true);
        grupoCarro2[9] = new Carro("ENZ5189", "Renault", "Branco", "Duster Dynamique", 450, true);

        grupoCarro1 = ordenarVeiculos(grupoCarro1);
        grupoCarro2 = ordenarVeiculos(grupoCarro2);

        Queue<Cliente> listaEspera1 = new ArrayDeque<>();
        Queue<Cliente> listaEspera2 = new ArrayDeque<>();

        Cliente cliente1 = new Cliente("32258068020", "João da Silva", "11932221423", "Av Ibirapuera, 1234", grupoCarro1[2]);
        Cliente cliente2 = new Cliente("12258099920", "Sandra Pereira", "119784533223", "Av Moema, 123", grupoCarro1[0]);
        Cliente cliente3 = new Cliente("99058071233", "Sergio Watanabe", "119824512342", "Av Imarés, 89", grupoCarro1[9]);
        Cliente cliente4 = new Cliente("35213968012", "Jose Luiz Villas", "113022753901", "Av Nações Unidas, 12555", grupoCarro1[1]);

        listaEspera1.add(cliente1);
        listaEspera1.add(cliente2);
        listaEspera1.add(cliente3);
        listaEspera1.add(cliente4);

        Cliente cliente5 = new Cliente("12487068012", "Ernesto Araújo", "11932221423", "Av Nações Unidas, 12555", grupoCarro2[0]);
        Cliente cliente6 = new Cliente("76523068077", "Paulo Ferreira", "11468797423", "Av Rio Bonito, 41", grupoCarro2[3]);
        Cliente cliente7 = new Cliente("39785068035", "Aristóteles Felicio", "11762636423", "Av Paulo Coelho, 712", grupoCarro2[8]);
        Cliente cliente8 = new Cliente("41158068003", "Marcia Christina", "11937889545", "Rua Alexandre Dumas, 124", grupoCarro2[1]);

        listaEspera2.add(cliente5);
        listaEspera2.add(cliente6);
        listaEspera2.add(cliente7);
        listaEspera2.add(cliente8);

        int grupoAtual = 0;
        for (Cliente cliente : listaEspera1){
            System.out.println("Veículo locado para o cliente: " + cliente.getNome());
            grupoAtual= grupoAtual+1;
        }

    }
    public static Carro[] ordenarVeiculos(Carro [] veiculos) {
        Arrays.sort(veiculos);

        return veiculos;
    }

    public static void alugarCarro(Cliente cliente, Carro carro, Stack<String> logLocacao) {

        carro.setDisponivel(false);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy à's' HH:mm:ss");

        loglocacao.push(dateFormat.format(Calendar.getInstance().getTime()) + ": Carro " + carro.getMarca() + ", " + carro.getModelo() + ", " + carro.getPlaca() + ", foi EMPRESTADO para " + cliente.getNome());
    }

//    public static void String imprimirFrotas(Carro[] veiculos) {
//        System.out.println("Relação de Veículos Disponíveis");
//        System.out.println(Arrays.toString(veiculos));
//    }
}

