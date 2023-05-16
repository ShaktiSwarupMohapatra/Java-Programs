package CarDevlopment;

public class Driver {
    //    public void drive(Swift swift)
//    {
//        swift.start();
//        swift.accelerate();
//        swift.stop();
//    }
//    public void drive(Audi audi)
//    {
//        audi.start();
//        audi.accelerate();
//        audi.stop();
//    }
    public void drive(Car car)
    {
        car.start();
        car.accelerate();
        car.stop();
    }
    public void accessBluetooth(Car car)
    {
       if(car instanceof Swift) ((Swift)car).bluetooth();
       if(car instanceof Audi) ((Audi)car).bluetooth();

    }

}
