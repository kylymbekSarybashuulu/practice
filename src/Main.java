import animals.Animal;
import animals.Eagle;
import animals.Shark;
import animals.Turtle;
import person.Danser;
import person.Person;
import person.Programmer;
import person.Singer;
import polimorf.*;

public class Main {
    public static void main(String[] args) {



      Animal[] animals = {new Animal(),new Eagle(), new Shark(),new Turtle()};
        for (Animal an:animals) {
            if(an instanceof Eagle){
                an.janybar();
            }

        }
        for (Animal a: animals) {
            if(a.getClass().getName().equals("animals.Shark"));
            a.janybar();

        }

     /* janybar(new Shark());
      janybar(new Turtle());
      janybar(new Eagle());
      janybar(new Animal());*/




//        DommesticAnimal[] animals1 = {new Cow(),new Ship(),
//                                       new Horse()};
//
//
//        animalsMethod(new DommesticAnimal());
//        animalsMethod(new Horse());
//        animalsMethod(new Ship());
//        animalsMethod(new Cow());
//
//
//    }
//    public  static void animalsMethod(DommesticAnimal domesticAnimal){
//        domesticAnimal.voise();
//
//        Person[] adam = {new Danser(), new Programmer(), new Singer()};
//
//        for (Person p: adam) {
//            if(p instanceof Singer)
//            p.walk();
//
//        }
//
//        adamdar(new Person());
//        adamdar(new Danser());
//        adamdar(new Singer());
//        adamdar(new Programmer());
//
//    }
//    public static void adamdar(Person person){
//        person.walk();
   }
   public static void janybar (Animal animal){
        animal.janybar();
   }

}