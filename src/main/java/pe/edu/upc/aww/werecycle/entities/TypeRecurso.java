package pe.edu.upc.aww.werecycle.entities;
import pe.edu.upc.aww.werecycle.entities.Recurso;
import javax.persistence.*;

@Entity
@Table(name = "TypeRecurso")
public class TypeRecurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeRecurso;
    @Column(name = "TypeRecursotype")
    private String type;
    @OneToOne
    @JoinColumn(name = "id_Recurso")
    private Recurso id_Recurso;

    public TypeRecurso() {
    }

    public TypeRecurso(int idTypeRecurso, String type, Recurso id_Recurso) {
        this.idTypeRecurso = idTypeRecurso;
        this.type = type;
        this.id_Recurso = id_Recurso;
    }

    public int getIdTypeRecurso() {
        return idTypeRecurso;
    }

    public void setIdTypeRecurso(int idTypeRecurso) {
        this.idTypeRecurso = idTypeRecurso;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Recurso getId_Recurso() {
        return id_Recurso;
    }

    public void setId_Recurso(Recurso id_Recurso) {
        this.id_Recurso = id_Recurso;
    }
}
