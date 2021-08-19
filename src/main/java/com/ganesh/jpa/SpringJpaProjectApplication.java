package com.ganesh.jpa;

import com.ganesh.persistence.*;
import com.ganesh.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.Arrays;


@SpringBootApplication(scanBasePackages = "com.ganesh")
@EnableJpaRepositories(basePackages = "com.ganesh.persistence")
@EntityScan(basePackages = "com.ganesh.pojo")
public class SpringJpaProjectApplication implements CommandLineRunner {

    private WifeDaoInterface wifeDao;
    private HusbandDaoInterface husbandDao;
    private TrainerDaoInterface trainerDao;
    private LearnerDaoInterface learnerDao;
    private EmployeeDaoInterface employeeDao;
    private DepartmentDaoInterface departmentDao;

    @Autowired
    public void setEmployeeDao(EmployeeDaoInterface employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Autowired
    public void setDepartmentDao(DepartmentDaoInterface departmentDao) {
        this.departmentDao = departmentDao;
    }

    @Autowired
    public void setTrainerDao(TrainerDaoInterface trainerDao) {
        this.trainerDao = trainerDao;
    }

    @Autowired
    public void setLearnerDao(LearnerDaoInterface learnerDao) {
        this.learnerDao = learnerDao;
    }

    @Autowired
    public void setWifeDao(WifeDaoInterface wifeDao) {
        this.wifeDao = wifeDao;
    }

    @Autowired
    public void setHusbandDao(HusbandDaoInterface husbandDao) {
        this.husbandDao = husbandDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaProjectApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Employee employee1 = new Employee("Jack");
        Employee employee2 = new Employee("Joe");
        Employee employee3 = new Employee("Will");
        Employee employee4 = new Employee("Peter");
        Employee employee5 = new Employee("Kim");
        Employee employee6 = new Employee("Oman");
        Employee employee7 = new Employee("Paul");
        Employee employee8 = new Employee("Mikel");

        Department department1 = new Department("IT");
        Department department2 = new Department("Sales");
        Department department3 = new Department("Marketing");

        departmentDao.save(department1);
        departmentDao.save(department2);
        departmentDao.save(department3);

        employee1.setDepartment(department1);
        employee2.setDepartment(department1);
        employee3.setDepartment(department2);
        employee4.setDepartment(department1);
        employee5.setDepartment(department3);
        employee6.setDepartment(department3);
        employee7.setDepartment(department1);
        employee7.setDepartment(department2);
        employee8.setDepartment(department1);


//        department1.setEmployee(new ArrayList<>(Arrays.asList(employee1, employee3, employee2, employee4)));
//        department2.setEmployee(new ArrayList<>(Arrays.asList(employee5, employee8)));
//        department3.setEmployee(new ArrayList<>(Arrays.asList(employee6, employee7)));

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);
        employeeDao.save(employee6);
        employeeDao.save(employee7);
        employeeDao.save(employee8);


//
//        Learner learner1 = learnerDao.getById(1);
//        Learner learner2 = learnerDao.getById(2);
//
//        System.out.println("Name " + learner1.getName() + " Id " + learner1.getId() );
//        System.out.println("Name " + learner2.getName() + " Id " + learner2.getId() );


//        Wife wife1 = new Wife("Ria");
//        Wife wife2 = new Wife("Myra");
//        Husband husband1 = new Husband("Tim");
//        Husband husband2 = new Husband("Fred");
//
//        wife1.setHusband(husband1);
//        wife2.setHusband(husband2);
//
//        husband1.setWife(wife1);
//        husband2.setWife(wife2);
//
//        wifeDao.save(wife1);
//        wifeDao.save(wife2);
//
//        husbandDao.save(husband1);
//        husbandDao.save(husband2);
//
//        Trainer trainer1 = new Trainer("Paul");
//        Trainer trainer2 = new Trainer("Greg");
//        trainerDao.save(trainer1);
//        trainerDao.save(trainer2);
//
//        Learner learner1 = new Learner("Learner 1");
//        Learner learner2 = new Learner("Learner 2");
//        Learner learner3 = new Learner("Learner 3");
//        Learner learner4 = new Learner("Learner 4");
//
//        Learner learner5 = new Learner("Learner 5");
//        Learner learner6 = new Learner("Learner 6");
//        Learner learner7 = new Learner("Learner 7");
//        Learner learner8 = new Learner("Learner 8");

//        learner1.getTrainers().add(trainer2);
//        learner2.getTrainers().add(trainer1);
//        learner3.getTrainers().add(trainer2);
//        learner4.getTrainers().add(trainer1);
//        learner5.getTrainers().add(trainer1);
//        learner6.getTrainers().add(trainer2);
//        learner7.getTrainers().add(trainer1);
//        learner8.getTrainers().add(trainer2);
//
//        learner1.setTrainer(trainer2);
//        learner2.setTrainer(trainer1);
//        learner3.setTrainer(trainer2);
//        learner4.setTrainer(trainer1);
//        learner5.setTrainer(trainer1);
//        learner6.setTrainer(trainer2);
//        learner7.setTrainer(trainer1);
//        learner8.setTrainer(trainer2);

//        trainer1.setLearnerList(new ArrayList<>(Arrays.asList(learner2, learner4, learner5, learner7)));
//        trainer2.setLearnerList(new ArrayList<>(Arrays.asList(learner1, learner2, learner6, learner8)));


//        learnerDao.save(learner1);
//        learnerDao.save(learner2);
//        learnerDao.save(learner3);
//        learnerDao.save(learner4);
//        learnerDao.save(learner5);
//        learnerDao.save(learner6);
//        learnerDao.save(learner7);
//        learnerDao.save(learner8);
    }


}
/* implements CommandLineRunner {

	@Autowired
	EmployeeService empService;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}*/