package live;

public class Singleton {

	  private Singleton() {}
	  
	  private static Singleton single = null;

	  public static Singleton getInstance() {
	  
	    if(single == null) {
	      System.out.println("�̱��� ����...");
	      single = new Singleton();
	    }

	   return single;
	  }
	  
	}
