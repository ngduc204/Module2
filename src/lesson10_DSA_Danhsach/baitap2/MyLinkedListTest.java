package lesson10_DSA_Danhsach.baitap2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        String firstElement = myList.get(0);
        System.out.println("First element: " + firstElement);

        boolean hasBanana = myList.contains("Banana");
        System.out.println("Contains Banana: " + hasBanana);

        System.out.println("Element at index 1: " + myList.get(1));

        String removedElement = myList.remove(1);
        System.out.println("Removed element: " + removedElement);

        System.out.println("Size after removal: " + myList.size());

            myList.clear();
        System.out.println("Size after clear: " + myList.size());
    }
}
