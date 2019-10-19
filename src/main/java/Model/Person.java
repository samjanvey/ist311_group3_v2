
package Model;

/**
 *
 * @author sam
 */
public abstract class Person {
    private String fName;
    private String lName;
    
    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    
    public Person() {
        
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
