package cmpt213.A4.model;

public class WeaponFactory {
    public interface Weapon {
        String getName();
        void attackType(int numOpponents, int damageMultiplier);
    }

    public static class WeaponBasedOnFillTime implements Weapon {
        @Override
        public int getDamage(1) {
            return 10; // example value
        }

        @Override
        public void attackOpponent(int damage) {
            System.out.println("Attacking opponent with " + damage + " damage (FillTime weapon)");
        }
    }

    public static class WeaponBasedOnFillOrder implements Weapon {
        @Override
        public int getDamage() {
            return 8;
        }

        @Override
        public void attackOpponent(int damage) {
            System.out.println("Attacking opponent with " + damage + " damage (FillOrder weapon)");
        }
    }

    public static class WeaponBasedOnNumberCells implements Weapon {
        @Override
        public int getDamage() {
            return 12;
        }

        @Override
        public void attackOpponent(int damage) {
            System.out.println("Attacking opponent with " + damage + " damage (NumberCells weapon)");
        }
    }

    public static class NullWeapon implements Weapon {
        @Override
        public int getDamage() {
            return 0;
        }

        @Override
        public void attackOpponent(int damage) {
            System.out.println("No weapon equipped.");
        }
    }
}
