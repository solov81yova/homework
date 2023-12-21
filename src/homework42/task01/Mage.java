package homework42.task01;

import java.util.Objects;

public class Mage extends Player implements Attackable {
  protected double mana;

  public Mage(String name, int health, int attackPower, double mana) {
    super(name, health, attackPower);
    this.mana = mana;
  }

  public double getMana() {
    return mana;
  }

  public void setMana(double mana) {
    this.mana = 1;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Mage mage;
    if (obj instanceof Mage) {
      mage = (Mage) obj;
    } else {
      return false;
    }
    return this.getName().equals(mage.getName())
        && this.getHealth() == mage.getHealth()
        && this.getAttackPower() == mage.getAttackPower()
        && this.getMana() == mage.getMana();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), mana);
  }

  @Override
  public String toString() {
    return "Mage{" +
        "mana=" + mana +
        ", name='" + name + '\'' +
        ", health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }

  @Override
  public void attack(Attackable target, int attackPower) {

if (this.mana >= 1) {
  target.takeDamage(attackPower * 2);
  this.mana -= 1;
  System.out.println("Mage attacked with double power. Damage dealt: " + (attackPower * 2));
} else {
  target.takeDamage(attackPower);
  System.out.println("Mage attacked. Damage dealt: " + attackPower);
}
  }

  @Override
  public void takeDamage(int source) {
    this.mana += 0.2;
    if (this.mana < 1) {
      this.mana = 1;
    }
    System.out.println("Mage took " + source + " damage. Current mana: " + this.mana);
  }
}
