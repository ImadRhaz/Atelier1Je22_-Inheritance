package dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data@NoArgsConstructor@AllArgsConstructor@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titre;
    private String description;
    @OneToMany(mappedBy = "lesson", fetch = FetchType.LAZY)
    private Collection<Session> sessions;
    @OneToOne(mappedBy = "lesson")
    private Professor professor;

    public Lesson(int id, String titre, String description) {
        this.id = id;
        this.titre = titre;
        this.description = description;
    }
}