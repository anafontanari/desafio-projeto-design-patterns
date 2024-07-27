package spring_boot.desafio_projeto.clientregistration.repository;


import com.example.clientregistration.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
