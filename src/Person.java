import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public final class Person implements Comparable, Serializable {
    private final String Name;
    private final String country;
    private final Date birthday;

    public Person (String Name, String country, Date birthday) {
        this.Name = Name;
        this.country = country;
        this.birthday = birthday;
    }

    public String getFullname () {
        return this.Name;
    }

    public String getCountry () {
        return this.country;
    }

    public Date getBirthday () {
        return this.birthday;
    }

    @Override
    public int hashCode () {
        return Objects.hash (Name, country, birthday);
    }

    @Override
    public boolean equals (Object object) {
        if (this == object) {
            return true;
        } else if ((object == null) || (getClass () != object.getClass ())) {
            return false;
        }

        Person person = (Person) object;
        return hashCode () == person.hashCode ();
    }

    @Override
    public Person clone () throws CloneNotSupportedException {
        super.clone ();
        return new Person ("", "", null);
    }

    @Override
    public int compareTo (Object o) {
        Person person = (Person) o;

        if (person.equals (this)) { return 1; }
        return 0;
    }
}
