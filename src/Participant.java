import java.util.Objects;

public class Participant {
    private String name;
    private String mail;
    private int age;

    public Participant(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Participant [name=" + name + ", mail=" + mail + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mail, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Participant) {
            Participant other = (Participant) obj;
            return this.name.equals(other.name) && this.mail.equals(other.mail) && this.age == other.age;
        }
        return false;
    }
}
