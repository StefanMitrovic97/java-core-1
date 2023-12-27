public class Person extends MakingChanges{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        String tempName;
        int tempAge;

        tempName = p1.name;
        tempAge = p1.age;

        p1.name = p2.name;
        p1.age = p2.age;

        p2.name = tempName;
        p2.age = tempAge;

    }
}
