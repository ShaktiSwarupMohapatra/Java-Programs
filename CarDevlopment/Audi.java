package CarDevlopment;

public class Audi extends  Car{
    @Override
    public void start()
    {
        System.out.println("Push Start");
    }
    @Override
    public void accelerate()
    {
        System.out.println("Full clutch drive");
    }
    @Override
    public void stop()
    {
        System.out.println("Push stop");
    }
    public void bluetooth()
    {
        System.out.println("Sony is on");
    }
}
