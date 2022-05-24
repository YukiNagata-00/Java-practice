 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
   
 
  public class Final3 extends JPanel {
  	   	 JLabel l1 = new JLabel("健康チェックをしましょう");  	
  	   	 JLabel l2 = new JLabel("身長 (cm)"); 
  	   	 JTextField f1 = new JTextField();
  	   	 JLabel l3 = new JLabel("体重 (kg)");   	   	 
  	   	 JTextField f2 = new JTextField();
  	   	 JButton b1 = new JButton("計算する");
  	   	 JLabel l4 = new JLabel(" ");
  	   	  	   	
  	   	public Final3() {
  	 
       setLayout(null);
  	   	   add(l1); l1.setBounds(100, 30, 200, 30);
  	   	   add(l2);l2.setBounds(50,50,80,30);
  	   	   add(f1);f1.setBounds(110,50,60,30);
  	   	   add(l3);l3.setBounds(50,80,80,30);
  	   	   add(f2); f2.setBounds(110,80,60,30);
  	   	   add(b1);b1.setBounds(50,150,80,30);
  	   	   add(l4); l4.setBounds(50, 200, 250,30);
  	   	   
  	   	   b1.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent evt) {
               try{ 
                double h = Double.parseDouble(f1.getText());
                double w = Double.parseDouble(f2.getText());
                
                double bmi = w / ((h*0.01)*(h*0.01));
                
                if( bmi < 18.5) {
                	l4.setText("あなたのBMIは "+ Math.round(bmi) +" で、低体重です");
                }else if(18.5 <=  bmi && bmi< 25.0) {
                	l4.setText("あなたのBMIは "+ Math.round(bmi) +" で、普通体重です");
                }else {
                	l4.setText("あなたのBMIは "+ Math.round(bmi) +" で、肥満です");
                }
               }catch(Exception ex){
               	l4.setText("正しく入力してください");
               }
  	   	   	   	  	
  	   	  	 }
  	  });  	   	  	
  	} 	  	
  	   	  	
  	    
  	   	  	
  	   	  	
  	   	  	 	  
  	   	  
  	   	  
  	
  	
  	
  	
  	
  	 public static void main(String[] args) {
      JFrame app = new JFrame();
      app.setTitle("BMI Check");
      app.setLocationRelativeTo(null);      
      app.add(new Final3());
      app.setSize(400, 300);
      app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      app.setVisible(true);
    }
  	
  	
  	
  }