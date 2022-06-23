package videogame.main;

public abstract class Character  //both player and enemy will inherit from
{
    //Variables / Attributes all characters have
    public String name; //stores character's name
    public int maxHp, hp, xp;

    //Constructor for character
    public Character(String name, int maxHp, int xp) //constructor
    {
        this.name=name;
        this.maxHp=maxHp;
        this.xp=xp;
        this.hp=maxHp;

    }
    public abstract int attack();  //abstract and will be overwritten by the subclasses
    public abstract int defend();
}

