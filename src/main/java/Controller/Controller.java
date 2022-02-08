package Controller;

import Model.Bus;
import Model.Message;
import View.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private View m_view;
    private Bus bus;
    public Integer globalTime;

    public Controller(View view){
        m_view = view;
        m_view.addBtn0Listener(new btn0Listener());
        m_view.addBtn1Listener(new btn1Listener());
        m_view.addBtn2Listener(new btn2Listener());
        m_view.addBtn3Listener(new btn3Listener());
        m_view.addBtn4Listener(new btn4Listener());
        m_view.addBtn5Listener(new btn5Listener());
        m_view.addBtnStepListener(new btnStepListener());


        bus = new Bus();
        globalTime = 0;
    }

    class btnStepListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            m_view.table1.setRowSelectionInterval(globalTime % bus.getListaMesaje().size(), globalTime % bus.getListaMesaje().size());
            String valueOnBus = String.valueOf(m_view.modelTabel.getValueAt(m_view.table1.getSelectedRow(), 1));
            Color myGreen = new Color(65,123,90);
            m_view.rxL0.setForeground(myGreen);
            m_view.rxL1.setForeground(myGreen);
            m_view.rxL2.setForeground(myGreen);
            m_view.rxL3.setForeground(myGreen);
            m_view.rxL4.setForeground(myGreen);
            m_view.rxL5.setForeground(myGreen);
            m_view.rxL0.setText(valueOnBus);
            m_view.rxL1.setText(valueOnBus);
            m_view.rxL2.setText(valueOnBus);
            m_view.rxL3.setText(valueOnBus);
            m_view.rxL4.setText(valueOnBus);
            m_view.rxL5.setText(valueOnBus);
            globalTime++;
        }
    }

    class btn0Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String data = m_view.getTextField0();
            Long id = m_view.getId0();

            if(data.equals("")){
                JOptionPane.showMessageDialog(null,
                        "Data field cannot be empty", "Failure", JOptionPane.ERROR_MESSAGE);
            }
            else{
                bus.sendMessage(new Message(id, data));

                m_view.updateTable(bus.getListaMesaje());

                m_view.txL0.setForeground(Color.RED);
                m_view.txL0.setText(data);
            }

        }
    }

    class btn1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String data = m_view.getTextField1();
            Long id = m_view.getId1();

            if(data.equals("")){
                JOptionPane.showMessageDialog(null,
                        "Data field cannot be empty", "Failure", JOptionPane.ERROR_MESSAGE);
            } else {
                bus.sendMessage(new Message(id, data));

                m_view.updateTable(bus.getListaMesaje());
                m_view.txL1.setForeground(Color.BLUE);
                m_view.txL1.setText(data);
            }

        }
    }

    class btn2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String data = m_view.getTextField2();
            Long id = m_view.getId2();

            if(data.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Data field cannot be empty", "Failure", JOptionPane.ERROR_MESSAGE);
            } else {
                bus.sendMessage(new Message(id, data));

                m_view.updateTable(bus.getListaMesaje());

                m_view.txL2.setForeground(new Color(216,164,127));
                m_view.txL2.setText(data);
            }


        }
    }

    class btn3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String data = m_view.getTextField3();
            Long id = m_view.getId3();

            if(data.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Data field cannot be empty", "Failure", JOptionPane.ERROR_MESSAGE);
            } else {
                bus.sendMessage(new Message(id, data));

                m_view.updateTable(bus.getListaMesaje());
                m_view.txL3.setForeground(new Color(117,119, 97));
                m_view.txL3.setText(data);
            }

        }
    }

    class btn4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String data = m_view.getTextField4();
            Long id = m_view.getId4();

            if(data.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Data field cannot be empty", "Failure", JOptionPane.ERROR_MESSAGE);
            } else {
                bus.sendMessage(new Message(id, data));

                m_view.updateTable(bus.getListaMesaje());
                m_view.txL4.setForeground(Color.magenta);
                m_view.txL4.setText(data);
            }

        }
    }

    class btn5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String data = m_view.getTextField5();
            Long id = m_view.getId5();

            if(data.equals("")) {
                JOptionPane.showMessageDialog(null,
                        "Data field cannot be empty", "Failure", JOptionPane.ERROR_MESSAGE);
            } else {
                bus.sendMessage(new Message(id, data));

                m_view.updateTable(bus.getListaMesaje());
                m_view.txL5.setForeground(Color.BLACK);
                m_view.txL5.setText(data);
            }


        }
    }

}
