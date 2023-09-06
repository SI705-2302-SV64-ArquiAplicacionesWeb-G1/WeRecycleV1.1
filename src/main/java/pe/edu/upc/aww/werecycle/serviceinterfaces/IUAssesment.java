package pe.edu.upc.aww.werecycle.serviceinterfaces;

import pe.edu.upc.aww.werecycle.entities.Assessment;

import java.util.List;

public interface IUAssesment {

    public void insert(Assessment assessment);
    public List<Assessment>list();
    public void delete(int idAssement);










}
