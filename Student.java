package Java;
public class Student {
private String name ;
    private String surname ;
    private int ID;
public Student(String name, String surname){
    this.name = name;
    this.surname = surname;
}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }
    public void setID (int ID){
    this.ID= ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                '}';
    }
}
