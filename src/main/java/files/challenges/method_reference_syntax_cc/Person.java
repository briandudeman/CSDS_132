package files.challenges.method_reference_syntax_cc;

import java.util.Comparator;

public class Person {
    
    private int age;

    public static int ageDifference(Person person1, Person person2) {
        return Math.abs(person1.getAge() - person2.getAge());
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public Comparator<Person> comparator() {
        return Person::ageDifference;
        
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(10);
        
        Person p2 = new Person();
        p2.setAge(20);

        Comparator<Person> c = p1.comparator();
        System.out.println(c.compare(p1, p2));
    }
}
