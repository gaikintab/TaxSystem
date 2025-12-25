package deals;

public class Deal {
    public String comment;
    public int changeDebit;
    public int changeCredit;

    public Deal(String comment, int changeDebit, int changeCredit){
        this.comment = comment;
        this.changeDebit = changeDebit;
        this.changeCredit = changeCredit;
    }
}
