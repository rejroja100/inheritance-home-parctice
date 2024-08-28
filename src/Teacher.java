public class Teacher extends Parson{
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}

class Driver extends Teacher{
    private int salary;
    private int income;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    void DisplayInformation1(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Qualification: " + getQualification());
        System.out.println("salary: " + getSalary());
        System.out.println("Outside Income: " + getIncome());
    }
}
