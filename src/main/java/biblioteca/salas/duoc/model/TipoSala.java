package biblioteca.salas.duoc.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tipo_sala")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Tipos de salas disponibles")
public class TipoSala {
    @Schema(description = "ID único del Tipo de Usuario")
    @Id
    private Long idTipo;
    @Column(nullable = false)
    private String nombre;

}
