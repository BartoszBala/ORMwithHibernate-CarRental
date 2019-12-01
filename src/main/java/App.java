import CarModel.CarServices;
import ClientModel.Adress;
import ClientModel.Client;
import ClientModel.ClientServices;
import EmployeeModel.Employee;
import EmployeeModel.EmployeeService;

import java.time.LocalDate;

public class App {

    private static CarServices carServices;
    private static ClientServices clientServices;
    private static EmployeeService employeeService;

    public static void main(String[] args) {
        carServices = new CarServices();
        clientServices = new ClientServices();
employeeService = new EmployeeService();

//        Adress addres = new Adress("Polska","Warszawa","00-324","Skupiona","2b");
//        Client client = new Client(null,"Kamil","Kott",LocalDate.of(2012,1,5),"500-255-501","kocur@wp.pl",null,addres);
//        client.setDateOfBirth(LocalDate.of(1965,12,11));
//        clientServices.persist(client);

        Employee employee = new Employee(null,"Tomasz","Goss",LocalDate.of(2013,1,1),"tomek@rentcar.com","600123456",LocalDate.of(1980,2,5));

        employeeService.persist(employee);
//       clientServices.findAllClient().stream().forEach(x-> System.out.println(x));

    }
}
