package at.riag.refugees;

public class Aggregator {

    private Calculator calculator;

    public Aggregator(Calculator calculator) {
        this.calculator = calculator;
    }

    public int aggregate(Integer... numbers) {
        int sum = 0;

        for(Integer number : numbers) {
            sum = this.calculator.sum(sum, number);
        }

        return sum;
    }
}
