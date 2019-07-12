import java.util.*;


class TestIterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Tehran");
        collection.add("Mashhad");
        collection.add("Shiraz");
        collection.add("Esfahan");

        //obtain an iterator for the collection
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase() + " ");
        }
        System.out.println();

        //simplify using foreach (This loop is read as “for each element in the collection, do the following.)
        // for (String element: collection)
        //System.out.print(element.toUpperCase() + " ");
    }
}