package deals;

public class Sale extends Deal {

    public Sale(String name, int price) {
        super("Продажа " + name + " на " + price + " руб.", price, 0);

    }
}

