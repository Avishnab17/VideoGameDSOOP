package videogame.main;

public class Story {
    public static void printIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("STORY");
        GameLogic.printSeperator(30);
        System.out.println(GameLogic.player.name + ", leader of the tough as nails gladiator Jaeger Vernietiger clan.\n");
        System.out.println("Your clan is mostly recognized by the people of Dorsia, a town of fellow Indians, for fending off the fearsome monster invasion in 1939.\n");
        System.out.println("Nearly all monster species had been wiped out, or those that survived their numbers reduced to ridicule.\n");
        System.out.println("But that would not be their end, for the almighty monster deity Hell Judecca still drew breath, and could rebirth the numbers once again, as long as the blood of Dorsians could still be sacrificed.\n");
        System.out.println("You may not be the hero the Dorsians seek, but your lust for vengeance must be quelled, for it is monsters that took from you your beloved, Sindel.");
        GameLogic.anythingToContinue();
    }
    public static void printFirstActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT I -INTRO");
        GameLogic.printSeperator(30);
        System.out.println();
        GameLogic.anythingToContinue();
    }
    public static void printFirstActOutro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT I -OUTRO");
        GameLogic.printSeperator(30);
        System.out.println("");
        GameLogic.anythingToContinue();
    }
    public static void printSecondActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT II -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printSecondActOutro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT II -OUTRO");
        GameLogic.printSeperator(30);
        System.out.println("");
        GameLogic.anythingToContinue();
    }

    public static void printThirdActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT III -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("");
        GameLogic.anythingToContinue();
    }
    public static void printThirdActOutro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT III -OUTRO");
        GameLogic.printSeperator(30);
        System.out.println("");
        GameLogic.anythingToContinue();
    }
    public static void printFourthActIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("ACT IV -INTRO");
        GameLogic.printSeperator(30);
        System.out.println("");
        GameLogic.anythingToContinue();
    }
    public static void printEnd(Player player)
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("Congratulations, "+player.name +" defeated enemy ");
        GameLogic.printSeperator(30);
        System.out.println("Hope you enjoyed it");
    }
}

