package mydolphin.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.View.MainMenu;
import mydolphin.View.MemberMenu;
import mydolphin.View.ResultMenu;
import mydolphin.View.FeeMenu;
import mydolphin.Util.UI;
import mydolphin.Controller.MemberHandler;
import mydolphin.Controller.ResultHandler;
import mydolphin.Controller.FeeHandler;
import mydolphin.Model.Disciplin;
import mydolphin.Model.Employee;
import mydolphin.Model.Member;
import mydolphin.Model.Result;
import mydolphin.View.FilterMemberMenu;


/**
 *
 * @author thor
 */
public class MainController {
	private final UI ui;
	private MainMenu mainMenu;
	private MemberMenu memberMenu;
	private ResultMenu resultMenu;
	private FeeMenu feeMenu;
	private FilterMemberMenu filterMemberMenu;
	private MemberHandler memberHandler;
	private DisciplinHandler disciplinHandler;
	private ResultHandler resultHandler;
	private FeeHandler feeHandler;
	private ArrayList<Member> members;
	private ArrayList<Member> filteredmembers;
	private ArrayList<Result> results;
	private ArrayList<Result> filteredresults;
	private ArrayList<Employee> employees;
	private ArrayList<Disciplin> disciplins;
	private HashMap<String,String> params;
	
	public MainController(UI ui) throws SQLException {
		this.ui = ui;
		mainMenu = new MainMenu();
		memberHandler = new MemberHandler();
		disciplinHandler = new DisciplinHandler();
		disciplins = disciplinHandler.getAllDisciplins();
	}
	
	public void runProgram() throws SQLException {
		int inputValue = 0;
		int exitValue = 9;
		while(inputValue!=exitValue) {
			mainMenu.showMainMenu();
			inputValue = ui.getInputInt("Enter value");
			switch(inputValue) {
				case 1:
					//show all members
					members = memberHandler.getAllMembers();break;
				case 2:
					//show members sorted by filter
					params = new HashMap<>();
					filterMemberMenu = new FilterMemberMenu(ui, params);
					filterMemberMenu.getFilterParams();
					filteredmembers = memberHandler.getMembersByFilter(params.get("Field"), params.get("Filter"));
					for (Member filteredmember : filteredmembers) {
						System.out.println(filteredmember);
					}
					break;
					
				case 3:
					//new member
					params = new HashMap<>();
					int memberid = 0;
					memberMenu = new MemberMenu(ui, params);
					memberMenu.getmemberParams();
					System.out.println(params.toString());
					memberid = memberHandler.writeMemberToStorage(params);
					// TODO: consider maintaining a list of members
					break;
					
				default:
					System.out.println("Exiting");
					inputValue=9;
			}
			
		}
		
	}
	
	
}
