package movies;

//Create a class named Movie. It should have private fields for name and category


public class Movie {
    private String name;
    private String category;
//and a constructor that sets both of these
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
// tostring
    @Override
    public String toString() {
        return name + " -- " + category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

