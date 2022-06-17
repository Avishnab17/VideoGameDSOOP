package videogame.main;

import java.util.Scanner;

//
public class GameLogic {

    package videogame.main;

import java.util.Scanner;

    public class GameLogic {

        static Scanner scanner = new Scanner(System.in);
        static Player player;
        public static boolean isRunning;

        //random encounters
        public static String[] encounters = {"Battle","Battle","Battle","Rest","Rest"};
        //enemy names
        public static String[] enemies={"Ogre", "Ogre", "Goblin", "Goblin", "Stone Elemental"};


        public static int place=0, act;
        public static String[] places = {"Everlasting Mountains", "Haunted Landlines", "Castle of the Evil Emperor", "Throne Room"}
        //story elements
        //method readInt
        //method clearConsole

        public static void characterInfo(){
            clearConsole();
            printHeading("CHARACTER INFO");
            System.out.println("player.name +"\tHP"+player.hp+"/"+player.maxHp);
                    printSeperator(20);
            System.out.println("Experience: "+player.xp);
            printSeperator(20);

            System.out.println("Number of Potions"+ player.pots);
            printSeperator(20);


            //Printing chosen traits
            if(player.numAtkUpgrades > 0){
                System.out.println("Offensive trait: "+player.atkUpgrades[player.numAtkUpgrades-1]);
                printSeperator(20);
            }
            if(player.numDefUpgrades> 0){
                System.out.println("Defensive trait: "+player.defUpgrade[player.numDefUpgrades - 1]);
            }
            anythingToContinue();
        }

        public static void printMenu(){
            clearConsole();
            printHeading(places[place]);
            System.out.println("Choose an action:");
            printSeperator(20);
            System.out.println("(1) Continue on your Journey ");
            System.out.println("(2) Character Information");
            System.out.println("(3) Exit Game");
        }
        //method gameLoop

        public static void startGame(){
            boolean nameSet=false;
            String name;
            //print title screen
            clearConsole();
            printSeperator(40);
            printSeperator(30;
            System.out.println(" AGE OF EVIL EMPEROR ");
            printSeperator(30);
            printSeperator(40);
            anythingToContinue();

            do{
                clearConsole();
                printHeading("Whats's your name ?");
                name=scanner.next();
                clearConsole();
                printHeading("Your name is "+name"./Is that correct?");
                System.out.println("(1) Yes!");
                System.out.println("(2) No,I want to change my name.");
                int input=readInt("->",2);
                if(input==1)
                    nameSet=true;
            }while(!nameSet);
            //creating player object with name
            player=new Player(name);

            //print first story intro
            Story.printFirstActIntro();

            //set Running to true for game loop to continue
            isRunnining = true;

            //start main game loop
            gameLoop();
        }

        //method checkAct
//method continueJourney
        //method CharacterInfo
        //method printMenu
        public static void gameLoop(){
            while (isRunning) {
                printMenu();
                int input = readInt("-> ", 3);
                if(input == 1)
                    continueJourney();
                else if(input == 2)
                    characterInfo();
                else
                    isRunning = false;
            }
        }
        //taking a rest
        public static void takeRest(){
            clearConsole();
            if(player.restsLeft >= 1){
                printHeading("Do you want to take a rest? (" + player.restsLeft + "rest(s) left).");
                System.out.println("(1) Yes\n(2) No, not now. ");
                int input = readInt("-> ", 2);
                if(input == 1){
                    //player actually takes rest
                    clearConsole();
                    if(player.hp < player.maxHp){
                        int hpRestored = (int) (Math.random() * (player.xp/4 + 1 ) + 10);
                        player.hp += hpRestored;
                        if(player.hp > player.max.hp){
                            player.hp = player.max.hp;
                            System.out.println("You took a rest and restored up to " + hpRestored + "health.");
                            System.out.println("You're now at " + player.hp + "/" + player.maxHp + "health.");
                            player.restsLeft--;
                        }
                    }
                }else
                    System.out.println("You're now at " + player.hp + "/" + player.max.hp + "health.");
                anythingToContinue();
            }
        }

        //create a random battle with a random enemy
        public static void randomBattle(){
            clearConsole();
            printHeading("You encountered an evil minded creature. You'll have to fight it!");
            anythingToContine();//lets the game pause until the player wants it to continue
            //create new enemy with random name and passing it as parameter to the main method
            battle(new Enemy(enemies[(int)(Math.random()*enemies.length)],player.xp));
        }
        //create a main battle method
        public static void battle(Enemy enemy){
            //main battle loop
            while(true){
                clearConsole();
                printHeading(enemy.name + "\nnHP: " + enemy.hp + "/" + enemy.maxHp);
                printHeading(enemy.name + "\nnHP: " + player.hp + "/" + player.maxHp);
                System.out.println("Choose an action:");
                printSeperator(20);
                System.out.println("(1) Fight\n(2) Use Potion\n(3) Run Away");
                int input =readInt("-> ",3);
                //react accordingly to player input
                if(input == 1){
                    int dmg = player.attack() - enemy.defend();
                    int dmgTook = enemy.attack() - player.defend();
                    //check that dmg and dmgTook isn't negative
                    if(dmgTook < 0){
                        //add some dmg if player defends very well
                        dmg -= dmgTook/2;
                        dmgTook = 0;

                    }
                    if(dmg < 0){
                        dmg = 0;
                        //deal damage to both parties
                        player.hp -= dmgTook;
                        enemy.hp -= dmg;
                        //print the info of this battle round
                        clearConsole();
                        printHeading("BATTLE");
                        System.out.println("You dealt " + dmg + "damage to the " + enemy.name + ".");
                        printSeperator(15);
                        System.out.println("The " + enemy.name + " dealt " + dmgTook + " damage to you.");
                        anythingToContinue();
                        //check if player is still alive or dead
                        if(player.hp <= 0) {
                            playerDied();//method to end the game
                            break;

                        }else if(enemy.hp <= 0){
                            //tell the player he won
                            clearConsole();
                            printHeading("You defeated the " + enemy.name + "!");
                            //increase player xp
                            player.xp += enemy.xp;
                            System.out.println("You earned "+ enemy.xp + "XP!");
                            anythingToContinue();
                            break;

                        }
                    }else if(input == 2){
                        //use potion (NEXT PART)
                    }else{
                        //RUN AWAY
                        clearConsole();
                        if(act !=4){
                            clearConsole();
                            //chance of 35% to escape
                            if(Math.random()*10 + 1 <= 3.5){
                                printHeading("You ran away from the " + enemy.name + "!");
                                anythingToContinue();
                                break;
                            }else{
                                printHeading("You didn't manage to escape.");
                                //calculate damage the player takes
                                int dmgTook = enemy.attack();
                                System.out.println("In your hurry you took 0 " + dmgTook + "damage!");
                                anythingToContinue();
                                //check if player's still alive
                                if(player.hp <= 0){
                                    playerDied();
                                }

                            }else{
                                printHeading("YOU CANNOT ESCAPE THE EVIL EMPEROR!!");
                                anythingToContinue();
                            }
                        }

                    }
                }
            }
        }
        public static void playerDied(){
            clearConsole();
            printHeading("You died...");
            printHeading("You earned " + player.xp + "XP on your journey. Try to earn more next time!");

        }

    }


}
