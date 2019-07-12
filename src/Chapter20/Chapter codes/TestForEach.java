class TestForEach {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Tehran");
        collection.add("Mashhad");
        collection.add("Shiraz");
        collection.add("Esfahan");

        collection.forEach(e -> System.out.println(e.toUpperCase()));
    }
}