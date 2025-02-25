package lesson10_DSA_Danhsach.baitap1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        String firstElement = myList.get(0);
        System.out.println("First element: " + firstElement);

        boolean hasBanana = myList.contains("Banana");
        System.out.println("Contains Banana: " + hasBanana);
        int indexOfCherry = myList.indexOf("Cherry");
        System.out.println("Index of Cherry: " + indexOfCherry);

        String removedElement = myList.remove(1); // Xóa "Banana"
        System.out.println("Removed element: " + removedElement);

        myList.clear();
        System.out.println("Size after clear: " + myList.size());
    }
}
