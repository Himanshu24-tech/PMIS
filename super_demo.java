class  employee{
    double salary = 35000;

}
class manager extends employee{
    double salary = 70000;
    void displaysalary(){
        System.out.println("manager salary is: " + salary);
        System.out.println("employee salary is: " + super.salary);
    }
}