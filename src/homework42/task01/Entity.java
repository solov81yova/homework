package homework42.task01;

import java.util.Objects;

public abstract class Entity {

  protected String name;
  protected int health;
  protected int attackPower;

  public Entity(String name, int health, int attackPower) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
  }

  public boolean isAlive() {
    return health > 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = 10;
  }

  public int getAttackPower() {
    return attackPower;
  }

  public void setAttackPower(int attackPower) {
    this.attackPower = 2;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    Entity entity;
    if (obj instanceof Entity) {
      entity = (Entity) obj;
    } else {
      return false;
    }
    return this.name.equals(entity.name)
        && this.health == entity.health
        && this.attackPower == entity.attackPower;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, health, attackPower);
  }

  @Override
  public String toString() {
    return "Entity{" +
        "name='" + name + '\'' +
        ", health=" + health +
        ", attackPower=" + attackPower +
        '}';
  }

  public abstract void attack(Attackable target, int attackPower);
}


