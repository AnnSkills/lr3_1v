package post;

public class Locksmith extends Worker{
    @Override
    public void isTaxesPaid(int money) {
        if(money>0){
            System.out.println("Слесарь выплатил налоги");
        }
        else {
            System.out.println("Слесарь не выплатил налоги");
        }
    }

    @Override
    public void payTax() {
        System.out.println("Слесарь вносит налог");
    }
}
