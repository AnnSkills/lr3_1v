package post;

import interfaces.Employee;
import interfaces.Object;

/*Создайте класс «Директор завода» производный от «Служащий»
содержит дополнительную информацию: срок избрания.*/
public class Director implements Employee, Object {
    private int electionTerm;

    public Director() {
    }

    public Director(int electionTerm) {
        this.electionTerm = electionTerm;
    }

    @Override
    public void isTaxesPaid(int money) {
        if(money>0){
            System.out.println("Директор выплатил налоги");
        }
        else {
            System.out.println("Директор не выплатил налоги");
        }
    }

    @Override
    public void print() {
        System.out.println("Информация директора");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Директор " +
                "срок избрания: " + electionTerm;
    }
}
