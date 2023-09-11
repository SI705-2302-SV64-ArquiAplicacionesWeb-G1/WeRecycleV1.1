package pe.edu.upc.aww.werecycle.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aww.werecycle.dtos.UserDTO;
import pe.edu.upc.aww.werecycle.entities.Useror;
import pe.edu.upc.aww.werecycle.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;
    @PostMapping
    public void registrar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Useror u =m.map(dto, Useror.class);
        uS.insert(u);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UserDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UserDTO.class);
        }).collect(Collectors.toList());
    }
}
