package dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Data@Entity@NoArgsConstructor@AllArgsConstructor@Table
public class Student extends Person{
    private String matricule;



    @ManyToMany(mappedBy = "students" ,fetch= FetchType.EAGER)
  private Collection<Session> sessions=new ArrayList<>();

    public Student(Long id, String name, Date dateNaissance, String matricule) {
        super(id, name, dateNaissance);
        this.matricule = matricule;
    }
}
