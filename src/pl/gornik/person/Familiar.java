package pl.gornik.person;

public class Familiar extends Person {

    private String intrests;

    public Familiar(String name, String surname, String telephoneNumber, String intrests) {
        super(name, surname, telephoneNumber);
        this.intrests = intrests;
    }

    @Override
    public void displayInfo() {
        System.out.println("Znajomy "+getName()+" "+getSurname()+", nr telefonu " + getTelephoneNumber()+intrests);
    }
}
