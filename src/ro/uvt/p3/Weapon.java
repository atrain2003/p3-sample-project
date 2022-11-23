package ro.uvt.p3;

public class Weapon extends Item implements Equipment{
    String name;
    int minAttack, maxAttack;
    public Weapon(String name,int minAttack, int maxAttack){
        super(name);
        this.minAttack=minAttack;
        this.maxAttack=maxAttack;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    @Override
    public MountPoint getMountPoint() {return MountPoint.ATTACK_ARM;}
}

