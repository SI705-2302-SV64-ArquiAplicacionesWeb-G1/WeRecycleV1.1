package pe.edu.upc.aww.werecycle.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"idUser","typeAccount"})})
public class Roles implements Serializable {
    private static final long serialVersionUID= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
    @Column(name = "typeAccount", length = 10, nullable = false)
    private String typeAccount;
    @Column(name = "stateType", nullable = false)
    private boolean stateType;
    @ManyToOne
    @JoinColumn(name = "idUser", nullable = false)
    private Useror user;

    public Roles() {
    }

    public Roles(int idRol, String typeAccount, boolean stateType, Useror user) {
        this.idRol = idRol;
        this.typeAccount = typeAccount;
        this.stateType = stateType;
        this.user = user;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public boolean isStateType() {
        return stateType;
    }

    public void setStateType(boolean stateType) {
        this.stateType = stateType;
    }

    public Useror getUser() {
        return user;
    }

    public void setUser(Useror user) {
        this.user = user;
    }
}