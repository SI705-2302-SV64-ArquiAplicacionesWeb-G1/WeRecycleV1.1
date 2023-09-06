package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;
import pe.edu.upc.aww.werecycle.repositories.IURecyclableMaterialRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IURecyclableMaterialService;

import java.util.List;

@Service
public class RecyclableMaterialServiceImplement implements IURecyclableMaterialService {
@Autowired
    private IURecyclableMaterialRepository rM;

    @Override
    public void insert(RecyclableMaterial recyclableMaterial) {
        rM.save(recyclableMaterial);
    }

    @Override
    public List<RecyclableMaterial> list() {
        return rM.findAll();
    }

    @Override
    public void delete(int idRecyclableMaterial) {
rM.deleteById(idRecyclableMaterial);
    }
}
