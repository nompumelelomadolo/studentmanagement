package stud;
// Generated Mar 14, 2016 12:50:58 PM by Hibernate Tools 3.6.0
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="account"
    ,catalog="studentmanagement"
)
public class Account  implements java.io.Serializable {
     private int accountId;
     private double balance;
     private String bankName;
     private Set<Payment> payments = new HashSet<Payment>(0);
    public Account() {
    }	
    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    public Account(int accountId, double balance, String bankName, Set<Payment> payments) {
       this.accountId = accountId;
       this.balance = balance;
       this.bankName = bankName;
       this.payments = payments;
    }
   
     @Id 

    
    @Column(name="AccountId", unique=true, nullable=false)
    public int getAccountId() {
        return this.accountId;
    }
    
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    
    @Column(name="Balance", nullable=false, precision=12)
    public double getBalance() {
        return this.balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    @Column(name="bankName", length=20)
    public String getBankName() {
        return this.bankName;
    }
    
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }




}


