public class Spear
{
    private final String BLACK = "\u001B[30m";
    private final String RED = "\u001B[31m";
    private final String WHITE = "\u001B[37m";
    private final String CHICKEN_EMOJI = "\uD83D\uDC14";


    public Spear()
    {

    }

    public void start() {
        // adding color to the console
        // note how you append a color string to change its color
        System.out.println(RED + "Hello, you have acquired a legendary spear!");
        System.out.println(RED + "USE IT TO THROW AT THE CHICKEN");
        System.out.println(RED + "I WANT TO EAT CHICKEN!");
    }

    public void animateSpear() throws InterruptedException
    {
        // helper method defined below
        System.out.print(RED);
        System.out.println("                  ^--/\\-/\\-/\\-");
        System.out.println( "                " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "               " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("                  ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("                ^--/\\-/\\-/\\-");
        System.out.println( "              " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "             " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("                ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("              ^--/\\-/\\-/\\-");
        System.out.println( "            " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "           " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("              ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("            ^--/\\-/\\-/\\-");
        System.out.println( "          " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "         " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("            ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("          ^--/\\-/\\-/\\-");
        System.out.println( "        " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "       " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("          ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("      ^--/\\-/\\-/\\-");
        System.out.println( "    " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "   " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("      ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("    ^--/\\-/\\-/\\-");
        System.out.println( "   " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + " " + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("    ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("  ^--/\\-/\\-/\\-");
        System.out.println( "  " + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(CHICKEN_EMOJI + BLACK + "" + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("  ^--/\\-/\\-/\\-");
        Thread.sleep(500);

        System.out.print(RED);
        System.out.println("  ^--/\\-/\\-/\\-");
        System.out.println( "" + WHITE + "/--/ /--------l~~~~~~~|");
        System.out.println(BLACK + "" + "\\--\\ \\--------l~~~~~~~|");
        System.out.println("  ^--/\\-/\\-/\\-");
        System.out.println(WHITE + "BOOOOOM! FRIED CHICKEN FOR ALL");
    }
}
