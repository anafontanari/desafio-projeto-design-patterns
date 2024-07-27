package spring_boot.desafio_projeto.clientregistration.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Email> emails;

    // Getters and Setters
}
