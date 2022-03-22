public class Staff {
    private String FullName;
    private String Position;
    private String Email;
    private int Phone;
    private int Salary;
    private int Age;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public Staff() {
    }

    public Staff(String FullName, String Position, String Email, int Phone, int Salary, int Age) {
        this.FullName = FullName;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Age = Age;
    }
    public void InfAboutStaff() {
        System.out.println("Сотрудник: " + FullName);
        System.out.println("Должность: " + Position);
        System.out.println("Электронная почта: " + Email);
        System.out.println("Номер телефона:" + Phone);
        System.out.println("Заработная плата: $" + Salary);
        System.out.println("Возраст: " + Age);
    }
}
