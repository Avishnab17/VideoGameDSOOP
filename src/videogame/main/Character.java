package videogame.main;

/**
 * This method represents the participants of the game.
 * It is a superclass for both player and enemy
 *
 * @author Vaishnavi
 *
 */
public abstract class Character  //both player and enemy will inherit from
{
    //Variables / Attributes all characters have
    public String name; //stores character's name
    public int maxHp, hp, xp;

    //Constructor for character

    /**
     * This method is called when object of the Character class is created.
     * The global parameters of the class is then take the value of the local parameters in the constructor.
     *
     * @author Vaishnavi
     *
     * @param name Name assigned to the Character created.
     * @param maxHp The maximum Health that the Character can have.
     * @param xp The Experience of the Character.
     */
    public Character(String name, int maxHp, int xp) //constructor
    {
        this.name=name;
        this.maxHp=maxHp;
        this.xp=xp;
        this.hp=maxHp;

    }

    /**
     * The attack method is found in both subclasses of Player and Enemy.
     * This method is overridden in the Player and Enemy subclasses to inherit from subclass Character.
     * The attack method is the rate at which the Character can attack as per its experience.
     *
     * @author Vaishnavi
     *
     * @return A random integer value as per the attack calculation
     */
    public abstract int attack();  //abstract and will be overwritten by the subclasses
    /**
     * The defend method is found in both subclasses of Player and Enemy.
     * This method is overridden in the Player and Enemy subclasses to inherit from subclass Character.
     * The defend method is the rate at which the Character can defend as per its experience.
     *
     * @author Vaishnavi
     *
     * @return A random integer value as per the defend calculation
     */
    public abstract int defend();
}

