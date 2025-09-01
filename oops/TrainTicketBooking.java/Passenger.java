
public class Passenger {
    private String name;
    private int age;
    private String phoneNumber;

    public Passenger(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }
    public void setPhoneNumber(String PhoneNumber){
        this.phoneNumber = PhoneNumber;
    }

}
