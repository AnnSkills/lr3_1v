package post;

public class Employee {
    private String fullName;
    private String gender;
    private String date;
    private int experience;
    private int salary;
    public void isTaxesPaid(int money){
        if(money>0){
            System.out.println("Служащий выплатил налоги");
        }
        else {
            System.out.println("Служащий не выплатил налоги");
        }
    }

    public Employee() {
    }
    public Employee(String fullName, String gender, String date, int experience, int salary) {
        this.fullName = fullName;
        this.gender = gender;
        this.date = date;
        this.experience = experience;
        this.salary = salary;
    }

}
