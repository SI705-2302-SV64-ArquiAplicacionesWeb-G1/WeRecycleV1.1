package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Publication;

import javax.persistence.*;

public class AssesmentDTO {


    private int idAssessment;
    private String descriptionAssessment;
    private int amountAssessment;

    private Publication idPublication;

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
