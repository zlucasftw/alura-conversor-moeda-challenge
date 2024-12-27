package br.com.alura.convesor_moeda.menu;

import br.com.alura.convesor_moeda.modelos.Currency;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {

        System.out.print("""

                Seja bem-vindo/a ao Conversor de Moeda =]
                
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileiro
                4) Real brasileiro =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Sair
                Escolha uma opção válida:\s""");

        try {
            return scanner.nextInt();
        } catch (InputMismatchException error) {
            throw new RuntimeException("Erro na digitação da opção.");
        }

    }

    public double mostrarValorConversao() {
        try {
            System.out.print("Digite o valor que deseja converter: ");
            return scanner.nextDouble();
        } catch (InputMismatchException error) {
            throw new RuntimeException("Erro na digitação do valor para conversão.");
        }
    }

    public void mostrarConversao(double valor, Currency currency) {
        System.out.println("Valor " +  valor + " [" + currency.base_code() +
                "] corresponde ao valor final de =>>> " + currency.conversion_result() +
                " [" + currency.target_code() + "]");
    }

}
