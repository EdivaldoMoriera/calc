package calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        byte  operacao;
        float n1, n2, soma, subtrair, multiplicar, dividir;
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
        System.out.println ("Escolha a Operação:\n"
                + "soma ........................[1]\n"
                + "subtrair.................... [2]\n"
                + "multiplicar .................[3]\n"
                + "dividir .....................[4]");
        operacao = ler.nextByte();
               
        switch (operacao) {
            case 1:
                System.out.println("Você escolheu somar, Insira O primeiro Numero:");
                n1 = ler.nextFloat();
                System.out.println("Insira o segundo Numero :");
                n2 = ler.nextFloat();
                soma = n1 + n2;
                System.out.println("A soma é " +soma);
                break;

            case 2:
                System.out.println("Insira O primeiro Numero:");
                n1 = ler.nextFloat();
                System.out.println("Insira o segundo Numero :");
                n2 = ler.nextFloat();
                subtrair = n1 - n2;
                System.out.println("A subtração é " +subtrair);
                break;

            case 3:
                System.out.println("Insira O primeiro Numero:");
                n1 = ler.nextFloat();
                System.out.println("Insira o segundo Numero :");
                n2 = ler.nextFloat();
                dividir = n1 / n2;
                System.out.println("A divisão é " +dividir);
                break;

            case 4:
                System.out.println("Insira O primeiro Numero:");
                n1 = ler.nextFloat();
                System.out.println("Insira o segundo Numero :");
                n2 = ler.nextFloat();
                multiplicar = n1 * n2;
                System.out.println("A multiplicação é " +multiplicar);
                break;

            default:
                System.out.println("Operacao não exite");
                System.exit(0);
                
        }
        }
        }
    }

