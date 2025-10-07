public class Main {
    private String name;
    private int age;
    Main(String name,int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args){
        Main obj = new Main("Bala",21);
        System.out.println("Name: "+obj.name);
        System.out.println("Age: "+obj.age);
    }
}
