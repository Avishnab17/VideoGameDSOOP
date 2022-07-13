package videogame.main;
import java.util.Scanner;

/**
 * This class is the main class for building the whole game
 *
 * @author Bootun Doorgeshwaree(Avishna),Dookheet Vaishnavi, Joyseeree Vrisht-Raaj(Ryan), Munogee Nayurvi
 *
 */
public class GameLogic {

    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;
    //random encounters
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};
    //enemy names
    public static String[] enemies = {"Ogre", "Ogre", "Goblin", "Goblin", "Stone Elemental"};
    public static int place = 0, act = 1;

    public static int judgement = 5;


    //story elements
    public static String[] places = {"Everlasting Mountains", "Haunted Landlines", "Castle of the Evil Emperor", "Throne Room"};
    //method readInt

    /**
     * This method is for reading the input of the user prompting him to enter an integer.
     * It is called in other methods where the user will use it to proceed with the game.
     *
     * @author Avishna
     *
     * @param prompt It is the input of the user which will be stored in string format. It represents the choice of the user
     * @param userChoices the number of choices will be hardcoded through the game when calling the method
     * @return The choice of the user in integer format
     */
    public static int readInt(String prompt, int userChoices) {
        int input;

        do {
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());//convert string to integer and returns a random value
            }catch(Exception e){  //if any error occurs, we set our input to -1 and print the message.
                input = -1;
                System.out.println("Please enter an integer!");
            }
        }while(input < 1 || input > userChoices); //to get user input, as long as input is not between 1 and number of choices
        return input;
    }
    //method clearConsole

    /**
     * This is a simple method for display purposes.
     * It prints a lot of 100 lines in the terminal whenever the method is called
     *
     * @author Avishna
     *
     */
    public static void clearConsole() {
        for (int i = 0; i < 100; i++)
            System.out.println();
    }
    //print separator

    /**
     * This is a method to display a line of dashes whenever it is called.
     *
     * @author Avishna
     *
     * @param n It is the number of dashes
     */
    public static void printSeperator(int n) {
        for (int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }
    //method to printf heading

    /** This method is used whenever we want to display a string as a heading.
     *
     * @author Avishna
     *
     * @param title The hardcoded string that we want to display as heading
     */
    public static void printHeading(String title) {
        printSeperator(30);
        System.out.println(title);
        printSeperator(30);
    }
    //method to stop the game until user enters anything, so that user can get time to read the console

    /**
     * This method is used to enter takes any value from user.
     * @author Avishna
     */
    public static void anythingToContinue() {
        System.out.println("\nEnter anything to continue : ");
        scanner.next();
    }

    /**
     *This method is used to start the game.
     * We need to input our name, and we can change our name if it is incorrect.
     * It creates a player object and set isRunning to true for the gameLoop to continue.
     * It then calls the method gameLoop.
     * @author Vaishnavi
     */
    public static void startGame(){
        boolean nameSet=false;
        String name;
        //print title screen
        clearConsole();
        printSeperator(40);
        printSeperator(30);
        System.out.println(" AGE OF EVIL EMPEROR ");
        System.out.println("HAVE FUN");
        printSeperator(30);
        printSeperator(40);
        anythingToContinue();
        // Get choice to change his name
        do {
            clearConsole();
            printHeading("What's your name ?");
            name = scanner.next();
            clearConsole();
            printHeading("Your name is " + name + ".\nIs that correct?");
            System.out.println("(1) Yes!");
            System.out.println("(2) No,I want to change my name.");
            int input = readInt("->", 2);
            if (input == 1)
                nameSet = true;
        }while(!nameSet);


        //creating player object with name
        player = new Player(name);

        //print story intro
        Story.printIntro();

        //print first story act intro
        Story.printFirstActIntro();

        //set Running to true for game loop to continue
        isRunning = true;

        //start main game loop
        gameLoop();
    }

    public static int FirstBossDefeated = 0;
    public static int SecondBossDefeated = 0;
    public static int ThirdBossDefeated = 0;
    public static int ActiveBossFight = 0;
    public static int encounternum = 0; //change game's values based on player xp


    /**
     * This method enables us to level up in the game.
     * @author Avishna
     */
    public static void checkAct() {
        //change acts based on xp
        //level up
        if (encounternum == 1 && act == 1) {
            if(FirstBossDefeated == 0) {
                encounternum = 0;
                ActiveBossFight = 1;
                FirstActBoss();
            }
            else {
                encounternum = 0;
                //increment act and place;
                act = 2;
                place = 1;
                //story
                Story.printFirstActOutro();
                System.out.println("\nCongratulations, you have moved on to Level 2!");
                //let player level up
                player.chooseTrait();
                //story
                Story.printSecondActIntro();
                //assign new values to enemy
                enemies[0] = "Evil Mercenary";
                enemies[1] = "Goblin";
                enemies[2] = "Wolves Pack";
                enemies[3] = "Henchman of the Evil Emperor";
                enemies[4] = "Scary Stranger";
                //assign encounter values
                encounters[0] = "Battle";
                encounters[1] = "Battle";
                encounters[2] = "Battle";
                encounters[3] = "Rest";
                encounters[4] = "Shop";
            }
        } else if (encounternum == 1 && act == 2){
            if(SecondBossDefeated == 0) {
                encounternum = 0;
                ActiveBossFight = 1;
                SecondActBoss();
            }
            else {
                encounternum = 0;
                //increment act and place
                act = 3;
                place = 2;
                Story.printSecondActOutro();
                System.out.println("\nCongratulations, you have moved on to Level 3!");
                //level up
                player.chooseTrait();
                //Story
                Story.printThirdActIntro();
                //assign new values to enemy
                enemies[0] = "Evil Mercenary";
                enemies[1] = "Evil Mercenary";
                enemies[2] = "Henchman of the Evil Emperor";
                enemies[3] = "Henchman of the Evil Emperor";
                enemies[4] = "Henchman of the Evil Emperor";
                //assign encounter values
                encounters[0] = "Battle";
                encounters[1] = "Battle";
                encounters[2] = "Battle";
                encounters[3] = "Battle";
                encounters[4] = "Shop";
                //fully heal player
                player.hp = player.maxHp;
            }
        }else if (encounternum == 1 && act == 3) {
            if(ThirdBossDefeated == 0) {
                encounternum = 0;
                ActiveBossFight = 1;
                ThirdActBoss();
            }
            else {
                ActiveBossFight = 1;
                encounternum = 0;
                //increment act and place
                act = 4;
                place = 3;
                //story
                System.out.println("Congratulations, you have moved on to Level 4!");
                Story.printThirdActOutro();
                //level up
                player.chooseTrait();
                //story
                Story.printFourthActIntro();
                //fully heal the player
                player.hp = player.maxHp;
                //calling last battle
                finalBattle();
            }
        }
    }

    /**
     *  This method which presents a random encounter to the player. eg fight, rests or shop
     *  @author Avishna
     */

    public static void randomEncounter() {
        //rand num between 0 and length of encounters array
        int encounter = (int) (Math.random()* encounters.length);
        //calling methods
        if (encounters[encounter].equals("Battle")) {
            randomBattle();
        } else if (encounters[encounter].equals("Rest")) {
            takeRest();
        } else {
            shop();
        }
    }

    /**
     * method continueJourney() will generate random encounters for the player to defeat.
     * If enough enemies are defeated, player is taken to the next stage/level/act.
     * @author Avishna
     */
    //method to continue journey
    public static void continueJourney() {
        //check if act must be increased
        checkAct();
        //check if game is in last act
        if ((encounternum == 0)&&(isRunning)) {
            randomEncounter();
        }
    }

    /**
     * method characterInfo() gives the player the option to see their current inventory and statistics
     * such as current health, available currency(gold), number of consumables and XP.
     * @author Vaishnavi
     */
    public static void characterInfo(){
        clearConsole();
        printHeading("CHARACTER INFO");
        System.out.println("Name: " +player.name);
        printSeperator(20);
        System.out.println("HP: "+player.hp + "/" + player.maxHp);
        printSeperator(20);
        System.out.println("Experience: " + player.xp + "\tGold: " + player.gold);
        printSeperator(20);
        System.out.println("Number of Potions: " + player.pots);
        printSeperator(20);
        System.out.println("Number of Judgements: " + judgement);
        printSeperator(20);
        //Printing chosen traits
        if (player.numAtkUpgrades > 0) {
            System.out.println("Offensive trait: " + player.atkUpgrades[player.numAtkUpgrades - 1]);
            printSeperator(20);
        }
        if (player.numDefUpgrades > 0) {
            System.out.println("Defensive trait: " + player.defUpgrades[player.numDefUpgrades - 1]);
        }
        anythingToContinue();
    }

    /**
     * method printMenu() will print the main menu options.
     * Options such as continuing, exiting the game or displaying character information.
     * @author Vaishnavi
     */
    public static void printMenu() {
        clearConsole();
        printHeading(places[place]);
        System.out.println("Choose an action:");
        printSeperator(20);
        System.out.println("(1) Continue on your Journey ");
        System.out.println("(2) Character Information");
        System.out.println("(3) Exit Game");
    }

    /**
     * method gameLoop() will either keep the game running, display character information or exit.
     * This depends on user input and any option can be accessed anytime.
     * @author Avishna
     */
    public static void gameLoop() {
        while(isRunning) {
            printMenu();
            int input = readInt("-> ", 3);
            if (input == 1)
                continueJourney();
            else if (input == 2)
                characterInfo();
            else
                isRunning = false;
        }
    }
    //method gameLoop

    //----------------------------------------------------------------------------------------------------------------------------
    //New!the final(last) battle of the entire game
    public static void FirstActBoss() {
        //creating the evil emperor and letting the player fight against him
        battle(new Enemy("NiddHogg", 5));
        FirstBossDefeated = 1;
        ActiveBossFight = 0;

    }

    //New!!the final(last) battle of the entire game
    public static void SecondActBoss() {
        //creating the evil emperor and letting the player fight against him
        battle(new Enemy("L'Agret du Regret", 10));
        SecondBossDefeated = 1;
        ActiveBossFight = 0;

    }

    //New!!!the final(last) battle of the entire game
    public static void ThirdActBoss() {
        //creating the evil emperor and letting the player fight against him
        battle(new Enemy("Evil Sindel", 20));
        ThirdBossDefeated = 1;
        ActiveBossFight = 0;

    }
     //----------------------------------------------------------------------------------------------------------------------------


    /**
     * This method is for the final battle. The enemy that the player has to fight is The evil emperor
     * @author Yashi
     */
    //the final(last) battle of the entire game
    public static void finalBattle() {
        //creating the evil emperor and letting the player fight against him
        battle(new Enemy("THE EVIL EMPEROR", 100));
        //printing the proper ending
        if(encounternum==1)
        {
        Story.printEnd(player);
        }
        isRunning = false;
    }

    /**
     * This method is to display a message to indicate that the player died in case he was defeated by the enemy
     * @author Yashi
     */
    public static void playerDied() {
        clearConsole();
        printHeading("You died...");
        printHeading("You earned " + player.xp + "XP on your journey. Try to earn more next time!");
        System.out.println("Thank you for playing. I hope you enjoyed");
        isRunning=false;
    }
    /**
     * This method is called when the player meets a mysterious stranger from whom he can shop potions only if he has enough gold.
     * @author Yashi
     */
    public static void shop() {
        clearConsole();
        printHeading("You meet a mysterious stranger.\nHe offers you something!");
        int price = (int) (Math.random()* (10 + player.pots*3) + 10 + player.pots);
        System.out.println("- Magic Potion: " + price + " gold.");
        printSeperator(20);
        //ask player if he wants to buy one
        System.out.println("Do you want to buy one?\n(1)Yes!\n(2) No thanks.");
        int input = readInt("-> ", 2);
        //check if player wants to buy
        if (input == 1) {
            clearConsole();
            //check if player has enough gold
            if (player.gold >= price) {
                printHeading("You bought a magical potion for " + price + " gold.");
                player.pots++;
                player.gold -= price;
            } else
                printHeading("You don't have enough gold to buy this...");
            anythingToContinue();
        }
    }

    /**
     * This method asks the player if he is willing to take a rest. If player's health is full, and he wants to take rest, he will not be able to take rest. If he is not at full health and wishes to take rest, he will be allowed to do so. If he chooses not to take rest, he will continue to play.
     * @author Yashi
     */
    public static void takeRest() {
        clearConsole();
        if (player.restsLeft >= 1) {
            printHeading("Do you want to take a rest? (" + player.restsLeft + "rest(s) left).");
            System.out.println("(1) Yes\n(2) No, not now. ");
            int input = readInt("-> ", 2);
            if ((input == 1)&&(player.hp < player.maxHp)) {
                //player actually takes rest
                clearConsole();
                //if (player.hp < player.maxHp) {
                    int hpRestored = (int) (Math.random() * (player.xp/4 + 1) + 10);
                    player.hp += hpRestored;
                    if (player.hp > player.maxHp) {
                        player.hp = player.maxHp;
                    }
                    System.out.println("You took a rest and restored up to " + hpRestored + " health.");
                    System.out.println("You're now at " + player.hp + "/" + player.maxHp + " health.");
                    player.restsLeft--;
               // }
            } else if ((input==1)&&(player.hp == player.maxHp)) {
                System.out.println("Your health is at its maximum, you are fit to fight!");
            }
            else
                System.out.println("Let's continue to play then!");
            anythingToContinue();
        }
    }

    /**
     * This method is creating a battle with a random enemy.
     * @author Yashi
     */
    public static void randomBattle() {
        clearConsole();
        printHeading("You encountered an evil minded creature. You'll have to fight it!");
        anythingToContinue();//lets the game pause until the player wants it to continue
        //create new enemy with random name and passing it as parameter to the main method
        battle(new Enemy(enemies[(int) (Math.random() * enemies.length)], player.xp));
    }

    /**
     * This method will give the player the option to fight, use potion, run away from encountered enemy or Judgement.
     * If player chooses to fight, the damage caused by the enemy and  to the enemy will be accounted.
     * If he chooses to use potion, he will be able to use it only if he possesses any.
     * If he chooses to run away, he might deal with damage from the enemy
     * if he chooses Judgement, he can cause massive damage to enemy
     * @param enemy It takes the random enemy generated from randomBattle, and for finalBattle it will take THE EVIL EMPEROR.
     * @author Yashi
     */
    public static void battle(Enemy enemy) {
        //main battle loop
        while (true) {
            clearConsole();
            printHeading(enemy.name + "\nnHP: " + enemy.hp + "/" + enemy.maxHp);
            printHeading(player.name + "\nnHP: " + player.hp + "/" + player.maxHp);
            System.out.println("Choose an action:");
            printSeperator(20);
            System.out.println("(1) Fight\n(2) Use Potion\n(3) Run Away\n(4) Judgement");
            int input = readInt("-> ", 4);
            //react accordingly to player input
            if (input == 1) {
                int dmg = player.attack() - enemy.defend();
                int dmgTook = enemy.attack() - player.defend();
                //check that dmg and dmgTook isn't negative
                if (dmgTook < 0) {
                    //add some dmg if player defends very well
                    dmg -= dmgTook / 2;
                    dmgTook = 0;
                }
                if (dmg < 0)
                    dmg = 0;
                //deal damage to both parties
                player.hp -= dmgTook;
                enemy.hp -= dmg;
                //print the info of this battle round
                clearConsole();
                printHeading("BATTLE");
                System.out.println("You dealt " + dmg + " damage to " + enemy.name + ".");
                printSeperator(15);
                System.out.println(enemy.name + " dealt " + dmgTook + " damage to you.");
                anythingToContinue();

                //check if player is still alive or dead
                if (player.hp <= 0) {
                    playerDied();//method to end the game
                    break;
                } else if (enemy.hp <= 0) {
                    //tell the player he won
                    clearConsole();
                    encounternum++;
                    printHeading("You defeated " + enemy.name + "!");
                    //increase player xp
                    player.xp += enemy.xp;
                    System.out.println("You earned " + enemy.xp + "XP!");

                    //random drops
                    boolean addRest = (Math.random()* 5 + 1 <= 2.25);
                    int goldEarned = (int) (Math.random()*enemy.xp);
                    if (addRest) {
                        player.restsLeft++;
                        System.out.println("You earned the chance to get an additional rest!");
                    }
                    if (goldEarned > 0) {
                        player.gold += goldEarned;
                        System.out.println("You collect " + goldEarned + " gold from the " + enemy.name + "'s corpse");
                    }
                    anythingToContinue();
                    break;
                }

            } else if (input == 2) {
                //use potion
                clearConsole();
                if (player.pots > 0 && player.hp < player.maxHp) {
                    //player can take a potion
                    //make sure player wants to drink potion
                    printHeading("Do you want to drink a potion? (" + player.pots + " left.)");
                    System.out.println("(1) Yes\n(2) No, maybe later");
                    input = readInt("-> ", 2);
                    if (input == 1) {
                        //player actually took it
                        player.hp = player.maxHp;
                        clearConsole();
                        printHeading("You drank a magic potion. It restored your health back to " + player.maxHp);
                        anythingToContinue();
                    }
                } else {
                    //player CANNOT take a potion
                    printHeading("You don't have any potions or you're at full health.");
                    System.out.println("HP: "+player.hp + "/" + player.maxHp);
                    printSeperator(20);
                    System.out.println("Number of Potions: " + player.pots);
                    anythingToContinue();
                }
            } else if (input ==3){
                //RUN AWAY
                clearConsole();
                if (ActiveBossFight == 0) {   //*
                    //chance of 35% to escape
                    if (Math.random() * 10 + 1 <= 3.5) {
                        printHeading("You ran away from the " + enemy.name + "!");
                        anythingToContinue();
                        break;
                    } else {
                        printHeading("You didn't manage to escape.");
                        //calculate damage the player takes
                        int dmgTook = enemy.attack();
                        System.out.println("In your hurry you took " + dmgTook + " damage!");
                        anythingToContinue();
                        player.hp-=dmgTook;
                        //check if player's still alive
                        if (player.hp <= 0)
                            playerDied();
                    }

                } else {
                    printHeading("You cannot run away from a boss!");
                    anythingToContinue();
                }
            }else if(input==4){

                clearConsole();
                    printHeading("Do you want to use Judgement?");
                    System.out.println("(1) Yes\n(2) No, maybe later");
                    input = readInt("-> ", 2);
                      if(input==1 && enemy.hp>20 && judgement>0 && player.hp<player.maxHp) {
                        System.out.println("You have " + judgement + " Judgement.");
                        double v = enemy.hp * 0.9;
                        int v1 = (int) v;
                        enemy.hp = enemy.hp - v1;
                        judgement--;
                        System.out.println("You dealt " + v1 + " damage to the enemy.");
                        System.out.println("The enemy's internal organs are now visible.");
                        System.out.println("You have " + judgement + " Judgement left.");
                        anythingToContinue();
                      }
                      else if(judgement==0){
                            System.out.println("You have no Judgement.");
                        }
                      else if(enemy.hp<=20){
                            System.out.println("You cannot use a Judgement.\n Your enemy is already weak.");
                        }
                        else if(player.hp==player.maxHp){
                            System.out.println("You are at full health.\n You don't need a Judgement.");
                        }
                        System.out.println("Continue your journey!!");
                        anythingToContinue();
                    }

               // }
                //anythingToContinue();
           // }
        }
    }

}
