package MoneyCalculator.main;

import MoneyCalculator.model.FileManager;
import MoneyCalculator.view.MainGUI;
import java.io.IOException;

public class MoneyCalculator {
    public static void main(String[] args) throws IOException{
        MainGUI userinterface = new MainGUI(FileManager.load("CurrencyList.txt"));
        userinterface.setVisible(true);
        System.exit(0);
    }
}
