package post;

import interfaces.Employee;
import interfaces.Object;

public abstract class Worker implements Employee, Object {
    private int shopNumber;
    private String category;

    public abstract void payTax();

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public void isTaxesPaid(int money) {
        if(money>0){
            System.out.println("Рабочий выплатил налоги");
        }
        else {
            System.out.println("Рабочий не выплатил налоги");
        }
    }

    public Worker() {
    }

    public Worker(int shopNumber) {
        this.shopNumber = shopNumber;
    }

    @Override
    public String toString() {
        return "Рабочий " +
                "номер цеха: " + shopNumber +
                ", разряд: " + category + "\n";
    }
}
