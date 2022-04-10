package main.java.metier;

import main.java.dao.IDao;

public class IMetierImpl implements IMetier {
    private IDao iDao;

    @Override
    public double calcul() {
        double temp = iDao.getData();
        double res = temp*100/Math.cos(temp*Math.PI);
        return res;
    }

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }
}
