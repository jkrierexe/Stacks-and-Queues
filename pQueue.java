import java.util.PriorityQueue;

public class pQueue {
    public static void main(String[] args) {
        // Initialize the priority queue
        PriorityQueue<Person> pq = new PriorityQueue<>();

        // Add items
        pq.add(new Person("Joey", 1));
        pq.add(new Person("Mike", 3));
        pq.add(new Person("Sam", 2));
        pq.add(new Person("Paul", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}


class Person implements Comparable<Person> {
    String n;
    int p;
    public Person() {
        n = null;
        p = 0;
    }
    public Person(String name, int priority) {
        n = name;
        p = priority;
    }
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.p, other.p);
    }
    @Override
    public String toString() {
        return "Name: " + n + ", Priority: " + p;
    }
}
