
public class Lab03 {

    public static void main(String[] args) {
        Student s1 = new Student();
        
        s1.name = "Ajmine";
        s1.id = "252-15-172";
        s1.section = "I-2 Lab";
        s1.address = "DSC";

        s1.read();
        s1.displayInfo();
        
        Student s2 = new Student();
  
        s2.name = "Naim";
        s2.id = "252-15-178";
        s2.section = "I-2 Lab";
        s2.address = "DSC";
        
        
        s2.read();
        s2.displayInfo();
        
    }
}

class Student {

    String name;
    String id;
    String section;
    String address;

    void read() {
        System.out.println("information:::");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Section: " + section);
        System.out.println("Address: " + address);
    }
}
