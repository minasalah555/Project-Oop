package oopproject;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import javafx.concurrent.Worker;
import java.util.Collections;

public class OopProject {

    static void fun() {
        System.out.println("what item you want to deal with");
        System.out.println("if you want  Workers enter 1  ");
        System.out.println("if you want  Employee enter 2  ");
        System.out.println("if you want  Adminstrator enter 3 ");
        System.out.println("if you want teachingAssisstant enter 4  ");
        System.out.println("if you want Student enter 5  ");
        System.out.println("if you want Proffessor enter 6  ");
        System.out.println("if you want Security enter 7  ");
        System.out.println("if you want Technician enter 8  ");
    }

    static void add_Security(Security w) {
        boolean f = false;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter his :-");
        System.out.print("Name :");
        try {
            w.setName(input.nextLine());
        } catch (InputMismatchException p) {
            System.out.println("please,insert text only");
        }
        System.out.print("Phone :");
        try {
            w.setPhone(input.nextInt());
        } catch (InputMismatchException p) {
            System.out.println("please,insert numeric values only!!");
            f = true;
            input = new Scanner(System.in);
        }
        if (f) {
            System.out.print("Phone :");
            w.setPhone(input.nextInt());
            f = false;
        }
        System.out.print("Age :");
        try {
            w.setAge(input.nextInt());
            if (Security.valid(w.getAge()) == false) {
                input = new Scanner(System.in);
                System.out.print("Age :");
                w.setAge(input.nextInt());
            }
        } catch (InputMismatchException p) {
            System.out.println("please,insert numeric values only!!");
            f = true;
            input = new Scanner(System.in);
        }
        if (f) {
            System.out.print("Age :");
            w.setAge(input.nextInt());
            f = false;
        }
        System.out.print("City :");
        w.setCity(input.next());
        System.out.print("ID :");
        try {
            w.setId(input.nextInt());
        } catch (InputMismatchException p) {
            System.out.println("please,insert numeric values only!!");
            f = true;
            input = new Scanner(System.in);
        }
        if (f) {
            System.out.print("ID :");
            w.setId(input.nextInt());
            f = false;
        }

        System.out.print("Gender :");
        w.setGender(input.next());
        System.out.print("Salary :");
        try {
            w.setSalary(input.nextDouble());
        } catch (InputMismatchException p) {
            System.out.println("please,insert numeric values only!!");
            f = true;
            input = new Scanner(System.in);
        }
        if (f) {
            System.out.print("Salary :");
            w.setId(input.nextInt());
            f = false;
        }
    }

    static void add_Administrators(Administrators a) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter name of worker ");
        a.setName(input.nextLine());
        System.out.println("enter address ");
        a.setAddress(input.next());
        System.out.println("enter Email ");
        a.setEmail(input.next());
        System.out.println("enter Kind Of Job ");
        a.setKindOfJob(input.next());
        System.out.println("enter Gender ");
        a.setGender(input.next());
        System.out.println("enter Description Of Job ");
        a.setDescriptionOfJob(input.next());

        try {
            System.out.println("enter ID ");
            a.setId(input.nextInt());
            System.out.println("enter phone ");
            a.setPhone(input.nextInt());
            System.out.println("enter Age ");
            a.setAge(input.nextInt());
            System.out.println("enter Salary ");
            a.setSalary(input.nextDouble());

        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }

    }

    static void add_Student(Student w) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("enter name of student ");
            w.setName(input.nextLine());
            System.out.println("enter phone ");
            w.setPhone(input.next());
            System.out.println("enter Age ");
            w.setAge(input.nextInt());
            System.out.println("enter city ");
            w.setCity(input.next());
            System.out.println("enter ID ");
            w.setId(input.nextInt());
            System.out.println("enter Gender ");
            w.setGender(input.next());
            System.out.println("enter grade ");
            w.setGrade(input.next());
            System.out.println("enter GBA ");
            w.setGba(input.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }
    }

    static void add_techincian(technicians w) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter name of technician ");
            w.setName(input.nextLine());
            System.out.println("enter phone ");
            w.setPhone(input.next());
            System.out.println("enter Age ");
            w.setAge(input.nextInt());
            System.out.println("enter city ");
            w.setCity(input.next());
            System.out.println("enter ID ");
            w.setId(input.nextInt());
            System.out.println("enter Gender ");
            w.setGender(input.next());
            System.out.println("enter Salary ");
            w.setSalary(input.nextInt());
            System.out.println("enter hourwage ");
            w.setHourwage(input.nextInt());
            System.out.println("Enter department");
            w.setDepartment(input.next());
            System.out.println("Enter hourwork");
            w.setHourwark(input.nextInt());

        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }

    }

    static void add_professor(professors w) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter name of prof ");
            w.setName(input.nextLine());
            System.out.println("enter phone ");
            w.setPhone(input.next());
            System.out.println("enter Age ");
            w.setAge(input.nextInt());
            System.out.println("enter city ");
            w.setCity(input.next());
            System.out.println("enter ID ");
            w.setId(input.nextInt());
            System.out.println("enter Gender ");
            w.setGender(input.next());
            System.out.println("enter Salary ");
            w.setSalary(input.nextInt());
            System.out.println("enter prof's subject ");
            w.setSubject(input.next());
            System.out.println("Enter department");
            w.setDepartment(input.next());
            System.out.println("Enter Bonus");
            w.setBonus(input.nextInt());

        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }
    }

    static void add_teachingAssisstant(teachingAssistant w) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter name of teaching assistant ");
            w.setName(input.nextLine());
            System.out.println("enter phone ");
            w.setPhone(input.next());
            System.out.println("enter Age ");
            w.setAge(input.nextInt());
            System.out.println("enter city ");
            w.setCity(input.next());
            System.out.println("enter ID ");
            w.setId(input.nextInt());
            System.out.println("enter Gender ");
            w.setGender(input.next());
            System.out.println("enter Salary ");
            w.setSalary(input.nextInt());
            System.out.println("enter prof's subject ");
            w.setSubject(input.next());
            System.out.println("Enter department");
            w.setDepartment(input.next());
            System.out.println("Enter Bonus");
            w.setBonus(input.nextInt());
            System.out.println("Enter deduction ");
            w.setDeduction(input.nextInt());
            System.out.println("Enter Master in what ?");
            w.setMasterName(input.next());

        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }
    }

    static void add_Employee(Employee E) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter name of Employee ");
            E.setName(input.nextLine());
            System.out.println("enter age of Employee ");
            E.setAge(input.nextInt());
            System.out.println("enter employeecode of Employee ");
            E.setEmployeecode(input.nextInt());
            System.out.println("enter qualification of Employee ");
            E.setQualification(input.next());
            System.out.println("enter gender of Employee ");
            E.setGender(input.next());
            System.out.println("enter socialstatus of Employee ");
            E.setSocialstatus(input.next());
            System.out.println("enter addres of Employee ");
            E.setAddres(input.next());
            System.out.println("enter cardnumber of Employee ");
            E.setCardnumber(input.nextInt());
            System.out.println("enter  typeofemployment of Employee ");
            E.setTypeofemployment(input.next());
            System.out.println("enter salary of Employee ");
            E.setSalary(input.nextInt());

        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }
    }

    static void add_Worker(Workers w) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("enter name of worker ");
            w.setName(input.nextLine());
            System.out.println("enter phone ");
            w.setPhone(input.next());
            System.out.println("enter Age ");
            w.setAge(input.nextInt());
            System.out.println("enter city ");
            w.setCity(input.next());
            System.out.println("enter ID ");
            w.setId(input.nextInt());
            System.out.println("enter Gender ");
            w.setGender(input.next());
            System.out.println("enter Salary ");
            w.setSalary(input.nextDouble());
            System.out.println("enter workHours ");
            w.setWorkHours(input.nextInt());

        } catch (InputMismatchException e) {
            System.out.println("Error, you must Enter the number");
        }
    }

    static String name_item = "";

    static void display() {
        System.out.println("if you want to \"add\" a " + name_item + " guard press 1");
        System.out.println("**********************************************");
        System.out.println("if you want to \"search\" for a " + name_item + " guard press 2");
        System.out.println("***************************************************");
        System.out.println("if you want to \"delete\" a " + name_item + "guard press 3");
        System.out.println("*************************************************");
        System.out.println("if you want to \"print\" the data of a " + name_item + " guard press 4");
        System.out.println("**********************************************************");
        System.out.println("if you want to \"exit\" press 0 5");
        System.out.println("******************************");

    }

    public static void main(String arg[]) {

        Scanner input = new Scanner(System.in);
        Workers w = new Workers();
        ArrayList<Workers> workerlist = new ArrayList<Workers>();
        Employee E = new Employee();
        ArrayList<Employee> Employeelist = new ArrayList<Employee>();
        Administrators adm = new Administrators();
        ArrayList<Administrators> Administratorslist = new ArrayList<Administrators>();
        professors p = new professors();
        Student s = new Student();
        teachingAssistant ta = new teachingAssistant();
        technicians t = new technicians();
        ArrayList<professors> proflist = new ArrayList<professors>();
        ArrayList<Student> studentlist = new ArrayList<Student>();
        ArrayList<teachingAssistant> teachingAssistantsrlist = new ArrayList<teachingAssistant>();
        ArrayList<technicians> technicianslist = new ArrayList<technicians>();
        Security S1 = new Security();
        ArrayList<Security> securitylist = new ArrayList<Security>();
        fun();
        int data = input.nextInt();
        switch (data) {
            case 1: {
                while (true) {
                    name_item = "Workers";
                    display();
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            w = new Workers();
                            add_Worker(w);
                            workerlist.add(w);

                            break;

                        case 2:
                            System.out.println("enter Id of worker ");
                            int id = input.nextInt();
                            boolean ser1 = false;
                            for (int i = 0; i < workerlist.size(); i++) {
                                if (id == workerlist.get(i).getId()) {
                                    ser1 = true;
                                    break;
                                } else {
                                    ser1 = false;
                                }

                            }
                            if (ser1 == true) {
                                System.out.println(w.toString());
                            } else {
                                System.out.println("id not found ");
                            }
                            break;
                        case 3:
                            int id_for_delete = input.nextInt();
                            boolean a = false;
                            int delete = 0;
                            for (int i = 0; i < workerlist.size(); i++) {
                                if (id_for_delete == workerlist.get(i).getId()) {
                                    delete = i;
                                    a = true;
                                    break;
                                } else {
                                    a = false;
                                }

                            }
                            if (a = true) {
                                workerlist.remove(delete);
                            }

                            break;
                        case 4:
                            System.out.println(workerlist);
                            break;

                        case 5:
                            return;

                    }
                }
            }

            case 2: {
                boolean continueinput = true;
                do {
                    try {
                        while (true) {
                            name_item = "Employee";
                            display();
                            int choice = input.nextInt();

                            switch (choice) {
                                case 1:
                                    E = new Employee();
                                    add_Employee(E);
                                    Employeelist.add(E);
                                    System.out.println("Employee is added");
                                    break;

                                case 2:
                                    System.out.println("enter employeecode of Employee   ");
                                    int code = input.nextInt();
                                    boolean ser2 = false;
                                    for (int i = 0; i < Employeelist.size(); i++) {
                                        if (code == Employeelist.get(i).getEmployeecode()) {
                                            ser2 = true;
                                            break;
                                        } else {
                                            ser2 = false;
                                        }

                                    }
                                    if (ser2 == true) {
                                        System.out.println(E.toString());
                                    } else {
                                        System.out.println("Employee not found ");
                                    }
                                    break;
                                case 3:
                                    System.out.println("enter employeecode for delete ");
                                    int code_for_delete = input.nextInt();
                                    boolean test = false;
                                    int deletee = 0;
                                    for (int i = 0; i < Employeelist.size(); i++) {
                                        if (code_for_delete == Employeelist.get(i).getEmployeecode()) {
                                            deletee = i;
                                            test = true;
                                            break;
                                        } else {
                                            test = false;
                                        }

                                    }
                                    if (test = true) {
                                        Employeelist.remove(deletee);
                                        System.out.println("Employee is removed");
                                    }

                                    break;
                                case 4:
                                    System.out.println(Employeelist);
                                    break;
                                case 5: {
                                    return;

                                }
                            }

                            continueinput = false;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("enter integer value");
                        input.nextLine();
                    }
                } while (continueinput);
            }
            case 3: {
                while (true) {
                    name_item = "Administrators";
                    display();

                    int choice = input.nextInt();
                    switch (choice) {

                        case 1:
                            adm = new Administrators();
                            add_Administrators(adm);
                            Administratorslist.add(adm);

                            break;

                        case 2:
                            System.out.println("enter Id of Administrators ");
                            int id = input.nextInt();
                            boolean ser3 = false;
                            for (int i = 0; i < Administratorslist.size(); i++) {
                                if (id == Administratorslist.get(i).getId()) {
                                    ser3 = true;
                                    break;
                                } else {
                                    ser3 = false;
                                }

                            }
                            if (ser3 == true) {
                                System.out.println(adm.toString());
                            } else {
                                System.out.println("id not found ");
                            }
                            break;
                        case 3:
                            System.out.println("enter Id of Administrators ");
                            int id_for_delete = input.nextInt();
                            boolean b = false;
                            int delete = 0;
                            for (int i = 0; i < Administratorslist.size(); i++) {
                                if (id_for_delete == Administratorslist.get(i).getId()) {
                                    delete = i;
                                    b = true;
                                    break;
                                } else {
                                    b = false;
                                }

                            }
                            if (b = true) {
                                Administratorslist.remove(delete);
                            }

                            break;
                        case 4:
                            System.out.println(Administratorslist);
                            break;

                        case 5:
                            return;

                    }

                }
            }
            case 4: {
                int choice;
                name_item = "teachingAssistant";
                display();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        ta = new teachingAssistant();
                        add_teachingAssisstant(ta);
                        teachingAssistantsrlist.add(ta);

                        break;

                    case 2:
                        System.out.println("enter Id ");
                        int id = input.nextInt();
                        boolean s1 = false;
                        for (int i = 0; i < teachingAssistantsrlist.size(); i++) {
                            if (id == teachingAssistantsrlist.get(i).getId()) {
                                s1 = true;
                                break;
                            } else {
                                s1 = false;
                            }

                        }
                        if (s1 == true) {
                            System.out.println(ta.toString());
                        } else {
                            System.out.println("id not found ");
                        }
                        break;
                    case 3:
                        int id_for_delete = input.nextInt();
                        boolean a = false;
                        int delete = 0;
                        for (int i = 0; i < teachingAssistantsrlist.size(); i++) {
                            if (id_for_delete == teachingAssistantsrlist.get(i)
                                    .getId()) {
                                delete = i;
                                a = true;
                                break;
                            } else {
                                a = false;
                            }

                        }
                        if (a = true) {
                            teachingAssistantsrlist.remove(delete);
                        }

                        break;
                    case 4:
                        System.out.println(teachingAssistantsrlist);
                        break;

                    case 5:
                        return;

                }
            }
            case 5: {
                int choice;
                name_item = "Student";
                display();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        s = new Student();
                        add_Student(s);
                        ;
                        studentlist.add(s);

                        break;

                    case 2:
                        System.out.println("enter Id ");
                        int id = input.nextInt();
                        boolean s1 = false;
                        for (int i = 0; i < studentlist.size(); i++) {
                            if (id == studentlist.get(i).getId()) {
                                s1 = true;
                                break;
                            } else {
                                s1 = false;
                            }

                        }
                        if (s1 == true) {
                            System.out.println(s.toString());
                        } else {
                            System.out.println("id not found ");
                        }
                        break;
                    case 3:
                        int id_for_delete = input.nextInt();
                        boolean a = false;
                        int delete = 0;
                        for (int i = 0; i < studentlist.size(); i++) {
                            if (id_for_delete == studentlist.get(i).getId()) {
                                delete = i;
                                a = true;
                                break;
                            } else {
                                a = false;
                            }

                        }
                        if (a = true) {
                            studentlist.remove(delete);
                        }

                        break;
                    case 4:
                        System.out.println(studentlist);
                        break;

                    case 5:
                        return;

                }
            }
            case 6: {
                int choice;
                name_item = "professors";
                display();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        p = new professors();
                        add_professor(p);
                        proflist.add(p);

                        break;

                    case 2:
                        System.out.println("enter Id  ");
                        int id = input.nextInt();
                        boolean s1 = false;
                        for (int i = 0; i < proflist.size(); i++) {
                            if (id == proflist.get(i).getId()) {
                                s1 = true;
                                break;
                            } else {
                                s1 = false;
                            }

                        }
                        if (s1 == true) {
                            System.out.println(p.toString());
                        } else {
                            System.out.println("id not found ");
                        }
                        break;
                    case 3:
                        int id_for_delete = input.nextInt();
                        boolean a = false;
                        int delete = 0;
                        for (int i = 0; i < proflist.size(); i++) {
                            if (id_for_delete == proflist.get(i).getId()) {
                                delete = i;
                                a = true;
                                break;
                            } else {
                                a = false;
                            }

                        }
                        if (a = true) {
                            proflist.remove(delete);
                        }

                        break;
                    case 4:
                        System.out.println(proflist);
                        break;

                    case 5:
                        return;

                }
            }
            case 7: {
                while (true) {
                    name_item = "Security";
                    display();
                    int choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            S1 = new Security();
                            add_Security(S1);
                            securitylist.add(S1);
                            break;

                        case 2:
                            System.out.println("Enter the id of the security guard for search");
                            int id = input.nextInt();
                            boolean ser1 = false;
                            for (int i = 0; i < securitylist.size(); i++) {
                                if (id == securitylist.get(i).getId()) {
                                    ser1 = true;
                                    break;
                                } else {
                                    ser1 = false;
                                }

                            }
                            if (ser1 == true) {
                                System.out.println(S1.toString());
                            } else {
                                System.out.println("not found ");
                            }
                            break;
                        case 3:
                            int id_for_delete = input.nextInt();
                            int delete = 0;
                            boolean ch = false;
                            for (int i = 0; i < securitylist.size(); i++) {
                                if (id_for_delete == securitylist.get(i).getId()) {
                                    delete = i;
                                    ch = true;
                                    break;
                                } else {
                                    ch = false;
                                }

                            }
                            if (ch == true) {
                                securitylist.remove(delete);
                            }

                            break;
                        case 4:
                            System.out.println(securitylist);
                            break;

                        default:
                            return;

                    }
                }
            }
            case 8: {
                int choice;
                name_item = "technicians";
                display();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        t = new technicians();
                        add_techincian(t);
                        technicianslist.add(t);

                        break;

                    case 2:
                        System.out.println("enter Id ");
                        int id = input.nextInt();
                        boolean s1 = false;
                        for (int i = 0; i < technicianslist.size(); i++) {
                            if (id == technicianslist.get(i).getId()) {
                                s1 = true;
                                break;
                            } else {
                                s1 = false;
                            }

                        }
                        if (s1 == true) {
                            System.out.println(t.toString());
                        } else {
                            System.out.println("id not found ");
                        }
                        break;
                    case 3:
                        int id_for_delete = input.nextInt();
                        boolean a = false;
                        int delete = 0;
                        for (int i = 0; i < technicianslist.size(); i++) {
                            if (id_for_delete == technicianslist.get(i).getId()) {
                                delete = i;
                                a = true;
                                break;
                            } else {
                                a = false;
                            }

                        }
                        if (a = true) {
                            technicianslist.remove(delete);
                        }

                        break;
                    case 4:
                        System.out.println(technicianslist);
                        break;

                    case 5:
                        return;

                }
            }
        }

    }
}
