package edu.matc.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * A class to represent a user.
 *
 * @author pwaite
 */
@Data
@Entity
@Table(name = "users")
public class User {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private String userid;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    /**
     * Calculate age int.
     *
     * @return the int
     */
    public int calculateAge() {
        LocalDate now = LocalDate.now();
        long age = ChronoUnit.YEARS.between(dateOfBirth, now);

        return (int)age;
    }
}