package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CollectionsFrameWork {

    public static void ArrayListUsage() throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            strings.add(reader.readLine());
        }
        System.out.println("printing the strings in the Arraylist");
        for (String str:strings
             ) {
            System.out.println(str);
        }
    }

    public static void LinkedListUsage(){
        LinkedList<Integer>linkedList = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
                linkedList.add(i);
        }
        System.out.println("printing the elements of linkedlist");
        for (Integer x:linkedList
             ) {
            System.out.println(x);

        }
    }

    public static void VectorUsage(){
        Vector<Integer>vector = new Vector<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <3; i++) {
            int x=sc.nextInt();
            vector.add(x);
        }
        System.out.println("printing the contents of vector");

        for (Integer x:vector
             ) {
            System.out.println(x);
        }
    }

    public static void StackUsage(){
        Stack<Integer>stack = new Stack<>();

        System.out.println("input values in order in stack 1,2,3,4,5");
        for (int i = 1; i < 6; i++) {
            stack.push(i);

        }

        Iterator<Integer> iterator = stack.iterator();
        while(!stack.empty()){
            System.out.println(stack.pop()+" ");
        }
    }

    public static void QueueUsage(){
        Queue<String>queue = new PriorityQueue<>();

        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("A");

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }

    public static void SetUsage(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        System.out.println("now sorted set example, inserting values 5,4,3,2,1 in order");
        SortedSet<Integer>sortedSet = new TreeSet<>();
        sortedSet.add(5);
        sortedSet.add(4);
        sortedSet.add(3);
        sortedSet.add(2);
        sortedSet.add(1);
        System.out.println("the sorted set is as follows "+ sortedSet);


    }

    public static void DequeUsage(){
        Deque<Integer>deque = new ArrayDeque<>();
        System.out.println("adding 10, 20 ,30 to deque");
        deque.add(10);
        deque.add(20);
        deque.add(30);

        System.out.println("get first element of deque "+deque.getFirst());
        System.out.println("get last element of deque " + deque.getLast());
        System.out.println(deque);
   }
}
