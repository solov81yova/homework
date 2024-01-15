package homework42.task01;

import java.util.Random;
import java.util.Scanner;

public class Main {

  public static String playerName(int choice) {
    switch (choice) {
      case 1:
        return "Marvin, health: 10, attack power:8, mana:5";
      case 2:
        return "Jake, health: 10, attack power:7";
      case 3:
        return "Robin,health: 15, attack power:8";
      default:
        return "This combat class is absent";
    }
  }

  public static void introduce(Entity entity) {
    System.out.println("I am a: " + entity.name);
    System.out.println("Health: " + entity.health);
    System.out.println("Attack power: " + entity.attackPower);
  }
public static boolean checkMonsterDefeated(int monsterHealth) {
    return monsterHealth > 0;
}
public static boolean checkPlayerDefeated(int playerHealth) {
    return playerHealth > 0;
}
  public static void main(String[] args) {
    System.out.println("What combat class do you want to choose? Press from 1 to 3.");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    if (choice == 1) {
      System.out.println("You choose combat class Mage");
    } else if (choice == 2) {
      System.out.println("You choose combat class Warrior");
    } else {
      System.out.println("You choose combat class Archer");
    }
    System.out.println("What is players name?");
    System.out.println(playerName(choice));

    Mage mage = new Mage("Marvin", 10, 8, 5);
    Warrior warrior = new Warrior("Jake", 10, 7, 5);
    Archer archer = new Archer("Robin", 10, 7);
    Monster monster = new Monster("Icepick", new Random().nextInt(20) + 1,
        new Random().nextInt(20) + 1);
    introduce(monster);
    introduce(mage);
    introduce(warrior);
    introduce(archer);
    monster.attack(mage, 4);
    mage.attack(monster, 5);
    monster.takeDamage(3);
    mage.takeDamage(2);
    boolean isMonsterDefeated = false;
    boolean isPlayerDefeated = false;
    boolean playerTurn = true;
    while ( !isMonsterDefeated && !isPlayerDefeated) {
      if (playerTurn) {
        System.out.println("Continue the fight? Yes or No?");
        String input = scanner.nextLine();
        scanner.nextLine();
        if (input.equals("Yes")) {
          System.out.println("Player attack");
          isMonsterDefeated = checkMonsterDefeated(10);
          playerTurn = false;
        } else {
          System.out.println("The fight is stopped");
          break;
        }
      } else {
        System.out.println("Monster attack");
        isPlayerDefeated = checkPlayerDefeated(8);
        playerTurn = true;
      }
    }
    if (isMonsterDefeated) {
      System.out.println("Congratulations, you are winner!");
    } else if (isPlayerDefeated) {
      System.out.println("Unfortunately, you lose");

    }
    checkMonsterDefeated(2);
    checkPlayerDefeated(1);
    warrior.attack(monster, 5);
    archer.attack(monster, 6);
    monster.takeDamage(5);
  }

}
