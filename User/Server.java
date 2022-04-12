package User;

// Server2 class that
// receives data and sends data

import java.io.*;
import java.net.*;

class Server {
    String str, str1;
    static Apple device = new Apple();
    static solution sol = new solution();

    public String getStr() {
        return str;

    }

    public static void main(String[] args)
            throws Exception {

        String str, str1 = null;
        String trial;
        // Create server Socket
        ServerSocket ss = new ServerSocket(4999);

        // connect it to client socket
        Socket s = ss.accept();
        System.out.println("Connection established");

        // to send data to the client
        PrintStream ps = new PrintStream(s.getOutputStream());

        // to read data coming from the client
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // to read data from the keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        //DataOutputStream dos = new DataOutputStream(ss.accept().getOutputStream());
// server executes continuously
        while (true) {


            // repeat as long as the client
            // does not send a null string

            // read from client
            // while ((str = br.readLine()) != null) {
            //System.out.println(str);
            //str is rahman's bot output.
            //str1 = kb.readLine();
            // STR1 = my bot's output.
            //change str1 to ans

            // send bot answer to input to client
            //ps.println(solution.Findsol(str));
            //ps.println(str1);
            //ps.println(ans);

            //////

//                  //  ps.println(str);
//                    str1= br.readLine();
//                    System.out.println(""str);
//                   String S1 = sol.Findsol(str);
//                    System.out.println(S1);
            //str = kb.readLine();
            //ps.println(str);
            //ps.println(sol.Findsol(str1));
            // ps.println(S1);


            //  }


            for (int i = 0; i<=20; i++) {
                //System.out.println("server:" + str1);
                //ps.println(str1);

                //if ((str = br.readLine()) != null) {
                    str = br.readLine();
                    if(str.equals("bye"))
                        break;
                    System.out.println("client: "+str);
                    String ans = sol.Findsol(str);
                    System.out.println("server:" + ans);
                    ps.println(ans);
                }

                // close connection
                ps.close();
                br.close();
                kb.close();
                ss.close();
                s.close();

                // terminate application
                System.exit(0);

            } // end of while
        }
        //String GetStr(){
        //  return str;
        //}
    }

/*
while (!(str = cb.getChatbotResponse("bye")).equals("exit")) {
        dos.writeBytes(str+"\n");
        str1= br.readLine();
        System.out.println("Server: " + str1);
        str = cb.getChatbotResponse(str1);
        dos.writeBytes(str+"\n");
        System.out.println("Bot: " + str);
        }
        dos is data output stream
        cb is his chatbot.
 */