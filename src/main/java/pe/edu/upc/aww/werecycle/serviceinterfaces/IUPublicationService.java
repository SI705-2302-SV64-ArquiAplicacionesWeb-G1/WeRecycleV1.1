package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Publication;

import java.util.List;

public interface IUPublicationService {
    public void insert(Publication publication);
    public List<Publication> list();
    public void delete(int idPublication);
}
