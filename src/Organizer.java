import java.util.Objects;

public class Organizer {
    private String name;
    private String contact;

    public Organizer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Organizer [name=" + name + ", contact=" + contact + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contact);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Organizer) {
            Organizer other = (Organizer) obj;
            return this.name.equals(other.name) && this.contact.equals(other.contact);
        }
        return false;
    }
}
