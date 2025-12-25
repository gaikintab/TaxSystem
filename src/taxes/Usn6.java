package taxes;

public class Usn6 extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit){
        return debit * 6 / 100;
    }

    @Override
    public String toString(){
        return "УСН доходы (6%)";
    }
}
