import java.util.Random;
   
public class NumberGenerator
{
    public int nextInt()
    {
        int randNumber = new Random(generator.nextInt(6));
        randNumber = (randNumber + 1);
        System.out.println(randNumber);
    }
}
        