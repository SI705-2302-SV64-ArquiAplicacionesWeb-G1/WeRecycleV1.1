package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.PublicationDTO;
import pe.edu.upc.aww.werecycle.entities.Publication;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUPublicationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PublicationController")
public class PublicationController {
    @Autowired
    private IUPublicationService pU;

    @PostMapping
    public void registrar(@RequestBody PublicationDTO dto) {
        ModelMapper m = new ModelMapper();
        Publication pu = m.map(dto, Publication.class);
        pU.insert(pu);

    }

    @GetMapping
    public List<PublicationDTO> listar() {
        return pU.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PublicationDTO.class);
        }).collect(Collectors.toList());
    }
}
