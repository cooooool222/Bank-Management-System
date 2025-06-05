package Loginmanagements;



public class Main {

       
    public static void main(String[] args) {

        /*Frame frame = new Frame();
        frame.framecrap();
         
        Loginmanager login = new Loginmanager(frame);
        frame.addLoginListener(login);
*/  

      SignupFrameOne window = new SignupFrameOne();
      System.out.println(System.getProperty("java.class.path"));
    }
      

   /*   private static String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hashedstring = new StringBuilder();
            for (byte bite : hash) {
                hashedstring.append(String.format("%02x", bite));
            }

            return hashedstring.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Hash not able to work");
        }

    }

    public static class Loginmanager implements ActionListener {

        Frame frame;

        Loginmanager(Frame frame) {
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = frame.getUsername();
            String userpassword = hashPassword(frame.getPassword());
            if (authentification(username, userpassword)) {
                frame.dispose();
                SignupFrameOne window = new SignupFrameOne();
            } else {
                JOptionPane.showMessageDialog(null, "Wrong info");
            }
        }

        public boolean authentification(String username, String userpassword) {
            String url = "jdbc:mysql://localhost:3306/bank_system";
            String user = "root";
            String password = "spiderman4408@";
            String sql = "SELECT * FROM Login where username = ? AND password = ?";
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, username);
                statement.setString(2, userpassword);

                ResultSet result = statement.executeQuery();
                return result.next();
            } catch (SQLException e) {
                return false;
            }

        }


    }
        */
}
