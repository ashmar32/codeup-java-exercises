package ArraysExercises;

//    Create Person class inside of src
public class Person {
// that has a private name field that is a string
    private String name;

    public Person(String ashley, String martinez) {
    }

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){

//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);

    }
// constructor


    public Person(String name) {
        this.name = name;
    }


    //    main method
public static void main(String[] args) {
//    Person ashley = new Person("Ashley");
//    Person kshley = new Person();
//    Person docRob = new Person("Mark Robinson");
//    System.out.println("ashley " +ashley.getName());
//    System.out.println("kshley " +kshley.getName());
//    kshley.setName("ashley2");
//    System.out.println("ashley " +ashley.getName());
//    System.out.println("kshley " +kshley.getName());
//    System.out.println("DocRob " +docRob.getName());
//    kshley.sayHello();

//    Person person1 = new Person("John");
//    Person person2 = new Person("John");
////    this compares the property: name
//    System.out.println(person1.getName().equals(person2.getName()));
////    this compares the object variables
//    System.out.println(person1 == person2);
////    here we can see different ids
//    System.out.println(person1);
//    System.out.println(person2);

//    Person person1 = new Person("John");
////    here we set person2 to person1 and this will make it true
//    Person person2 = person1;
//    System.out.println(person1 == person2);

    Person person1 = new Person("John");
    Person person2 = person1;
    System.out.println(person1);
    System.out.println(person2);
    System.out.println(person1.getName());
    System.out.println(person2.getName());
    person2.setName("Jane");
    System.out.println(person1.getName());
    System.out.println(person2.getName());
}
}
