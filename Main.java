public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                Team.teamOne = new Team();
        };

        Obstacle[] obstacles = {new Road(3), new Water(3), new Wall(3)};

        for (Obstacle ob : obstacles) {
            for (Animal al2 : animals) {
                ob.doIt(al2);
            }
        }


        for (Animal al2 : animals) {
            System.out.println(al2.getName() + " on distance " + al2.isOnDistance());
        }

    }

}