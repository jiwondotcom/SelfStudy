package bookcase.page;

public class Main {
    public static void main(String[] args) {
    	try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        new StartPage().startStart();
    }
}

