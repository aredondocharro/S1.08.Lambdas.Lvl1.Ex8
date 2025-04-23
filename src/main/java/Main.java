public class Main {

    public static void main(String[] args) {

        StringReverser reverser = str -> new StringBuilder(str).reverse().toString();

        String original = "HelloWorld";

        StringProcessor processor = new StringProcessor();
        String result = processor.process(original, reverser);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + result);
    }
}