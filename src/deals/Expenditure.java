package deals;

public class Expenditure extends Deal{

    public Expenditure(String name, int changeCredit) {
        super("Покупка " + name + " на " + changeCredit + " руб.", 0, changeCredit);
    }
}
