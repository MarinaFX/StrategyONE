package Application;

import Entities.ConcreteStrategy;
import Entities.Strategy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Seja bem vindo! ");
        System.out.println("Digite um dia da semana");
        String resposta = in.nextLine();

        try {
            ConcreteStrategy strategy = new ConcreteStrategy(resposta);
            strategy.execute();
        } catch (IllegalArgumentException f){
            System.err.println(f.getMessage());
        }
    }
}
