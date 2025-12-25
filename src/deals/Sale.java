package deals;

public class Sale extends Deal{

    public Sale(String name, int changeDebit, int changeCredit){
        super("Продажа " + name + " на " + changeDebit + " руб.", changeDebit, changeCredit);
    }
}
