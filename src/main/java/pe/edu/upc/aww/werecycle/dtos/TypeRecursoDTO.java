package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.Recurso;

public class TypeRecursoDTO {
    private int idTypeRecurso;
    private String type;
    private Recurso id_Recurso;

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
