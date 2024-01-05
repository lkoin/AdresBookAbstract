package pl.gornik.person;

public class Employee extends Person{

    private String position;


    public Employee(String name, String surname, String telephoneNumber, String position) {
        super(name, surname, telephoneNumber);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        System.out.println("Pracownik "+getName()+" "+getSurname()+", nr telefonu " + getTelephoneNumber()+position);
    }
}
