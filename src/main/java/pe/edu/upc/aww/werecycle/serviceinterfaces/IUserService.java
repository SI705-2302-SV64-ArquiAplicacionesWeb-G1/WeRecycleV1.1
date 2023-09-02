package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User user);
    public List<User>list();
    public void delete(int idUser);
}
