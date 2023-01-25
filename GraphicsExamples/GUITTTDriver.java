import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUITTTDriver extends JFrame{

    /* buttons */
    private JButton but11;
    private JButton but12;
    private JButton but13;
    private JButton but21;
    private JButton but22;
    private JButton but23;
    private JButton but31;
    private JButton but32;
    private JButton but33;
    
    private JLabel messageLabel;    
    private PlayListener myListener;    
    
    public class PlayListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command;
            
            //rewrite
            command = event.getActionCommand();
            messageLabel.setText(command);
        }
    }
    
    public GUITTTDriver() {
        setGraphics();
    }

    public void setGraphics() {
        JPanel gamePanel, messagePanel;
        Container myPane;
        
        myPane = getContentPane();
        myPane.setLayout(new GridLayout(2,1));
        gamePanel = new JPanel();
        gamePanel.setLayout(new GridLayout(3,3));
        messagePanel = new JPanel();
        messagePanel.setLayout(new GridLayout(1,1));
        myPane.add(gamePanel);
        myPane.add(messagePanel);
        but11 = new JButton("1 1");
        but12 = new JButton("1 2");
        but13 = new JButton("1 3");
        but21 = new JButton("2 1");
        but22 = new JButton("2 2");
        but23 = new JButton("2 3");
        but31 = new JButton("3 1");
        but32 = new JButton("3 2");
        but33 = new JButton("3 3");
        messageLabel = new JLabel("X turn: ");
        myListener = new PlayListener();
        but11.addActionListener(myListener);
/*        twoBut.addActionListener(myListener);
        thrBut.addActionListener(myListener);
        fouBut.addActionListener(myListener);
        fivBut.addActionListener(myListener);
        sixBut.addActionListener(myListener);
        sevBut.addActionListener(myListener);
        eigBut.addActionListener(myListener);
        ninBut.addActionListener(myListener); */
        but11.setEnabled(true);
/*        twoBut.setEnabled(true);
        thrBut.setEnabled(true);
        fouBut.setEnabled(true);
        fivBut.setEnabled(true);
        sixBut.setEnabled(true);
        sevBut.setEnabled(true);
        eigBut.setEnabled(true);
        ninBut.setEnabled(true);
        zerBut.setEnabled(true);
        pntBut.setEnabled(true);
        addBut.setEnabled(true);
        subBut.setEnabled(true);
        mulBut.setEnabled(true);
        divBut.setEnabled(true);
        eqlBut.setEnabled(true); */
        gamePanel.add(but11);
/*        numbersPanel.add(twoBut);
        numbersPanel.add(thrBut);
        numbersPanel.add(fouBut);
        numbersPanel.add(fivBut);
        numbersPanel.add(sixBut);
        numbersPanel.add(sevBut);
        numbersPanel.add(eigBut);
        numbersPanel.add(ninBut);
        numbersPanel.add(pntBut);
        numbersPanel.add(zerBut);
        operationsPanel.add(addBut);
        operationsPanel.add(subBut);
        operationsPanel.add(mulBut);
        operationsPanel.add(divBut);
        operationsPanel.add(eqlBut); */
        messagePanel.add(messageLabel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
}