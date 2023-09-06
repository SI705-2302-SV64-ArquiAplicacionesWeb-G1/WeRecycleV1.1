package pe.edu.upc.aww.werecycle.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.Assessment;
import pe.edu.upc.aww.werecycle.repositories.IUAssementRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUAssesment;

import java.util.List;

@Service
public class AssesmentServiceImplement implements IUAssesment {
    @Autowired
    private IUAssementRepository aS;

    @Override
    public void insert(Assessment assessment) {
        aS.save(assessment);
    }

    @Override
    public List<Assessment> list() {
        return aS.findAll();
    }

    @Override
    public void delete(int idAssement) {
        aS.deleteById(idAssement);

    }
}
