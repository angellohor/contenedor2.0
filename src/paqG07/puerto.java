package paqG07;
import paqG07.*;
public class puerto {
    public almacen []a = new almacen[3];

    public puerto() {
        a[0] = new almacen();
        a[1] = new almacen();
        a[2] = new almacen();
    }

    public boolean espacio(int num){
        if (a[num].p1[9][11].getNumero_identificación()==0 && a[num].p1[0][11].getNumero_identificación()==0 && a[num].p1[2][11].getNumero_identificación()==0 ){
            return false;
        }else return true;
    }
    public  void apila(contenedor c){
        if (espacio(0)){
            a[0].apilacontenedor(c);
        }else  if (espacio(1)){
            a[1].apilacontenedor(c);
        }else if (espacio(2)){
            a[2].apilacontenedor(c);
        }
    }

    public String desapila(int cont, int colum){
        String desapilado;
        desapilado = a[cont].muestracontainerbycolumn(colum);
        a[cont].desapilacontenedor(colum);
        return desapilado;
    }
  
}
