package videogame.main;

/***
 * This class is extended from character.
 * @author Vrisht-Raaj
 */
public class Enemy extends Character{

  //variable to store player's current XP
  int playerXp;

  //Enemy-specific constructor

    /***
     * This is an enemy specific constructor
     * It calculates the experience point of the enemy at random
     * @author Vrisht Raaj
     * @param name The name of the enemy
     * @param playerXp The experience point of the player
     */
  public Enemy(String name, int playerXp){

      super(name, (int)(Math.random()*playerXp + playerXp/3 + 5), (int) (Math.random()*(playerXp/4 + 2)+1));
        //assigning variable
       this.playerXp = playerXp;
  }

  //Enemy specific attack and defense calculations

    /***
     * This method is used to calculate how much attack the enemy made to the player.
     * @author Vrisht Raaj
     * @return a random value
     *
     */
  @Override
  public int attack(){
      return (int) (Math.random()*(playerXp/3 + 7) + xp/3 + 7);
  }

    /***
     * This method is used to calculate how much the enemy has defended himself
     * @author Vrisht Raaj
     * @return a random value
     */
  @Override
    public int defend(){
        return (int) (Math.random()*(playerXp/4 + 1) + xp/4 + 3);
    }

}
