import java.util.ArrayList;
import java.util.List;

public class Developer {
    private String name;
    private int age;
    private List<String> programmingLanguages;
    private int yearsOfExpirience;
    private String specialization;

    public Developer(String name, int age, List<String> programmingLanguages, int yearsOfExpirience, String specialization) {
        this.name = name;
        this.age = age;
        this.programmingLanguages = programmingLanguages;
        this.yearsOfExpirience = yearsOfExpirience;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can not be null or empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Integrity checks
        if (age < 18) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        if (age > 100) { // Optional range check
            throw new IllegalArgumentException("Age must be between 0 and 120.");
        }
        this.age = age;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<String> programmingLanguages) {
        if (programmingLanguages == null || programmingLanguages.isEmpty()) {
            throw new IllegalArgumentException("Programming languages can not be null or empty.");
        }
        this.programmingLanguages = programmingLanguages;
    }

    public int getYearsOfExpirience() {
        return yearsOfExpirience;
    }

    public void setYearsOfExpirience(int yearsOfExpirience) {
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.isEmpty()) {
            throw new IllegalArgumentException("Programming languages can not be null or empty.");
        }
        this.specialization = specialization;
    }
}
