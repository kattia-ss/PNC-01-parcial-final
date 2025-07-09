package com.uca.parcialfinalncapas.config;

import com.uca.parcialfinalncapas.entities.Ticket;
import com.uca.parcialfinalncapas.entities.User;
import com.uca.parcialfinalncapas.repository.TicketRepository;
import com.uca.parcialfinalncapas.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TicketRepository ticketRepository;
    @Override
    public void run(String... args) {
        userRepository.deleteAll();
        ticketRepository.deleteAll();

            User user = User.builder()
                    .nombre("Usuario Final")
                    .correo("user@correo.com")
                    .password(passwordEncoder.encode("user123"))
                    .nombreRol("USER")
                    .build();

            User user2 = User.builder()
                    .nombre("Usuario Final2")
                    .correo("user2@correo.com")
                    .password(passwordEncoder.encode("user123"))
                    .nombreRol("USER")
                    .build();

            User tech = User.builder()
                    .nombre("Soporte Técnico")
                    .correo("tech@correo.com")
                    .password(passwordEncoder.encode("tech123"))
                    .nombreRol("TECH")
                    .build();

            user = userRepository.save(user);
            user2 = userRepository.save(user2);
            tech = userRepository.save(tech);

            Ticket ticket1 = Ticket.builder()
                    .titulo("Error en el login")
                    .descripcion("No se puede iniciar sesión")
                    .estado("ABIERTO")
                    .usuarioId(user.getId())
                    .tecnicoAsignadoId(tech.getId())
                    .fecha(LocalDateTime.now())
                    .build();

            Ticket ticket2 = Ticket.builder()
                    .titulo("Pantalla en blanco")
                    .descripcion("La app se queda en blanco después del login")
                    .estado("ASIGNADO")
                    .usuarioId(user.getId())
                    .tecnicoAsignadoId(tech.getId())
                    .fecha(LocalDateTime.now())
                    .build();

            ticketRepository.save(ticket1);
            ticketRepository.save(ticket2);

            System.out.println("🟢 Tickets Usuarios de prueba creados.");

    }

}
