public class helloWorld implements Greeter{
  private String name;
  
  public void setName(String name) {
	  this.name = name;
  }
  public String getGreeting() {
	  return "Hello world from " + name + "!";
  }
}
