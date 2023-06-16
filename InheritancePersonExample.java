import java.util.Scanner;

class Person {
    String Name, Gender, Address;
    protected int Age;

    public Person() {

    }

    public Person(String n, String g, String addr, int a) {
        this.Name = n;
        this.Gender = g;
        this.Address = addr;
        this.Age = a;
    }

    public void displayPerson() {
        System.out.println("Name:__" + Name);
        System.out.println("Gender:__" + Gender);
        System.out.println("Address:__" + Address);
        System.out.println("Age:__" + Age);
    }
}

class Employee extends Person {
    int Empid, Salary;
    String Company_name, Qualification;

    public Employee() {

    }

    public Employee(String n, String g, String addr, int a, int eid, String cname, String qual, int sal) {
        super(n, g, addr, a);
        Empid = eid;
        Company_name = cname;
        Qualification = qual;
        Salary = sal;

    }

    public void displayEmployee() {
        super.displayPerson();
        System.out.println("Empid:__" + Empid);
        System.out.println("Company_name:__" + Company_name);
        System.out.println("Qualification:__" + Qualification);
        System.out.println("Salary:__" + Salary);

    }
}

class Teacher1 extends Employee {
    String Subject, Department;
    int Teacherid;

    public Teacher1(String n, String g, String addr, int a, int eid, String cname, String qual, int sal, String sub,
            String dept, int tid) {
        super(n, g, addr, a, eid, cname, qual, sal);
        Subject = sub;
        Department = dept;
        Teacherid = tid;
    }

    public void displayTeacher() {
        super.displayEmployee();
        System.out.println("Teacherid:__" + Teacherid);
        System.out.println("Subject:__" + Subject);
        System.out.println("\n\nDepartment:__" + Department);
    }
}

public class InheritancePersonExample {
    public static void main(String[] args) {
        System.out.println("Enter number of teachers");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Teacher1[] teacher1s = new Teacher1[N];
        Scanner scs = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.println("Enter name of the teacher:");
            String name = scs.next();
            System.out.println("Enter the gender:");
            String gen = scs.next();
            System.out.println("Enter the address:");
            String addr = scs.next();
            System.out.println("Enter the age of the teacher:");
            int ag = scs.nextInt();
            System.out.println("Enter the Eid:");
            int eid = scs.nextInt();
            System.out.println("Enter the company name:");
            String cn = scs.next();
            System.out.println("Enter the qualification:");
            String quali = scs.next();
            System.out.println("Enter the salary:");
            int sal = sc.nextInt();
            System.out.println("Enter Teacher_id:");
            int tid = sc.nextInt();
            System.out.println("Enter subject of the teacher:");
            String sub = scs.next();
            System.out.println("Enter Department of the teacher:");
            String dept = scs.next();
            Teacher1 t = new Teacher1(name, gen, addr, ag, eid, cn, quali, sal, sub, dept, tid);
            teacher1s[i] = t;

        }
        for (Teacher1 t : teacher1s) {
            t.displayTeacher();
        }
    }
}
