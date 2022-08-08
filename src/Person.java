public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
    }

    public void setName(String name){
//TODO: change the name field to the passed value
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
    }
// constructor
    public Person(String name) {
        this.name = name;
    }

//    main method
public static void main(String[] args) {
    Person ashley = new Person();
    ashley.name = "Ashley";
}
}
