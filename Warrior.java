public class Warrior extends Player
{
    Warrior()
    {
        super("Warrior", 260, 260, 40, 20, 30);
    }

    Warrior(String name)
    {
        super(name, 260, 260, 40, 20, 30);
    }

    public void basic_attack(List<Enemy> enemy)
    {
        System.out.println("Which enemy would you like to attack?");
        
        enemy.HP -= this.ATK - enemy.DEF;
        if (enemy.HP < 0)
        {
            enemy.HP = 0;
        }
    }
}