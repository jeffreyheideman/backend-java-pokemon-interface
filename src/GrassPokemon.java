import java.util.Arrays;
import java.util.List;

public class GrassPokemon {
    private static final String type = "Fire";
    private static final List<String> attacks = Arrays.asList("Leafstorm", "LeechSeed", "Leaveblade", "Solarbeam");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leafstorm on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
            case "Water": {
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Fire": {
                System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Electric": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leechseed on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
            case "Water": {
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Fire": {
                System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Electric": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Leaveblade on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
            case "Water": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Fire": {
                System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Electric": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Solarbeam on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
            case "Water": {
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Fire": {
                System.out.println(enemy.getName() + "loses 5hp");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Electric": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }

}