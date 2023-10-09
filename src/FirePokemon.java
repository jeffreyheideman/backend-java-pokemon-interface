import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "Fire";
    private static final List<String> attacks = Arrays.asList("Firelash", "Solarbeam", "Pyroball", "Inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, type, level, hp, food, sound);
    }

    public void Firelash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used fire lash on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
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
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void SolarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Solarbeam on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
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
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Pyroball on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 10hp");
                enemy.setHp(enemy.getHp() - 15);
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
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " used Inferno on " + enemy.getName());
        switch (enemy.getType()) {
            case "Grass": {
                System.out.println(enemy.getName() + "loses 15hp");
                enemy.setHp(enemy.getHp() - 15);
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
                System.out.println(enemy.getName() + "loses 3hp");
                enemy.setHp(enemy.getHp() - 3);
            }
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public List<String> getAttacks() {
        return attacks;
    }

}
