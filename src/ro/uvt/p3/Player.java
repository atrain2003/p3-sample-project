package ro.uvt.p3;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Player implements Comparable<Player> {
    private String name;
    private int level, HP, maxHP, stamina, maxStamina;
    private List<Item> inventory = new ArrayList<Item>();
    int count = 0;
    private HashMap<MountPoint, Equipment> equipment = new HashMap<MountPoint, Equipment>();

    public Player(String name) {
        this.name = name;
        this.level = 1;
        this.HP = 100;
        this.maxHP = 100;
        this.stamina = 100;
        this.maxStamina = 100;

    }

    public String getName(){return name;}

    public int getHP() {
        return HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public int getLevel() {
        return level;
    }
    public void levelUp() {
        this.level = this.level + 1;
        this.HP = this.HP + (this.HP * 20 / 100);
        this.maxHP = this.maxHP + (this.maxHP * 20 / 100);
        this.stamina = this.stamina + (this.stamina * 20 / 100);
        this.maxStamina = this.maxStamina + (this.maxStamina * 20 / 100);
    }

    public void AddItem(Item e) {
        inventory.add(e);
        count++;
    }

    public List<Item> GetInventory() {
        return inventory;
    }

    @Override
    public int CompareTo(Player b) {
        if (this.level > b.level)
            return 1;
        if (this.level < b.level)
            return -1;
        if (this.level == b.level) {
            if (this.count > b.count)
                return 1;
            else
                return -1;
        }
        return 0;
    }
    public Equipment getEquipment(MountPoint m) {
        return equipment.get(m);
    }

    public void Equip(MountPoint m, int pos) {
        Item extract_item = inventory.get(pos);
        if (equipment.get(m) = !null) {
            equipment.remove(m);
            inventory.remove(pos);
            inventory.add(extract_item);
        } else {
            equipment.put(m, (Equipment), extract_item);
        }
    }

    public static Weapon FindBestWeapon(List<Player> players) {
        Weapon best_weapon = new Weapon("best weapon" -1)
        for (Player p : players) {
            for (Item i : p.inventory) {
                if (i instanceof Weapon) {
                    if (((Weapon) i).getMaxAttack() > best_weapon.getMaxAttack())
                        best_weapon = ((Weapon) i);
                    if (((Weapon) i).getMaxAttack() == best_weapon.getMaxAttack() && if ((Weapon) i).getMinAttack() > best_weapon.getMinAttack())
                    best_weapon = ((Weapon) i);
                }
            }
        }return best_weapon;
    }
}
