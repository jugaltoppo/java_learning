import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hp;
    private int strength;
    public Monster(String name,int hp, int strength)
    {
        this.name=name;
        this.hp=hp;
        this.strength=strength;
    }

    public String getname()
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write()
    {
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(""+this.hp);
        values.add(""+this.strength);
        return values;
    }

    public void read(List<String> SavedValues)
    {
        if(SavedValues!=null && SavedValues.size()>0  )
        {
            this.name=SavedValues.get(0);
            this.hp=Integer.parseInt(SavedValues.get(1));
            this.strength=Integer.parseInt(SavedValues.get(2));
        }
    }

    public String toString()
    {
        return "Monster {" +
                " name-" + getname() +
                 " HitPoint-" + getHp() +
                " Strength-" + getStrength() +
                " }";
    }
}
