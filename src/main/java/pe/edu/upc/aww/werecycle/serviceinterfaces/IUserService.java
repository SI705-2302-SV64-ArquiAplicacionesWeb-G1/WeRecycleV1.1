package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Useror;

import java.util.List;

public interface IUserService {
    public void insert(Useror user);
    public List<Useror>list();
    public void delete(int idUser);
}
