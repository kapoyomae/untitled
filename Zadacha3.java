import java.util.Objects;

class Cat {
    public String name;
    public int kindlevel;
    public int hp;
    public Cat(String name, int kindlevel, int hp) {
        this.name = name;
        this.kindlevel = kindlevel;
        this.hp = hp;}
    public Cat(){
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getKindlevel(){
        return kindlevel;
    }
    public void setKindlevel(){
        this.kindlevel = kindlevel;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(){
        this.hp = hp;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, kindlevel, hp);
    }
    @Override
    public String toString(){
        return "Имя кота = " + name + ", уровень доброты = "
                + kindlevel + ", количество жизней = " + hp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return kindlevel == cat.kindlevel &&
                hp == cat.hp &&
                name.equals(cat.name);
    }
    public static void voice(){
        System.out.println("Меня заставляют учить джаву, мя-я-я-у-у >.<");
    }

}

class Dog{
    public String name;
    public int kindlevel;
    public int hp;
    public Dog(String name, int kindlevel, int hp) {
        this.name = name;
        this.kindlevel = kindlevel;
        this.hp = hp;
    }
    public Dog(){}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getKindlevel(){
        return kindlevel;
    }
    public void setKindlevel(){
        this.kindlevel = kindlevel;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(){
        this.hp = hp;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, kindlevel, hp);
    }
    @Override
    public String toString(){
        return "Имя собаки = " + name + ", уровень доброты = "
                + kindlevel + ", количество жизней = " + hp;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return kindlevel == dog.kindlevel &&
                hp == dog.hp &&
                name.equals(dog.name);
    }
    public static void voice(){
        System.out.println("Меня заставляют учить джаву, гав-гав >.<");
    }
}

class CatDog {

    public static Cat[] cats = new Cat[10];
    public static Dog[] dogs = new Dog[10];

    public static void cdMethod(){
        cats[0] = new Cat("Murzik", 7, 5);
        cats[1] = new Cat("Barsik", 3, 7);
        cats[2] = new Cat("Tom", 5, 10);
        cats[3] = new Cat("Farik", 10, 10);
        cats[4] = new Cat("Marsel", 9, 10);
        cats[5] = new Cat("Marik", 8, 10);
        cats[6] = new Cat("Shamil", 4, 3);
        cats[7] = new Cat("Pushistik", 7, 6);
        cats[8] = new Cat("Jojo", 1, 2);
        cats[9] = new Cat("NicoBellic", 2, 9);

        dogs[0] = new Dog("Bobik", 7, 5);
        dogs[1] = new Dog("Baxter", 6, 5);
        dogs[2] = new Dog("Yorik", 7, 6);
        dogs[3] = new Dog("Jorik", 5, 8);
        dogs[4] = new Dog("Sheldon", 10, 10);
        dogs[5] = new Dog("Gugo", 6, 8);
        dogs[6] = new Dog("Aloha", 8, 7);
        dogs[7] = new Dog("Zelda", 10, 7);
        dogs[8] = new Dog("Barbos", 3, 5);
        dogs[9] = new Dog("Mishka", 5, 6);}


    public static void main(String[] args) {
        cdMethod();
        Cat maxcathash = cats[0];
        for (Cat i : cats) {
            if (i.hashCode() > maxcathash.hashCode()) {
                maxcathash = i;
            }
        }
        Dog maxdoghash = dogs[0];
        for (Dog dog : dogs) {
            if (dog.hashCode() > maxdoghash.hashCode()) {
                maxdoghash = dog;
            }
        }

        if (maxcathash.getHp() > maxdoghash.getKindlevel()){
            System.out.println("Победитель жесточайшей схватки - " + maxcathash.toString() + "с хэшем " + maxcathash.hashCode() + ", последние слова проигравшего");
            maxdoghash.voice();
        }
        if (maxdoghash.getHp() > maxcathash.getKindlevel()) {
            System.out.println("Победитель жесточайшей схватки - " + maxdoghash.toString() + " с хэшем " + maxdoghash.hashCode() + ", последние слова проигравшего:");
            maxcathash.voice();
        }
        System.out.println(maxcathash.getClass());

    }
}

