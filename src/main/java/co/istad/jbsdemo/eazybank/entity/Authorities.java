package co.istad.jbsdemo.eazybank.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "authorities")
public class Authorities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String authority;
}
