package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI extends GUI1 {

    public JTextArea area = new JTextArea(); //Chat Area
    private JScrollPane scroll;
    public JTextField field = new JTextField();//Chat Field
    private JButton button = new JButton();// The Button
    private JLabel label = new JLabel();// A label for the button (i.e., "return")
    Server server = new Server();

    Boolean ex = false;
    int excount = 0;

    public ClientGUI(){

        //adds scrollable feature
        scroll = new JScrollPane();
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setSize(500,420);
        scroll.getViewport().setBackground(Color.black);
        scroll.getViewport().add(area);




        JFrame frame = new JFrame();
        frame.setSize(500,500); //SCREEN SIZE
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.getContentPane();

        frame.setTitle("Team 30 - A COSC310 Virtual Assistant"); //Title

        //Adding different parts to frame
        //frame.add(area);
        frame.add(scroll);
        frame.add(field);
        frame.add(button);



//AREA SETTINGS
        area.setSize(500,420); //SIZE
        area.setLocation(0,0); //LOCATION
        area.setBackground(Color.black); //BACKGROUND COLOR
        area.setForeground(Color.WHITE); //TEXT COLOR
        area.setAutoscrolls(true);


        //field settings
        field.setSize(401,20);
        field.setLocation(1,420);


        //BUTTON SETTINGS
        button.setSize(500,60); //SIZE
        button.setLocation(400,420); //LOCATION

        //LABEL SETTING
        label.setText("RETURN"); //TEXT
        label.setAlignmentY(button.getAlignmentY()-2);
        button.add(label); //Assigning the Label to the Bottom

        IO io = new IO(this);

        //opening statement
//        area.append("Hello! I am Team 30's Virtual Product Assistant"+"\n" +
//                "in order to exit the program enter exit or done\n"+
//                "Chatbot: How can I help you today?\n");

        //Adding Action Listener for the Button
        button.addActionListener((ActionListener) new ActionListener(){
            public void actionPerformed(ActionEvent e) {


                //button press
                if(e.getSource()==button) {
                    //Getting text from user once BUTTON is pressed
                    String userText = field.getText().toLowerCase();//evrything to lower case
                    io.button(server.getStr());
                    try {
                        io.solfind(server.getStr());
                    } catch (Exception exc) {
                        exc.printStackTrace();
                    }

                }

            }

        }); //CLOSING BRACKET for the function that adds the Action Listener to the button

    }
    //SELECT-one-of-the-following method

    //The REPLY METHOD
    public void reply(String input) {area.append("Chatbot: you should try to " + input + "\n");}
    public void screenout(String text){area.append(text);}


    public void close() {
        System.exit(10);
    }
}


