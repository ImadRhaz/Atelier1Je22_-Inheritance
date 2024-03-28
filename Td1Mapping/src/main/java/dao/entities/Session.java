package dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date date,h_debut,h_fin;
    @ManyToOne
    private Lesson lesson;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Student> students=new ArrayList<>();

    public Session(int id, Date date, Date h_debut, Date h_fin){
        this.id=id;
        this.date=date;
        this.h_debut=h_debut;
        this.h_fin=h_fin;
    }
}