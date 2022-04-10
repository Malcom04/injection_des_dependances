package main.java.ext;

import main.java.dao.IDao;

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Impl 2 version capteur");
        return 6000;
    }
}
