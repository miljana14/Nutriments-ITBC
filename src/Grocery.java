import java.util.Objects;
import java.util.UUID;

public abstract class Grocery implements Energy{
    private UUID id;
    private String company;
    private String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public Grocery(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Grocery grocery = (Grocery) o;
        if(this.company.equals(grocery.company) && this.name.equals(grocery.name)){
            return true;
        }
        return false;
    }
}
