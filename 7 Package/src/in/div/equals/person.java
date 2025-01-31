package in.div.equals;

import java.util.Objects;

public class person {
    private String Name;
    private int age;
    private String id;

    public person(String name, int age, String id) {
        Name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("person{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof person)){
            return false;
        }
        person per=(person)obj;
        return per.Name.equals(Name)&&
                per.age==age&&
                per.id.equals(id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, age, id);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
