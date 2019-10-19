
package View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class MainFrame extends JFrame {
    private MainPanel mPanel;
    private GridBagLayout mGrid;
    private GridBagConstraints mainConstraints;

    private LoginPanel lPanel;
    private GridLayout lLayout;
    
    private TransactionsPanel tPanel;
    private GridLayout tLayout;

    public MainFrame(){
        super("IST 311 - Group 3");
        setupLayoutForMacs();
        
        //Formating JPanels
        mPanel = new MainPanel();
        mGrid = new GridBagLayout();
        mainConstraints = new GridBagConstraints();
        mPanel.setLayout(mGrid);
        
        lPanel = new LoginPanel();
        lLayout = new GridLayout();
        lLayout.setColumns(1);
        lLayout.setRows(4);
        lPanel.setLayout(lLayout);
        mainConstraints.fill = GridBagConstraints.BOTH;
        mainConstraints.gridx = 0;
        mainConstraints.gridy = 0;
//        mainConstraints.ipadx = 400;
//        mpgbc.ipady = 750;
        mPanel.add(lPanel, mainConstraints);
        
        
//        tPanel = new TransactionsPanel();
//        tLayout = new GridLayout();
//        tPanel.setLayout(tLayout);

        add(mPanel);
        
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 800);
        setVisible(true);

        
    }

    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }
    
    public TransactionsPanel gettPanel() {
        return tPanel;
    }

    public void settPanel(TransactionsPanel tPanel) {
        this.tPanel = tPanel;
    }

    public GridLayout gettLayout() {
        return tLayout;
    }

    public void settLayout(GridLayout tLayout) {
        this.tLayout = tLayout;
    }
    
    public GridBagLayout getMainGrid() {
        return mGrid;
    }

    public void setMainGrid(GridBagLayout mainGrid) {
        this.mGrid = mainGrid;
    }

    public GridBagConstraints getMainConstraints() {
        return mainConstraints;
    }

    public void setMainConstraints(GridBagConstraints mainConstraints) {
        this.mainConstraints = mainConstraints;
    }
    
    public MainPanel getmPanel() {
        return mPanel;
    }

    public void setmPanel(MainPanel mPanel) {
        this.mPanel = mPanel;
    }

    public GridBagLayout getmGrid() {
        return mGrid;
    }

    public void setmGrid(GridBagLayout mGrid) {
        this.mGrid = mGrid;
    }

    public LoginPanel getlPanel() {
        return lPanel;
    }

    public void setlPanel(LoginPanel lPanel) {
        this.lPanel = lPanel;
    }

    public GridLayout getlLayout() {
        return lLayout;
    }

    public void setlLayout(GridLayout lLayout) {
        this.lLayout = lLayout;
    }
    
}
