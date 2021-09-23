package post;

public class Turner extends Worker{
    @Override
    public void isTaxesPaid(int money) {
        if(money>0){
            System.out.println("Токарь выплатил налоги");
        }
        else {
            System.out.println("Токарь не выплатил налоги");
        }
    }

    @Override
    public void payTax() {
        System.out.println("Токарь вносит налог");
    }
}
