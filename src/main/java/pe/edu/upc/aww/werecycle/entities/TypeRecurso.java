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

}
