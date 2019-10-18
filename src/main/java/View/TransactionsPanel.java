package View;

import Model.Transaction;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Brad
 */
public class TransactionsPanel extends JPanel {
    ArrayList<Transaction> transactions;
    
    public TransactionsPanel(){
        transactions = new ArrayList<Transaction>();
        
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    
}
