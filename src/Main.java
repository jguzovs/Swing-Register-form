import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // creating frame and panel
        JFrame frame = new JFrame("Register");
        JPanel panel = new JPanel();

        // setting frame
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setVisible(true);

        // setting panel
        panel.setLayout(null);
        frame.add(panel);

        // creating labels and textfields
        JLabel userNameLabel = new JLabel("User");
        userNameLabel.setBounds(10,20,85,25);
        panel.add(userNameLabel);

        JTextField userNameTextField = new JTextField(20);
        userNameTextField.setBounds(100,20,165,25);
        panel.add(userNameTextField);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(10,50,85,25);
        panel.add(emailLabel);

        JTextField emailTextField = new JTextField(20);
        emailTextField.setBounds(100,50,165,25);
        panel.add(emailTextField);

        JLabel phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(10,80,85,25);
        panel.add(phoneLabel);

        JTextField phoneTextField = new JTextField(20);
        phoneTextField.setBounds(100, 80, 165,25);
        panel.add(phoneTextField);

        JLabel countryLabel = new JLabel("Country");
        countryLabel.setBounds(10,110,85,25);
        panel.add(countryLabel);

        JTextField countryTextField = new JTextField(20);
        countryTextField.setBounds(100, 110, 165,25);
        panel.add(countryTextField);

        JLabel cityLabel = new JLabel("City");
        cityLabel.setBounds(10,140,140,25);
        panel.add(cityLabel);

        JTextField cityTextField = new JTextField(20);
        cityTextField.setBounds(100, 140, 165,25);
        panel.add(cityTextField);

        JLabel streetLabel = new JLabel("Street");
        streetLabel.setBounds(10,170,140,25);
        panel.add(streetLabel);

        JTextField streetTextField = new JTextField(20);
        streetTextField.setBounds(100, 170, 165,25);
        panel.add(streetTextField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(10,200,140,25);
        panel.add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(100, 200, 75,25);
        panel.add(maleRadioButton);

        JRadioButton femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(175, 200, 165,25);
        panel.add(femaleRadioButton);

        // button group for radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(maleRadioButton);
        group.add(femaleRadioButton);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 230,85,25);
        panel.add(passwordLabel);

        JTextField passwordTextField = new JTextField(20);
        passwordTextField.setBounds(100, 230, 165,25);
        panel.add(passwordTextField);

        // adding Registration button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(75,275, 100, 25);
        panel.add(registerButton);

        // adding on click listener to button
        registerButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                // creating string variables for each textfield
                String username = userNameTextField.getText();
                String email = emailTextField.getText();
                String phone = phoneTextField.getText();
                String country = countryTextField.getText();
                String city = cityTextField.getText();
                String street = streetTextField.getText();
                String password = passwordTextField.getText();
                String gender = "";

                // if statement for String gender assignment based on clicked radioButton
                if (maleRadioButton.isSelected() &&  e.getSource() == registerButton) {
                    gender = "male";
                }
                if (femaleRadioButton.isSelected() && e.getSource() == registerButton) {
                    gender = "female";
                }

                // creating MessageDialog with all user inputs
                JOptionPane.showMessageDialog(null,
                        "user: " + username + "\nemail: " + email + "\nphone: " + phone +
                                "\ncountry: " + country + "\ncity: " + city + "\nstreet: " + street + "\ngender: " + gender + "\npassword: " + password,
                        "Confirm Register Information",JOptionPane.PLAIN_MESSAGE);
            }
        });
    }
}