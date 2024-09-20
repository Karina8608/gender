enum Gender {
    MALE,
    FEMALE
}

// Класс Сотрудник
class Employee {
    private String name;
    private Gender gender;

    public Employee(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

// Перечисление для праздников
enum Holiday {
    NO_HOLIDAY,
    NEW_YEAR,
    MARCH_8,
    FEBRUARY_23
}