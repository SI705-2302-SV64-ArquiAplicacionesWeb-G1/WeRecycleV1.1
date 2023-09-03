package pe.edu.upc.aww.werecycle.entities;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Entity
@Table(name = "Assesment")
public class Assessment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssessment;
@Column(name = "descriptionAssessment",nullable = false,length = 100)
    private String descriptionAssessment;
@Column(name = "amountAssessment",nullable = false)
    private int amountAssessment;
@OneToOne
@JoinColumn(name = "idPublication")
    private Publication idPublication;


}
