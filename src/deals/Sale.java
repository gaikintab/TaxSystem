package deals;

public class Sale extends Deal {

    public Sale(String name, int changeDebit) {
        super("Продажа " + name + " на " + changeDebit + " руб.", changeDebit, 0);

    }
}

