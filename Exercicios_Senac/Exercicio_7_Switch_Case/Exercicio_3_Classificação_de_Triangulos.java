package Exercicio_7_Switch_Case;

import java.util.Scanner;

public class Exercicio_3_Classificação_de_Triangulos {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        double L1, L2, L3;
        int tri = 0;
        System.out.println("Digite o primeiro lado: ");
        L1 = tecla.nextDouble();

        System.out.println("Digite o segundo lado: ");
        L2 = tecla.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        L3 = tecla.nextDouble();

        if (L1 == L2 && L2 == L3 && L1 == L3) {
            tri = 1;
        } else if ((L1 != L2) && (L2 != L3) && (L1 != L3)) {
            tri = 2;
        } else if ((L1 != L2) && (L1 != L3) && (L2 == L3) || (L1 != L2) && (L1 == L3) && (L2 != L3) || (L1 == L2) && (L1 != L3) && (L2 != L3)) {
            tri = 3;
        }
        switch (tri) {
            case 1:
                System.out.println("Equilatero");
                break;
            case 2:
                System.out.println("Escaleno");
                break;
            case 3:
                System.out.println("Isoceles");
                break;
        }

    }
}
