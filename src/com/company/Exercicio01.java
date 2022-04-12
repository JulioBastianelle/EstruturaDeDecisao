/*
Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros
para receber um para receber a nota de português e outro para receber as de matemática.
A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150)
ele não conseguirá a vaga. No final mostre para o candidato se ele conseguiu ou não.
 */

package com.company;

import java.util.Scanner;

public class Exercicio01 {
    static final float NOTA_CLASIFICATORIA = 150;
    static final float NOTA_MINIMA_NAS_MATERIAS = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota que você tirou em português: ");
        float notaDePortugues = scanner.nextFloat();
        System.out.println("Digite a nota que você tirou em matematica ");
        float notaDeMatematica = scanner.nextFloat();
        float notaTotal = notaDePortugues + notaDeMatematica;
        System.out.println("Juntando as duas notas sua nota total é de: " + notaTotal);
        boolean estaAcimaDoMinimoPortugues = notaDePortugues >= NOTA_MINIMA_NAS_MATERIAS;
        boolean estaAcimaDoMinimoMatematica = notaDeMatematica >= NOTA_MINIMA_NAS_MATERIAS;
        boolean temNotaPraPassar = notaTotal >= NOTA_CLASIFICATORIA;
        boolean passouDeAno = temNotaPraPassar && estaAcimaDoMinimoPortugues && estaAcimaDoMinimoMatematica;
        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ANO!");
        } else {
            System.out.println("Infelizmente você reprovou...Tente na proxima!");
        }
        scanner.close();
    }
}