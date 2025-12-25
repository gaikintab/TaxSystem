import deals.Deal;
import taxes.TaxSystem;

public class Company {
    int debit;
    int credit;
    int dealsCount;
    Deal[] deals = new Deal[10];
    String title;
    TaxSystem taxSystem;

    public Company (String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void setTaxSystem(TaxSystem taxSystem){
        this.taxSystem = taxSystem;
    }

    public void payTaxes(){
        System.out.printf("Система налогообложения: %s%n" +
                        "Компания %s уплатила налог в размере: %d руб.%n",
                taxSystem.toString(), title, taxSystem.calcTaxFor(debit, credit));
        debit = 0;
        credit = 0;
    }

    public void addDeal(Deal deal){                             // part2
        deals[dealsCount] = deal;
        dealsCount ++;
    }

    public int applyDeals(Deal[] deals){
        for (Deal deal : deals) {
            if (deal != null) {
                debit += deal.changeDebit;
                credit += deal.changeCredit;
            }
        }
        int profit = debit - credit;
        payTaxes();
        return profit;
    }
}
