import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
    // Labels for the form fields
    private JLabel nameLabel, ageLabel, heightLabel, weightLabel, bodyTypeLabel, genderLabel;

    // Text fields for the form fields
    private JTextField nameField, ageField, heightField, weightField;

    // Combo box for body type and gender selection
    private JComboBox<String> bodyTypeCombo, genderCombo;

    // Submit button
    private JButton submitButton;

    public Formulario() {
        super("Formulario");
        setLayout(new GridLayout(7, 2));

        // Initialize the labels
        nameLabel = new JLabel("Nombre: ");
        ageLabel = new JLabel("Edad: ");
        heightLabel = new JLabel("Talla (cm): ");
        weightLabel = new JLabel("Peso (kg): ");
        bodyTypeLabel = new JLabel("Contextura: ");
        genderLabel = new JLabel("Sexo: ");

        // Initialize the text fields
        nameField = new JTextField(10);
        ageField = new JTextField(10);
        heightField = new JTextField(10);
        weightField = new JTextField(10);

        // Initialize the combo boxes
        String[] bodyTypes = {"Delgada", "Media", "Ancha"};
        bodyTypeCombo = new JComboBox<String>(bodyTypes);
        String[] genders = {"Masculino", "Femenino", "No binario"};
        genderCombo = new JComboBox<String>(genders);

        // Initialize the submit button
        submitButton = new JButton("Enviar");
        submitButton.addActionListener(this);

        // Add the components to the form
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(heightLabel);
        add(heightField);
        add(weightLabel);
        add(weightField);
        add(bodyTypeLabel);
        add(bodyTypeCombo);
        add(genderLabel);
        add(genderCombo);
        add(new JLabel(""));
        add(submitButton);

        // Set the size and visibility of the form
        setSize(400, 300);
        setVisible(true);
    }

    // Handle the submit button action
    public void actionPerformed(ActionEvent e) {
        // Get the values from the form fields
        String name = nameField.getText();
        int age = Integer.parseInt(ageField.getText());
        int height = Integer.parseInt(heightField.getText());
        double weight = Double.parseDouble(weightField.getText());
        String bodyType = (String)bodyTypeCombo.getSelectedItem();
        String gender = (String)genderCombo.getSelectedItem();

        // Output the values to the console
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Talla: " + height);
        System.out.println("Peso: " + weight);
        System.out.println("Contextura: " + bodyType);
        System.out.println("Sexo: " + gender);
    }

    public static void main(String[] args) {
        Formulario form = new Formulario();
    }
}
