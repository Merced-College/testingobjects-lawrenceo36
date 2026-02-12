[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22393125)
# testingObjects

this is an example of a ReadMe file.
1. Before the toString what printed when attempting to print an object was the name of your object with a separator such as '@' followed by the hashcode of the object in memory this happens becuase every class in jave implicitly inherits the java.lang.Object which defines a default toString method

2. My classes three fields were the make, model, and year of a vehicle. Their values before setting them were 'Unknown', 'Unknown' , '0'

3. When I used the default constructor it set safe, human readable defualts, while when using the paramaterized constructor sets, and initializes s all the fields in my class. 
4. Adding the @Override to toString allows you as a developer to override the toString and equals methods which will give you the power to customize how objects are represented as Strings which is important rather than getting returned the hashcode and how they are compared for equality. 

5. Encapsulation is preffered over public fields due to fact that it handles information better in terms of security, allowing for the developer to hide sensitive information while also stille being able to work with it. One validation rule I could add to my car object would be to restrict the year the could be inputed by knowing the year of when vehicles were first released. So it would return an error to the user if they entered a year such as 1657.