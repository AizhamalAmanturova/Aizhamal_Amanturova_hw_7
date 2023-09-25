import org.w3c.dom.ls.LSOutput;

public abstract class Hero implements HavingSuperAbility {
    public int health;
    public int damage;
    public String typeOfSuperAbility;

    @Override
    public void applySuperAbility() {
        System.out.println("Hero applied superability to absorb other heroes' abilities");
    }
}
