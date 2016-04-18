package Azerty;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

/**
 * Created by Manikandan Sundararajan on 4/17/16.
 */

public class azerty extends JPanel implements ActionListener, KeyListener {

    protected JTextField textField;
    protected JTextArea textArea;
    private final static String newline = "\n";

    //Constructor that initializes the text field and text are
    public azerty() {
        super(new GridBagLayout());

        textField = new JTextField(20);
        textField.addActionListener(this);
        textField.addKeyListener(this);

        textArea = new JTextArea(5, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        //Add Components to this panel.
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;

        c.fill = GridBagConstraints.HORIZONTAL;
        add(textField, c);

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);
    }

    //Getting text from the text field and adding it to the text area
    public void actionPerformed(ActionEvent evt) {
        String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();

        //Make sure the new text is visible, even if there
        //was a selection in the text area.
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //Handles the conversion of AZERTY keys to QWERTY keys. Not all the keys are handled. Keys like e with accent grave are not supported
    public void keyPressed(KeyEvent ke){
        if (ke.getKeyCode() == KeyEvent.VK_A){
            textArea.append("Q" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_Z){
            textArea.append("W" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_Q){
            textArea.append("A" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_W){
            textArea.append("Z" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_Z){
            textArea.append("W" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_M) {
            textArea.append(";" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_1 && ke.isShiftDown()) {
            textArea.append("!" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_2 && ke.isShiftDown()) {
            textArea.append("@" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_3 && ke.isShiftDown()) {
            textArea.append("#" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_4 && ke.isShiftDown()) {
            textArea.append("$" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_5 && ke.isShiftDown()) {
            textArea.append("%" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_6 && ke.isShiftDown()) {
            textArea.append("^" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_7 && ke.isShiftDown()) {
            textArea.append("&" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_8 && ke.isShiftDown()) {
            textArea.append("*" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_9 && ke.isShiftDown()) {
            textArea.append("(" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_0 && ke.isShiftDown()) {
            textArea.append(")" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_AMPERSAND) {
            textArea.append("1" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_QUOTE) {
            textArea.append("2" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_LEFT_PARENTHESIS) {
            textArea.append("5" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_MINUS) {
            textArea.append("6" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_UNDERSCORE) {
            textArea.append("8" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_RIGHT_PARENTHESIS) {
            textArea.append("-" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_EXCLAMATION_MARK) {
            textArea.append("/" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_DEAD_ABOVEDOT) {
            textArea.append("{" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_CIRCUMFLEX) {
            textArea.append("[" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_DOLLAR) {
            textArea.append("]" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_ASTERISK) {
            textArea.append("\\" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_DIVIDE && ke.isShiftDown()) {
            textArea.append("\"" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_DEAD_MACRON && ke.isShiftDown()) {
            textArea.append("|" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_COMMA) {
            textArea.append("M" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_SEMICOLON) {
            textArea.append("," + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_PERIOD && ke.isShiftDown()) {
            textArea.append("<" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_COLON) {
            textArea.append("." + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else if (ke.getKeyCode() == KeyEvent.VK_BACK_SLASH && ke.isShiftDown()) {
            textArea.append(">" + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
        else{
            textArea.append(KeyEvent.getKeyText(ke.getKeyCode()) + newline);
            textField.selectAll();
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    //Creates and shows the gui for entering text
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TextDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add contents to the window.
        frame.add(new azerty());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}