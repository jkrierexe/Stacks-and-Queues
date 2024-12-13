import java.util.Queue;
import java.util.LinkedList;

public class queue{
    public static void main(String args[]){
        Queue<String> q = new LinkedList<>();

        //adding print jobs
        q.add("Best employee award recipitant...");
        q.add("Final grades for Data Structures:");
        q.add("Ultimate Manifesto for Flying Squirrels (UMFS)");

        //printing first job
        System.out.println(q.remove() + "\n");

        //add another job
        q.add("Printer Malfunction: Terminating...");

        //printing remaining jobs
        System.out.println(q.remove() + "\n");
        System.out.println(q.remove() + "\n");
        System.out.println(q.remove() + "\n");


    }
}