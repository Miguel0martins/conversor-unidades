import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int opcao = 0;

        String Menu =
                "\n*****Conversor Unidades*****" +
                        "\n1- IMC (altura/peso)" +
                        "\n2- Celsius para Fahrenheit" +
                        "\n3- km para milhas" +
                        "\n4- real para o dolar" +
                        "\n5- quilograma (kg) para libras (lb)" +
                        "\n6- Sair" +
                        "\ndigite a opcao que deseja convertir: ";

        while (opcao != 6) {
            System.out.println(Menu);
            opcao = Leitor.nextInt();

            if (opcao == 1) {
                System.out.println("essa é a calculadora de IMC");
                System.out.println("\ndigite seu peso");
                double peso = Leitor.nextDouble();

                System.out.println("digite sua altura");
                double altura = Leitor.nextDouble();
                double imc = peso / (altura * altura);
                System.out.println("Seu IMC é de: " + String.format("%.2f", imc));
            }
            else if (opcao == 2) {
                System.out.println("esse é o conversor de Fahrenheit");
                System.out.println("\ndigite o atual Celsius (C°)");
                double celsius = Leitor.nextDouble();
                double fahrenheit = celsius * 1.8 + 32;
                System.out.println("o seu Fahrenheit atual é: " + String.format("%.2f", fahrenheit));
            }
            else if (opcao == 3) {
                System.out.println("esse é o conversor de km para milhas");
                System.out.println("\ndigite o km para ser convertido");
                double km = Leitor.nextDouble();
                double milhas = km * 0.6214;
                System.out.println("sua distância em milhas é de: " + String.format("%.2f", milhas));
            }
            else if (opcao == 4) {
                System.out.println("esse é o conversor de real para dólar");
                System.out.println("\ndigite quantos reais (R$) você deseja converter");
                double real = Leitor.nextDouble();
                double dolar = 5.22;
                double valor = real / dolar;
                System.out.println("você tem: " + String.format("%.2f", valor) + "$ em dólares");
            }
            else if (opcao == 5) {
                System.out.println("esse é o conversor de kg para libras");
                System.out.println("\ndigite o peso em quilogramas (kg)");
                double kg = Leitor.nextDouble();
                double libras = kg * 2.20462;
                System.out.println("o peso em libras é de: " + String.format("%.2f", libras) + " (lb)");
            }
            else if (opcao == 6) {
                System.out.println("ok obrigado");
            }
            else {
                System.out.println("Opcao invalida");
            }
        }
    }
}