package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

public class Demo {

    public static void main(String[] args) {

//创建对象
        PingPangAtheletes ppA = new PingPangAtheletes();
        ppA.setName("马龙");
        ppA.setAge(30);
        System.out.println(ppA.getName() + "今年已经" + ppA.getAge() + "岁了");
        ppA.eat();
        ppA.learn();
        ppA.learningEnglish();

        BasketballAthletes ba = new BasketballAthletes("流川枫", 18);
        System.out.println(ba.getName() + "已经" + ba.getAge() + "岁了");
        ba.eat();
        ba.learn();

        Coach c = new BasketballCoach();
        c.setName("姚明");
        c.setAge(40);
        System.out.println(c.getName() + "已经" + c.getAge() + "岁了");
        c.teach();
        c.eat();

        Coach d = new PingPangCoach("刘国梁", 41);
        System.out.println(d.getName() + "已经" + d.getAge() + "岁了");
        d.teach();
        d.eat();
        d.learningEnglish();


    }
}
