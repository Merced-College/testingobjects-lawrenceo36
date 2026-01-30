public class carTest {
    public static void main(String[] args){
        //creating a car with no constructor defined
        Car c1 = new Car();

        // A2: Print the object directly.
        System.out.println("Printing c1 directly:");
        System.out.println(c1);

        //printing fields before setting them to see javas defualt values
        System.out.println("\nDefaults for c1 fields (before any assignment):");
        System.out.println("Make = " + c1.getMake()); //expected null
        System.out.println("Model = " + c1.getModel()); //expected 0
        System.out.println("Year = " + c1.getYear()); //expected null

        //using both constructors default and paramitized
        Car c2 = new Car(); //uses default constructor values 

        System.out.println("\nc2 after defuault constructor:");
        System.out.println("Make = " + c2.getMake() + ", Model = " + c2.getModel() + ", Year = " + c2.getYear());

        Car c3 = new Car("Honda", "Civic LX", 2005); // uses parameterized constructor 

        System.out.println("\nc3 after parameterized constructor: ");
        System.out.println("Make = " + c3.getMake() + ", Model = " + c3.getModel() + ", Year = " + c3.getYear());

        //Print objects directly again
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("c2 = " + c2);
        System.out.println("c3 =" + c3);

        //mutating via setters and read via getters
        System.out.println("\nMutating via setters after making fields private: ");
        c3.setMake("Honda");
        c3.setModel("Civic LX");
        c3.setYear(2025);
    
        System.out.println("c3 year via getter = " + c3.getYear());
        System.out.println("c3 now = " + c3);
    }
}