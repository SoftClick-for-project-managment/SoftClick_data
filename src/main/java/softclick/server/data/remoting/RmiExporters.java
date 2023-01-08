package softclick.server.data.remoting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import softclick.server.data.entities.ExpenseCategory;
import softclick.server.data.repositories.*;

@Configuration
@ComponentScan
public class RmiExporters {

    @Bean(name = "/UserRepository") @Autowired
    HttpInvokerServiceExporter rmiUserRepositoryExporter(UserRepository userRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService( userRepository );
        exporter.setServiceInterface( UserRepository.class );
        return exporter;
    }

    @Bean(name = "/TaskRepository") @Autowired
    HttpInvokerServiceExporter rmiTaskRepositoryExporter(TaskRepository taskRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(taskRepository);
        exporter.setServiceInterface(TaskRepository.class);

        return exporter;
    }

    @Bean(name = "/RoleRepository") @Autowired
    HttpInvokerServiceExporter rmiRoleRepositoryExporter(RoleRepository roleRepository) {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(RoleRepository.class);
        exporter.setService(roleRepository);
        return  exporter;
    }

    @Bean(name = "/ClientRepository") @Autowired
    HttpInvokerServiceExporter rmiClientRepositoryExporter(ClientRepository clientRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(ClientRepository.class);
        exporter.setService(clientRepository);

        return exporter;
    }

    @Bean(name = "/EmployeeRepository") @Autowired
    HttpInvokerServiceExporter rmiEmployeeRepositoryExporter(EmployeeRepository employeeRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(EmployeeRepository.class);
        exporter.setService(employeeRepository);

        return exporter;
    }

    @Bean(name = "/SkillRepository") @Autowired
    HttpInvokerServiceExporter rmiSkillRepositoryExporter(SkillRepository skillRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(SkillRepository.class);
        exporter.setService(skillRepository);

        return exporter;
    }
    @Bean(name = "/ExpenseRepository") @Autowired
    HttpInvokerServiceExporter rmiExpenseRepositoryExporter(ExpenseRepository expenseRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(ExpenseRepository.class);
        exporter.setService(expenseRepository);

        return exporter;
    }
    @Bean(name = "/ExpenseCategoryRepository") @Autowired
    HttpInvokerServiceExporter rmiExpenseCategoryRepositoryExporter(ExpenseCategoryRepository expenseCategoryRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(ExpenseCategoryRepository.class);
        exporter.setService(expenseCategoryRepository);
        return exporter;
    }



    @Bean(name = "/ProjectRepository") @Autowired
    HttpInvokerServiceExporter rmiProjectRepositoryExporter(ProjectRepository projectRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(ProjectRepository.class);
        exporter.setService(projectRepository);

        return exporter;
    }
    @Bean(name = "/DomainRepository") @Autowired
    HttpInvokerServiceExporter rmiDomainepositoryExporter(DomainRepository domainRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(DomainRepository.class);
        exporter.setService(domainRepository);

        return exporter;
    }
    @Bean(name = "/InvoiceRepository") @Autowired
    HttpInvokerServiceExporter rmiInvoiceRepositoryExporter(InvoiceRepository invoiceRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(InvoiceRepository.class);
        exporter.setService(invoiceRepository);

        return exporter;
    }
    @Bean(name = "/PriorityRepository") @Autowired
    HttpInvokerServiceExporter rmiPrioritypositoryExporter(PriorityRepository priorityRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(PriorityRepository.class);
        exporter.setService(priorityRepository);

        return exporter;
    }
    @Bean(name = "/StatusRepository") @Autowired
    HttpInvokerServiceExporter rmiStatuspositoryExporter(StatusRepository statusRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(StatusRepository.class);
        exporter.setService(statusRepository);

        return exporter;
    }

    @Bean(name = "/TeamRepository") @Autowired
    HttpInvokerServiceExporter rmiStatusTeamExporter(TeamRepository teamRepository){
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setServiceInterface(TeamRepository.class);
        exporter.setService(teamRepository);

        return exporter;
    }
}
