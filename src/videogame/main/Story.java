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
        System.out.println("You may not be the hero the Dorsians seek, but your lust for vengeance must be quelled, for it is monsters that took from you your beloved, Sindel.");
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
        System.out.println(GameLogic.places[GameLogic.place] + ", a place where people that once thought they could live free resided.\n");
        System.out.println("Now their souls roam freely in these lands, always surveying for their next prey, looking to end their torment.\n");
        System.out.println("Being a body replacement was unfortunately not something you eerily desired, however.");
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
        System.out.println("The mushy mess of Juddecca's royal knight lay on the red-painted lands, soon to be lost forever to time, because nature doesn't sleep.\n");
        System.out.println("His soul too shall eternally roam these lands...");
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
        System.out.println("You've made your way to the"+ GameLogic.places[GameLogic.place] +", your revenge journey is almost coming to an end.\n");
        System.out.println("As you step on these cursed lands, you feel an endearing presence nearby.\n");
        System.out.println("This was the first time in a long time you felt an emotion this dense, ever since you held Sindel's dead body.\n");
        System.out.println("You make your way inside, following this presence as it draws you....");
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
        System.out.println("In your hands were again, your beloved, in her elegance but cold.\n");
        System.out.println("The line between victory and defeat had blurred to non-existence.\n");
        System.out.println("The emotion you felt was absolute rage, but it was also being quelled by the idea of a last chance to revive your fallen love.\n");
        System.out.println("You knew, however, that it would not be possible. Nothing can reverse death, or memories of the past.\n");
        System.out.println("You had to put an end to the use of such deceiving power, so you keep going, now set to kill the evil emperor.");
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
        System.out.println("After mercilessly slaughtering the rest of the emperor's minions, you arrive at a gold and ruby-infused door.\n");
        System.out.println("You take a small step backwards, then kick the door down with all your might.\n");
        System.out.println("Behind laid another entity, in a magnanimous and unfazed stance, sitting on a chair of levitating souls.\n");
        System.out.println("You already knew who it was....\n");
        System.out.println("I've come to stop you sucking the air of this Earth, Juddecca! - "+ GameLogic.player.name + "\n");
        System.out.println("He calmly gets a soul to lift him from his chair and says.......\n");
        System.out.println("You.....will SUFFER!");
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
        System.out.println("The evil emperor has finally been brought down!\n");
        System.out.println("You draw your sword back from his unresponsive body.\n");
        System.out.println("They say revenge is not the answer, and that it leaves you always dissatisfied.\n");
        System.out.println("You leave the castle knowing that is nonsense. Seeing the emperor dead brought you peace and determination to keep on existing.\n");
        System.out.println("You come back to the village to a grand welcoming feast and chants of name.\n");
        System.out.println("'All hail " + GameLogic.player.name +"'! They all cheered.\n");
        System.out.println("Maybe being a person of the people is not so bad and boring after all...\n");
        System.out.println("Congratulations,you("+ player.name +") destroyed the EVIL EMPEROR!");
        GameLogic.printSeperator(30);
        System.out.println("--------------------------END OF GAME--------------------------");
    }
}

