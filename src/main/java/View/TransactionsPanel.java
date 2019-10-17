package View;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Brad
 */
public class TransactionsPanel extends JPanel {
    ArrayList<String> transactions;
    
    public TransactionsPanel(){
        transactions = new ArrayList<String>();
        
    }
    
    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }
    
}
