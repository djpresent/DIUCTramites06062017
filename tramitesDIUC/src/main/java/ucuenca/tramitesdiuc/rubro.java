package ucuenca.tramitesdiuc;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class rubro implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(generator = "RUBRO_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "RUBRO_ID_GENERATOR", sequenceName = "RUBRO_ID_SEQ")
   private java.lang.Long id;

   private java.lang.String codigo;

   private java.lang.String descripcion;

   private java.lang.Float aprobado;

   private java.lang.Float reformulado;

   public rubro()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getCodigo()
   {
      return this.codigo;
   }

   public void setCodigo(java.lang.String codigo)
   {
      this.codigo = codigo;
   }

   public java.lang.String getDescripcion()
   {
      return this.descripcion;
   }

   public void setDescripcion(java.lang.String descripcion)
   {
      this.descripcion = descripcion;
   }

   public java.lang.Float getAprobado()
   {
      return this.aprobado;
   }

   public void setAprobado(java.lang.Float aprobado)
   {
      this.aprobado = aprobado;
   }

   public java.lang.Float getReformulado()
   {
      return this.reformulado;
   }

   public void setReformulado(java.lang.Float reformulado)
   {
      this.reformulado = reformulado;
   }

   public rubro(java.lang.Long id, java.lang.String codigo,
         java.lang.String descripcion, java.lang.Float aprobado,
         java.lang.Float reformulado)
   {
      this.id = id;
      this.codigo = codigo;
      this.descripcion = descripcion;
      this.aprobado = aprobado;
      this.reformulado = reformulado;
   }

}