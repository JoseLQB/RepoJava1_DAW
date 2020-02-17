public class Articulo {
   
    private String codigo;
    private String nombre;
    private String codcat;
    
    public Articulo(String reg,String sep) {
       String[] campos = reg.split(sep);
       codigo = campos[0];
       nombre = campos[1];
       codcat = campos[2];
    }
    public Articulo() {
    }

    public Articulo(String codigo, String nombre, String codcat) {
       this.codigo=codigo;
       this.nombre=nombre;
       this.codcat=codcat;
    }

    public void setCodigo(String c) {
       codigo = c;
    }
    public void setNombre(String n) {
       nombre = n;
    }
    public void setCodcat(String cc) {
       codcat = cc;
    }
    public String getCodigo() {
       return codigo;
    }
    public String getCodcat() {
       return codcat;
    }
    public String getNombre() {
       return nombre; 
    }
}
