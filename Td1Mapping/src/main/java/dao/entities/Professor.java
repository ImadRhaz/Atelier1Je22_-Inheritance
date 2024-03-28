package dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity@Table@Data@AllArgsConstructor@NoArgsConstructor
public class Professor extends Person{
    private Date d_affectation;
    @OneToOne
    private Lesson lesson;

    public Professor(Long id, String name, Date dateNaissance, Date d_affectation) {
        super(id, name, dateNaissance);
        this.d_affectation = d_affectation;
    }
}
