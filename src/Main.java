import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.TaxSystem;
import taxes.Usn15;
import taxes.Usn6;

public class Main {
    static Deal deal;

    public static void main(String[] args) {
        //part1();
        part2();
    }

    private static void part1() {
        TaxSystem tax = new Usn6();                         // УСН 6%
        Company company = new Company("ZZZ", tax);
        company.shiftMoney(2000);
        company.shiftMoney(-1000);
        company.payTaxes();
        company.shiftMoney(4500);
        company.shiftMoney(-4700);
        company.payTaxes();
        System.out.println();

        tax = new Usn15();                                  // УСН 15%
        company.setTaxSystem(tax);
        company.shiftMoney(2000);
        company.shiftMoney(-1000);
        company.payTaxes();
        company.shiftMoney(4500);
        company.shiftMoney(-4700);
        company.payTaxes();
    }

    public static void part2() {
        TaxSystem tax = new Usn6();                         // УСН 6%
        Company company = new Company("ZZZ", tax);

        addData("Болты", "Продажа", 300, company);
        addData("Уголки", "Продажа", 500, company);
        addData("Уголки", "Покупка", 350, company);
        addData("Стяжки", "Покупка", 200, company);

        System.out.println("Прибыль до уплаты налогов: " + company.applyDeals(company.deals));
        System.out.println();


        tax = new Usn15();                                  // УСН 15%
        company.setTaxSystem(tax);
        System.out.println("Прибыль до уплаты налогов: " + company.applyDeals(company.deals));
    }

    private static void addData(String name, String usage, int price, Company company){
        switch (usage){
            case "Продажа":
                deal = new Sale(name, price);
                break;
            case "Покупка":
                deal = new Expenditure(name, price);
        }
        company.addDeal(deal);
        System.out.println(deal.comment);
    }
}
