package ru.sudanov.fish.and.beer.model;

import jakarta.persistence.*;
import lombok.*;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "users")
@EqualsAndHashCode
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String login;
    @Column
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Event> getJoinedEvents() {
        return joinedEvents;
    }

    public void setJoinedEvents(List<Event> joinedEvents) {
        this.joinedEvents = joinedEvents;
    }

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;


    @OneToMany (cascade = CascadeType.ALL, mappedBy = "creator")
    private List<Event> events;


    @ManyToMany(mappedBy = "participants")
    private List<Event> joinedEvents;


    public User(String login, String password, List<Role> roles, List<Event> events, List<Event> joinedEvents) {
        this.login = login;
        this.password = password;
        this.roles = roles;
        this.events = events;
        this.joinedEvents = joinedEvents;
    }
}
