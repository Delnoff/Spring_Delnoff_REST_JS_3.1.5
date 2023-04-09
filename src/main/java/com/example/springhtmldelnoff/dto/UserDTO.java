package com.example.springhtmldelnoff.dto;

import com.example.springhtmldelnoff.model.Role;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

public class UserDTO {

    private Long id;

    @NotEmpty(message = "The name fields should not be empty")
    @Size(min = 2, max = 50, message = "The name must be between 2 and 50 characters")
    private String username;

    @NotEmpty(message = "Password fields should not be empty")
    private String password;

    @Min(value = 1, message = "The age cannot be less than or equal to 0")
    @Max(value = 99, message = "The age cannot be more than 100")
    private int age;

    @NotEmpty(message = "Email fields should not be empty")
    private String email;

    @NotEmpty(message = "Please select role")
    private Set<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
