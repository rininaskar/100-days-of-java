import java.util.Vector;

public class BasicVector {

    public static void main(String[] args) {

        Vector <String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Fourth");
        System.out.println(vct);
        System.out.println(vct.size());
        System.out.println(vct.capacity());
        vct.add(3,"JAVA");
        System.out.println(vct);
        System.out.println("\n Elements at index 3 is:" +vct.get(3));
        System.out.println("\n The first element of the vector is:" +vct.firstElement());
        System.out.println("\n The last element of the vector is:" +vct.lastElement());
    }
}
