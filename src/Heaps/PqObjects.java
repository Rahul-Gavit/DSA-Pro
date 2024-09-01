package Heaps;

import java.util.*;;

public class PqObjects {

    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("Rahul", 12));
        pq.add(new Student("Manish", 49));
        pq.add(new Student("Pratik", 33));
        pq.add(new Student("Gaurav", 20));

        while (!pq.isEmpty()) {
            System.out.println("name " + pq.peek().name + "," + "rank " + pq.peek().rank);
            pq.remove();
        }
    }

}
