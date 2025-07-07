package pe.edu.vallegrande.customer.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.vallegrande.customer.dto.customerDto;

@RestController
@RequestMapping("/api/datos")
public class customerRest {

    @GetMapping
   public customerDto getAll(){
    customerDto dto = new customerDto();
    dto.setNombre("Ronaldinho Yefferson");
    dto.setTelefono("991875497");
    dto.setCorreo("ronal15ccencho@gmail.com");
    dto.setStatus("Active");
    return dto;
   }
}
