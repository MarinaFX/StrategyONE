package Entities;

public class ConcreteStrategy {
    private Strategy strategy;

    public ConcreteStrategy(String diaDaSemana) {
        diaDaSemana = diaDaSemana.toUpperCase();
        switch (diaDaSemana) {
            case "SEGUNDA":
                strategy = new Segunda();
                break;

            case "TERCA":
                strategy = new Terca();
                break;

            case "QUARTA":
                strategy = new Quarta();
                break;

            case "QUINTA":
                strategy = new Quinta();
                break;

            case "SEXTA":
                strategy = new Sexta();
                break;

            case "SABADO":
                strategy = new Sabado();
                break;

            case "DOMINGO":
                strategy = new Domingo();
                break;

            default:
                throw new IllegalArgumentException("ERR_STRATEGY_NOT_FOUND");
        }
    }

    public void execute(){
        strategy.printMsg();
    }
}
