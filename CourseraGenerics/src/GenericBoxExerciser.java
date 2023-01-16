public class GenericBoxExerciser {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        GenericBox<String> stringBox= new GenericBox<>();
        Integer[] intArray={1,2,3,4,5};
        Double[] doubArray={1.1,2.2,3.3,4.5,5.6};
        Character[] charArray={'H','E','L','L','O'};
        integerBox.setT(10);
        stringBox.setT("Ola Mundo");
        System.out.println("integer Box Value "+integerBox.getT());
        System.out.println("String Box Value "+stringBox.getT());
        System.out.println("Int Array Prints: ");
        GenericMethod.printArray(intArray);
        System.out.println("Double Array ");
        GenericMethod.printArray(doubArray);
        System.out.println("Chars Array");
        GenericMethod.printArray(charArray);

        
    }
    
}
