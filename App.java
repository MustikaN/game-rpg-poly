public class App {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.move(); 
        hero.move("north");
        
        Enemy enemy = new Enemy();
        enemy.move();
        enemy.move(5); 
        

        Character character1 = new Hero();
        character1.move(); 
        Character character2 = new Enemy();
        character2.move(); 
        Character character3 = new Witch();
        character3.move(); 
        Character character4 = new Witch();
        Fighter fighter = (Fighter) character4;
        fighter.move(); 
    }
}

