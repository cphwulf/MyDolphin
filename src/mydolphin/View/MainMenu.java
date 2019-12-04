package mydolphin.View;

import java.util.ArrayList;
import mydolphin.Util.UI;

public class MainMenu {

    public void showMainMenu() {
        String menu = "";
        menu += "1. Vis alle medlemmer\n";
        menu += "2. Vis filtrerede medlemmer\n";
        menu += "3. Registrer nyt medlem\n";
        menu += "4. Vis alle discipliner\n";
        menu += "5. Indtast et resultat\n";
        menu += "6. Vis ranglister for alle discipliner\n";
        menu += "7. Vis alle resultater\n";
        menu += "8. Vis medlemmer med restance\n";
        menu += "9. Afslut\n";
	    System.out.println(menu);
    }
}
