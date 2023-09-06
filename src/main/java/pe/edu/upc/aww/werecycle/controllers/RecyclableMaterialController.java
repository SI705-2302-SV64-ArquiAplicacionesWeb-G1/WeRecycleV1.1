package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.aww.werecycle.dtos.RecyclableMaterialDTO;
import pe.edu.upc.aww.werecycle.entities.RecyclableMaterial;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IURecyclableMaterialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/RecyclableMaterialController")
public class RecyclableMaterialController {
    @Autowired
    private IURecyclableMaterialService rM;

    public void registrar(@RequestBody RecyclableMaterialDTO dto) {
        ModelMapper m = new ModelMapper();
        RecyclableMaterial rm = m.map(dto, RecyclableMaterial.class);
        rM.insert(rm);
    }

    @GetMapping
    public List<RecyclableMaterialDTO> listar() {
        return rM.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RecyclableMaterialDTO.class);
        }).collect(Collectors.toList());
    }
}
