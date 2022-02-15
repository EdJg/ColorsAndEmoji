public class Main
{
    public static void main(String[] args)
    {
        Spear test = new Spear();




        test.start();

      /* C. uncomment code below third
            then study my code and see how 'console animation' is made!
            for more info on try-catch syntax (not required for this course),
            check out https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html */

        try {
          test.animateSpear();
        } catch (Exception e) { }
    }
}