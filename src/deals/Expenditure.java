package deals;

public class Expenditure extends Deal{

    public Expenditure(String name, int changeDebit, int changeCredit) {
        super("Покупка " + name + " на " + changeCredit + " руб.", changeDebit, changeCredit);
    }
}
