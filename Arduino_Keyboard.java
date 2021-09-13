package Arduino_Keyboard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.Enumeration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Gowtham
 */
public class Arduino_Keyboard implements SerialPortEventListener {

    /**
     *
     * @param letter
     */
    public void press(char letter) {

        try {
            Robot rbt = new Robot();

            if (letter == 'a') {

                rbt.keyPress(KeyEvent.VK_A);
                rbt.keyRelease(KeyEvent.VK_A);

            } else if (letter == 'b') {
                rbt.keyPress(KeyEvent.VK_B);
                rbt.keyRelease(KeyEvent.VK_B);

            } else if (letter == 'c') {
                rbt.keyPress(KeyEvent.VK_C);
                rbt.keyRelease(KeyEvent.VK_C);

            } else if (letter == 'd') {
                rbt.keyPress(KeyEvent.VK_D);
                rbt.keyRelease(KeyEvent.VK_D);

            } else if (letter == 'e') {
                rbt.keyPress(KeyEvent.VK_E);
                rbt.keyRelease(KeyEvent.VK_E);

            } else if (letter == 'f') {
                rbt.keyPress(KeyEvent.VK_F);
                rbt.keyRelease(KeyEvent.VK_F);

            } else if (letter == 'g') {
                rbt.keyPress(KeyEvent.VK_G);
                rbt.keyRelease(KeyEvent.VK_G);

            } else if (letter == 'h') {
                rbt.keyPress(KeyEvent.VK_H);
                rbt.keyRelease(KeyEvent.VK_H);

            } else if (letter == 'i') {
                rbt.keyPress(KeyEvent.VK_I);
                rbt.keyRelease(KeyEvent.VK_I);

            } else if (letter == 'j') {
                rbt.keyPress(KeyEvent.VK_J);
                rbt.keyRelease(KeyEvent.VK_J);

            } else if (letter == 'k') {
                rbt.keyPress(KeyEvent.VK_K);
                rbt.keyRelease(KeyEvent.VK_K);

            } else if (letter == 'l') {
                rbt.keyPress(KeyEvent.VK_L);
                rbt.keyRelease(KeyEvent.VK_L);

            } else if (letter == 'm') {
                rbt.keyPress(KeyEvent.VK_M);
                rbt.keyRelease(KeyEvent.VK_M);

            } else if (letter == 'n') {
                rbt.keyPress(KeyEvent.VK_N);
                rbt.keyRelease(KeyEvent.VK_N);

            } else if (letter == 'o') {
                rbt.keyPress(KeyEvent.VK_O);
                rbt.keyRelease(KeyEvent.VK_O);

            } else if (letter == 'p') {
                rbt.keyPress(KeyEvent.VK_P);
                rbt.keyRelease(KeyEvent.VK_P);

            } else if (letter == 'q') {
                rbt.keyPress(KeyEvent.VK_Q);
                rbt.keyRelease(KeyEvent.VK_Q);

            } else if (letter == 'r') {
                rbt.keyPress(KeyEvent.VK_R);
                rbt.keyRelease(KeyEvent.VK_R);

            } else if (letter == 's') {
                rbt.keyPress(KeyEvent.VK_S);
                rbt.keyRelease(KeyEvent.VK_S);

            } else if (letter == 't') {
                rbt.keyPress(KeyEvent.VK_T);
                rbt.keyRelease(KeyEvent.VK_T);

            } else if (letter == 'u') {
                rbt.keyPress(KeyEvent.VK_U);
                rbt.keyRelease(KeyEvent.VK_U);

            } else if (letter == 'v') {
                rbt.keyPress(KeyEvent.VK_V);
                rbt.keyRelease(KeyEvent.VK_V);

            } else if (letter == 'w') {
                rbt.keyPress(KeyEvent.VK_W);
                rbt.keyRelease(KeyEvent.VK_W);

            } else if (letter == 'x') {
                rbt.keyPress(KeyEvent.VK_X);
                rbt.keyRelease(KeyEvent.VK_X);

            } else if (letter == 'y') {
                rbt.keyPress(KeyEvent.VK_Y);
                rbt.keyRelease(KeyEvent.VK_Y);

            } else if (letter == 'z') {
                rbt.keyPress(KeyEvent.VK_Z);
                rbt.keyRelease(KeyEvent.VK_Z);
            } else if (letter == 'A') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_A);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_A);
            } else if (letter == 'B') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_B);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_B);

            } else if (letter == 'C') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_C);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_C);

            } else if (letter == 'D') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_D);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_D);

            } else if (letter == 'E') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_E);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_E);

            } else if (letter == 'F') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_F);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_F);

            } else if (letter == 'G') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_G);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_G);

            } else if (letter == 'H') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_H);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_H);

            } else if (letter == 'I') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_I);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_I);

            } else if (letter == 'J') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_J);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_J);

            } else if (letter == 'K') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_K);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_K);

            } else if (letter == 'L') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_L);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_L);

            } else if (letter == 'M') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_M);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_M);

            } else if (letter == 'N') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_N);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_N);

            } else if (letter == 'O') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_O);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_O);

            } else if (letter == 'P') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_P);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_P);

            } else if (letter == 'Q') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_Q);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_Q);

            } else if (letter == 'R') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_R);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_R);

            } else if (letter == 'S') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_S);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_S);

            } else if (letter == 'T') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_T);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_T);

            } else if (letter == 'U') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_U);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_U);

            } else if (letter == 'V') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_V);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_V);

            } else if (letter == 'W') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_W);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_W);

            } else if (letter == 'X') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_X);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_X);

            } else if (letter == 'Y') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_Y);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_Y);

            } else if (letter == 'Z') {
                rbt.keyPress(KeyEvent.VK_SHIFT);
                rbt.keyPress(KeyEvent.VK_Z);
                rbt.keyRelease(KeyEvent.VK_SHIFT);
                rbt.keyRelease(KeyEvent.VK_Z);
            } else if (letter == '1') {
                rbt.keyPress(KeyEvent.VK_1);
                rbt.keyRelease(KeyEvent.VK_1);

            } else if (letter == '2') {
                rbt.keyPress(KeyEvent.VK_2);
                rbt.keyRelease(KeyEvent.VK_2);

            } else if (letter == '3') {
                rbt.keyPress(KeyEvent.VK_3);
                rbt.keyRelease(KeyEvent.VK_3);

            } else if (letter == '4') {
                rbt.keyPress(KeyEvent.VK_4);
                rbt.keyRelease(KeyEvent.VK_4);

            } else if (letter == '5') {
                rbt.keyPress(KeyEvent.VK_5);
                rbt.keyRelease(KeyEvent.VK_5);

            } else if (letter == '6') {
                rbt.keyPress(KeyEvent.VK_6);
                rbt.keyRelease(KeyEvent.VK_6);

            } else if (letter == '7') {
                rbt.keyPress(KeyEvent.VK_7);
                rbt.keyRelease(KeyEvent.VK_7);

            } else if (letter == '8') {
                rbt.keyPress(KeyEvent.VK_8);
                rbt.keyRelease(KeyEvent.VK_8);

            } else if (letter == '9') {
                rbt.keyPress(KeyEvent.VK_9);
                rbt.keyRelease(KeyEvent.VK_9);

            } else if (letter == '0') {
                rbt.keyPress(KeyEvent.VK_0);
                rbt.keyRelease(KeyEvent.VK_0);

            } else if (letter == ',') {
                rbt.keyPress(KeyEvent.VK_BACK_SPACE);
                rbt.keyRelease(KeyEvent.VK_BACK_SPACE);

            } else if (letter == '.') {
                rbt.keyPress(KeyEvent.VK_SPACE);
                rbt.keyRelease(KeyEvent.VK_SPACE);
                

            } else if (letter == '?') {
                rbt.keyPress(KeyEvent.VK_ENTER);
                rbt.keyRelease(KeyEvent.VK_ENTER);}
            else if (letter == '!') {
                rbt.keyPress(KeyEvent.VK_DECIMAL);
                rbt.keyRelease(KeyEvent.VK_DECIMAL);}
            else if (letter == '@') {
                rbt.keyPress(KeyEvent.VK_COMMA);
                rbt.keyRelease(KeyEvent.VK_COMMA);}
            else {
                System.out.println(" ");
            }

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    SerialPort serialPort;
    /**
     * The port we're normally going to use.
     */
    private static final String PORT_NAMES[] = {
        "COM9", // Mac OS X
        "COM9", // Raspberry Pi
        "COM9", // Linux
        "COM9", // Windows
    };
    /**
     * A BufferedReader which will be fed by a InputStreamReader converting the
     * bytes into characters making the displayed results codepage independent
     */
    private BufferedReader input;
    /**
     * The output stream to the port
     */
    private OutputStream output;
    /**
     * Milliseconds to block while waiting for port open
     */
    private static final int TIME_OUT = 2000;
    /**
     * Default bits per second for COM port.
     */
    private static final int DATA_RATE = 600;

    /**
     *
     */
    public void initialize() {
        // the next line is for Raspberry Pi and 
        // gets us into the while loop and was suggested here was suggested http://www.raspberrypi.org/phpBB3/viewtopic.php?f=81&t=32186
        System.setProperty("gnu.io.rxtx.SerialPorts", "COM9");

        CommPortIdentifier portId = null;
        Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

        //First, Find an instance of serial port as set in PORT_NAMES.
        while (portEnum.hasMoreElements()) {
            CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
            for (String portName : PORT_NAMES) {
                if (currPortId.getName().equals(portName)) {
                    portId = currPortId;
                    break;
                }
            }
        }
        if (portId == null) {
            System.out.println("Could not find COM port.");
            return;
        }

        try {
            // open serial port, and use class name for the appName.
            serialPort = (SerialPort) portId.open(this.getClass().getName(),
                    TIME_OUT);

            // set port parameters
            serialPort.setSerialPortParams(DATA_RATE,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);

            // open the streams
            input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
            output = serialPort.getOutputStream();

            // add event listeners
            serialPort.addEventListener(this);
            serialPort.notifyOnDataAvailable(true);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }

    /**
     * This should be called when you stop using the port. This will prevent
     * port locking on platforms like Linux.
     */
    public synchronized void close() {
        if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
        }
    }

    /**
     * Handle an event on the serial port. Read the data and print it.
     *
     * @param oEvent
     */
    public synchronized void serialEvent(SerialPortEvent oEvent) {
        if (oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            try {
                String inputLine = input.readLine();
                inputLine = inputLine.trim();
                System.out.println(inputLine);

                char[] i = inputLine.toCharArray();
                for (int j = 0; j < inputLine.length(); j++) {
                    press(i[j]);
                }
            } catch (Exception e) {
                System.err.println(e.toString());
            }
        }

        // Ignore all the other eventTypes, but you should consider the other ones.
    }

    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Arduino_Keyboard main = new Arduino_Keyboard();
        main.initialize();
        Thread t = new Thread() {
            public void run() {
                //the following line will keep this app alive for 1000 seconds,
                //waiting for events to occur and responding to them (printing incoming messages to console).
                try {
                    Thread.sleep(1000000);
                } catch (InterruptedException ie) {
                }
            }
        };
        t.start();
        System.out.println("Started");

    }
}
