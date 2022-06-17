package videogame.main;

public class Story {
    public static void printIntro()
    {
        GameLogic.clearConsole();
        GameLogic.printSeperator(30);
        System.out.println("STORY");
        GameLogic.printSeperator(30);
        System.out.println("You are the only survivor after the attack made");
        System.out.println("");
        System.out.println("");
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
        System.out.println("Congratulations, "+player.name +"cdkfn ");
        GameLogic.printSeperator(30);
        System.out.println("Hope you enjoyed it");
        GameLogic.anythingToContinue();
    }


}

