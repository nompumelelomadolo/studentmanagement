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
 * House generated by hbm2java
 */
@Entity
@Table(name="house"
    ,catalog="studentmanagement"
)
public class House  implements java.io.Serializable {


     private int houseId;
     private String houseAddress;
     private int noOfRooms;
     private Set<Room> rooms = new HashSet<Room>(0);

    public House() {
    }

	
    public House(int houseId, String houseAddress, int noOfRooms) {
        this.houseId = houseId;
        this.houseAddress = houseAddress;
        this.noOfRooms = noOfRooms;
    }
    public House(int houseId, String houseAddress, int noOfRooms, Set<Room> rooms) {
       this.houseId = houseId;
       this.houseAddress = houseAddress;
       this.noOfRooms = noOfRooms;
       this.rooms = rooms;
    }
   
     @Id 

    
    @Column(name="HouseId", unique=true, nullable=false)
    public int getHouseId() {
        return this.houseId;
    }
    
    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    
    @Column(name="HouseAddress", nullable=false, length=50)
    public String getHouseAddress() {
        return this.houseAddress;
    }
    
    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    
    @Column(name="NoOfRooms", nullable=false)
    public int getNoOfRooms() {
        return this.noOfRooms;
    }
    
    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="house")
    public Set<Room> getRooms() {
        return this.rooms;
    }
    
    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }




}


