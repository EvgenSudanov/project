package ru.sudanov.fish.and.beer.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Event {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String place;
    @Column
    private Date date;
    @Column
    private String description;
    @Column
    private Long countPeople;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User creator;
    @ManyToMany
    @JoinTable(
            name = "event_participants",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> participants;


    public Event(String name, String place, Date date, String description, Long countPeople, User creator, List<User> participants) {
        this.name = name;
        this.place = place;
        this.date = date;
        this.description = description;
        this.countPeople = countPeople;
        this.creator = creator;
        this.participants = participants;
    }
}
