package studentManagement;
import util.NewHibernateUtil;  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Account {
     public void insertAccount(int id,double balance,String bName ){ 
        try { 
            Configuration config = new Configuration().configure();
            SessionFactory factory = config.buildSessionFactory(); 
            Session session = factory.openSession(); 
            Transaction trans=session.beginTransaction();
            
            stud.Account in = new stud.Account();
            in.setAccountId(id);
            in.setBalance(balance);
            in.setBankName(bName);
            session.save(in);
            trans.commit();
        }catch(Exception e){
            e.printStackTrace();
        } finally { 
        }
}
     public static void main(String[] args) {
            Account objAccount = new Account();
            objAccount.insertAccount(852963785,4000.00 ,"Capitec");
         }
}
