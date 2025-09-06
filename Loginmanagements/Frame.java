package Loginmanagements;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import com.toedter.calendar.*;


public class Frame {

    JFrame window = new JFrame("Wsp");

    JButton button = new JButton("Sign in");
    JButton Signup = new JButton("Sign up");

    JPanel panel = new JPanel();
    JPanel textfield = new JPanel();

    JLabel Logintitle = new JLabel();
    JLabel labelPassword = new JLabel();
    JLabel labelUsername = new JLabel(); 
   
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    
    GridBagConstraints gbc = new GridBagConstraints();

    public void framecrap() {

        //textfield
        textfield.setLayout(new BoxLayout(textfield, BoxLayout.Y_AXIS));
        textfield.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));

        username.setPreferredSize(new Dimension(250, 30));
        password.setPreferredSize(new Dimension(250, 30));

        textfield.add(username);
        textfield.add(Box.createRigidArea(new Dimension(0, 10)));
        textfield.add(password);
        textfield.setOpaque(false);

        //login panel
        Logintitle.setText("WELCOME TO THE BANK");
        Logintitle.setFont(new Font("Arial", Font.BOLD, 20));
        labelUsername.setText("USERNAME:");
        labelUsername.setFont(new Font("Arial", Font.BOLD, 17));
        labelPassword.setText("PASSWORD:");
        labelPassword.setFont(new Font("Arial", Font.BOLD, 17));

        panel.setLayout(new GridBagLayout());
        panel.setBounds(0, 0, 800, 500);
        panel.setBackground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0; // Top of the layout // Take full row width
        gbc.insets = new Insets(0, 0,180, 0); // Optional spacing
        panel.add(Logintitle, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(200,180,0,10);
        panel.add(button, gbc);
        gbc.gridx=0;
        gbc.gridy= 0;
        gbc.insets = new Insets(250, 20,50, 190);
        panel.add(Signup,gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(90,0,50,0);
        panel.add(textfield, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0,10,0,400);
        panel.add(labelUsername, gbc);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(80,10,0,400);
        panel.add(labelPassword, gbc);

      

        // Centerin
        //frame
        window.setLayout(null);
        window.setSize(800, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.add(panel);
        window.setResizable(false);
        window.setVisible(true);

    }

    public String getUsername() {
        return username.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public void dispose() {
        window.dispose();
    }

    public void addLoginListener(ActionListener listener) {
        button.addActionListener(listener);
    }
    public void addSignupListener(ActionListener listener) {
         Signup.addActionListener(listener);
    }

}

 class SignupFrameOne implements ActionListener {

    GridBagConstraints gbc = new GridBagConstraints();

    

    JFrame frame = new JFrame();
    JPanel SignUpPanel = new JPanel();
    //Labels for Signup Frame one
    JLabel firstNamelabel = new JLabel("FirstName:"); 
    JLabel lastNamelabel = new JLabel("LastName:"); 
    JLabel usernameLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    JLabel dobLabel = new JLabel("Date of Birth:");
    JLabel genderLabel = new JLabel("Gender:"); 
    JLabel emailAddressLabel = new JLabel("EmailAddress:");
    JLabel AddressLabel = new JLabel("Address:");
    JLabel CityLabel = new JLabel("City:");
    JLabel ZipCodeLabel = new JLabel("ZipCode:");
    JLabel StateLabel = new JLabel("State:");
    
    //Textfield for sign up frame one3 
    JTextField firstNameText = new JTextField();
    JTextField lastNameText = new JTextField();
    JTextField usernameText = new JTextField();
    JTextField passwordText = new JTextField();
    JTextField emailAddressText = new JTextField();
    JTextField AddressText = new JTextField();
    JTextField CityText = new JTextField();
    JTextField ZipCodeText  = new JTextField(); 
    JTextField StateText = new JTextField();
 
     //Button
    JButton next = new JButton("next");
    JRadioButton malebutton = new JRadioButton("Male");
    JRadioButton femalebutton = new JRadioButton("Female");
    ButtonGroup genderbender = new ButtonGroup();
    
    

    JDateChooser datechooser = new JDateChooser();



    SignupFrameOne() {
           //panel 

         
      
        firstNameText.setPreferredSize(new Dimension(400,27));
        lastNameText.setPreferredSize(new Dimension(400,27));
        datechooser.setPreferredSize(new Dimension(400,27));
        emailAddressText.setPreferredSize(new Dimension(400,27));
        AddressText.setPreferredSize(new Dimension(400,27));
        CityText.setPreferredSize(new Dimension(400,27));
        ZipCodeText.setPreferredSize(new Dimension(400,27));
        StateText.setPreferredSize(new Dimension(400,27));

                                  
            
        //button
        femalebutton.setOpaque(false);
        femalebutton.setFont(new Font("Arial", Font.BOLD, 15));
        malebutton.setFont(new Font("Arial", Font.BOLD, 15));
        malebutton.setOpaque(false);
        genderbender.add(malebutton);
        genderbender.add(femalebutton);
        

    
         //label 
         firstNamelabel.setFont(new Font("Arial", Font.BOLD, 20));
         lastNamelabel.setFont(new Font("Arial", Font.BOLD, 20));
         dobLabel.setFont(new Font("Arial", Font.BOLD, 20));
         genderLabel.setFont(new Font("Arial", Font.BOLD, 20));
         emailAddressLabel.setFont(new Font("Arial", Font.BOLD, 20));
         AddressLabel.setFont(new Font("Arial", Font.BOLD, 20));
          StateLabel.setFont(new Font("Arial", Font.BOLD, 20));
          CityLabel.setFont(new Font("Arial", Font.BOLD, 20));


        SignUpPanel.setBackground(Color.WHITE);
        int middlex = (850 - 700)/ 2;
        int middley = (800 - 600)/2;
        SignUpPanel.setBounds(middlex, middley, 700, 600);
        SignUpPanel.setLayout(new GridBagLayout());
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.insets = new Insets(50,50,10,10);
        gbc.fill = GridBagConstraints.NONE;
        SignUpPanel.add(firstNamelabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0; 
        gbc.weighty = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        SignUpPanel.add(firstNameText,gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.weightx = 0;
        gbc.insets = new Insets(20, 50, 10, 10);
        gbc.fill = GridBagConstraints.NONE;
        SignUpPanel.add(lastNamelabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;  
        gbc.gridwidth = 2;
        SignUpPanel.add(lastNameText, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weighty = 0;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        SignUpPanel.add(datechooser, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;
        SignUpPanel.add(dobLabel, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;
        SignUpPanel.add(genderLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.weightx = 0;
         gbc.fill = GridBagConstraints.NONE;
        SignUpPanel.add(femalebutton, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.NONE;
        SignUpPanel.add(malebutton,gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;
        SignUpPanel.add(emailAddressLabel,gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        SignUpPanel.add(emailAddressText,gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
          gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        SignUpPanel.add(AddressLabel,gbc);
        gbc.gridx = 1;
        gbc.gridy= 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty= 0;
        gbc.gridwidth = 2;
        SignUpPanel.add(AddressText, gbc);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;
        SignUpPanel.add(StateLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy= 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty= 0;
        gbc.gridwidth = 2;
        SignUpPanel.add(StateText,gbc);
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = 1;
        gbc.weighty = 0.1;
        SignUpPanel.add(CityLabel, gbc);
         gbc.gridx = 1;
        gbc.gridy= 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty= 0;
        gbc.gridwidth = 2;
        SignUpPanel.add(CityText, gbc);

       

        /*gbc.gridx = 0;
        gbc.gridy = 0;
        SignUpPanel.add(firstNameText, gbc);
        *gbc.gridx = 0;
        gbc.gridy =0;
        SignUpPanel.add(next, gbc);
*/
        

        //frame
        frame.setSize(850, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        next.addActionListener(this);
        frame.add(SignUpPanel);
        frame.setResizable(false);
        
        frame.setVisible(true);
        getLayout();
    }

    public void getLayout() {
         System.out.println(SignUpPanel.getLayout());
    }


   public String getfirstName() {
       return firstNameText.getText();
   }

   public void actionPerformed(ActionEvent e) {
        String url = "jdbc:mysql://localhost:3306/bank_system";
        String user = "root";
        String password = "spiderman4408@";
        String sql = "INSERT INTO Customers (username) VALUES (?)";
      
  

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = con.prepareStatement(sql);
            String username = getfirstName();
            statement.setString(1, username);
            statement.executeUpdate();

            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
