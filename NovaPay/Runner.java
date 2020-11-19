package com.assign.emp;

import com.assign.emp.entity.Employee;

import java.util.*;

public class Runner {
    public static void main(String[] args) {


        Employee emp1 = new Employee(1, "A", 5000.0, 2);
        Employee emp2 = new Employee(2, "B", 16000.0, 5);
        Employee emp3 = new Employee(3, "C", 4000.0, 3);
        Employee emp4 = new Employee(4, "D", 6000.0, 2);
        Employee emp5 = new Employee(5, "E", 7000.0, 5);
        Employee emp6 = new Employee(6, "F", 88000.0, 2);


//        making id comparator for comparing the id
        Comparator<Employee> idCompare = Comparator.comparing(Employee::getId);
        TreeSet<Employee> SET = new TreeSet<>(idCompare);
        SET.addAll(Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6));
        Iterator<Employee> it = SET.iterator();

        HashMap<Integer, Integer> map = new HashMap<>();  // this is for containing the rate as id and id as value for the employee
        while (it.hasNext())
        {
            Employee obj = it.next();
//            int curr_id = obj.getId();
            int curr_rate = obj.getRating();
            double curr_salary = obj.getSalary();
            // search the employee with the same rate and then pick those employee who have highest salary

            Iterator<Employee> next_itr = SET.iterator();

            while (next_itr.hasNext()){
                Employee next_obj = next_itr.next();
                if (curr_rate == next_obj.getRating()){
                    if (curr_salary<=next_obj.getSalary()){
                        curr_salary = next_obj.getSalary();
                        map.put(next_obj.getRating(), next_obj.getId());
                    }
                }
            }


        }

        Iterator<Map.Entry<Integer, Integer>> mp_itr = map.entrySet().iterator();

        System.out.println("==================");
        System.out.println("Output:(id-rating)");
        System.out.println("==================");


        while(mp_itr.hasNext()){
            Map.Entry<Integer, Integer> entry = mp_itr.next();
            System.out.println(entry.getValue()+"-"+entry.getKey());
        }

        System.out.println("====================================================");
        System.out.println("Output for Hike applicability:(Employee id - Hike %)");
        System.out.println("====================================================");


        ArrayList<Double> bandWeight = new ArrayList<>();
        bandWeight.addAll(Arrays.asList(3.0, 2.5, 2.0, 1.5, 1.0, 0.5));

        ArrayList<Integer> ratingWeight = new ArrayList<>();
        ratingWeight.addAll(Arrays.asList(0,5,10,15,20));


//        first of all we have to know the employee rating and his band based on their salary

        Iterator<Employee> hike_itr  = SET.iterator();

        while (hike_itr.hasNext()){
            Employee emp = hike_itr.next();

//            now lets get the emp rate and salary
            int rate = emp.getRating();
            double salary = emp.getSalary();

//            now lets find the salary band of the employee
            int band_var;
            if (salary<=1000){
                band_var = 1; // band 1
            }
            else if (salary >= 1001 && salary <= 5000){
                band_var = 2;  // band 2
            }
            else if (salary >= 5001 && salary <= 10000)
            {
                band_var = 3;  // band 3
            }
            else if (salary >= 10001 && salary <= 20000)
            {
                band_var = 4;  // band 4
            }
            else  if (salary >= 20001 && salary <= 50000)
            {
                band_var = 5; // band 5
            }
            else {
                band_var = 6;
            }

            // Hike percentage = Rating weightage * Band weightage
//            actually i have store the rate weight and band weight in the list so for each rate we will get its weghtage at (index - 1) place in the list
            double hike_percentage = ratingWeight.get(rate - 1) * bandWeight.get(band_var-1);

            System.out.println(emp.getId()+" - "+hike_percentage+"%");

        }

    }

}
