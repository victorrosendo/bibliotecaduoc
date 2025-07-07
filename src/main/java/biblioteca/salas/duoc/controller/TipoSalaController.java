package biblioteca.salas.duoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.salas.duoc.model.TipoSala;
import biblioteca.salas.duoc.service.TipoSalaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("api/tipo-salas")
public class TipoSalaController {
    @Autowired
    private TipoSalaService tipoSalaService;

    @GetMapping
    public List<TipoSala> getAllTipoSala(){
        return tipoSalaService.findAll();
    }

    @Operation(summary = "Obtener un Tipo de Sala por ID")
    @ApiResponses(value = {
    @ApiResponse(responseCode = "200", description = "Tipo de Sala encontrada",
        content = @Content(schema = @Schema(implementation = TipoSala.class)))
})
    @GetMapping("/{id}")
    public TipoSala getTipoSalaById(@PathVariable Long id){
        return tipoSalaService.findById(id);
    }

    @PostMapping
    public TipoSala createTipoSala(@RequestBody TipoSala tipoSala){
        return tipoSalaService.save(tipoSala);
    }

    @DeleteMapping("/{id}")
    public void deleteTipoSala(@PathVariable Long id){
        tipoSalaService.deleteById(id);
    }

}
