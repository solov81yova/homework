package homework42.task01;

import java.util.Objects;

public class Warrior extends Player implements Attackable {
protected int armor;

  public Warrior(String name, int health, int attackPower, int armor) {
    super(name, health, attackPower);
    this.armor = armor;
  }

  public int getArmor() {
    return armor;
  }

  public void setArmor(int armor) {
    this.armor = armor;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Warrior warrior;
    if (obj instanceof Warrior) {
      warrior = (Warrior) obj;
    } else {
      return false;
    }
    return this.getName().equals(warrior.getName())
        && this.getHealth() == warrior.getHealth()
        && this.getAttackPower() == warrior.getAttackPower()
        && this.getArmor() == warrior.getArmor();
  }
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), armor);
  }

  @Override
  public String toString() {
    return "Warrior{" +
        "armor=" + armor +
        ", name='" + name + '\'' +
        ", health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }

  @Override
  public void attack(Attackable target, int attackPower) {

    target.takeDamage(attackPower);
    System.out.println("Warrior attacked. Damage dealt: " + attackPower);
  }

  @Override
  public void takeDamage(int source) {
    double reduceSource = source - (this.armor / 2);
    if (reduceSource < 0) {
      reduceSource = 0;
    }
    System.out.println("Warrior took " + reduceSource + " damage. Current armor: " + this.armor);
  }
}
