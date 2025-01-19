/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.JFrame;
/**
 *
 * @author JVLL
 */
public class Controlador implements ActionListener {
    private final Modelo modelo;
    private final Calculator calculator;
    private String numTemp="";
    private String history="";

    public Controlador(Modelo modelo, Calculator calculator) {
        this.modelo = modelo;
        this.calculator =  calculator;
        
        //Botonoes
        this.calculator.button_0.addActionListener(this);
        this.calculator.button_00.addActionListener(this);
        this.calculator.button_1.addActionListener(this);
        this.calculator.button_2.addActionListener(this);
        this.calculator.button_3.addActionListener(this);
        this.calculator.button_4.addActionListener(this);
        this.calculator.button_5.addActionListener(this);
        this.calculator.button_6.addActionListener(this);
        this.calculator.button_7.addActionListener(this);
        this.calculator.button_8.addActionListener(this);
        this.calculator.button_9.addActionListener(this);
        this.calculator.button_add.addActionListener(this);
        this.calculator.button_Subtraction.addActionListener(this);
        this.calculator.button_Multiplication.addActionListener(this);
        this.calculator.button_Division.addActionListener(this);
        this.calculator.button_dot.addActionListener(this);
        this.calculator.button_equal.addActionListener(this);
        this.calculator.button_Restart.addActionListener(this);
        this.calculator.button_DEL.addActionListener(this);
    }
    
    public void iniciarVista(){
        calculator.setVisible(true);
        calculator.pack();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setLocationRelativeTo(null);
        calculator.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(calculator.button_0 == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat("0");
                repaintNumTemp();
            }
        } else if (calculator.button_00 == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat("00");
                repaintNumTemp();
            }
        } else if (calculator.button_1 == evento.getSource()){
            numTemp=numTemp.concat("1");
            repaintNumTemp();
        } else if (calculator.button_2 == evento.getSource()){
            numTemp=numTemp.concat("2");
            repaintNumTemp();
        } else if (calculator.button_3 == evento.getSource()){
            numTemp=numTemp.concat("3");
            repaintNumTemp();
        } else if (calculator.button_4 == evento.getSource()){
            numTemp=numTemp.concat("4");
            repaintNumTemp();
        } else if (calculator.button_5 == evento.getSource()){
            numTemp=numTemp.concat("5");
            repaintNumTemp();
        } else if (calculator.button_6 == evento.getSource()){
            numTemp=numTemp.concat("6");
            repaintNumTemp();
        } else if (calculator.button_7 == evento.getSource()){
            numTemp=numTemp.concat("7");
            repaintNumTemp();
        } else if (calculator.button_8 == evento.getSource()){
            numTemp=numTemp.concat("8");
            repaintNumTemp();
        } else if (calculator.button_9 == evento.getSource()){
            numTemp=numTemp.concat("9");
            repaintNumTemp();
        } else if (calculator.button_dot == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat(".");
                repaintNumTemp();
            } else {
                numTemp=numTemp.concat("0.");
                repaintNumTemp();
            }
        } else if (calculator.button_DEL == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.substring(0, numTemp.length()-1); 
                repaintNumTemp();
            }
        } else if (calculator.button_Division == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat(",/,");
                history=history.concat(numTemp);
                numTemp="";
                repaintHistory();
            }
        } else if (calculator.button_Multiplication == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat(",x,");
                history=history.concat(numTemp);
                numTemp="";
                repaintHistory();
            }
        } else if (calculator.button_Restart == evento.getSource()){
            numTemp="";
            history="";
            calculator.txtHistory.setText("");
            calculator.txtNumberTemp.setText("");
        } else if (calculator.button_Subtraction == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat(",-,");
                history=history.concat(numTemp);
                numTemp="";
                repaintHistory();
            }
        } else if (calculator.button_add == evento.getSource()){
            if(!"".equals(numTemp)){
                numTemp=numTemp.concat(",+,");
                history=history.concat(numTemp);
                numTemp="";
                repaintHistory();
            }
        } else if (calculator.button_equal == evento.getSource()){
            history=history.concat(numTemp);
            repaintHistory();
            solution();
        }
    }

    private void solution() {
        String[] aux = history.split(",");
        modelo.setA(Double.parseDouble(aux[0]));
        modelo.setOperacion(aux[1]);
        modelo.setB(Double.parseDouble(aux[2]));
        repaintHistory();
        calculator.txtNumberTemp.removeAll();
        modelo.obtenerResultado();
        calculator.txtNumberTemp.setText(String.valueOf(modelo.getResultado()));
    }
    
    private void repaintNumTemp(){
        calculator.txtNumberTemp.removeAll();
        calculator.txtNumberTemp.setText(numTemp.replaceAll(",", ""));
    }
    
    private void repaintHistory(){
        calculator.txtHistory.removeAll();
        calculator.txtHistory.setText(history.replaceAll(",", ""));
    }
    
}
