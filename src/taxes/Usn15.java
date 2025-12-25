package taxes;

public class Usn15 extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit){
        int res = debit - credit;
        if (res > 0) {
            return (res * 15 / 100);
        } else { return 0;}
    }

    @Override
    public String toString(){
        return "УСН доходы минус расходы (15%)";
    }
}
