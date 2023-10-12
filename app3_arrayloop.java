import java.util.Scanner;

public class app3_arrayloop {
    public static void main(String[] args) {
 
        Double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("부가세를 제외한 상품의 금액을 입력하세요");
        a = sc.nextDouble();

        double valueOfSupply = a;
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
         
 
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
         
        double[] dividendRates = new double[4];
        dividendRates[0] = 0.4;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;
        dividendRates[3] = 0.1;

        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend"+i+ ": " + (income*dividendRates[i]) );
            i = i + 1;
        }
         
 
    }
 
}