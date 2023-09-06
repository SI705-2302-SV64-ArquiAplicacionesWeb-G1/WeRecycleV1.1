package pe.edu.upc.aww.werecycle.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aww.werecycle.entities.StatisticalReports;
import pe.edu.upc.aww.werecycle.repositories.IUAssementRepository;
import pe.edu.upc.aww.werecycle.repositories.IUStatisticalReportsRepository;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUStatisticalReportsService;

import java.util.List;

@Service
public class StatisticalReportsServiceImplement implements IUStatisticalReportsService {
    @Autowired
    private IUStatisticalReportsRepository aR;

    @Override
    public void insert(StatisticalReports statisticalReports) {
        aR.save(statisticalReports);
    }

    @Override
    public List<StatisticalReports> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idStatisticalReports) {
    aR.deleteById(idStatisticalReports);
    }
}
