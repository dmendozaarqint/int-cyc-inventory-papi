package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Fabrica;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Inventario
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-05-22T13:50:47.215042163Z[GMT]")


public class Inventario   {
  @JsonProperty("organizacion")
  private String organizacion = null;

  @JsonProperty("id_articulo")
  private String idArticulo = null;

  @JsonProperty("nombre_articulo")
  private String nombreArticulo = null;

  @JsonProperty("fecha")
  private LocalDate fecha = null;

  @JsonProperty("fabrica")
  private Fabrica fabrica = null;

  public Inventario organizacion(String organizacion) {
    this.organizacion = organizacion;
    return this;
  }

  /**
   * Get organizacion
   * @return organizacion
   **/
  @Schema(example = "CyC", required = true, description = "")
      @NotNull

    public String getOrganizacion() {
    return organizacion;
  }

  public void setOrganizacion(String organizacion) {
    this.organizacion = organizacion;
  }

  public Inventario idArticulo(String idArticulo) {
    this.idArticulo = idArticulo;
    return this;
  }

  /**
   * Get idArticulo
   * @return idArticulo
   **/
  @Schema(example = "3201ABC", required = true, description = "")
      @NotNull

    public String getIdArticulo() {
    return idArticulo;
  }

  public void setIdArticulo(String idArticulo) {
    this.idArticulo = idArticulo;
  }

  public Inventario nombreArticulo(String nombreArticulo) {
    this.nombreArticulo = nombreArticulo;
    return this;
  }

  /**
   * Get nombreArticulo
   * @return nombreArticulo
   **/
  @Schema(example = "Widget Adapter", required = true, description = "")
      @NotNull

    public String getNombreArticulo() {
    return nombreArticulo;
  }

  public void setNombreArticulo(String nombreArticulo) {
    this.nombreArticulo = nombreArticulo;
  }

  public Inventario fecha(LocalDate fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
   **/
  @Schema(example = "Mon Aug 29 00:00:00 GMT 2016", required = true, description = "")
      @NotNull

    @Valid
    public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public Inventario fabrica(Fabrica fabrica) {
    this.fabrica = fabrica;
    return this;
  }

  /**
   * Get fabrica
   * @return fabrica
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Fabrica getFabrica() {
    return fabrica;
  }

  public void setFabrica(Fabrica fabrica) {
    this.fabrica = fabrica;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inventario inventario = (Inventario) o;
    return Objects.equals(this.organizacion, inventario.organizacion) &&
        Objects.equals(this.idArticulo, inventario.idArticulo) &&
        Objects.equals(this.nombreArticulo, inventario.nombreArticulo) &&
        Objects.equals(this.fecha, inventario.fecha) &&
        Objects.equals(this.fabrica, inventario.fabrica);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizacion, idArticulo, nombreArticulo, fecha, fabrica);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inventario {\n");
    
    sb.append("    organizacion: ").append(toIndentedString(organizacion)).append("\n");
    sb.append("    idArticulo: ").append(toIndentedString(idArticulo)).append("\n");
    sb.append("    nombreArticulo: ").append(toIndentedString(nombreArticulo)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    fabrica: ").append(toIndentedString(fabrica)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
