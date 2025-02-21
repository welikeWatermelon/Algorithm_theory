//package Heap;
//
//import java.util.PriorityQueue;
//
//class Person implements Comparable<Person>{
//    String name;
//    int age;
//
//    public Person(){
//        this("김싸피", 13);
//    }
//
//    public Person(String name, int age) {
//        super();
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public int compareTo(Person o) {
//        //나이순으로? -> 오름차순? 내림차순?
////            return this.age - o.age;
//        //이름순으로?
//        return this.name.compareTo(o.name);
//    }
//}
//
//public class Heap03_PersionPQ1 {
//
//
//    public static void main(String[] args) {
//        PriorityQueue<Person> pq = new PriorityQueue<>();
//
//        pq.add(new Person("정", 25));
//        pq.add(new Person("강", 38));
//        pq.add(new Person("김준영", 26));
//        pq.add(new Person("김영준", 26));
//
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//
//
//    }
//}
