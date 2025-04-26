public class Car extends Vehicle {
    @Override
    void calRent(int jarak, float harga) {
        float fare = harga * jarak;
        fare = fare - 100.0f;
        System.out.println("harga sewa mobil = " + fare);
    }

    @Override
    void sewa() {
        System.out.println("sewa mobil");
    }
}
