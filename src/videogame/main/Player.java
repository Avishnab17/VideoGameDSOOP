package videogame.main;

public class Player extends Character {

    //integers to store number of upgrades/skills in each path
    public int numAtkUpgrades, numDefUpgrades;

    //additional player stats
    int gold, restsLeft, pots;

    //Array to store skill names
    public String[] atkUpgrades = {"Strength","Power","Might","Godlike Strength"};
    public String[] defUpgrades = {"Heavy Bones","StoneSkin","Scale Armor","Holy Aura"};

    //Player specific constructor
    public Player(String name){
        //calling constructor of superclass
        super(name, 100, 0);
        //Setting # of upgrades to 0
        this.numAtkUpgrades = 0;
        this.numDefUpgrades = 0;
        //set additional stats
        this.gold = 5;
        this.restsLeft = 1;
        this.pots = 0;
        //let the player choose a trait when creating a new character
        chooseTrait();
    }


    //Player specific methods (more in next part)
    @Override
    public int attack(){

        //  TODO Auto-generated method stub
        return (int)(Math.random()*(xp/4 + numAtkUpgrades*3 + 3) + xp/10 + numAtkUpgrades*2 + numDefUpgrades + 1);
    }
    @Override
    public int defend(){

        //  TODO Auto-generated method stub
        return (int)(Math.random()*(xp/4 + numDefUpgrades*3 + 3) + xp/10 + numDefUpgrades*2 + numAtkUpgrades + 1);
    }

    //let the player choose a trait of either skill path
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
        }
        else{
            GameLogic.printHeading("You chose " + defUpgrades[numDefUpgrades] + "!");
            numDefUpgrades++;
        }
        GameLogic.anythingToContinue();
    }
}

