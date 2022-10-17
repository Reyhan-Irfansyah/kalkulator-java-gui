/*Tugas Kelompok pemrograman berorientasi objek
  Nama : Reyhan Irfansyah (05202140047) & Rubia Karepesina (05202140028)

*/
import sun.font.TrueTypeFont;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel Kalkulator;
    private JTextField TxtHasil;
    private JButton BtnBagi;
    private JButton BtnKali;
    private JButton BtnTambah;
    private JButton BtnAngka7;
    private JButton BtnAngka4;
    private JButton BtnAngka1;
    private JButton BtnAngka8;
    private JButton BtnAngka5;
    private JButton Btnkoma;
    private JButton BtnClear1;
    private JButton BtnAngka9;
    private JButton BtnAngka6;
    private JButton BtnSamaDengan;
    private JButton BtnAngka0;
    private JButton BtnKurang;
    private JButton BtnAngka3;
    private JButton BtnAngka2;

    private void getOperator (String Btntext){
        math_operator = Btntext.charAt(0);
        total1 = total1 + Double.parseDouble(TxtHasil.getText());
        TxtHasil.setText("");
    }

    public Kalkulator() {
        BtnAngka1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = TxtHasil.getText() + BtnAngka1.getText();
                TxtHasil.setText(btnOneText);
            }
        });
        BtnAngka2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = TxtHasil.getText() + BtnAngka2.getText();
                TxtHasil.setText(btnTwoText);

            }
        });
        BtnAngka3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = TxtHasil.getText() + BtnAngka3.getText();
                TxtHasil.setText(btnThreeText);

            }
        });
        BtnAngka4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = TxtHasil.getText() + BtnAngka4.getText();
                TxtHasil.setText(btnFourText);

            }
        });
        BtnAngka5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = TxtHasil.getText() + BtnAngka5.getText();
                TxtHasil.setText(btnFiveText);

            }
        });
        BtnAngka6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = TxtHasil.getText() + BtnAngka6.getText();
                TxtHasil.setText(btnSixText);

            }
        });
        BtnAngka7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = TxtHasil.getText() + BtnAngka7.getText();
                TxtHasil.setText(btnSevenText);

            }
        });
        BtnAngka8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = TxtHasil.getText() + BtnAngka8.getText();
                TxtHasil.setText(btnEightText);

            }
        });
        BtnAngka9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = TxtHasil.getText() + BtnAngka9.getText();
                TxtHasil.setText(btnNineText);

            }
        });
        BtnAngka0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = TxtHasil.getText() + BtnAngka0.getText();
                TxtHasil.setText(btnZeroText);

            }
        });

        Btnkoma.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(TxtHasil.getText().equals("")){
                    TxtHasil.setEnabled(false);
                }
                else if (TxtHasil.getText().contains("")){
                    Btnkoma.setEnabled(false);
                }
                else
                {String BtnkomaText = TxtHasil.getText() + Btnkoma.getText();
                    TxtHasil.setText(BtnkomaText);
                }
                Btnkoma.setEnabled(true);
            }
        });

        BtnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnTambah.getText();
                getOperator(button_text);
            }
        });
        BtnSamaDengan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(TxtHasil.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(TxtHasil.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(TxtHasil.getText());
                        break;
                    case 'x':
                        total2 = total1 * Double.parseDouble(TxtHasil.getText());
                        break;
                }
                TxtHasil.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        BtnClear1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                TxtHasil.setText("");
            }
        });
        BtnKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnKurang.getText();
                getOperator(button_text);
            }
        });
        BtnBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnBagi.getText();
                getOperator(button_text);
            }
        });
        BtnKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = BtnKali.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().Kalkulator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
