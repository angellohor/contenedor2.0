import paqG07.*;
public class Main {
    public static void main(String[] args) {
        puerto p1 = new puerto();
        contenedor c = new contenedor(1, 12, "remite", "recibe", "españa", 2, true);
        c.setDescripción("descripcion");
        c.setEstado("estado");
        p1.a[0].apilacontenedor(c);
        c = new contenedor(2, 12, "remite", "recibe", "españa", 2, true);
        p1.a[0].apilacontenedor(c);
        c = new contenedor(3, 12, "remite", "recibe", "italia", 2, true);
        p1.a[0].apilacontenedor(c);
        System.out.println(p1.a[0].tostring());
        System.out.println(p1.a[0].muestracontainer(1));
        p1.a[0].desapilacontenedor(1);
        System.out.println(p1.a[0].tostring());
        System.out.println(p1.a[0].muestracontainer(1));
        System.out.println( "hay:" +p1.a[0].cuantosa("españa"));
    }
}