package live;

public class Singleton {

	  private Singleton() {}
	  
	  private static Singleton single = null;

	  public static Singleton getInstance() {
	  
	    if(single == null) {
	      System.out.println("½Ì±ÛÅæ »ý¼º...");
	      single = new Singleton();
	    }

	   return single;
	  }
	  
	}
