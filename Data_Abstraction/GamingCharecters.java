package Data_Abstraction;
class Animal
{
    public void drinkingWater () //(Genaric M)
    {
        System.out.println("Every animal can drink Water");
    }
    public void sound() //(Overriden M)
    {

    }
    public void movement() //(Overriden M)
    {

    }
}
class Lion extends Animal
{

    @Override
    public void sound() //(Overriding M)
    {
        System.out.println("Roar");
    }

    @Override
    public void movement()  //(Overriding M)
    {
        System.out.println("Run/jump/walk"); //Implemantation
    }
    public void preyFinding() //(Spacific M)
{
    System.out.println("Attacking"); //Implemantation
}
}
class Snake extends Animal
{

    @Override
    public void sound()  //(Overriding M)
    {
        System.out.println("HHHHSSSSSSS"); //Implemantation
    }

    @Override
    public void movement() //(Overriding M)
    {
        System.out.println("Nagin Dance"); //Implemantation
    }
    public void venomUse() //(Spacific M)
    {
        System.out.println("Venom is sometime medicinal also"); //Implemantation
    }
}
public class GamingCharecters {
    public static void main(String[] args) {
//        Lion animal1=new Lion();
//        animal1.drinkingWater();
//        animal1.sound();
//        animal1.movement();
//        Thats why we use upcasting ..........
        Animal animal1= new Lion();
        animal1.drinkingWater(); // features/behaviour (Generic)
        animal1.sound(); // features/behaviour (overriding)
        animal1.movement(); // features/behaviour (overriding)
        Lion lion=(Lion) animal1;
        lion.preyFinding(); // features/behaviour (Spacific)
        System.out.println("*************************");
        Animal animal2=new Snake();
        animal2.drinkingWater(); // features/behaviour (Generic)
        animal2.sound(); // features/behaviour (overriding)
        animal2.movement(); // features/behaviour (overriding)
        Snake snake= (Snake) animal2;
        snake.venomUse(); // features/behaviour (Spacific)

    }
}
