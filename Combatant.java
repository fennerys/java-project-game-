public abstract class Combatant
{
    protected String name;
    protected int maxHP;
    protected int HP;
    protected int DEF;
    protected int SPD;
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