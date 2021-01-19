package calculator;



import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.UIManager.*;


class calculator implements ActionListener,KeyListener

{
    JFrame f=new JFrame();
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,beq,bd,bc,bde;
    JLabel t;
    Image icon ;
    JLabel l1;


  double a=0.0,b=0.0,c=0.0;
    int op,k;
    private JLabel lblNewLabel;

    calculator()
    {
        icon= Toolkit.getDefaultToolkit().getImage("calcul.png");  


        

        f=new JFrame("Calculator");
        t=new JLabel();
        t.setOpaque(true);
        t.setToolTipText("");
        t.setForeground(new Color(0, 153, 255));
        b1=new JButton("1");
        b1.setForeground(new Color(0, 0, 51));
        b2=new JButton("2");
        b2.setForeground(new Color(0, 0, 51));
        b3=new JButton("3");
        b3.setForeground(new Color(0, 0, 51));
        b4=new JButton("4");
        b4.setForeground(new Color(0, 0, 51));
        b5=new JButton("5");
        b5.setForeground(new Color(0, 0, 51));
        b6=new JButton("6");
        b6.setForeground(new Color(0, 0, 51));
        b7=new JButton("7");
        b7.setForeground(new Color(0, 0, 51));
        b8=new JButton("8");
        b8.setForeground(new Color(0, 0, 51));
        b9=new JButton("9");
        b9.setForeground(new Color(0, 0, 51));
        b0=new JButton("0");
        b0.setForeground(new Color(0, 0, 51));
        badd=new JButton("+");
        badd.setForeground(new Color(0, 0, 51));
        bsub=new JButton("-");
        bsub.setForeground(new Color(0, 0, 51));
        bmul=new JButton("X");
        bmul.setForeground(new Color(0, 0, 51));
        bdiv=new JButton("/");
        beq=new JButton("=");
        bd=new JButton("<-");
        bc=new JButton("c");
        bc.setForeground(new Color(102, 0, 0));
        bde=new JButton(".");
        bde.setForeground(new Color(0, 0, 51));

        l1=new JLabel("CHIRANTHAN ACHARYA");
        l1.setForeground(new Color(255, 255, 255));
        l1.setBounds(10,355,107,9);
        l1.setFont(new Font("Arial Black", Font.BOLD, 6));
        l1.setBackground(new Color(60,179,113));

        t.setBounds(30,40,330,50);
        t.setFont(new Font("Agency FB", Font.BOLD, 30));
        t.setBackground(new Color(0, 0, 102));

        
        b1.setBounds(30,100,50,50);
        b2.setBounds(100,100,50,50);
        b3.setBounds(170,100,50,50);

        b4.setBounds(30,160,50,50);
        b5.setBounds(100,160,50,50);
        b6.setBounds(170,160,50,50);

        b7.setBounds(30,220,50,50);
        b8.setBounds(100,220,50,50);
        b9.setBounds(170,220,50,50);

        b0.setBounds(100,282,50,50);
        bd.setBounds(260,267,50,50);
        bc.setBounds(170,280,50,50);

        badd.setBounds(260,100,50,75);
        bsub.setBounds(320,100,50,75);

        bmul.setBounds(260,180,50,75);
        bdiv.setBounds(320,180,50,75);

        beq.setBounds(320,267,50,50);

        bde.setBounds(30,282,50,48);

        b1.setBackground(Color.blue);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.blue);
        b3.setBackground(Color.blue);
        b4.setBackground(Color.blue);
        b5.setBackground(Color.blue);
        b6.setBackground(Color.blue);
        b7.setBackground(Color.blue);
        b8.setBackground(Color.blue);
        b9.setBackground(Color.blue);
        bc.setBackground(Color.red);
        bd.setBackground(Color.red);
        badd.setBackground(Color.blue);
        bsub.setBackground(Color.blue);
        bmul.setBackground(Color.blue);
        bdiv.setBackground(Color.blue);
        bde.setBackground(Color.blue);
        b0.setBackground(Color.blue);
        beq.setBackground(Color.RED);
        f.setBackground(new Color(95,158,160));

        
        b1.setFont(new Font("Vrinda", Font.BOLD, 30));
        b2.setFont(new Font("Vrinda", Font.BOLD, 30));
        b3.setFont(new Font("Vrinda", Font.BOLD, 30));
        b4.setFont(new Font("Vrinda", Font.BOLD, 30));
        b5.setFont(new Font("Vrinda", Font.BOLD, 30));
        b6.setFont(new Font("Vrinda", Font.BOLD, 30));
        b7.setFont(new Font("Vrinda", Font.BOLD, 30));
        b8.setFont(new Font("Vrinda", Font.BOLD, 30));
        b9.setFont(new Font("Vrinda", Font.BOLD, 30));
        b0.setFont(new Font("Vrinda", Font.BOLD, 30));

        badd.setFont(new Font("Vrinda", Font.BOLD, 30));
        bsub.setFont(new Font("Vrinda", Font.BOLD, 30));
        bmul.setFont(new Font("Vrinda", Font.BOLD, 25));
        bdiv.setFont(new Font("Vrinda", Font.BOLD, 25));

        beq.setFont(new Font("Vrinda", Font.BOLD, 20));
        bd.setFont(new Font("Vrinda", Font.BOLD, 10));
        bc.setFont(new Font("Vrinda", Font.BOLD, 30));
        bde.setFont(new Font("Vrinda", Font.BOLD, 50));

        f.getContentPane().add(t);
        f.getContentPane().add(b1);
        f.getContentPane().add(b2);
        f.getContentPane().add(b3);
        f.getContentPane().add(b4);
        f.getContentPane().add(b5);
        f.getContentPane().add(b6);
        f.getContentPane().add(b7);
        f.getContentPane().add(b8);
        f.getContentPane().add(b9);
        f.getContentPane().add(b0);
        f.getContentPane().add(badd);
        f.getContentPane().add(bsub);
        f.getContentPane().add(bmul);
        f.getContentPane().add(bdiv);
        f.getContentPane().add(bc);
        f.getContentPane().add(bd);
        f.getContentPane().add(beq);
        f.getContentPane().add(bde);
        f.getContentPane().add(l1);

        f.getContentPane().setLayout(null);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("F:\\CHIRANTHAN\\photos\\147-HD-Wallpaper-Pack-FRAER.OLYMPUS.RU-66-700x400.jpg"));
        lblNewLabel.setBounds(0, 0, 394, 375);
        f.getContentPane().add(lblNewLabel);
        f.setVisible(true);
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\CHIRANTHAN\\photos\\Calculator-icon.png"));
        f.setBackground(new Color(95,158,160));

        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bc.addActionListener(this);
        bd.addActionListener(this);
        beq.addActionListener(this);
        bde.addActionListener(this);
        
        b1.addKeyListener(this);
        b2.addKeyListener(this);
        b3.addKeyListener(this);
        b4.addKeyListener(this);
        b5.addKeyListener(this);
        b6.addKeyListener(this);
        b7.addKeyListener(this);
        b8.addKeyListener(this);
        b9.addKeyListener(this);
        b0.addKeyListener(this);
        badd.addKeyListener(this);
        bsub.addKeyListener(this);
        bmul.addKeyListener(this);
        bdiv.addKeyListener(this);
        bc.addKeyListener(this);
        bd.addKeyListener(this);
        beq.addKeyListener(this);
        bde.addKeyListener(this);
       
        t.addKeyListener(this);
        
        
    }

    public void actionPerformed(ActionEvent e)

    
    
  
    {
        try{
            if(e.getSource()==b1)
                t.setText(t.getText().concat("1"));

            if(e.getSource()==b2)
                t.setText(t.getText().concat("2"));

            if(e.getSource()==b3)
                t.setText(t.getText().concat("3"));

            if(e.getSource()==b4)
                t.setText(t.getText().concat("4"));

            if(e.getSource()==b5)
                t.setText(t.getText().concat("5"));

            if(e.getSource()==b6)
                t.setText(t.getText().concat("6"));

            if(e.getSource()==b7)
                t.setText(t.getText().concat("7"));

            if(e.getSource()==b8)
                t.setText(t.getText().concat("8"));

            if(e.getSource()==b9)
                t.setText(t.getText().concat("9"));

            if(e.getSource()==b0)
                t.setText(t.getText().concat("0"));

            if(e.getSource()==bde)
                t.setText(t.getText().concat("."));

            if(e.getSource()==badd)
            {
                a=Double.parseDouble(t.getText());
                op=1;
                t.setText("");
            }

            if(e.getSource()==bsub)
            {
                a=Double.parseDouble(t.getText());
                op=2;
                t.setText("");
            }

            if(e.getSource()==bmul)
            {
                a=Double.parseDouble(t.getText());
                op=3;
                t.setText("");
            }

            if(e.getSource()==bdiv)
            {
                a=Double.parseDouble(t.getText());
                op=4;
                t.setText("");
            }

            if(e.getSource()==beq)
            {
                b=Double.parseDouble(t.getText());

                switch(op)
                {
                    case 1:
                    c=a+b;
                    break;

                    case 2:
                    c=a-b;
                    break;

                    case 3:
                    c=a*b;
                    break;

                    case 4:
                    c=a/b;
                    break;

                    default:
                    c=0;
                }
                t.setText(""+c);
            }

            if(e.getSource()==bc)
                t.setText("");

            if(e.getSource()==bd)
            {
                String s=t.getText();
                t.setText("");
                for(int i=0;i<s.length()-1;i++)
                    t.setText(t.getText()+s.charAt(i));
            }   
        }catch(ArithmeticException ju){System.out.println(ju);}
        l1.setText("CHIRANTHAN ACHARYA");
    }  

     
    public void keyPressed(KeyEvent e)
    {
    	try{
    		k=e.getKeyCode();
    	
    	
    	
    	if(k==e.VK_BACK_SPACE)
    	{
    		String s=t.getText();
            t.setText("");
            for(int i=0;i<s.length()-1;i++)
                t.setText(t.getText()+s.charAt(i));
    	}
    	if(k==e.VK_X)
    	{
    		t.setText("");
    	}
    	
    }catch(ArithmeticException ju) {
    	t.setText("SYNTAX ERROR");}
    
    		
    }
    public void keyReleased(KeyEvent e)
    {
    	

    }
    public void keyTyped(KeyEvent e)
    {
    	
    }
    
    
    	
    	
    	
    	public static void main(String args[])
    
    {
    	try {
    	    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
    	        if ("Windows".equals(info.getName())) {
    	            UIManager.setLookAndFeel(info.getClassName());
    	            break;
    	        }
    	    }
    	} catch (Exception e) {
    	    
    	}
        new calculator(); 
        

    }
}
    	

		
