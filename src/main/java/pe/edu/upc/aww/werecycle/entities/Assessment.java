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

    public Assessment() {
    }

    public Assessment(int idAssessment, String descriptionAssessment, int amountAssessment, Publication idPublication) {
        this.idAssessment = idAssessment;
        this.descriptionAssessment = descriptionAssessment;
        this.amountAssessment = amountAssessment;
        this.idPublication = idPublication;
    }


    public int getIdAssessment() {
        return idAssessment;
    }

    public void setIdAssessment(int idAssessment) {
        this.idAssessment = idAssessment;
    }

    public String getDescriptionAssessment() {
        return descriptionAssessment;
    }

    public void setDescriptionAssessment(String descriptionAssessment) {
        this.descriptionAssessment = descriptionAssessment;
    }

    public int getAmountAssessment() {
        return amountAssessment;
    }

    public void setAmountAssessment(int amountAssessment) {
        this.amountAssessment = amountAssessment;
    }

    public Publication getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(Publication idPublication) {
        this.idPublication = idPublication;
    }
}
