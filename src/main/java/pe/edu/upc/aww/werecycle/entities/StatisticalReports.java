package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;

@Entity
@Table
public class StatisticalReports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStatisticalReports;
    @Column(name = "typeStatisticalReports", nullable = false, length = 30)
    private String typeStatisticalReports;
    @Column(name = "descriptionStatisticalReports", nullable = false, length = 40)
    private String descriptionStatisticalReports;
    @Column(name = "generationDateStatisticalReports", nullable = false)
    private LocalDate generationDateStatisticalReports;
    @OneToOne
    @JoinColumn(name = "idUser")
    private Useror idUser;

    public StatisticalReports() {
    }

    public StatisticalReports(int idStatisticalReports, String typeStatisticalReports, String descriptionStatisticalReports, LocalDate generationDateStatisticalReports, Useror idUser) {
        this.idStatisticalReports = idStatisticalReports;
        this.typeStatisticalReports = typeStatisticalReports;
        this.descriptionStatisticalReports = descriptionStatisticalReports;
        this.generationDateStatisticalReports = generationDateStatisticalReports;
        this.idUser = idUser;
    }

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
