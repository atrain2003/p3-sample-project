package ro.uvt.p3;

public class Player {
    private String name;
    private int level, HP, maxHP, stamina, maxStamina;


    public Player(String name) {
        this.name = name;
        level=1;
        HP=100;
        maxHP=100;
        stamina=100;
        maxStamina=100;

    }

    public void levelUp(){
        level=level+1;
        HP=HP+(HP*20/100);
        maxHP=maxHP+(maxHP*20/100);
        stamina=stamina+(stamina*20/100);
        maxStamina=maxStamina+(maxStamina*20/100);
    }


}
