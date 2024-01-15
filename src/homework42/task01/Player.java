package homework42.task01;

public abstract class Player extends Entity {

  protected Player(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public boolean isAlive() {
    System.out.println(getName() + " I am alive!");
    return super.isAlive();
  }
}
