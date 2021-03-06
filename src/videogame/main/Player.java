package videogame.main;

/**
 * This class is extended from Character
 * @author Vrisht-Raaj
 */
public class Player extends Character { //inherit from superclass Character

    //integers to store number of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    //additional player stats
    int gold, restsLeft, pots;

    //Array to store skill names
    public String[] atkUpgrades = {"Executioner","Power","Son of God","Godlike Strength"};
    public String[] defUpgrades = {"Shield Knight","SteelSkin","Hedgehog","Divine Aura"};

    /**
     * This is player specific constructor.
     * @param name Player's name
     * @author Vrisht-Raaj
     */
    //Player specific constructor
    public Player(String name){  //only takes name since maxHp and xp will be hardcoded
        //calling constructor of superclass
        super(name, 100, 0);
        //Setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //set additional stats
        this.gold = 25;
        this.restsLeft = 2;
        this.pots = 1;
        //let the player choose a trait when creating a new character
        chooseTrait();
    }

    /**
     * This method is overridden from character
     * @return a random value
     * @author Vrisht-Raaj
     */

    //Player specific methods (more in next part)
    @Override  //indicates that those methods altered from what they have been assigned to in their superclass
    public int attack(){

        //  TODO Auto-generated method stub
        return (int)(Math.random()*(xp/4 + numAtkUpgrades*4 + 3) + xp/10 + numAtkUpgrades*4 + numDefUpgrades + 1);
    }
    /**
     * This method is overridden from character
     * @return a random value
     * @author Vrisht-Raaj
     */
    @Override
    public int defend(){

        //  TODO Auto-generated method stub
        return (int)(Math.random()*(xp/4 + numDefUpgrades*3 + 3) + xp/10 + numDefUpgrades*4 + numAtkUpgrades + 1);
    }

    /**
     * This method let the player choose a trait of either skill path
     * @author Vrisht-Raaj
     */
    public void chooseTrait(){
        GameLogic.clearConsole();
        GameLogic.printHeading("Choose a trait:");
        System.out.println("(1) " + atkUpgrades[numAtkUpgrades]);
        System.out.println("(2) " + defUpgrades[numDefUpgrades]);
        //get the player's choice:
        int input = GameLogic.readInt("-> ", 2);
        GameLogic.clearConsole();
        //deal with both cases
        if(input == 1){
            GameLogic.printHeading("You chose " + atkUpgrades[numAtkUpgrades] + "!");
            numAtkUpgrades++;
        }else{
            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
    }
}

