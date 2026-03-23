public abstract class Combatant
{
    protected String name;
    protected int maxHp;
    protected int defense;
    protected int speed;
    protected List<StatusEffect> StatusEffect;

    public void takeDamage (int dmg)
    {
        this.HP = this.HP - dmg;
        if (this.HP < 0)
        {
            this.HP = 0;
        }
    }

    public boolean isDefeated()
    {
        return (this.HP <= 0); 
    }
}