public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Stefan",26);
        Person p2 = new Person("Nikola",25);

        System.out.println("Person 1: " + p1.name + " " + p1.age);
        System.out.println("Person 2: " + p2.name + " " + p2.age);

        MakingChanges.changeIdentities(p1,p2);

        System.out.println("After changes Person 1: " + p1.name + " " + p1.age);
        System.out.println("After changes Person 2: " + p2.name + " " + p2.age);
    }
}