package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.*;
import java.time.LocalDate;

public class StatisticalReportsDTO {

    private int idStatisticalReports;
    private String typeStatisticalReports;
    private String descriptionStatisticalReports;
    private LocalDate generationDateStatisticalReports;

    private Useror idUser;

    public int getIdStatisticalReports() {
        return idStatisticalReports;
    }

    public void setIdStatisticalReports(int idStatisticalReports) {
        this.idStatisticalReports = idStatisticalReports;
    }

    public String getTypeStatisticalReports() {
        return typeStatisticalReports;
    }

    public void setTypeStatisticalReports(String typeStatisticalReports) {
        this.typeStatisticalReports = typeStatisticalReports;
    }

    public String getDescriptionStatisticalReports() {
        return descriptionStatisticalReports;
    }

    public void setDescriptionStatisticalReports(String descriptionStatisticalReports) {
        this.descriptionStatisticalReports = descriptionStatisticalReports;
    }

    public LocalDate getGenerationDateStatisticalReports() {
        return generationDateStatisticalReports;
    }

    public void setGenerationDateStatisticalReports(LocalDate generationDateStatisticalReports) {
        this.generationDateStatisticalReports = generationDateStatisticalReports;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
