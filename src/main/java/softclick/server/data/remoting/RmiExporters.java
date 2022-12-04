package softclick.server.data.remoting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import softclick.server.data.repositories.*;

@Configuration
public class RmiExporters {

    @Bean @Autowired
    RmiServiceExporter rmiUserRepositoryExporter(UserRepository userRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("UserRepository");
        exporter.setServiceInterface(UserRepository.class);
        exporter.setService(userRepository);

        return exporter;
    }

    @Bean @Autowired
    RmiServiceExporter rmiTaskRepositoryExporter(TaskRepository taskRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("TaskRepository");
        exporter.setServiceInterface(TaskRepository.class);
        exporter.setService(taskRepository);

        return exporter;
    }

    @Bean @Autowired
    RmiServiceExporter rmiRoleRepositoryExporter(RoleRepository roleRepository) {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("RoleRepository");
        exporter.setServiceInterface(RoleRepository.class);
        exporter.setService(roleRepository);
        return  exporter;
    }

    @Bean @Autowired
    RmiServiceExporter rmiClientRepositoryExporter(ClientRepository clientRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("ClientRepository");
        exporter.setServiceInterface(ClientRepository.class);
        exporter.setService(clientRepository);

        return exporter;
    }

    @Bean @Autowired
    RmiServiceExporter rmiEmployeeRepositoryExporter(EmployeeRepository employeeRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("EmployeeRepository");
        exporter.setServiceInterface(EmployeeRepository.class);
        exporter.setService(employeeRepository);

        return exporter;
    }

    @Bean @Autowired
    RmiServiceExporter rmiSkillRepositoryExporter(SkillRepository skillRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("SkillRepository");
        exporter.setServiceInterface(SkillRepository.class);
        exporter.setService(skillRepository);

        return exporter;
    }
    @Bean @Autowired
    RmiServiceExporter rmiExpenseRepositoryExporter(ExpenseRepository expenseRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("ExpenseRepository");
        exporter.setServiceInterface(ExpenseRepository.class);
        exporter.setService(expenseRepository);

        return exporter;
    }
    @Bean @Autowired
    RmiServiceExporter rmiExpenseCategoryRepositoryExporter(ExpenseCategoryRepository expenseCategoryRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("ExpenseCategoryRepository");
        exporter.setServiceInterface(ExpenseCategoryRepository.class);
        exporter.setService(expenseCategoryRepository);

        return exporter;
    }

    @Bean @Autowired
    RmiServiceExporter rmiProjectRepositoryExporter(ProjectRepository projectRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("ProjectRepository");
        exporter.setServiceInterface(ProjectRepository.class);
        exporter.setService(projectRepository);

        return exporter;
    }
    @Bean @Autowired
    RmiServiceExporter rmiDomainepositoryExporter(DomainRepository domainRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("DomainRepository");
        exporter.setServiceInterface(DomainRepository.class);
        exporter.setService(domainRepository);

        return exporter;
    }
    @Bean @Autowired
    RmiServiceExporter rmiInvoiceRepositoryExporter(InvoiceRepository invoiceRepository){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("InvoiceRepository");
        exporter.setServiceInterface(InvoiceRepository.class);
        exporter.setService(invoiceRepository);

        return exporter;
    }
}
