package pe.edu.upc.aww.werecycle.dtos;

import pe.edu.upc.aww.werecycle.entities.TypeRecurso;
import pe.edu.upc.aww.werecycle.entities.Useror;

import javax.persistence.*;

public class PublicationDTO {

    private int idPublication;

    private TypeRecurso id_TypeRecurso;

    private Useror idUser;

    public int getIdPublication() {
        return idPublication;
    }

    public void setIdPublication(int idPublication) {
        this.idPublication = idPublication;
    }

    public TypeRecurso getId_TypeRecurso() {
        return id_TypeRecurso;
    }

    public void setId_TypeRecurso(TypeRecurso id_TypeRecurso) {
        this.id_TypeRecurso = id_TypeRecurso;
    }

    public Useror getIdUser() {
        return idUser;
    }

    public void setIdUser(Useror idUser) {
        this.idUser = idUser;
    }
}
