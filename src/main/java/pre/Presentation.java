package main.java.pre;

import main.java.dao.DaoImpl;
import main.java.ext.DaoImpl2;
import main.java.metier.IMetierImpl;

public class Presentation {
    public static void main(String[] args) {
        //DaoImpl dao = new DaoImpl();
        DaoImpl2 dao2 = new DaoImpl2();
        IMetierImpl metier = new IMetierImpl();
        metier.setiDao(dao2);
        System.out.println("Resultat = "+metier.calcul());
    }
}
