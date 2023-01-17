

public class GenericsApp {
    public static void main(String[] args) throws Exception {

        Stack<Integer> ints = new DequeStack<>();
        Stack<String> strings = new DequeStack<>();

        if (ints.getClass()==strings.getClass())
            System.out.println("Stack <Integer> and Stack <String> are both "+ints.getClass());
        strings.push("Hello");
        strings.push("World");
        ints.push(5);
        ints.push(4);
        ints.push(3);
        ints.push(2);
        ints.push(1);
        strings.print();
        ints.print();
        System.out.println(strings.pop());
        System.out.println(ints.pop());
        strings.print();
        ints.print();
        System.out.printf("Maximum of %d %d and %d is %d%n",5,4,3,Maximum.maximum(5,4,3));
        // System.out.printf("Maximum of %d %d and %d is %d%n","Pear","Apple","Orange",Maximum.maximum("Pear","Apple","Orange"));

    }
}
