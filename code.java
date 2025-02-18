
// Java Program to Demonstrate the 
// use of a class with instance variables 

// Class Declaration
public class Dog {
  
  // Instance Variables
  String name;
  String breed;
  int age;
  String color;
  String city;  // Added city instance variable

  // Constructor Declaration of Class
  public Dog(String name, String breed, int age, String color, String city) {
      this.name = name;
      this.breed = breed;
      this.age = age;
      this.color = color;
      this.city = city;  // Initialize city
  }

  // method 1
  public String getName() { 
    return name; 
  }

  // method 2
  public String getBreed() { 
    return breed; 
  }

  // method 3
  public int getAge() { 
    return age; 
  }

  // method 4
  public String getColor() { 
    return color; 
  }

  // New method to get the city
  public String getCity() { 
    return city; 
  }

  @Override 
  public String toString() {
      return ("Name is: " + this.getName()
              + "\nBreed, age, color, and city are: "
              + this.getBreed() + "," + this.getAge()
              + "," + this.getColor() + "," + this.getCity());
  }

  public static void main(String[] args) {
      // Create an object with the new city parameter
      Dog Buddy = new Dog("Buddy", "Siberian Husky", 8, "white", "New York");
      System.out.println(Buddy.toString());
  }
}
