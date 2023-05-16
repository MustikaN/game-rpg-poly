class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy is moving.");
    }
    
    public void move(int steps) {
        System.out.println("Enemy is moving " + steps + " steps.");
    }
}
