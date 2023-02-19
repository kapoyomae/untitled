import Interfaces.Interface1;

class Animal {
    public String name;
    public int kindlevel;
    public int hp;
    public Animal(String name, int kindlevel, int hp) {
        this.name = name;
        this.kindlevel = kindlevel;
        this.hp = hp;
    }
    public static void printAnimalVoices(Kot kot, Doge doge) {
        System.out.println(kot);
        kot.voice();
        System.out.println(doge);
        doge.voice();
    }

    public static void main(String[] args) {
        Kot kot = new Kot("Barsik",2,5,43);
        Doge doge = new Doge("Barbos",4,13,411);
        printAnimalVoices(kot, doge);
    }


}
class Kot extends Animal implements Interface1 {
    int poopPerDay;

    Kot(String name, int hp, int kindlevel, int poopPerDay) {
        super(name, hp, kindlevel);
        this.poopPerDay = poopPerDay;
    }

    @Override
    public void voice() {
        System.out.println(Catvoice);
    }

    @Override
    public String toString() {
        return "Имя кота = " + name + ", уровень доброты = "
                + kindlevel + ", количество жизней = " + hp + ", какашек в день = " + poopPerDay;
    }
}
class Doge extends Animal implements Interface1 {
    int barkPerDay;

    Doge(String name, int hp, int kindlevel, int barkPerDay) {
        super(name, hp, kindlevel);
        this.barkPerDay = barkPerDay;
    }

    @Override
    public void voice() {
        System.out.println(Dogvoice);
    }

    @Override
    public String toString() {
        return "Имя кота = " + name + ", уровень доброты = "
                + kindlevel + ", количество жизней = " + hp + ", гавков в день = " + barkPerDay;
    }
}







