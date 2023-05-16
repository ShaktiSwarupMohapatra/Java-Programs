package CarDevlopment;

public class Swift extends Car {
    @Override
    public void start()
        {
            System.out.println("Key Start");
        }
    @Override
    public void accelerate()
    {
        System.out.println("Half clutch drive");
    }
    @Override
    public void stop()
    {
        System.out.println("Key stop");
    }
    public void bluetooth() //SM
    {
        System.out.println("JBL ON");
    }
    public void m2()
    {
        System.out.println("HI am M2");
    }
}
