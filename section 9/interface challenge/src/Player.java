import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hp;
    private int strength;
    private String weapon;
    public Player(String name, int hp, int strength)
    {
        this.name=name;
        this.hp=hp;
        this.strength=strength;
        this.weapon="Sword";
    }

    public String getName()
    {
        return this.name;
    }
    public int getHp()
    {
        return this.hp;
    }
    public int getStrength()
    {
        return this.strength;
    }
    public String getWeapon()
    {
        return this.weapon;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setHp(int hp)
    {
        this.hp=hp;
    }
    public void setStrength(int strength)
    {
        this.strength=strength;
    }
    public void setWeapon(String weapon)
    {
        this.weapon=weapon;
    }



    public List<String> write()
    {
        List<String> values =  new ArrayList<>();
        values.add(this.name);
        values.add(""+this.hp);
        values.add(""+this.strength);
        values.add(this.weapon);
        return values;
    }

    public void read(List<String> SavedValues)
    {
        if(SavedValues!=null && SavedValues.size()>0)
        {
            this.name=SavedValues.get(0);
            this.hp=Integer.parseInt(SavedValues.get(1));
            this.strength=Integer.parseInt(SavedValues.get(2));
            this.weapon=SavedValues.get(3);
        }
    }

    public String toString()
    {
        return "Player { " +
                "name " + getName() +
                " HP " + getHp() +
                " Strength " + getStrength() +
                " Weapon " + getWeapon() +
                " }";
    }
}
