public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "Жёлтая", 150);
        Address address2 = new Address("Moscow", "Жёлтая", 150);

        if (address1 == address2) {
            System.out.printf("Равны");
        } else {
            System.out.printf("Не равны");
        }
    }
}
