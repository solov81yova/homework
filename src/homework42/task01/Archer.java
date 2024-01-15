package homework42.task01;

import java.util.Objects;
import java.util.Random;

public class Archer extends Player implements Attackable {

  public Archer(String name, int health, int attackPower) {
    super(name, health, attackPower);

  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getHealth(), getAttackPower());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Archer archer;
    if (obj instanceof Archer) {
      archer = (Archer) obj;
    } else {
      return false;
    }
    return this.getName().equals(archer.getName())
        && this.getHealth() == archer.getHealth()
        && this.getAttackPower() == archer.getAttackPower();
  }

  @Override
  public String toString() {
    return "Archer{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }

  @Override
  public void attack(Attackable target, int attackPower) {

    Random random = new Random();
    int chance = random.nextInt(100);
    if (chance < 20) {
      target.takeDamage(attackPower * 2);
      System.out.println("Archer attacked with double damage. Damage dealt: " + (attackPower * 2));
    } else {
      target.takeDamage(attackPower);
      System.out.println("Archer attacked. Damage dealt: " + attackPower);
    }
  }

  @Override
  public void takeDamage(int source) {
    Random random = new Random();
    int chance = random.nextInt(100);
    if (chance < 25) {
      System.out.println("Archer dodged the attack. Damage got: 0");
    } else {
      System.out.println("Archer took " + source + " damage.");
    }
  }
}