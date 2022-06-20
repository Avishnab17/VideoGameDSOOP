package videogame.main;

public class Enemy extends Character{

  //variable to store player's current XP
  int playerXp;

  //Enemy-specific constructor
  public Enemy(String name, int playerXp){

      super(name, (int)(Math.random() * playerXp + playerXp/3 + 5), (int)(Math.random()*(playerXp/4 + 2)+1));
        //assigning variable
       this.playerXp = playerXp;

  }
  //Enemy specific attack and defense calculations
  @Override
  public int attack(){
      return (int)(Math.random() * (playerXp/4 + 1) + xp/4 + 3);
  }
  @Override
    public int defend(){
        return (int)(Math.random() * (playerXp/4 + 1) + xp/4 + 3);
    }

}
