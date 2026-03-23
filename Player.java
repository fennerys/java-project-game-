import java.util.Scanner;

public abstract class Player extends Combatant
{
    private List<item> items;
    private int specialCooldown;

    public void chooseAction()
    {
        //printing relevent UI
        Scanner scan = new Scanner(System.in);
        System.out.println("What action would you like to perform: ");
        System.out.println("---------------------------------------");
        System.out.println("1) Basic Attack");
        System.out.println("2) Special Attack");
        System.out.println("3) Defend");
        System.out.println("4) Item");
        System.out.println("---------------------------------------");
        System.out.println("Please input a number 1-4: ");

        //getting user input
        int userinput = scan.nextInt();

        //activating the correct methods
        switch (userinput)
        {
            case 1:
            {
                this.basicAttack();
            }
            case 2:
            {
                this.specialAttack();
            }
            case 3:
            {
                this.defend();
            }
            case 4:
            {
                this.useItem();
            }
        }
    }

    //methods to be implemented by wizard and warrior class later
    abstract void specialAttack();
    abstract void basicAttack();

    public void defend()
    {
        this.DEF += 10;
        //idk how to make it last for only 2 turns
    }

}
