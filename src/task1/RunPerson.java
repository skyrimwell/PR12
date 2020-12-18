package task1;

public class RunPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Сашок", "Саня", "Саневич");
        Person p2 = new Person("Городнов", "Сергей");
        Person p3 = new Person("Хэтфилд");

        System.out.println("p1 = " + p1.getFIO());
        System.out.println("p2 = " + p2.getFIO());
        System.out.println("p3 = " + p3.getFIO());
    }
}
