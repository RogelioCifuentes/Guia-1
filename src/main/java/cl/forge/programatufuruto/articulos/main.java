package cl.forge.programatufuruto.articulos;

import cl.forge.programatufuruto.articulos.dao.ArticuloDAO;
import cl.forge.programatufuruto.articulos.dao.Conexion;

public class main {
    public static void main(String[] args) {

        ArticuloDAO articulo = new ArticuloDAO();
        Conexion conexion = new Conexion();


        Articulo articulo1 = new Articulo(1, "Zapallo italiano", 1000, 10);
        //articulo.mostrarArticulos();
        articulo.venderArticulo(articulo1,9);


        /*  INGRESO ARTICULOS
        Articulo articulo1 = new Articulo(1, "Zapallo italiano", 1000, 10);
        Articulo articulo2 = new Articulo(2, "Cebolla", 500, 7);
        Articulo articulo3 = new Articulo(3, "Lechuga", 300, 12);
        Articulo articulo4 = new Articulo(4, "Cebolla morada", 450, 13);
        Articulo articulo5 = new Articulo(5, "Tomate", 800, 27);
        Articulo articulo6 = new Articulo(6, "Platano", 1200, 20);
        Articulo articulo7 = new Articulo(7, "Naranja", 1030, 13);
        Articulo articulo8 = new Articulo(8, "Sandia", 1500, 8);
        Articulo articulo9 = new Articulo(9, "Kimchi", 8990, 5);
        Articulo articulo10 = new Articulo(10, "Repollo", 1000, 15);

        ArticuloDAO articulo = new ArticuloDAO();

        articulo.ingresarArticulo(articulo1);
        articulo.ingresarArticulo(articulo2);
        articulo.ingresarArticulo(articulo3);
        articulo.ingresarArticulo(articulo4);
        articulo.ingresarArticulo(articulo5);
        articulo.ingresarArticulo(articulo6);
        articulo.ingresarArticulo(articulo7);
        articulo.ingresarArticulo(articulo8);
        articulo.ingresarArticulo(articulo9);
        articulo.ingresarArticulo(articulo10);
*/

    }
}

