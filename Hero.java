public class Hero extends Character{
    @Override
    public void move () {
        System.out.println("Hero is moving...");
    }
    public void move(String diretion) {
        System.out.println("Hero is moving towards" + diretion);
    }
}






