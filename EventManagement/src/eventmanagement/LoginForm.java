
package eventmanagement;

//import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class LoginForm extends javax.swing.JFrame 
{

   
    public LoginForm() 
    {
        //setIconImage(new ImageIcon(getClass().getResource("flower2.jpg")).getImage());
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage("flower2.JPG"));
        this.setTitle("Login Form");
        initComponents();
    }
   
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblEventManagement = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        lblFrame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(10, 10));
        setResizable(false);

        jPanel1.setLayout(null);

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(180, 340, 130, 30);

        lblEventManagement.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblEventManagement.setText("Event Management");
        jPanel1.add(lblEventManagement);
        lblEventManagement.setBounds(120, 30, 380, 44);

        lblName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblName.setText("Name");
        jPanel1.add(lblName);
        lblName.setBounds(40, 130, 150, 29);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblPassword.setText("Password");
        jPanel1.add(lblPassword);
        lblPassword.setBounds(40, 200, 150, 29);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txtName);
        txtName.setBounds(200, 130, 290, 30);

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPanel1.add(txtPassword);
        txtPassword.setBounds(200, 200, 290, 30);

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(340, 340, 150, 30);

        lblFrame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFrame.setForeground(new java.awt.Color(0, 51, 255));
        lblFrame.setIcon(new javax.swing.ImageIcon("C:\\Users\\MILTON KHAN\\Desktop\\Login.JPG")); // NOI18N
        jPanel1.add(lblFrame);
        lblFrame.setBounds(0, 0, 570, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void Refresh()
    {
        txtName.setText(null);
        txtPassword.setText(null);
    }
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
    String name = txtName.getText();
    String password = txtPassword.getText();
    if(name.equals("kyau") && password.equals("1234"))
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new MainInterfaceEventManagement().setVisible(true);
             }
         });
        Refresh(); 
        this.dispose();
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Name and Password is Incorrect");
        Refresh();
    }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(() -> 
        {
            new LoginForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEventManagement;
    private javax.swing.JLabel lblFrame;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
