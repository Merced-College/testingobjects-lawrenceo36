public class Car {
    public String make; 
    public String model;
    public int year; 

public Car(){ //default constructor 
    make = "Unknown";
    model = "Unknown";
    year = 0;
}

public Car(String make, String model, int year){ //parameterized constructor
    this.make = make;
    this.model = model; 
    this.year = year;
}

@Override
public String toString(){
    return "Car{Make = '" + make + "', Model = " + model + ", Year ='" + year + "'}";
}

public String getMake(){
    return make;
}
public String setMake(String make){
    return this.make = make; 
}

public String getModel(){
return model; 
}

public String setModel(String model) {
    return this.model= model; 
}

public int getYear(){
    return year;
}
public int setYear(int year){
    return this.year = year;
}

}