package Programming_Challenges;

class Person {
    // These are the attributes (or properties) that every Person object will have.
    String name;      // Stores the person's name
    int age;          // Stores the person's age
    String location;  // Stores the person's location or city

    // This is a constructor — a special method that runs when we create a new Person.
    // It allows us to set the values of name, age, and location immediately.
    Person(String name, int age, String location) {
        //  The keyword 'this' refers to the current object.
        // It helps differentiate between the instance variable and the parameter with the same name.
        this.name = name;
        this.age = age;
        this.location = location;
    }

    //  The toString() method defines what should be displayed when we print a Person object.
    public String toString() {
        //  Returns a readable string like "Adrian (22, Manila)"
        return name + " (" + age + ", " + location + ")";
    }
}

// Module 1: Filter by Age
class AgeFilter {
    // This method filters an array of Person objects based on an age range.
    // It takes in:
    // - an array of Person objects,
    // - a lower bound (minimum age),
    // - and an upper bound (maximum age).
    void filter(Person[] people, int lower, int upper) {
        System.out.println("Filter by Age (" + lower + "–" + upper + "):");

        // The enhanced for-loop goes through every Person object inside the 'people' array.
        for (Person p : people) {
            // Check if the person's age is within the specified range.
            if (p.age >= lower && p.age <= upper) {
                // If true, print the person's details using their toString() method.
                System.out.println(p);
            }
        }
        System.out.println(); // Just prints a blank line for spacing between results.
    }
}

// Module 2: Filter by Name
class NameFilter {
    // This method filters people whose names start with a specific letter or string.
    void filter(Person[] people, String start) {
        System.out.println("Filter by Name starting with '" + start + "':");

        for (Person p : people) {
            // The startsWith() method checks if the name begins with the given string.
            if (p.name.startsWith(start)) {
                System.out.println(p);
            }
        }
        System.out.println(); // Prints a blank line after results.
    }
}

// Module 3: Filter by Location
class LocationFilter {
    // This method filters people who are from a specific location.
    void filter(Person[] people, String location) {
        System.out.println("Filter by Location '" + location + "':");

        for (Person p : people) {
            // equalsIgnoreCase() compares two strings while ignoring uppercase/lowercase differences.
            if (p.location.equalsIgnoreCase(location)) {
                System.out.println(p);
            }
        }
        System.out.println(); // Adds a blank line for spacing.
    }
}

// Main class to run everything
public class FilteringChallenge {
    public static void main(String[] args) {

        // Step 1: Create an array of Person objects (our data source).
        Person[] people = {
            new Person("Adrian", 22, "Manila"),
            new Person("Anna", 25, "Cebu"),
            new Person("Alex", 30, "Manila"),
            new Person("Brian", 19, "Davao")
        };

        // Step 2: Create separate filter objects for each module.
        AgeFilter ageFilter = new AgeFilter();
        NameFilter nameFilter = new NameFilter();
        LocationFilter locationFilter = new LocationFilter();

        // Step 3: Run each filter to display results.
        // This will print all people between ages 20–30.
        ageFilter.filter(people, 20, 30);

        // This will print all people whose names start with "A".
        nameFilter.filter(people, "A");

        // This will print all people located in "Manila".
        locationFilter.filter(people, "Manila");
    }
}
