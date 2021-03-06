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

/**
 * Address generated by hbm2java
 */
@Entity
@Table(name="address"
    ,catalog="studentmanagement"
)
public class Address  implements java.io.Serializable {


     private int addressId;
     private int addressNo;
     private String streetName;
     private String city;
     private String province;
     private String country;
     private Set<Tenant> tenants = new HashSet<Tenant>(0);
     private Set<Nextofkin> nextofkins = new HashSet<Nextofkin>(0);
     private Set<Employee> employees = new HashSet<Employee>(0);
     private Set<Tenant> tenants_1 = new HashSet<Tenant>(0);

    public Address() {
    }

	
    public Address(int addressId, int addressNo, String streetName, String city, String province, String country) {
        this.addressId = addressId;
        this.addressNo = addressNo;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
    }
    public Address(int addressId, int addressNo, String streetName, String city, String province, String country, Set<Tenant> tenants, Set<Nextofkin> nextofkins, Set<Employee> employees, Set<Tenant> tenants_1) {
       this.addressId = addressId;
       this.addressNo = addressNo;
       this.streetName = streetName;
       this.city = city;
       this.province = province;
       this.country = country;
       this.tenants = tenants;
       this.nextofkins = nextofkins;
       this.employees = employees;
       this.tenants_1 = tenants_1;
    }
   
     @Id 

    
    @Column(name="AddressId", unique=true, nullable=false)
    public int getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    
    @Column(name="AddressNo", nullable=false)
    public int getAddressNo() {
        return this.addressNo;
    }
    
    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }

    
    @Column(name="StreetName", nullable=false, length=25)
    public String getStreetName() {
        return this.streetName;
    }
    
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    
    @Column(name="City", nullable=false, length=25)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="Province", nullable=false, length=25)
    public String getProvince() {
        return this.province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }

    
    @Column(name="Country", nullable=false, length=25)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Tenant> getTenants() {
        return this.tenants;
    }
    
    public void setTenants(Set<Tenant> tenants) {
        this.tenants = tenants;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Nextofkin> getNextofkins() {
        return this.nextofkins;
    }
    
    public void setNextofkins(Set<Nextofkin> nextofkins) {
        this.nextofkins = nextofkins;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="address")
    public Set<Tenant> getTenants_1() {
        return this.tenants_1;
    }
    
    public void setTenants_1(Set<Tenant> tenants_1) {
        this.tenants_1 = tenants_1;
    }




}


