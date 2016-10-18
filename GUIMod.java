

import java.awt.event.*;
import java.awt.*;
import java.awt.Container;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import com.hp.hpl.jena.ontology.*;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.util.FileManager;

public abstract class GUIMod extends JFrame implements ActionListener,ItemListener{

	
	//private static final String B1 = null;
		JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
		JCheckBox b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
		JButton bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,bu10,bu11,bu12,bu13,bu14,bu15,bu16,bu17,bu18,bu19,bu20,resetOptions,next,previous,search,resetText,mainMenu;
		JTextField t1,t2,t3,t4,t5;
		JTextArea ta1,tu3;
		Boolean findMovie=false,findActor=false,findDirector=false,findProducer=false,findWriter=false,knowMovie=false,knowActor=false,knowDirector=false,knowProducer=false,knowWriter=false;
		JEditorPane editorPane;
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		
		Container c = this.getContentPane();
	
	    
		
		GUIMod()
		  {
			
			c.setLayout(null);
			l1 = new JLabel("MOVIE SEARCH TOOL");
			l1.setBounds(590,30,150,50);
			c.add(l1);
			l2 = new JLabel("WHAT DO YOU WANT TO FIND ? ");
			l2.setBounds(350,100,300,50);
			c.add(l2);
			l18=new JLabel("WHAT DO YOU KNOW ?");
			l18.setBounds(770,100,300,50);
			c.add(l18);
			l3=new JLabel("MOVIE ");
			l3.setBounds(420,150,100,50);
			l3.setVisible(false);
			c.add(l3);
			l4=new JLabel("ACTOR");
			l4.setBounds(420,200,100,50);
			l4.setVisible(false);
			c.add(l4);
			l5=new JLabel("DIRECTOR");
			l5.setBounds(420,250,100,50);
			l5.setVisible(false);
			c.add(l5);
			l6=new JLabel("PRODUCER");
			l6.setBounds(420,300,100,50);
			l6.setVisible(false);
			c.add(l6);
			l7=new JLabel("WRITER");
			l7.setBounds(420,350,100,50);
			l7.setVisible(false);
			c.add(l7);
			l8=new JLabel("MOVIE ");
			l8.setBounds(620,150,100,50);
			c.add(l8);
			l9=new JLabel("ACTOR");
			l9.setBounds(620,200,100,50);
			c.add(l9);
			l10=new JLabel("DIRECTOR");
			l10.setBounds(620,250,100,50);
			c.add(l10);
			l11=new JLabel("PRODUCER");
			l11.setBounds(620,300,100,50);
			c.add(l11);
			l12=new JLabel("WRITER");
			l12.setBounds(620,350,100,50);
			c.add(l12);
			l13=new JLabel("MOVIE ");
			l13.setBounds(820,150,100,50);
			l13.setVisible(false);
			c.add(l13);
			l14=new JLabel("ACTOR");
			l14.setBounds(820,200,100,50);
			l14.setVisible(false);
			c.add(l14);
			l15=new JLabel("DIRECTOR");
			l15.setBounds(820,250,100,50);
			l15.setVisible(false);
			c.add(l15);
			l16=new JLabel("PRODUCER");
			l16.setBounds(820,300,100,50);
			l16.setVisible(false);
			c.add(l16);
			l17=new JLabel("WRITER");
			l17.setBounds(820,350,100,50);
			l17.setVisible(false);
			c.add(l17);
			bu1=new JButton(">>");
			bu1.setBounds(490,160,50,30);
			bu1.setActionCommand("remMovie");
			bu1.addActionListener(this);
			bu1.setVisible(false);
			c.add(bu1);
			bu2=new JButton(">>");
			bu2.setBounds(490,210,50,30);
			bu2.setActionCommand("remActor");
			bu2.addActionListener(this);
			bu2.setVisible(false);
			c.add(bu2);
			bu3=new JButton(">>");
			bu3.setBounds(490,260,50,30);
			bu3.setActionCommand("remDirector");
			bu3.addActionListener(this);
			bu3.setVisible(false);
			c.add(bu3);
			bu4=new JButton(">>");
			bu4.setBounds(490,310,50,30);
			bu4.setActionCommand("remProducer");
			bu4.addActionListener(this);
			bu4.setVisible(false);
			c.add(bu4);
			bu5=new JButton(">>");
			bu5.setBounds(490,360,50,30);
			bu5.setActionCommand("remWriter");
			bu5.addActionListener(this);
			bu5.setVisible(false);
			c.add(bu5);
			bu6=new JButton("<<");
			bu6.setBounds(560,160,50,30);
			bu6.setActionCommand("findMovie");
			bu6.addActionListener(this);
			c.add(bu6);
			bu7=new JButton("<<");
			bu7.setBounds(560,210,50,30);
			bu7.setActionCommand("findActor");
			bu7.addActionListener(this);
			c.add(bu7);
			bu8=new JButton("<<");
			bu8.setBounds(560,260,50,30);
			bu8.setActionCommand("findDirector");
			bu8.addActionListener(this);
			c.add(bu8);
			bu9=new JButton("<<");
			bu9.setBounds(560,310,50,30);
			bu9.setActionCommand("findProducer");
			bu9.addActionListener(this);
			c.add(bu9);
			bu10=new JButton("<<");
			bu10.setBounds(560,360,50,30);
			bu10.setActionCommand("findWriter");
			bu10.addActionListener(this);
			c.add(bu10);
			bu11=new JButton(">>");
			bu11.setBounds(690,160,50,30);
			bu11.setActionCommand("selectMovie");
			bu11.addActionListener(this);
			c.add(bu11);
			bu12=new JButton(">>");
			bu12.setBounds(690,210,50,30);
			bu12.setActionCommand("selectActor");
			bu12.addActionListener(this);
			c.add(bu12);
			bu13=new JButton(">>");
			bu13.setBounds(690,260,50,30);
			bu13.setActionCommand("selectDirector");
			bu13.addActionListener(this);
			c.add(bu13);
			bu14=new JButton(">>");
			bu14.setBounds(690,310,50,30);
			bu14.setActionCommand("selectProducer");
			bu14.addActionListener(this);
			c.add(bu14);
			bu15=new JButton(">>");
			bu15.setBounds(690,360,50,30);
			bu15.setActionCommand("selectWriter");
			bu15.addActionListener(this);
			c.add(bu15);
			bu16=new JButton("<<");
			bu16.setBounds(760,160,50,30);
			bu16.setActionCommand("deselectMovie");
			bu16.addActionListener(this);
			bu16.setVisible(false);
			c.add(bu16);
			bu17=new JButton("<<");
			bu17.setBounds(760,210,50,30);
			bu17.setActionCommand("deselectActor");
			bu17.addActionListener(this);
			bu17.setVisible(false);
			bu18=new JButton("<<");
			bu18.setBounds(760,260,50,30);
			bu18.addActionListener(this);
			bu18.setVisible(false);
			c.add(bu18);
			bu19=new JButton("<<");
			bu19.setBounds(760,310,50,30);
			bu19.setActionCommand("deselectProducer");
			bu19.addActionListener(this);
			bu19.setVisible(false);
			c.add(bu19);
			bu20=new JButton("<<");
			bu20.setBounds(760,360,50,30);
			bu20.setActionCommand("deselectWriter");
			bu20.addActionListener(this);
			bu20.setVisible(false);
			c.add(bu20);
			
			mainMenu = new JButton("Main Menu");
			mainMenu.setBounds(600,650,100,50);
			mainMenu.setActionCommand("Main");
			mainMenu.addActionListener(this);
			mainMenu.setVisible(false);
			c.add(mainMenu);
			
			resetOptions = new JButton("Reset");
			resetOptions.setBounds(350,450,80,30);
			resetOptions.setActionCommand("Reset");
			resetOptions.addActionListener(this);
			resetOptions.setVisible(true);
			c.add(resetOptions);
			
			next = new JButton("Next");
			next.setBounds(500,450,80,30);
			next.setActionCommand("Next");
			next.addActionListener(this);
			next.setVisible(true);
			c.add(next);
			
			previous = new JButton("Previous");
			previous.setBounds(650,450,100,30);
			previous.setActionCommand("Previous");
			previous.addActionListener(this);
			previous.setVisible(false);
			c.add(previous);
			
			search = new JButton("Search");
			search.setBounds(800,450,80,30);
			search.setActionCommand("Search");
			search.addActionListener(this);
			search.setVisible(false);
			c.add(search);
			
			resetText = new JButton("Reset");
			resetText.setBounds(350,450,80,30);
			resetText.setActionCommand("Reset1");
			resetText.addActionListener(this);
			resetText.setVisible(false);
			c.add(resetText);
			
			t1 = new JTextField();
	        t1.setBounds(850,160,200,30);
	        t1.setVisible(false);
	        c.add(t1);
	        
	        t2 = new JTextField();
	        t2.setBounds(850,210,200,30);
	        t2.setVisible(false);
			c.add(t2);
			
	        t3 = new JTextField();
	        t3.setBounds(850,260,200,30);
	        t3.setVisible(false);
	        c.add(t3);
	        
	        t4 = new JTextField();
	        t4.setBounds(850,310,200,30);
	        t4.setVisible(false);
			
	        t5 = new JTextField();
	        t5.setBounds(850,360,200,30);
	        t5.setVisible(false);
	        c.add(t5);
	        
	    	
	        /*b1= new JCheckBox("MOVIE");
			b1.setBounds(50,140,100,30);
			b1.setActionCommand("B1");
			b1.addActionListener(this);
			b1.addItemListener(this);
			c.add(b1);
			b2= new JCheckBox("ACTOR");
			b2.setBounds(50,180,100,30);
			b2.setActionCommand("B2");
			b2.addActionListener(this);
			b1.addItemListener(this);
			c.add(b2);
			b3= new JCheckBox("DIRECTOR");
			b3.setBounds(50,220,100,30);
			b3.setActionCommand("B3");
			b3.addActionListener(this);
			c.add(b3);
			b4= new JCheckBox("PRODUCER");
			b4.setBounds(50,260,100,30);
			b4.setActionCommand("B4");
			b4.addActionListener(this);
			c.add(b4);
			b5= new JCheckBox("WRITER");
			b5.setBounds(50,300,100,30);
			b5.setActionCommand("B5");
			b5.addActionListener(this);
			c.add(b5);
			
			l6 = new JLabel("");
			l6.setBounds(60,500,500,30);
			c.add(l6);
			
			bu1 = new JButton("NEXT");
			bu1.setBounds(250,220,200,30);
			c.add(bu1);
			bu1.addActionListener(this);
			
		
		    l3 = new JLabel("WHAT DO YOU KNOW ? ");
		    l3.setBounds(550,100,200,30);
		    l3.setVisible(false);
		    c.add(l3);
		    
		    b6= new JCheckBox("MOVIE");
			b6.setBounds(600,140,100,30);
			b6.setVisible(false);
			b6.setActionCommand("B6");
			b6.addActionListener(this);
			c.add(b6);
			b7= new JCheckBox("ACTOR");
			b7.setBounds(600,180,100,30);
			b7.setVisible(false);
			b7.setActionCommand("B7");
			b7.addActionListener(this);
			c.add(b7);
			b8= new JCheckBox("DIRECTOR");
			b8.setBounds(600,220,100,30);
			b8.setVisible(false);
			b8.setActionCommand("B8");
			b8.addActionListener(this);
			c.add(b8);
			b9= new JCheckBox("PRODUCER");
			b9.setBounds(600,260,100,30);
			b9.setVisible(false);
			b9.setActionCommand("B9");
			b9.addActionListener(this);
			c.add(b9);
			b10= new JCheckBox("WRITER");
			b10.setBounds(600,300,100,30);
			b10.setVisible(false);
			b10.setActionCommand("B10");
			b10.addActionListener(this);
			c.add(b10);
		    
	        t1 = new JTextField();
	        t1.setBounds(720,140,200,30);
	        t1.setVisible(false);
	        c.add(t1);
	        
	        t2 = new JTextField();
	        t2.setBounds(720,180,200,30);
	        t2.setVisible(false);
	        t2.setActionCommand("T2");
	        t2.addActionListener(this);
	        
	        //t2.addKeyListener((KeyListener) new MyKeyListener());
	        c.add(t2);
	       
	        t3 = new JTextField();
	        t3.setBounds(720,220,200,30);
	        t3.setVisible(false);
	        c.add(t3);
	        
	        t4 = new JTextField();
	        t4.setBounds(720,260,200,30);
	        t4.setVisible(false);
	        c.add(t4);
	        
	        t5 = new JTextField();
	        t5.setBounds(720,300,200,30);
	        t5.setVisible(false);
	        c.add(t5);
	        
	        bu2 = new JButton("SEARCH");
	        bu2.setBounds(1000,220,100,30);
	        bu2.setVisible(false);
	        bu2.addActionListener(this);
	        c.add(bu2);
	       
	        
	        bu3 = new JButton("RESET");
	        bu3.setBounds(1100,220,100,30);
	        bu3.setVisible(true);
	        bu3.addActionListener(this);
	        c.add(bu3);
	 
	        bu4=new JButton("SPARQL");
	        bu4.setBounds(100,350,90,30);
	        bu4.setVisible(true);
	        bu4.addActionListener(this);
	        c.add(bu4);
	        
	        bu5=new JButton("SUBMIT");
	        bu5.setBounds(200,350,90,30);
	        bu5.setVisible(false);
	        bu5.addActionListener(this);
	        c.add(bu5);
	        
	        tu3=new JTextArea();
	        tu3.setBounds(200,400,550,300);
	        tu3.setVisible(false);
	        c.add(tu3);*/
	        
	        
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	     }
		
		/*public static void main(String args[]) throws Exception{
			
			GUIMod gui = new GUIMod();
      		gui.setTitle("MSearch"); 
      		gui.setSize(1350,720);
      		gui.setVisible(true);
		}*/
		
		
	
	
	
}
