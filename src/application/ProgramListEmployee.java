package application;

import entities.EmployeeList;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProgramListEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        List<EmployeeList> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            while (hasId(list, id)) {
                System.out.println("ID already taken! Try again:");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine(); //quebrar buffer de entrada
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            EmployeeList emp = new EmployeeList(id, name, salary);
            list.add(emp);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();

        EmployeeList emp = list.stream().filter(x -> x.getId()==idsalary).findFirst().orElse(null);

        // Integer pos = position(list, idsalary);

        if (emp == null){
            System.out.print("This id doesnt exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeList empA : list){
            System.out.println(empA);
        }
        sc.close();
    }

    public static Integer position(List<EmployeeList> list, int id){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).getId() == id){  // GET -> pegar elemento na posição
                return i;
            }
        }
        return -1; //valor nao encontrado para o id
    }

    public static boolean hasId(List<EmployeeList> list, int id){
        EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
