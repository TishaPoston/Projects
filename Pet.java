public class Pet {
    private String name;
    private String type;
    private int age;

    public Pet() {
        name = "Pet Name";
        type = "Animal";
        age = 1;
    }

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Pet information:\nType: " + type + "\nName: " + name + "\nAge: " + age;
    }
}

