package CarDevlopment;

public class Testcar {
    public static void main(String[] args) {
        Driver driver=new Driver();
        driver.drive(new Swift());

        driver.accessBluetooth(new Swift());
        driver.drive(new Audi());
        driver.drive(new Benz());
    }
}
