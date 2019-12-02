package mydolphin;
import java.sql.SQLException;
import mydolphin.Controller.MainController;
import mydolphin.Util.UI;

public class MyDolphin {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws SQLException {
		UI ui = new UI();
		MainController mc = new MainController(ui);
		mc.runProgram();
	}
	
}
