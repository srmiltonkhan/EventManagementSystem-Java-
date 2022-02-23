
package eventmanagement;

/**
 *
 * @author MILTON KHAN
 */
public class EventManagement
{

  
    public static void main(String[] args) 
    {
      java.awt.EventQueue.invokeLater(new Runnable() {
          @Override
          public void run() {
              new LoginForm().setVisible(true);
          }
      }); 
    }
    
}
