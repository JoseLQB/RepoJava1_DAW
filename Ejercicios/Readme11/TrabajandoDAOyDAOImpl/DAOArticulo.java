import java.util.List;
public interface DAOArticulo {
    public Articulo get() throws Exception;
    public List<Articulo> findAll() throws Exception;
}
