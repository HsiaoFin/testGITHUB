package my.ssh;



/**
 * Firstssh entity. @author MyEclipse Persistence Tools
 */

public class Firstssh  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String password;


    // Constructors

    /** default constructor */
    public Firstssh() {
    }

    
    /** full constructor */
    public Firstssh(String name, String password) {
        this.name = name;
        this.password = password;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
   








}