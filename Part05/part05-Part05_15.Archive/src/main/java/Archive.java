
import java.util.Objects;

public class Archive {
    private String name;
    private String identifier;

    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Archive other = (Archive) obj;
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        return true;
    }
}
