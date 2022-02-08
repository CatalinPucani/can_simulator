package View;



import Model.Bus;
import Model.Message;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class View {
    private JTextField textField0;
    private JButton sendButton0;
    private JPanel mainPanel;
    private JPanel node0;
    private JLabel ID0;
    private JLabel Data0;
    private JLabel rx0;
    private JLabel tx0;
    public JLabel rxL0;
    public JLabel txL0;
    private JPanel node1;
    private JPanel node2;
    private JPanel node3;
    private JPanel node4;
    private JPanel node5;
    private JLabel ID1;
    private JLabel Data1;
    private JTextField textField1;
    private JLabel rx1;
    public JLabel rxL1;
    private JLabel tx1;
    public JLabel txL1;
    private JButton sendButton1;
    private JLabel ID2;
    private JLabel Data2;
    private JTextField textField2;
    private JLabel rx2;
    public JLabel rxL2;
    private JLabel tx2;
    public JLabel txL2;
    private JButton sendButton2;
    private JLabel ID3;
    private JLabel Data3;
    private JTextField textField3;
    private JLabel rx3;
    public JLabel rxL3;
    private JLabel tx3;
    public JLabel txL3;
    private JButton sendButton3;
    private JLabel ID4;
    private JLabel Data4;
    private JTextField textField4;
    private JLabel rx4;
    public JLabel rxL4;
    private JLabel tx4;
    public JLabel txL4;
    private JButton sendButton4;
    private JLabel ID5;
    private JLabel Data5;
    private JTextField textField5;
    private JLabel rx5;
    public JLabel rxL5;
    private JLabel tx;
    public JLabel txL5;
    private JButton sendButton5;
    private JPanel Bus;
    public JTable table1;
    private JScrollPane scrollPane;
    private JButton stepButton;
    public DefaultTableModel modelTabel = new DefaultTableModel();


    public View() {
        JFrame frame = new JFrame("Can simulator");
        frame.setContentPane(this.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        Vector<String> header = new Vector<>();
        header.add("Sender ID");
        header.add("Message");
        modelTabel.setColumnIdentifiers(header.toArray());
        table1.setModel(modelTabel);
        table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table1.setFillsViewportHeight(true);

        rxL0.setText("");
        rxL1.setText("");
        rxL2.setText("");
        rxL3.setText("");
        rxL4.setText("");
        rxL5.setText("");

        txL0.setText("");
        txL1.setText("");
        txL2.setText("");
        txL3.setText("");
        txL4.setText("");
        txL5.setText("");


    }

    public void addBtn0Listener(ActionListener mal) {
        sendButton0.addActionListener(mal);
    }

    public String getTextField0() {
        return textField0.getText().toString();
    }

    public Long getId0() {
        return Long.parseLong(ID0.getText().substring(4));
    }

    public void addBtn1Listener(ActionListener mal) {
        sendButton1.addActionListener(mal);
    }

    public String getTextField1() {
        return textField1.getText().toString();
    }

    public Long getId1() {
        return Long.parseLong(ID1.getText().substring(4));
    }

    public void addBtn2Listener(ActionListener mal) {
        sendButton2.addActionListener(mal);
    }

    public String getTextField2() {
        return textField2.getText().toString();
    }

    public Long getId2() {
        return Long.parseLong(ID2.getText().substring(4));
    }

    public void addBtn3Listener(ActionListener mal) {
        sendButton3.addActionListener(mal);
    }

    public String getTextField3() {
        return textField3.getText().toString();
    }

    public Long getId3() {
        return Long.parseLong(ID3.getText().substring(4));
    }

    public void addBtn4Listener(ActionListener mal) {
        sendButton4.addActionListener(mal);
    }

    public String getTextField4() {
        return textField4.getText().toString();
    }

    public Long getId4() {
        return Long.parseLong(ID4.getText().substring(4));
    }

    public void addBtn5Listener(ActionListener mal) {
        sendButton5.addActionListener(mal);
    }

    public String getTextField5() {
        return textField5.getText().toString();
    }

    public Long getId5() {
        return Long.parseLong(ID5.getText().substring(4));
    }

    public void addBtnStepListener(ActionListener mal) { stepButton.addActionListener(mal);}

    public void updateTable(List<Message> lista){
        List<Vector<String>> dateTabel = new ArrayList<>();
        modelTabel.setRowCount(0);
        int i;
        for(i=0; i<lista.size(); i++){
            dateTabel.add(new Vector<>());
            dateTabel.get(i).add(String.valueOf(lista.get(i).getSenderId()));
            dateTabel.get(i).add(lista.get(i).getMessage());
            modelTabel.addRow(dateTabel.get(i));
        }
        table1.setModel(modelTabel);
    }


}

