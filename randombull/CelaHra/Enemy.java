package randombull.randombull.CelaHra;

public class Enemy extends Entita {
    int pady;
}
class MensiVlci extends Enemy {
    public MensiVlci(){
        name = "Mensi vlci";
        hp = 20;
        damage = 4;
        pady = 1;
    }
}
class VetsiVlk extends Enemy {
    public VetsiVlk() {
        name = "Vetsi vlk";
        hp = 35;
        damage = 8;
        pady = 2;
    }
}
class Arsen extends Enemy{
    public Arsen(){
        name = "Arsen";
        hp = 30;
        damage = 7;
        pady = 3;
    }
}
class drak extends Enemy{
    public drak(){
        name = "drak";
        hp = 50;
        damage = 15;
        pady = 4;
    }
}


