import org.apache.poi.ss.usermodel.orm.annotation.Column;
import org.apache.poi.ss.usermodel.orm.annotation.Sheet;

@Sheet
public class Person {
    @Column
    private String name;

    @Column
    private int age;

    @Column(name = "IsAdmitted")
    private boolean vegeterian;

    public Person() {}

    public Person(String name, int age, boolean vegan) {
        this.name = name;
        this.age = age;
        this.vegeterian = vegan;
    }

    @Override
    public String toString() {
        return name + "|" + age + "|" + vegeterian;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setVegeterian(boolean vege) { this.vegeterian = vege; }

    public boolean getVegeterian() {
        return this.vegeterian;
    }
}