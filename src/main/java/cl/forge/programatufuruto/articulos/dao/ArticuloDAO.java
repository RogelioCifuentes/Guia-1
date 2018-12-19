package cl.forge.programatufuruto.articulos.dao;

import cl.forge.programatufuruto.articulos.Articulo;
import cl.forge.programatufuruto.articulos.Exception.StockException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArticuloDAO {

    private Conexion conexion = new Conexion();
    private PreparedStatement psInsertar;
    private Statement statement;


    public void ingresarArticulo(Articulo o){
        try{
            conexion.getConexion().createStatement();
            psInsertar = conexion.getConexion().prepareStatement("INSERT INTO articulo(Id,nombre,precio,stock)"+"VALUES(?,?,?,?)");
            psInsertar.setInt(1,o.getId());
            psInsertar.setString(2,o.getNombre());
            psInsertar.setInt(3,o.getPrecio());
            psInsertar.setInt(4,o.getStock());
            psInsertar.executeUpdate();

        }catch(SQLException ex){
            System.out.println("Error al ingresar articulo"+ex);
        }
    }

    public void mostrarArticulos(){
        try{
            statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM articulo");

            while(rs.next()){
                System.out.println(rs.getInt("Id"));
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getInt("precio"));
                System.out.println(rs.getInt("stock"));
                System.out.println("");
            }

        }catch(SQLException ex){
            System.out.println("Error al mostrar articulos "+ex);
        }
    }

    public void venderArticulo(Articulo o, int numeroVendido){

        try{
            statement = conexion.getConexion().createStatement();
            psInsertar = conexion.getConexion().prepareStatement("UPDATE articulo SET stock= ? WHERE Id = ?");
//comentario random
            if(o.getStock()<numeroVendido){
                throw new StockException("No hay stock disponible");
            }else{
                psInsertar.setInt(1,(o.getStock()-numeroVendido));
                psInsertar.setInt(2,o.getId());
                psInsertar.executeUpdate();
            }

        }catch(SQLException ex){
            System.out.println("Error al vender."+ex);
        } catch (StockException e) {
            e.printStackTrace();
        }
    }


}
