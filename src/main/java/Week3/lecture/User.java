package Week3.lecture;

public class User {
    private String name;
    private Gender gender;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    public User(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


}
