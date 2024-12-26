package cognizantBootcampExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Implementação da Interface, EvaluationStrategy e seu método abstrato:
interface EvaluationStrategy {
    String evaluate(double average);
}

// Classe Concreta, ExcellentStrategy e sua lógica de resolução aplicada:
class ExcellentStrategy implements EvaluationStrategy {
    public String evaluate(double average) {
        return average >= 9 ? "Excelente" : "";
    }
}

// TODO: Crie a classe Concreta, GoodStrategy e sua lógica de avaliação aplicada:
class GoodStrategy implements EvaluationStrategy {
    public String evaluate(double average) {
        return average <= 8.9 && average >= 7 ? "Bom" :"";
    }
}

// TODO: Crie a classe Concreta, RegularStrategy e sua lógica de avaliação aplicada:
class RegularStrategy implements EvaluationStrategy {
    public String evaluate(double average) {
        return average <= 6.9 && average >= 5 ? "Regular" :"";
    }
}

// TODO: Crie a classe Concreta, UnsatisfactoryStrategy e sua lógica de avaliação aplicada:

class UnsatisfactoryStrategy implements EvaluationStrategy {
    public String evaluate(double average) {
        return average < 5  ? "Insatisfatorio" :"";
    }
}

public class ProjectEvaluation {

    private static final List<Double> evaluations = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double evaluation1 = scanner.nextDouble();
        evaluations.add(evaluation1);


        double evaluation2 = scanner.nextDouble();
        evaluations.add(evaluation2);

        double average = calculateAverage(evaluations);

        EvaluationStrategy[] strategies = {
                new ExcellentStrategy(),
                new GoodStrategy(),
                new RegularStrategy(),
                new UnsatisfactoryStrategy()
        };

        String status = "";
        for (EvaluationStrategy strategy : strategies) {
            status = strategy.evaluate(average);
            if (!status.isEmpty()) {
                break;
            }
        }

        System.out.printf("Media: %.1f. Status: %s.%n", average, status);
    }

    private static double calculateAverage(List<Double> evaluations) {
        double sum = 0;
        for (double eval : evaluations) {
            sum += eval;
        }
        return sum / evaluations.size();
    }
}