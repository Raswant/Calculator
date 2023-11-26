import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
public class Calculator  implements ActionListener {
   int c,n;
   String s1,s2,s3,s4,s5;
   Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq,bclr;
   JRadioButton r1,r2;
   Panel p;
   Frame f;
   TextField t1;
   GridLayout g;
    
   //Constores
   Calculator()
   {
      f = new Frame("calculator");
      f.setLayout(new FlowLayout());
      p = new Panel();
      r1 = new JRadioButton();
      r2 = new JRadioButton();
    

     ButtonGroup bg = new ButtonGroup();
      r1 = new JRadioButton("on");
      r1.addActionListener(this);


      r2 = new JRadioButton("off");
      r2.addActionListener(this);
     
      
      
      b0 = new Button("0");
      b0.addActionListener(this);
      b0.setBackground(Color.lightGray); 

      b1 = new Button("1");
      b1.addActionListener(this);
      b1.setBackground(Color.lightGray);


      b2 = new Button("2");
      b2.addActionListener(this);
      b2.setBackground(Color.lightGray);
 

      b3 = new Button("3");
      b3.addActionListener(this);
      b3.setBackground(Color.lightGray);

      b4 = new Button("4");
      b4.addActionListener(this);
      b4.setBackground(Color.lightGray);



      b5 = new Button("5");
      b5.addActionListener(this);
      b5.setBackground(Color.lightGray);



      b6 = new Button("6");
      b6.addActionListener(this);
     b6.setBackground(Color.lightGray);



      b7 = new Button("7");
      b7.addActionListener(this);
      b7.setBackground(Color.lightGray);



      b8 = new Button("8");
      b8.addActionListener(this);
      b8.setBackground(Color.lightGray);



      b9 = new Button("9");
      b9 .addActionListener(this);
      b9.setBackground(Color.lightGray);



      badd = new Button("+");
      badd.addActionListener(this);
    badd.setBackground(Color.lightGray);



      bsub = new Button("-");
      bsub .addActionListener(this);
     bsub.setBackground(Color.lightGray);



      bmul = new Button("*");
      bmul .addActionListener(this);
     bmul.setBackground(Color.lightGray);

      
    
      bdiv = new Button("/ ");
      bdiv.addActionListener(this);
      bdiv.setBackground(Color.lightGray);

      beq = new Button("=");
      beq .addActionListener(this);
      beq.setBackground(Color.lightGray);



      bclr = new Button("CLR");
      bclr .addActionListener(this);
     bclr.setBackground(Color.lightGray);

     t1 = new TextField(20);
     f.add(t1); 

     g = new GridLayout(4,4);
     p.setLayout(g);
    
     // adding components
     bg.add(r1);
     bg.add(r2);
     f.add(r1);
     f.add(r2);
      p.add(b0);
      p.add(b1); 
      p.add(b2);
      p.add(b3); 
      p.add(b4); 
     p.add(b5); 
     p.add(b6); 
     p.add(b7); 
     p.add(b8); 
     p.add(b9); 
     p.add(badd); 
     p.add(bsub); 
     p.add(bmul); 
     p.add(bdiv); 
     p.add(beq); 
     p.add(bclr); 
     f.add(p);
     f.setVisible(true);
     f.setSize(300,200); 
     f.setBackground(Color.black );   
     f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
        
       
    });
   

    //end

    
   } 
  
   public void actionPerformed(ActionEvent ae)
   {
        if(ae.getSource()==r2) // off radiobutton
      {                  t1.setEnabled(false);
                         b0.setEnabled(false);
                         b1.setEnabled(false);
                         b2.setEnabled(false);
                         b3.setEnabled(false);
                         b4.setEnabled(false);
                         b5.setEnabled(false);
                         b6.setEnabled(false);
                         b7.setEnabled(false);
                         b8.setEnabled(false);
                         b9.setEnabled(false);
                         badd.setEnabled(false);
                         bsub.setEnabled(false);
                         bmul.setEnabled(false);
                         bdiv.setEnabled(false);
                         beq.setEnabled(false);
                         bclr.setEnabled(false);
    }else
    {
      if(ae.getSource()==r1) // on radiobutton
{                       t1.setEnabled(true);
                        b0.setEnabled(true);
                         b1.setEnabled(true);
                         b2.setEnabled(true);
                         b3.setEnabled(true);
                         b4.setEnabled(true);
                         b5.setEnabled(true);
                         b6.setEnabled(true);
                         b7.setEnabled(true);
                         b8.setEnabled(true);
                         b9.setEnabled(true);
                         badd.setEnabled(true);
                         bsub.setEnabled(true);
                         bmul.setEnabled(true);
                         bdiv.setEnabled(true);
                         beq.setEnabled(true);
                         bclr.setEnabled(true);
                         
}
    }
      // starting off
      
      //end
     
      if(ae.getSource()==b0)
      {
          
          s3=t1.getText();
          s4= "0";
          s5 = s3 + s4;
          t1.setText(s5);
      } 
      if(ae.getSource()==b1)
      {
          s3=t1.getText();
          s4= "1";
          s5 = s3 + s4;
          t1.setText(s5);
      } 
      if(ae.getSource()==b2)
      {
          s3=t1.getText();
          s4= "2";
          s5 = s3 + s4;
          t1.setText(s5);
      } 
      if(ae.getSource()==b3)
      {
          s3=t1.getText();
          s4= "3";
          s5 = s3 + s4;
          t1.setText(s5);
      }   
      if(ae.getSource()==b4)
      {
          s3=t1.getText();
          s4= "4";
          s5 = s3 + s4;
          t1.setText(s5);
      }   
      if(ae.getSource()==b5)
      {
          s3=t1.getText();
          s4= "5";
          s5 = s3 + s4;
          t1.setText(s5);
      }   
      if(ae.getSource()==b6)
      {
          s3=t1.getText();
          s4= "6";
          s5 = s3 + s4;
          t1.setText(s5);
      }   
      if(ae.getSource()==b7)
      {
          s3=t1.getText();
          s4= "7";
          s5 = s3 + s4;
          t1.setText(s5);
      }   
      if(ae.getSource()==b8)
      {
          s3=t1.getText();
          s4= "8";
          s5 = s3 + s4;
          t1.setText(s5);
      }   
      if(ae.getSource()==b9)
      {
          s3=t1.getText();
          s4= "9";
          s5 = s3 + s4;
          t1.setText(s5);
      }
        if(ae.getSource()==badd){
            s1 = t1.getText();
            t1.setText("");
            c =1;  
        } 
        if(ae.getSource()==bsub){
            s1 = t1.getText();
            t1.setText("");
            c =2;  
        }   
        if(ae.getSource()==bmul){
            s1 = t1.getText();
            t1.setText("");
            c =3;  
        }   
        if(ae.getSource()==bdiv){
            s1 = t1.getText();
            t1.setText("");
            c =4;  
        }   
        if(ae.getSource()==beq){
            s2 = t1.getText();
            if(c==1){
                n =Integer.parseInt(s1) + Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } 
            if(c==2){
                n =Integer.parseInt(s1) - Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } 
            if(c==3){
                n =Integer.parseInt(s1) * Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } 
            if(c==4){
                n =Integer.parseInt(s1) / Integer.parseInt(s2);
                t1.setText(String.valueOf(n));
            } 
        }  
        if(ae.getSource()==bclr){
            t1.setText("");
        }
        
       
}

    public static void main(String[] args)
     {
        Calculator obj = new Calculator();
    }
}
