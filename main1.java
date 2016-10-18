

 
import javax.swing.SwingUtilities;
public class main1 {
    public static void main(String args[]) throws Exception
    {
    	IntroScreen s=new IntroScreen();
        s.setVisible(true);
        Thread t=Thread.currentThread();
        t.sleep(5000);
        s.dispose();
        SwingUtilities.invokeLater(new Runnable(){
            public void run()
            {
                //opening the main application
                 //new MainApplication().setVisible(true);
                MainApplication gui = new MainApplication();
         		gui.setTitle("MSearch"); 
         		gui.setSize(1350,720);
         		gui.setVisible(true);
            }
        });
    }
 
}