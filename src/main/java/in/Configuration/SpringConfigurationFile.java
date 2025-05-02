package in.Configuration;


import in.beans.Address;
import in.beans.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFile {

    @Bean
    public Address createAddress() {
        Address address = new Address();
        address.setAddress("Ayush Park");
        address.setCity("Pune");
        address.setZip("1456");
        address.setState("Maharashtra");
        return address;
    }

    @Bean
    public Students CreateStudents () {

        Students students1 = new Students();
        students1.setName("vikas");
        students1.setAge(22);
        students1.setId(145);
        students1.setAddress(createAddress());
        return students1;
    }
}