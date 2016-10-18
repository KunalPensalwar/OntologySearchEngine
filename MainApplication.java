



import java.awt.event.*;
import java.awt.*;
import java.awt.Container;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
//import com.hp.hpl.jena.ontology.*;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.*;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.util.FileManager;
//import trial1.GUI;

public class MainApplication extends GUIMod implements ActionListener,ItemListener 
{
	
	int optionsCalculator=0;
	
	
	public void itemStateChanged(ItemEvent e)
	{
		
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		JScrollPane editorScrollPane = new JScrollPane(editorPane);
		editorScrollPane.setVerticalScrollBarPolicy(
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//editorScrollPane.setPreferredSize(new Dimension(250, 145));
		//editorScrollPane.setMinimumSize(new Dimension(10, 10));
		editorScrollPane.setBounds(450,100,300,300);
		String str = e.getActionCommand();
		
		
		
		
			
			
		 
		if(str.equals("remMovie")){
	
			
			  optionsCalculator-=1; 
			
			findMovie=false;
			l3.setVisible(false);
			bu1.setVisible(false);
			bu6.setVisible(true);
			l8.setVisible(true);
			bu11.setVisible(true);
		}
		
		if(str.equals("remActor")){
			
			
			  optionsCalculator-=2;
			
			findActor=false;
			l4.setVisible(false);
			bu2.setVisible(false);
			bu7.setVisible(true);
			l9.setVisible(true);
			bu12.setVisible(true);
		}
		
		if(str.equals("remDirector")){
			
			   optionsCalculator-=3;
			
			findDirector=false;   
			l5.setVisible(false);
			bu3.setVisible(false);
			bu8.setVisible(true);
			l10.setVisible(true);
			bu13.setVisible(true);
		}
		
		if(str.equals("remProducer")){
			
			   optionsCalculator-=4;
			
			findProducer=false;   
			l6.setVisible(false);
			bu4.setVisible(false);
			bu9.setVisible(true);
			l11.setVisible(true);
			bu14.setVisible(true);
		}
		
		if(str.equals("remWriter")){
			
			  optionsCalculator-=5; 
			
			findWriter=false;  
			l7.setVisible(false);
			bu5.setVisible(false);
			bu10.setVisible(true);
			l12.setVisible(true);
			bu15.setVisible(true);
		}
		
		if(str.equals("findMovie")){
			
			  optionsCalculator+=1; 
			  if(optionsCalculator<15)
			{
				findMovie=true;  
				  l3.setVisible(true);
				bu1.setVisible(true);
			bu6.setVisible(false);
			l8.setVisible(false);
			bu11.setVisible(false);
		    }
			  else
			  {
				  optionsCalculator-=1;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }
		}
		
		if(str.equals("findActor")){
			
			  optionsCalculator+=2; 
			  if(optionsCalculator<15){
			findActor=true;	  
			l4.setVisible(true);
			bu2.setVisible(true);
			bu7.setVisible(false);
			l9.setVisible(false);
			bu12.setVisible(false);
			}
			  else
			  {
				  optionsCalculator-=2;
				JOptionPane.showMessageDialog(c,"Check What You Know !");  
			  }
		}
		
		if(str.equals("findDirector")){
			
			  optionsCalculator+=3; 
			  if(optionsCalculator<15){
				  findDirector=true;
			l5.setVisible(true);
			bu3.setVisible(true);
			bu8.setVisible(false);
			l10.setVisible(false);
			bu13.setVisible(false);}
			  else
			  {
				  optionsCalculator-=3;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }	  
		}
		
		if(str.equals("findProducer")){
			
			  optionsCalculator+=4; 
			  if(optionsCalculator<15){
				  findProducer = true;
			l6.setVisible(true);
			bu4.setVisible(true);
			bu9.setVisible(false);
			l11.setVisible(false);
			bu14.setVisible(false);}
			  else
			  {
				  optionsCalculator-=4;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }
		}
		
		if(str.equals("findWriter")){
			
			  optionsCalculator+=5; 
			  if(optionsCalculator<15){
				  findWriter=true;
			l7.setVisible(true);
			bu5.setVisible(true);
			bu10.setVisible(false);
			l12.setVisible(false);
			bu15.setVisible(false);}
			  else
			  {
				  optionsCalculator-=5;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }
		}
		
		if(str.equals("selectMovie")){
			
			  optionsCalculator+=1; 
			  if(optionsCalculator<15)
			{
				  knowMovie=true;
				  l8.setVisible(false);
				bu6.setVisible(false);
			bu11.setVisible(false);
			l13.setVisible(true);
			bu16.setVisible(true);
		   }
			  else
			  {
				  optionsCalculator-=1;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }	  
		}
		
		if(str.equals("selectActor")){
			
			  optionsCalculator+=2; 
			  if(optionsCalculator<15){
				  knowActor=true;
			l9.setVisible(false);
			bu7.setVisible(false);
			bu12.setVisible(false);
			l14.setVisible(true);
			bu17.setVisible(true);}
			  else
			  {
				  optionsCalculator-=2;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }		  
		}
		
		if(str.equals("selectDirector")){
			
			  optionsCalculator+=3; 
			  if(optionsCalculator<15){
				  knowDirector=true;
			l10.setVisible(false);
			bu8.setVisible(false);
			bu13.setVisible(false);
			l15.setVisible(true);
			bu18.setVisible(true);}
			  else
			  {
				  optionsCalculator-=3;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }
		}
		
		if(str.equals("selectProducer")){
			
			  optionsCalculator+=4; 
			  if(optionsCalculator<15){
				  knowProducer=true;
			l11.setVisible(false);
			bu9.setVisible(false);
			bu14.setVisible(false);
			l16.setVisible(true);
			bu19.setVisible(true);}
			  else
			  {
				  optionsCalculator-=4;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }
		}
		
		if(str.equals("selectWriter")){
			
			  optionsCalculator+=5; 
			  if(optionsCalculator<15){
				  knowWriter=true;
			l12.setVisible(false);
			bu10.setVisible(false);
			bu15.setVisible(false);
			l17.setVisible(true);
			bu20.setVisible(true);}
			  else
			  {
				  optionsCalculator-=5;
				  JOptionPane.showMessageDialog(c, "Check What You Know !");
			  }
		}
		
		if(str.equals("deselectMovie")){
			
			  optionsCalculator-=1; 
			knowMovie=false;
			l13.setVisible(false);
			bu16.setVisible(false);
			bu6.setVisible(true);
			l8.setVisible(true);
			bu11.setVisible(true);
		}
		
		if(str.equals("deselectActor")){
			
			  optionsCalculator-=2; 
			knowActor=false;
			l14.setVisible(false);
			bu17.setVisible(false);
			bu7.setVisible(true);
			l9.setVisible(true);
			bu12.setVisible(true);
		}
		
		if(str.equals("deselectDirector")){
			knowDirector=false;
			  optionsCalculator-=3; 
			
			l15.setVisible(false);
			bu18.setVisible(false);
			bu8.setVisible(true);
			l10.setVisible(true);
			bu13.setVisible(true);
		}
		
		if(str.equals("deselectProducer")){
			knowProducer=false;
			  optionsCalculator-=4; 
			
			l16.setVisible(false);
			bu19.setVisible(false);
			bu9.setVisible(true);
			l11.setVisible(true);
			bu14.setVisible(true);
		}
		
		if(str.equals("deselectWriter")){
			
			  optionsCalculator-=5; 
			knowWriter=false;
			l17.setVisible(false);
			bu20.setVisible(false);
			bu10.setVisible(true);
			l12.setVisible(true);
			bu15.setVisible(true);
		}
		
		if(str.equals("Reset"))
		  {
			optionsCalculator=0;
			
			findMovie=false;findActor=false;findDirector=false;findProducer=false;findWriter=false;
			knowMovie=false;knowActor=false;knowDirector=false;knowProducer=false;knowWriter=false;
			
			
			l3.setBounds(420,150,100,50);
			l3.setVisible(false);
			
			l4.setBounds(420,200,100,50);
			l4.setVisible(false);
			
			l5.setBounds(420,250,100,50);
			l5.setVisible(false);
			
			l6.setBounds(420,300,100,50);
			l6.setVisible(false);
			
			l7.setBounds(420,350,100,50);
			l7.setVisible(false);
			
			l8.setBounds(620,150,100,50);
			l8.setVisible(true);
			
			
			l9.setBounds(620,200,100,50);
			l9.setVisible(true);
			
			l10.setBounds(620,250,100,50);
			l10.setVisible(true);
			
			l11.setBounds(620,300,100,50);
			l11.setVisible(true);
			
			l12.setBounds(620,350,100,50);
			l12.setVisible(true);
			
			l13.setBounds(820,150,100,50);
			l13.setVisible(false);
			
			l14.setBounds(820,200,100,50);
			l14.setVisible(false);
			
			l15.setBounds(820,250,100,50);
			l15.setVisible(false);
			
			l16.setBounds(820,300,100,50);
			l16.setVisible(false);
			
			l17.setBounds(820,350,100,50);
			l17.setVisible(false);
			
			
			bu1.setBounds(490,160,50,30);
			bu1.setVisible(false);
			
			bu2.setBounds(490,210,50,30);
			bu2.setVisible(false);
			
			bu3.setBounds(490,260,50,30);
			bu3.setVisible(false);
			
			bu4.setBounds(490,310,50,30);
			bu4.setVisible(false);
			
			bu5.setBounds(490,360,50,30);
			bu5.setVisible(false);
			
			bu6.setBounds(560,160,50,30);
			bu6.setVisible(true);
			
			bu7.setBounds(560,210,50,30);
			bu7.setVisible(true);
			
			bu8.setBounds(560,260,50,30);
			bu8.setVisible(true);
			
			bu9.setBounds(560,310,50,30);
			bu9.setVisible(true);
			
			bu10.setBounds(560,360,50,30);
			bu10.setVisible(true);
			
			bu11.setBounds(690,160,50,30);
			bu11.setVisible(true);
			
			bu12.setBounds(690,210,50,30);
			bu12.setVisible(true);
			
			bu13.setBounds(690,260,50,30);
			bu13.setVisible(true);
			
			bu14.setBounds(690,310,50,30);
			bu14.setVisible(true);
			
			bu15.setBounds(690,360,50,30);
			bu15.setVisible(true);
			
			bu16.setBounds(760,160,50,30);
			bu16.setVisible(false);
			
			bu17.setBounds(760,210,50,30);
			bu17.setVisible(false);
			
			bu18.setBounds(760,260,50,30);
			bu18.setVisible(false);
			
			bu19.setBounds(760,310,50,30);
			bu19.setVisible(false);
			
			bu20.setBounds(760,360,50,30);
			bu20.setVisible(false);
			
			
			resetOptions.setVisible(true);
			
			next.setVisible(true);
			
			previous.setVisible(false);
			
			search.setVisible(false);
		  }
		
		if(str.equals("Next"))
		  {
			resetOptions.setVisible(false);
			resetText.setVisible(true);
			next.setVisible(false);
			previous.setVisible(true);
			search.setVisible(true);
			l2.setBounds(250,100,300,50);
			
			l18.setBounds(670,100,300,50);
			
			l3.setBounds(320,150,100,50);
			
			l4.setBounds(320,200,100,50);
			
			l5.setBounds(320,250,100,50);
			
			l6.setBounds(320,300,100,50);
			
			l7.setBounds(320,350,100,50);
			
			l8.setBounds(520,150,100,50);
			
			l9.setBounds(520,200,100,50);
			
			l10.setBounds(520,250,100,50);
			
			l11.setBounds(520,300,100,50);
			
			l12.setBounds(520,350,100,50);
			
			l13.setBounds(720,150,100,50);
			
			l14.setBounds(720,200,100,50);
			
			l15.setBounds(720,250,100,50);
			
			l16.setBounds(720,300,100,50);
			
			l17.setBounds(720,350,100,50);
			
			bu1.setBounds(390,160,50,30);
			
			bu2.setBounds(390,210,50,30);
			
			bu3.setBounds(390,260,50,30);
			
			bu4.setBounds(390,310,50,30);
			
			bu5.setBounds(390,360,50,30);
			
			bu6.setBounds(460,160,50,30);
			
			bu7.setBounds(460,210,50,30);
			
			bu8.setBounds(460,260,50,30);
			
			bu9.setBounds(460,310,50,30);
			
			bu10.setBounds(460,360,50,30);
			
			bu11.setBounds(590,160,50,30);
			
			bu12.setBounds(590,210,50,30);
			
			bu13.setBounds(590,260,50,30);
			
			bu14.setBounds(590,310,50,30);
			
			bu15.setBounds(590,360,50,30);
			
			bu16.setBounds(660,160,50,30);
			
			bu17.setBounds(660,210,50,30);
			
			bu18.setBounds(660,260,50,30);
			
			bu19.setBounds(660,310,50,30);
			
			bu20.setBounds(660,360,50,30);
			
			if(knowMovie)
			   t1.setVisible(true);
			
			if(knowActor)
			  t2.setVisible(true);
			
			if(knowDirector)
			  t3.setVisible(true);
			
			if(knowProducer)
			  t4.setVisible(true);
			
			if(knowWriter)
			  t5.setVisible(true);
			
		  }
		
		if(str.equals("Reset1"))
		  {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			
		  }
		
		if(str.equals("Previous"))
		  {
			 t1.setVisible(false);
			 t2.setVisible(false); 
			 t3.setVisible(false);
			 t4.setVisible(false);
			 t5.setVisible(false);
			resetOptions.setVisible(true);
			resetText.setVisible(false);
			next.setVisible(false);
			previous.setVisible(false);
			search.setVisible(false);
			l2.setBounds(350,100,300,50);
			
			l18.setBounds(770,100,300,50);
			
			l3.setBounds(420,150,100,50);
			
			l4.setBounds(420,200,100,50);
			
			l5.setBounds(420,250,100,50);
			
			l6.setBounds(420,300,100,50);
			
			l7.setBounds(420,350,100,50);
			
			l8.setBounds(620,150,100,50);
			
			l9.setBounds(620,200,100,50);
			
			l10.setBounds(620,250,100,50);
			
			l11.setBounds(620,300,100,50);
			
			l12.setBounds(620,350,100,50);
			
			l13.setBounds(820,150,100,50);
			
			l14.setBounds(820,200,100,50);
			
			l15.setBounds(820,250,100,50);
			
			l16.setBounds(820,300,100,50);
			
			l17.setBounds(820,350,100,50);
			
			bu1.setBounds(490,160,50,30);
			
			bu2.setBounds(490,210,50,30);
			
			bu3.setBounds(490,260,50,30);
			
			bu4.setBounds(490,310,50,30);
			
			bu5.setBounds(490,360,50,30);
			
			bu6.setBounds(560,160,50,30);
			
			bu7.setBounds(560,210,50,30);
			
			bu8.setBounds(560,260,50,30);
			
			bu9.setBounds(560,310,50,30);
			
			bu10.setBounds(560,360,50,30);
			
			bu11.setBounds(690,160,50,30);
			
			bu12.setBounds(690,210,50,30);
			
			bu13.setBounds(690,260,50,30);
			
			bu14.setBounds(690,310,50,30);
			
			bu15.setBounds(690,360,50,30);
			
			bu16.setBounds(760,160,50,30);
			
			bu17.setBounds(760,210,50,30);
			
			bu18.setBounds(760,260,50,30);
			
			bu19.setBounds(760,310,50,30);
			
			bu20.setBounds(760,360,50,30);
			
		  }
		
		if(str.equals("Search"))
		  {
			 t1.setVisible(false);
			 t2.setVisible(false);
			 t3.setVisible(false);
			 t4.setVisible(false);
			 t5.setVisible(false);
			 mainMenu.setVisible(true);
			l1.setText("Result");
			
			l2.setVisible(false);
			l3.setVisible(false);
			l4.setVisible(false);
			l5.setVisible(false);
			l6.setVisible(false);
			l7.setVisible(false);
			l8.setVisible(false);
			l9.setVisible(false);
			l10.setVisible(false);
			l11.setVisible(false);
			l12.setVisible(false);
			l13.setVisible(false);
			l14.setVisible(false);
			l15.setVisible(false);
			l16.setVisible(false);
			l17.setVisible(false);
			l18.setVisible(false);
			
			bu1.setVisible(false);
			bu2.setVisible(false);
			bu3.setVisible(false);
			bu4.setVisible(false);
			bu5.setVisible(false);
			bu6.setVisible(false);
			bu7.setVisible(false);
			bu8.setVisible(false);
			bu9.setVisible(false);
			bu10.setVisible(false);
			bu11.setVisible(false);
			bu12.setVisible(false);
			bu13.setVisible(false);
			bu14.setVisible(false);
			bu15.setVisible(false);
			bu16.setVisible(false);
			bu17.setVisible(false);
			bu18.setVisible(false);
			bu19.setVisible(false);
			bu20.setVisible(false);
			
			resetText.setVisible(false);
			previous.setVisible(false);
			search.setVisible(false);
			
		
			c.add(editorScrollPane);
			//editorScrollPane.setVisible(false);
			
		  }	
		
		if(str.equals("Main"))
		  {
			c.remove(editorScrollPane);
			l1.setText("MOVIE SEARCH TOOL");
            optionsCalculator=0;
			
			findMovie=false;findActor=false;findDirector=false;findProducer=false;findWriter=false;
			knowMovie=false;knowActor=false;knowDirector=false;knowProducer=false;knowWriter=false;
			l2.setVisible(true);
			l18.setVisible(true);
			
			l3.setBounds(420,150,100,50);
			l3.setVisible(false);
			
			l4.setBounds(420,200,100,50);
			l4.setVisible(false);
			
			l5.setBounds(420,250,100,50);
			l5.setVisible(false);
			
			l6.setBounds(420,300,100,50);
			l6.setVisible(false);
			
			l7.setBounds(420,350,100,50);
			l7.setVisible(false);
			
			l8.setBounds(620,150,100,50);
			l8.setVisible(true);
			
			
			l9.setBounds(620,200,100,50);
			l9.setVisible(true);
			
			l10.setBounds(620,250,100,50);
			l10.setVisible(true);
			
			l11.setBounds(620,300,100,50);
			l11.setVisible(true);
			
			l12.setBounds(620,350,100,50);
			l12.setVisible(true);
			
			l13.setBounds(820,150,100,50);
			l13.setVisible(false);
			
			l14.setBounds(820,200,100,50);
			l14.setVisible(false);
			
			l15.setBounds(820,250,100,50);
			l15.setVisible(false);
			
			l16.setBounds(820,300,100,50);
			l16.setVisible(false);
			
			l17.setBounds(820,350,100,50);
			l17.setVisible(false);
			
			
			bu1.setBounds(490,160,50,30);
			bu1.setVisible(false);
			
			bu2.setBounds(490,210,50,30);
			bu2.setVisible(false);
			
			bu3.setBounds(490,260,50,30);
			bu3.setVisible(false);
			
			bu4.setBounds(490,310,50,30);
			bu4.setVisible(false);
			
			bu5.setBounds(490,360,50,30);
			bu5.setVisible(false);
			
			bu6.setBounds(560,160,50,30);
			bu6.setVisible(true);
			
			bu7.setBounds(560,210,50,30);
			bu7.setVisible(true);
			
			bu8.setBounds(560,260,50,30);
			bu8.setVisible(true);
			
			bu9.setBounds(560,310,50,30);
			bu9.setVisible(true);
			
			bu10.setBounds(560,360,50,30);
			bu10.setVisible(true);
			
			bu11.setBounds(690,160,50,30);
			bu11.setVisible(true);
			
			bu12.setBounds(690,210,50,30);
			bu12.setVisible(true);
			
			bu13.setBounds(690,260,50,30);
			bu13.setVisible(true);
			
			bu14.setBounds(690,310,50,30);
			bu14.setVisible(true);
			
			bu15.setBounds(690,360,50,30);
			bu15.setVisible(true);
			
			bu16.setBounds(760,160,50,30);
			bu16.setVisible(false);
			
			bu17.setBounds(760,210,50,30);
			bu17.setVisible(false);
			
			bu18.setBounds(760,260,50,30);
			bu18.setVisible(false);
			
			bu19.setBounds(760,310,50,30);
			bu19.setVisible(false);
			
			bu20.setBounds(760,360,50,30);
			bu20.setVisible(false);
			
			
			resetOptions.setVisible(true);
			
			next.setVisible(true);
			
			previous.setVisible(false);
			
			search.setVisible(false);
			
			resetText.setVisible(false);
			mainMenu.setVisible(false);
			//editorScrollPane.setVisible(false);
		  }
		/*if(str.equals("SPARQL"))             SPARQL SEARCH CODE
		{
			tu3.setVisible(true);
		    bu5.setVisible(true);
		}
		
		
		if(str.equals("SUBMIT"))
		{
			String t=tu3.getText();
			String R=Search(t);
			
			R=R.replace('-', ' ');
			R=R.replace('=',' ');
			R=R.replace("\n","<br>");
			R=R.replace("| ","</td><td>");
			R=R.replace("|", "</td></tr><tr><td>");
			R=R.replace("|| ","</td><td>");
			R=R.replace("||", "</td></tr><tr><td>");
			R=R.replace('"',' ');
			
			R="<head>RESULTS<br></head><table border=1 color=#ff00ff><tr color=BLACK bgcolor=WHITE><td>"+R+"</td></tr></table>";
			
			
			JFrame frame = new JFrame("RESULTS");
			
			JEditorPane pane = new JEditorPane ("text/html",R);
		
			 JScrollPane scroll = new JScrollPane ( pane );
			 scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
			 frame.add ( scroll );
			 pane.setEditable(false);
			frame.pack ();
			frame.setLocationRelativeTo ( null );
			frame.setVisible ( true );
			

		}*/
		
		
		
		if(str.equals("NEXT"))
		{	
			
			//l6.setText(st2);
			if(b1.isSelected()==false && b2.isSelected()==false  && b3.isSelected()==false && b4.isSelected()==false && b5.isSelected()==false)
			{
			  	
				JOptionPane.showMessageDialog(c, "CHECK WHAT YOU KNOW!");
			}
			
			
			if(b1.isSelected() && b2.isSelected()  && b3.isSelected() && b4.isSelected() && b5.isSelected())
			{
			  	
				JOptionPane.showMessageDialog(c, "CHECK WHAT YOU KNOW!");
			}
			else if(b1.isSelected() && b2.isSelected() && b3.isSelected() && b4.isSelected())          // INPUT IS ONLY WRITER
				{
				l3.setVisible(true);
			     //b6.setVisible(true);
			     //b7.setVisible(true);
			     //b8.setVisible(true);
			     //b9.setVisible(true);
			     b10.setVisible(true);
			     //t1.setVisible(true);
			     //t2.setVisible(true);
			     //t3.setVisible(true);
			     //t4.setVisible(true);
			     t5.setVisible(true);
			     bu2.setVisible(true);
			     
			     b10.setBounds(600,220,100,30);
			     t5.setBounds(720,220,200,30);
				
				
				}
			
			else if(b1.isSelected() && b2.isSelected() && b3.isSelected() && b5.isSelected())	     // INPUT IS ONLY PRODUCER
			{
			l3.setVisible(true);
		     //b6.setVisible(true);
		     //b7.setVisible(true);
		     //b8.setVisible(true);
		     b9.setVisible(true);
		     //b10.setVisible(true);
		     //t1.setVisible(true);
		     //t2.setVisible(true);
		     //t3.setVisible(true);
		     t4.setVisible(true);
		     //t5.setVisible(true);
		     bu2.setVisible(true);
		     
		     b9.setBounds(600,220,100,30);
		     t4.setBounds(720,220,200,30);
			
			}
		
			else if(b2.isSelected() && b3.isSelected() && b4.isSelected() && b5.isSelected())    // INPUT IS ONLY MOVIE
			{
			l3.setVisible(true);
		     b6.setVisible(true);
		     //b7.setVisible(true);
		     //b8.setVisible(true);
		     //b9.setVisible(true);
		     //b10.setVisible(true);
		     t1.setVisible(true);
		     //t2.setVisible(true);
		     //t3.setVisible(true);
		     //t4.setVisible(true);
		     //t5.setVisible(true);
		     bu2.setVisible(true);
			
		     b6.setBounds(600,220,100,30);
		     t1.setBounds(720,220,200,30);
		     
			}
		
			
			else if(b1.isSelected() && b3.isSelected() && b4.isSelected() && b5.isSelected())   // INPUT IS ONLY ACTOR
			{
			l3.setVisible(true);
		     //b6.setVisible(true);
		     b7.setVisible(true);
		     //b8.setVisible(true);
		     //b9.setVisible(true);
		     //b10.setVisible(true);
		     //t1.setVisible(true);
		     t2.setVisible(true);
		     //t3.setVisible(true);
		     //t4.setVisible(true);
		     //t5.setVisible(true);
		     bu2.setVisible(true);
			
		     b7.setBounds(600,220,100,30);
		     t2.setBounds(720,220,200,30);
		     
			}
			
			
			else if(b1.isSelected() && b3.isSelected() && b4.isSelected() && b5.isSelected())   // INPUT IS ONLY DIRECTOR
			{
			l3.setVisible(true);
		     //b6.setVisible(true);
		     //b7.setVisible(true);
		     b8.setVisible(true);
		     //b9.setVisible(true);
		     //b10.setVisible(true);
		     //t1.setVisible(true);
		     //t2.setVisible(true);
		     t3.setVisible(true);
		     //t4.setVisible(true);
		     //t5.setVisible(true);
		     bu2.setVisible(true);
			
		     b8.setBounds(600,220,100,30);
		     t3.setBounds(720,220,200,30);
		     
			}
			
			else if(b1.isSelected() && b2.isSelected() && b3.isSelected())   // INPUT IS WRITER AND PRODUCER
			{
				 l3.setVisible(true);
			     //b6.setVisible(true);
			     //b7.setVisible(true);
			     //b8.setVisible(true);
			     b9.setVisible(true);
			     b10.setVisible(true);
			     //t1.setVisible(true);
			     //t2.setVisible(true);
			     //t3.setVisible(true);
			     t4.setVisible(true);
			     t5.setVisible(true);
			     bu2.setVisible(true);
			     
			     b9.setBounds(600,180,100,30);
			     t4.setBounds(720,180,200,30);
			     b10.setBounds(600,260,100,30);
			     t5.setBounds(720,260,200,30);
			     
			     
			}
			else if(b1.isSelected() && b2.isSelected() && b4.isSelected())		// INPUT IS DIRECTOR AND WRITER
 			{
				 l3.setVisible(true);
			     //b6.setVisible(true);
			     //b7.setVisible(true);
			     b8.setVisible(true);
			     //b9.setVisible(true);
			     b10.setVisible(true);
			     //t1.setVisible(true);
			     //t2.setVisible(true);
			     t3.setVisible(true);
			     //t4.setVisible(true);
			     t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b1.isSelected() && b2.isSelected() && b5.isSelected())
			{
				 l3.setVisible(true);
			     //b6.setVisible(true);
			     //b7.setVisible(true);
			     b8.setVisible(true);
			     b9.setVisible(true);
			     //b10.setVisible(true);
			     //t1.setVisible(true);
			     //t2.setVisible(true);
			     t3.setVisible(true);
			     t4.setVisible(true);
			     //t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b1.isSelected() && b3.isSelected() && b4.isSelected())
			{
				 l3.setVisible(true);
			     //b6.setVisible(true);
			     b7.setVisible(true);
			     //b8.setVisible(true);
			     //b9.setVisible(true);
			     b10.setVisible(true);
			     //t1.setVisible(true);
			     t2.setVisible(true);
			     //t3.setVisible(true);
			     //t4.setVisible(true);
			     t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b1.isSelected() && b3.isSelected() && b5.isSelected())
			{
				 l3.setVisible(true);
			     //b6.setVisible(true);
			     b7.setVisible(true);
			     //b8.setVisible(true);
			     b9.setVisible(true);
			     //b10.setVisible(true);
			     //t1.setVisible(true);
			     t2.setVisible(true);
			     //t3.setVisible(true);
			     t4.setVisible(true);
			     //t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b1.isSelected() && b4.isSelected() && b5.isSelected())
			{
				 l3.setVisible(true);
			     //b6.setVisible(true);
			     b7.setVisible(true);
			     b8.setVisible(true);
			     //b9.setVisible(true);
			     //b10.setVisible(true);
			     //t1.setVisible(true);
			     t2.setVisible(true);
			     t3.setVisible(true);
			     //t4.setVisible(true);
			     //t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b2.isSelected() && b3.isSelected() && b4.isSelected())
			{
				 l3.setVisible(true);
			     b6.setVisible(true);
			     //b7.setVisible(true);
			     //b8.setVisible(true);
			     //b9.setVisible(true);
			     b10.setVisible(true);
			     t1.setVisible(true);
			     //t2.setVisible(true);
			     //t3.setVisible(true);
			     //t4.setVisible(true);
			     t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b2.isSelected() && b3.isSelected() && b5.isSelected())
			{
				 l3.setVisible(true);
			     b6.setVisible(true);
			     //b7.setVisible(true);
			     //b8.setVisible(true);
			     b9.setVisible(true);
			     //b10.setVisible(true);
			     t1.setVisible(true);
			     //t2.setVisible(true);
			     //t3.setVisible(true);
			     t4.setVisible(true);
			     //t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b2.isSelected() && b4.isSelected() && b5.isSelected())
			{
				 l3.setVisible(true);
			     b6.setVisible(true);
			     //b7.setVisible(true);
			     b8.setVisible(true);
			     //b9.setVisible(true);
			     //b10.setVisible(true);
			     t1.setVisible(true);
			     //t2.setVisible(true);
			     t3.setVisible(true);
			     //t4.setVisible(true);
			     //t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			else if(b3.isSelected() && b4.isSelected() && b5.isSelected())
			{
				 l3.setVisible(true);
			     b6.setVisible(true);
			     b7.setVisible(true);
			     //b8.setVisible(true);
			     //b9.setVisible(true);
			     //b10.setVisible(true);
			     t1.setVisible(true);
			     t2.setVisible(true);
			     //t3.setVisible(true);
			     //t4.setVisible(true);
			     //t5.setVisible(true);
			     bu2.setVisible(true);
			}
			
			
			
			else if(b1.isSelected() && b2.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     //b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     //t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			 else if(b1.isSelected() && b3.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     b7.setVisible(true);
				     //b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     t2.setVisible(true);
				     //t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			 else if(b1.isSelected() && b4.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     b7.setVisible(true);
				     b8.setVisible(true);
				     //b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     t2.setVisible(true);
				     t3.setVisible(true);
				     //t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			 else if(b1.isSelected() && b5.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     //b10.setVisible(true);
				     //t1.setVisible(true);
				     t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     //t5.setVisible(true);
				     bu2.setVisible(true);
					}
			 else if(b2.isSelected() && b3.isSelected())
				{
				     l3.setVisible(true);
				     b6.setVisible(true);
				     //b7.setVisible(true);
				     //b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     t1.setVisible(true);
				     //t2.setVisible(true);
				     //t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			 else if(b2.isSelected() && b4.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     b7.setVisible(true);
				     //b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     t2.setVisible(true);
				     //t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			 else if(b2.isSelected() && b5.isSelected())
				{
				     l3.setVisible(true);
				     b6.setVisible(true);
				     //b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     //b10.setVisible(true);
				     t1.setVisible(true);
				     //t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     //t5.setVisible(true);
				     bu2.setVisible(true);
					}
			 
			 else if(b3.isSelected() && b4.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     //b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     //t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			 else if(b3.isSelected() && b5.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     b7.setVisible(true);
				     //b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     t2.setVisible(true);
				     //t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			 else if(b4.isSelected() && b5.isSelected())
				{
				     l3.setVisible(true);
				     //b6.setVisible(true);
				     //b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     //t1.setVisible(true);
				     //t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
			
			
			 
			 else if(b1.isSelected())
				{
			     l3.setVisible(true);
			     //b6.setVisible(true);
			     b7.setVisible(true);
			     b8.setVisible(true);
			     b9.setVisible(true);
			     b10.setVisible(true);
			     //t1.setVisible(true);
			     t2.setVisible(true);
			     t3.setVisible(true);
			     t4.setVisible(true);
			     t5.setVisible(true);
			     bu2.setVisible(true);
				}
				else if(b2.isSelected())
				{
				     l3.setVisible(true);
				     b6.setVisible(true);
				     //b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     t1.setVisible(true);
				     //t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
				else if(b3.isSelected())
				{
				     l3.setVisible(true);
				     b6.setVisible(true);
				     b7.setVisible(true);
				     //b8.setVisible(true);
				     b9.setVisible(true);
				     b10.setVisible(true);
				     t1.setVisible(true);
				     t2.setVisible(true);
				     //t3.setVisible(true);
				     t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
				else if(b4.isSelected())
				{
				     l3.setVisible(true);
				     b6.setVisible(true);
				     b7.setVisible(true);
				     b8.setVisible(true);
				     //b9.setVisible(true);
				     b10.setVisible(true);
				     t1.setVisible(true);
				     t2.setVisible(true);
				     t3.setVisible(true);
				     //t4.setVisible(true);
				     t5.setVisible(true);
				     bu2.setVisible(true);
					}
				else if(b5.isSelected())
				{
				     l3.setVisible(true);
				     b6.setVisible(true);
				     b7.setVisible(true);
				     b8.setVisible(true);
				     b9.setVisible(true);
				     //b10.setVisible(true);
				     t1.setVisible(true);
				     t2.setVisible(true);
				     t3.setVisible(true);
				     t4.setVisible(true);
				     //t5.setVisible(true);
				     bu2.setVisible(true);
					
				
				}
				
				
				
			}
		
		if(str.equals("SEARCH"))
		{	
			//l4.setVisible(true);
			//ta1.setVisible(true);
			
			
			if(b1.isSelected()==true || b2.isSelected()==true || b3.isSelected()==true || b4.isSelected()==true || b5.isSelected()==true)
			{
				String Q1 =	"SELECT DISTINCT ";
				
				if(b1.isSelected()==true){
					Q1 = Q1 + "?filmTitle ";
				}
				
				if(b2.isSelected()==true){
					Q1 = Q1 + "?filmActor ";
				}
				
				if(b3.isSelected()==true){
					Q1 = Q1 + "?filmDirector ";
				}
				
				if(b4.isSelected()==true){
					Q1 = Q1 + "?filmProducer ";
				}
				
				if(b5.isSelected()==true){
					Q1 = Q1 + "?filmWriter ";
				}
				
				
				Q1 = Q1 +   "WHERE";						//UNIVERSAL QUERY 				
				Q1 = Q1 +   " {";
				Q1 = Q1 +   " ?film rdfs:label ?filmTitle ;";
				Q1 = Q1 +	" mdb:actor ?name; ";
				Q1 = Q1 +	" mdb:director ?name1; ";
				Q1 = Q1 +	" mdb:producer ?name2; ";
				Q1 = Q1 +   " mdb:writer ?name3. ";
				Q1 = Q1 +	" ?name mdb:actor_name ?filmActor. "; 
				Q1 = Q1 +	" ?name1 mdb:director_name ?filmDirector. ";
				Q1 = Q1 +	" ?name2 mdb:producer_name ?filmProducer. ";
				Q1 = Q1 +   " ?name3 mdb:writer_name ?filmWriter. ";
				
				
				if(b6.isSelected()==true){
					Q1 = Q1 +	"FILTER regex(?filmTitle,'^"+t1.getText()+"').";
				}
				
				if(b7.isSelected()==true){
					Q1 = Q1 +	"FILTER regex(?filmActor,'^"+t2.getText()+"').";
				}
				
				if(b8.isSelected()==true){
				Q1 = Q1 +	"FILTER regex(?filmDirector,'^"+t3.getText()+"').";
				}
				
				if(b9.isSelected()==true){
				Q1 = Q1 +	"FILTER regex(?filmProducer,'^"+t4.getText()+"').";
				}
				
				if(b10.isSelected()==true){
				Q1 = Q1 +	"FILTER regex(?filmWriter,'^"+t5.getText()+"')";
				}
				
				Q1 = Q1 +	"} ";
				
				//String R1="<HTML><HEAD>RESULTS</HEAD><br>";
				
				String R1=Search(Q1);
		  		
		  		
		  		R1 = R1.toUpperCase();
		  		//R1 = R1.replace(" ", " 				");
		  		//R1 = R1.replace("|", "  ");*/
			    
			    
			    
			    //R2 = R2 + "</TABLE></HTML>";
			    
		  		R1=R1.replace('-', ' ');
				R1=R1.replace('=',' ');
				R1=R1.replace("\n","<br>");
				R1=R1.replace("| ","</td><td>");
				R1=R1.replace("|", "</td></tr><tr><td>");
				R1=R1.replace("|| ","</td><td>");
				R1=R1.replace("||", "</td></tr><tr><td>");
				R1=R1.replace('"',' ');
				R1="<HTML><head>RESULTS<br></head><table border=1 color=#ff00ff><tr color=BLACK bgcolor=WHITE><td>"+R1+"</td></tr></table></HTML>";
				
				
				//R1=R1.replace("| "," ");
				//R1=R1.replace("|", " ");
		  		
		  		
			   /*FileWriter fstream;
				try {
					fstream = new FileWriter("MyHtml.html");
					 BufferedWriter out = new BufferedWriter(fstream);
					 out.write(R1);
					 out.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
			   
				
				
			    //R2 = R2 + R1;
				
			  
				
				JFrame frame = new JFrame("RESULTS");
					
					JEditorPane pane = new JEditorPane ("text/html",R1);
				
					 JScrollPane scroll = new JScrollPane ( pane );
					 scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
					 frame.add ( scroll );
					 pane.setEditable(false);
					
					frame.pack ();
					frame.setLocationRelativeTo ( null );
					frame.setVisible ( true );
				
				
				
		  		
			}
			
			else{
				JOptionPane.showMessageDialog(c, "PLEASE PROVIDE INPUT");
			}
			
			
			
			
		}	
	}
		
	
	public String Search(String strQuery){
		

	       String directory = "./tdb";
		   Dataset dataset = TDBFactory.createDataset(directory);
		   Model tdb = dataset.getDefaultModel();
		   String source =  "D:/SIT/BE Project/Proj/data.nt";
		   FileManager.get().readModel( tdb, source, "N3" );
		 
		   String queryString = 				"PREFIX mdb: <http://data.linkedmdb.org/resource/movie/>";
		   queryString	= queryString + 		"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>";
		   queryString	= queryString + 		"PREFIX dc: <http://purl.org/dc/terms/>";
		   queryString	= queryString + 		"PREFIX owl: <http://www.w3.org/2002/07/owl#> ";
		   queryString	= queryString + 	    "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#> ";
		   queryString	= queryString + 	    "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> ";
		   queryString	= queryString + 	    "PREFIX foaf: <http://xmlns.com/foaf/0.1/> ";
		   queryString	= queryString + 	    "PREFIX db: <http://data.linkedmdb.org/resource/> ";
		   queryString	= queryString + 	    "PREFIX dbpedia: <http://dbpedia.org/property/> ";
		   queryString	= queryString + strQuery;
		   
		   
		     
		   
		   Query query = QueryFactory.create(queryString);

		   QueryExecution qe = QueryExecutionFactory.create(query, tdb);
		   ResultSet results = qe.execSelect();
		   //ResultSetFormatter.outputAsTSV(System.out,results);
		   //String str = ResultSetFormatter.asText(results);
		   String str1 = "new";
		   //QuerySolution qs=results.nextSolution();
		   List l=results.getResultVars();
		   //String href = " <a href="https://www.google.co.in/#q=";
		   //String href2= "&safe=off">";
		   //String val;
		   PrintWriter pw;
		try 
		{
			pw = new PrintWriter(new File("result.html"));
			pw.print("<html><body bgcolor=\"#EAE6F5\">");
			   pw.print("<h2 align=center><font color=\"#FF00FF\">SPARQLRESULT</font></h2>");
			   pw.print("<table border=1 align=\"center\">");
			   pw.print("<tr>");
			   for(int i=0;i<l.size();i++){
				   pw.print("<th bgcolor=\"#FFA500\"><fontsize=6><p><a href=\"https://www.google.co.in/#q="+l.get(i)+"&safe=off\">"+l.get(i)+"</a></p></font></th>");
			   }
			   pw.write("</tr>");
			   pw.print("<tbody bgcolor=\"#C0C0C0\">");

			   while(results.hasNext())
			   	{
			   		QuerySolution qs=results.nextSolution();
			   		pw.print("<tr>");
			   		for(int i=0;i<l.size();i++)
			   		{
			   			String val=qs.get(l.get(i).toString()).toString();
			   			pw.print("<td><p><a href=\"https://www.google.co.in/#q="+val+"&safe=off\"><button>"+val+"</button></a></p></td>");
			   		}
			   		pw.print("</tr>");
			   	}
			   pw.print("</tbody></table>");
			   pw.print("</body></html>");
			   pw.close();
			   
			   Desktop dt=Desktop.getDesktop();
			   try {
				dt.browse(new URI("result.html"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			   
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
		   
		   
		   //ResultSetFormatter.out(System.out, results, query);
		   //qe.close();
       
		   return str1;
	}


	
}











