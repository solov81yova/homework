package homework42.task01;

public class Monster extends Entity implements Attackable {

  public Monster(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public boolean isAlive() {
    System.out.println(getName() + " I am alive!");
    return super.isAlive();
  }

  @Override
  public void attack(Attackable target, int attackPower) {

    target.takeDamage(attackPower);
    System.out.println("Monster attacked. Damage dealt: " + attackPower);
  }

  @Override
  public void takeDamage(int source) {
    this.health -= source;
    System.out.println("Monster took " + source + " damage. Current health: " + this.health);
  }
}
