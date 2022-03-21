package homeworkweek7;

public class Person {
    //instance variable
    String firstName;
    String lastName;
    int age;
      //with return value
    public String getFirstName() {
        return firstName;
    }
      //with return value
    public String getLastName() {
        return lastName;
    }
           //with return value
    public int getAge() {
        return age;

    }
        //no return with parameters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
           // no return type with parameters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // no return type with parameters
    public void setAge(int age) {
        if (age <= 0 || age >= 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
              //person age is teen or not between 12 to 20
    public boolean isTeen() {
        boolean r;
        if (age > 12 && age < 20) {
            r = true;

        } else {
            r = false;
        }
        return r;
    }
           // fullname is empty or not
    public String getFullName() {
        String fullName;
        if (firstName.isEmpty() == true && lastName.isEmpty() == true) {
            fullName = " ";
        } else {
            fullName = firstName.concat(lastName);
        }
        return fullName;

    }

    public static void main(String[] args) {


        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());


    }

}
