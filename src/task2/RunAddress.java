package task2;

public class RunAddress {
    public static void main(String[] args) {
        AddressFirstMethod addF = new AddressFirstMethod("Россия, Москва, Москва, Большая Академическая, 6, 2, 1");
        AddressSecondMethod addS = new AddressSecondMethod("Россия, Москва, Москва, Большая Академическая, 6, 2, 1");
        AddressSecondMethod addS2 = new AddressSecondMethod("Россия. Москва, Москва, Большая Академическая, 6, 2, 1");
        AddressSecondMethod addS3 = new AddressSecondMethod("Россия- Москва- Москва; Большая Академическая, 6, 2, 1");

        System.out.println(addF);
        System.out.println(addS);
        System.out.println(addS2);
        System.out.println(addS3);
    }
}
