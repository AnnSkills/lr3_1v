package post;

import interfaces.Employee;
import interfaces.Object;

public class Manager implements Employee, Object {
    private String workshopName;
    private int subordinatesNumber;


    public Manager() {
    }

    public Manager(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public int getSubordinatesNumber() {
        return subordinatesNumber;
    }

    public void setSubordinatesNumber(int subordinatesNumber) {
        this.subordinatesNumber = subordinatesNumber;
    }

    @Override
    public void print() {
        System.out.println("Информация о начальнике цеха");
        System.out.println(this);
    }
    @Override
    public void isTaxesPaid(int money) {
        if(money>0){
            System.out.println("Начальник цеха выплатил налоги");
        }
        else {
            System.out.println("Начальник цеха не выплатил налоги");
        }
    }

    @Override
    public String toString() {
        return "Начальник цеха " +"\n"+
                "название цеха: " + workshopName +"\n"+
                "количество подчиненных: " + subordinatesNumber;
    }
}
