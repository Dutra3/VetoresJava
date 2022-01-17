package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int n[] = {5,7,3,2};

	    for (int i = 0; i<4; i++) {
            System.out.println(n[i]);
        }

        System.out.println("Fazendo for each em java");

	    int num[] = {3,5,1,8,4};
	    for (int valor: num) {
            System.out.println(valor);
        }

        System.out.println("Colocando o vetor em ordem!");
        Arrays.sort(num);
	    for (int value: num) {
            System.out.println(value); // o "value" poderia ser "valor" tbm, aqui é o nome que eu quero!
        }

        System.out.println("Testando busca binaria");
	    int vet[] = {3,7,6,1,9,4,2};
	    for (int v:vet) {
            System.out.println(v);
        }
	    int p = Arrays.binarySearch(vet, 4);
        System.out.println("Encontrei o valor 4 na posição " + p);


        System.out.println("Preenchendo o vetor com apenas um valor.");
        Arrays.fill(vet, 8);
        for (int b:vet) {
            System.out.println(b);
        }
    }
}
