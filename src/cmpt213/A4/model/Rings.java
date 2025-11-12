package cmpt213.A4.model;

public class Rings {
    interface Ring {
        void multiplyDamage(int multiplier);
    }
    class PlayerRing implements Ring {

        @Override
        public void multiplyDamage(int multiplier) {
            System.out.println("Damage multiplied by " + multiplier);

        }
    }
    static class NullRing implements Ring {
        @Override
        public void multiplyDamage(int multiplier) {
            System.out.println("Null ring — no effect");

        }
    }

}
