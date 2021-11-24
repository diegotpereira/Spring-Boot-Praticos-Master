package br.com.java.springbootpraticosmaster;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.java.springbootpraticosmaster.model.Role;
import br.com.java.springbootpraticosmaster.model.User;
import br.com.java.springbootpraticosmaster.repository.RoleRepository;
import br.com.java.springbootpraticosmaster.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {
    
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("ADMIN"));

        Role adminRole = roleRepository.findByRole("ADMIN");
        Role userRole = roleRepository.findByRole("USER");

        User user = new User("admin@admin.com", passwordEncoder.encode("password"), "Admin", "Super", true, "admin");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

        user = new User("user@user.com", passwordEncoder.encode("password"), "User", "Super", true, "user");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);
    }
}
