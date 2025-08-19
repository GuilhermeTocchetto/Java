package com.mycompany.boletim;

import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Nota b1 = new Nota();
        Nota b2 = new Nota();
        Nota b3 = new Nota();
        Nota b4 = new Nota();
        
        double valorNota;
        int Bimestre;
        
        System.out.println("\nBimestre 1\n");
        System.out.println("Digite a nota do aluno: ");
        valorNota = teclado.nextDouble();
        b1.setValorNota(valorNota);
        
        System.out.println("\nBimestre 2\n");
        System.out.println("Digite a nota do aluno: ");
        valorNota = teclado.nextDouble();
        b2.setValorNota(valorNota);
        
        System.out.println("\nBimestre 3\n");
        System.out.println("Digite a nota do aluno: ");
        valorNota = teclado.nextDouble();
        b3.setValorNota(valorNota);
        
        System.out.println("\nBimestre 4\n");
        System.out.println("Digite a nota do aluno: ");
        valorNota = teclado.nextDouble();
        b4.setValorNota(valorNota);
        
        //double media = b1 + b2 + b3 + b4;
    }
}
