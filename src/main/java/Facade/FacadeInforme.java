
package Facade;

import DaoGenerico.ConexionException;
import DaoGenerico.ServiceImpl;
import DaoGenerico.SingletonConnection;
import javax.persistence.EntityManager;
import modelo.Informe;

public class FacadeInforme extends ServiceImpl<Informe> {
    
     public FacadeInforme() throws ConexionException {
        super(Informe.class);
        try{
             EntityManager em = SingletonConnection.getConnection();
            super.setEntityManager(em);
        }catch(Exception e){
           throw new ConexionException("Problemas en la realizacion de conexion con la base de datos");
        }
    }
}
