package principle;

/**
 * 李氏替换原则
 */
public class LSPtest {
    public static void main(String[] args) {
        Birds bird_swallow = new Swallow();
        Animal bird_ostrich = new Ostrich();
        bird_ostrich.setRunSpeed(12);
        System.out.println(bird_ostrich.getTimes(21));

    }
    static class Animal{
        double runSpeed;

        public void setRunSpeed(double runSpeed) {
            this.runSpeed = runSpeed;
        }

        public double getTimes(double distance) {
            return distance/runSpeed;
        }
    }
    static class Birds extends Animal {
         double f_speed;
        public void setSpeed(double speed) {
            this.f_speed = speed;
        }
        public double getTime(double distance){
            return distance/f_speed;
        }
    }

    static class Swallow extends Birds{

    }

    static class Ostrich extends Animal{

    }
}
