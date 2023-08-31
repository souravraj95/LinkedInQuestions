package Part1;
/* Question 10 : Write a java program to insert given table data into a collection and print it.
Choose best collection keep in mind time and space complexity. (Please see attached image for input and output).

Input :
Id	Name	City	PhoneNo
1.	John	Boston	000000000
2.	Ola	New Jersey	111111111

Output:
1 John Boston 000000000
2 Ola New Jersey 1111111111

 */
import java.util.ArrayList;
import java.util.List;

class Person {
    int id;
    String name;
    String city;
    String phoneNo;

    public Person(int id, String name, String city, String phoneNo) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return id + ". " + name + "\t" + city + "\t" + phoneNo;
    }
}

public class TableDataIntoCollection {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(1, "John", "Boston", "000000000"));
        people.add(new Person(2, "Ola", "New Jersey", "111111111"));

        System.out.println("Id\tName\tCity\t\tPhoneNo");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

