package softclick.server.data.remoting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import softclick.server.data.repositories.TaskRepository;
import softclick.server.data.repositories.UserRepository;

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
}