package videogame.main;

/**
 * The Story class will tell the tale of the game through text
 * There are several stages each with their introduction and conclusions
 * There will a small text printed at each of these intervals to give the player some plot insight
 * @author
 */

public class Story {

    /**
     * method printIntro() will print the story prologue.
     * @author
     */
    public static void printIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("STORY");
        GameLogic.printSeperator(30);
        System.out.println(GameLogic.player.name + ", leader of the tough as nails gladiator Jaeger Vernietiger clan.\n");
        System.out.println("Your clan is mostly recognized by the people of Dorsia, a town of fellow Indians, for fending off the fearsome monster invasion of 1939.\n");
        System.out.println("Nearly all monster species had been wiped out, or those that survived their numbers reduced to ridicule.\n");
        System.out.println("But that would not be their end, for the almighty monster deity Hell Judecca still drew breath, and could rebirth the numbers once again, as long as the blood of Dorsians could still be sacrificed.\n");
        System.out.println("You may not be the hero the Dorsians seek, b ut your lust for vengeance must be quelled, for it is monsters that took from you your beloved, Sindel.");
        GameLogic.anythingToContinue();
    }

    /**
     * method printFirstActIntro() will print the story for the beginning of the first act.
     * @author
     */
    public static void printFirstActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT I -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("You are in " + GameLogic.places[GameLogic.place] + ", a region known to be commuted by monster weaklings and newborns.\n");
        System.out.println("Today is great day for a pre-emptive strike on the monster population count! - " + GameLogic.player.name +"\n");
        System.out.println("You set to continue on your journey ahead, with a mean right hook and smug face.\n");
        GameLogic.anythingToContinue();
    }

    /**
     * method printFirstActOutro() will print the story for the end of the first act.
     * @author
     */
    public static void printFirstActOutro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT I -OUTRO");
        GameLogic.printSeperator(30);
        System.out.println("The blood-sucking parasite NiddHogg has been sent to a new Hell, the blood sacrifices on the village will now cease!\n");
        System.out.println("However, you do not share the same feelings as the village people.\n");
        System.out.println("Revenge is your hindsight, and anyone in the way shall accordingly be crushed, monster or not.\n");
        GameLogic.anythingToContinue();
    }

    /**
     * method printSecondActOutro() will print the story for the beginning of the second act.
     * @author
     */
    public static void printSecondActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT II -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("-");
        GameLogic.anythingToContinue();
    }

    /**
     * method printSecondActOutro() will print the story for the end of the second act.
     * @author
     */
    public static void printSecondActOutro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT II -OUTRO");
        GameLogic.printSeperator(30);
        System.out.println("-");
        GameLogic.anythingToContinue();
    }

    /**
     * method printThirdActIntro() will print the story for the beginning of the third act.
     * @author
     */
    public static void printThirdActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT III -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("-");
        GameLogic.anythingToContinue();
    }

    /**
     * method printThirdActOutro() will print the story for the end of the third act.
     * @author
     */
    public static void printThirdActOutro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT III -OUTRO");
        GameLogic.printSeperator(30);
        System.out.println("-");
        GameLogic.anythingToContinue();
    }

    /**
     * method printFourthActIntro() will print the story for the beginning of the last act.
     * @author
     */
    public static void printFourthActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT IV -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("-");
        GameLogic.anythingToContinue();
    }

    /**
     * method printFirstActIntro() will print the ending tale and credits.
     * @author
     */
    public static void printEnd(Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("Congratulations, "+player.name +" defeated enemy ");
        GameLogic.printSeperator(30);
        System.out.println("Hope you enjoyed it");
    }
}

