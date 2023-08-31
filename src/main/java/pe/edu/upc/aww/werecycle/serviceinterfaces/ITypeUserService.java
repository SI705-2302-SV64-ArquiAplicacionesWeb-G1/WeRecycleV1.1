package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.TypeUser;

import java.util.List;

public interface ITypeUserService {
    public void insert(TypeUser typeUser);

    public List<TypeUser>list();
    public void delete(int idTypeUser);
}
