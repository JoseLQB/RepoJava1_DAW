import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.List;
import java.util.ArrayList;

public class DAOArticuloImplDB implements DAOArticulo {
    private int i = 0;
    private int len = 0;
    private Connection conn = null;
    private List<Articulo> lista = new ArrayList<Articulo>();
    private String table;
    private String url; //= "jdbc:sqlite:auladb";
    public DAOArticuloImplDB() {
            //url="jdbc:mysql://localhost/news?" + "user=root&password=root";
            url="jdbc:mysql://localhost/news?" + "serverTimezone=UTC&user=root&password=root";
//"jdbc:mysql://127.0.0.1/db?serverTimezone="+TimeZone.getDefault().getID()
            table="articulo";
            connect(url);
    }
    public DAOArticuloImplDB(String url) {
            this.url = url;
            table="articulo";
            connect(url);
    }
    private void connect(String url){
       try {
         conn = DriverManager.getConnection(url);
         i = 0;
         this.lista = todos();
         this.len = lista.size();
       } catch (SQLException e) {
         System.out.println(e.getMessage());
       }
    }
    private void closeConnect(){
            if(conn == null)
               return;
            try {
               conn.close();
            } catch (SQLException ex) {
            }
    }

    public List<Articulo> findAll() throws Exception {
         this.lista = todos();
         this.len = lista.size();
         this.i = 0;
         return this.lista;
    }
    public Articulo get() throws Exception {
      if(i < len) {
        Articulo art = new Articulo();
        art = lista.get(i);
        i++;
        return art;
      }
      i=0;
      return null;
    }
    public List<Articulo> todos() {
       List<Articulo> result = new ArrayList<Articulo>();
       String sql = "select * from articulo";
       try {
         PreparedStatement statement = conn.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery();
         while (resultSet.next()) {
          Articulo unArt = new Articulo();
          unArt.setCodigo(resultSet.getString("codigo"));
          unArt.setNombre(resultSet.getString("nombre"));
          unArt.setCodcat(resultSet.getString("codcat"));
          result.add(unArt);
         }
       }
       catch (SQLException ex) {
         ex.printStackTrace();
       }
       finally {
         //closeConnect();
       }
       return result;
    }
}
