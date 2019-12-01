package EmployeeModel;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeService() {
        employeeDAO = new EmployeeDAO();
    }

    public void persist(Employee employee){
        employeeDAO.openSessionWithTransaction();
        employeeDAO.persist(employee);
        employeeDAO.closeSessionWithTransaction();
    }

    public void delete(Employee employee){
        employeeDAO.openSessionWithTransaction();
        employeeDAO.delete(employee);
        employeeDAO.closeSessionWithTransaction();

    }

    public void update(Employee employee){
        employeeDAO.openSessionWithTransaction();
        employeeDAO.update(employee);
        employeeDAO.closeSessionWithTransaction();

    }

    public List<Employee> findAllEmployee(){
        employeeDAO.openSession();
        List<Employee> employees = employeeDAO.findALl();
         employeeDAO.closeSession();
        return employees;
    }

    public Employee findEmplyeById(Long id){
        employeeDAO.openSession();
        Employee employee = employeeDAO.findById(id);
        employeeDAO.closeSession();
        return employee;
    }
}
