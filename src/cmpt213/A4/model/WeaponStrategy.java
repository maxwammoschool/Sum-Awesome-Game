package cmpt213.A4.model;

public interface WeaponStrategy {
        double calculateDamage(int condition);
}
class WeaponBasedOnTime implements WeaponStrategy {
    @Override
    public double calculateDamage(int numSeconds) {

        if (numSeconds < 10) {
            return 1.0;
        }
        if (numSeconds < 15) {
            return 0.8;
        }
        else {
            return 0.0;
        }
    }
}
class WeaponBasedOnFill implements WeaponStrategy {
    @Override
    public double calculateDamage(int numCells) {
        if (numCells >= 10 && numCells < 15) {
            return 1.0;
        }
        if (numCells >= 15) {
            return 0.8;
        }
        else {
            return 0.0;
        }
    }    }
}
class WeaponBasedOnOrder implements WeaponStrategy {
    @Override
    public int calculateDamage(int baseDamage, double multiplier) {
        return 0;
    }
}
