package demo_package;

public class encapsulation01 {
	public int a=10;
	private int b=20;


  private String name="Anil"; // private = restricted access
 
  // Getter
  public String getName() {
    return name;
  }
  public int getb() {
	  return b;
  }
 
  // Setter
  public void setName(String newName) {
    this.name = newName;
  }
  public void setb(int b) {
	 this.b=b;
  }
}


