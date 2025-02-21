package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

//얘와 쟤
class Person{
    String name;
    int age;

    public Person(){
        this("김싸피", 13);
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class Heap04_PersionPQ2 {


    public static void main(String[] args) {
//        PriorityQueue<Person> pq = new PriorityQueue<>(new NameComparator());
        PriorityQueue<Person> pq = new PriorityQueue<>(new AgeComparator());

        pq.add(new Person("정", 25));
        pq.add(new Person("강", 38));
        pq.add(new Person("김준영", 26));
        pq.add(new Person("김영준", 26));

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
