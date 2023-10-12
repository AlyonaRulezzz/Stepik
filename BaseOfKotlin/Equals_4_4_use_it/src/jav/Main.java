package jav;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Moscow", "Жёлтая", 150);
        Address address2 = new Address("Moscow", "Жёлтая", 150);
//        Address address2 = address1;

        address1.setNumberOfHouse(100);
        System.out.println(address2.getNumberOfHouse());
        address1.setNumberOfHouse(150);

//        if (address1 == address2) {
        if (address1.equals(address2)) {
            System.out.println("Равны");
        } else {
            System.out.println("Не равны");
        }

        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());

        System.out.println(address1.equals(null)); // false

        Address address3 = null;
//        System.out.println(address3.equals(null)); // Exception
        System.out.println(address3 == null); // true
    }
}
