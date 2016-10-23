

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import usb.core.Bus;
import usb.core.Configuration;
import usb.core.Endpoint;
import usb.core.Host;
import usb.core.HostFactory;
import usb.core.Interface;
import usb.windows.DeviceImpl;



public class Test {
      public static void main(String[] args) {
    try {

        Host host = HostFactory.getHost();

        Bus[] bus = host.getBusses();

        SearchUSBDevices(bus);
    } catch (Exception e) {
    }

}

private static void SearchUSBDevices(Bus[] bus) {
    boolean FOUND_FLAG = false;
    try {
        DeviceImpl dev;
        for (int k = 0; k < bus.length; k++) {
            for (int i = 0; i < 5; i++) {
                dev = (DeviceImpl) bus[k].getDevice(i);
                if (dev != null) {
                    // System.out.println(dev.getString(1, 1));
                    if (dev.getAddress() >= 1) {
                        if (dev.getNumPorts() > 0)
                            ;
                        else {
                            // System.out.println("Device Name :"+dev.getFriendlyDeviceName());
                            if (dev.getFriendlyDeviceName()
                                    .equalsIgnoreCase(
                                            "USB Mass Storage Device")) {

                                FOUND_FLAG = true;

                                // // START
                                //
                                if (dev != null) {
                                    // Obtain the current Configuration of
                                    // the device and the number of
                                    // Interfaces available under the
                                    // current Configuration.
                                    Configuration config = dev
                                            .getConfiguration();
                                    int total_interface = config
                                            .getNumInterfaces();

                                    // Traverse through the Interfaces
                                    for (int k1 = 0; k1 < total_interface; k1++) {
                                        // Access the currently Interface
                                        // and obtain the number of
                                        // endpoints available on the
                                        // Interface.
                                        Interface itf = config
                                                .getInterface(k1, 0);
                                        int total_ep = itf
                                                .getNumEndpoints();
                                        System.out.println(total_ep);
                                        // Traverse through all the
                                        // endpoints.
                                        for (int l = 0; l < total_ep - 1; l++) {
                                            // Access the endpoint, and
                                            // obtain its I/O type.
                                            Endpoint ep = itf
                                                    .getEndpoint(l);
                                            String io_type = ep.getType();
                                            System.out.println(io_type);
                                            boolean input = ep.isInput();
                                            System.out.println(input);

                                            // If the endpoint is an input
                                            // endpoint, obtain its
                                            // InputStream and read in data.
                                            if (input) {
                                                InputStream in;
                                                in = ep.getInputStream();
                                                // Read in data here
                                                /*
                                                 * byte[] b = new byte[100];
                                                 * in.read(b);
                                                 */
                                                BufferedReader bReader = new BufferedReader(
                                                        new InputStreamReader(
                                                                in));
                                                String line;

                                                /*
                                                 * while ((line =
                                                 * bReader.read
                                                 * (cbuf))!=null){
                                                 * System.out
                                                 * .println(line); }
                                                 */
                                                in.close();
                                            }
                                            // If the Endpoint is and output
                                            // Endpoint, obtain its
                                            // OutputStream and write out
                                            // data.
                                            else {
                                                OutputStream out;
                                                out = ep.getOutputStream();
                                                // Write out data here.
                                                out.close();
                                            }
                                        }
                                    }
                                }
                                // END
                            }

                        }
                    }
                }
            }
        }
        if (FOUND_FLAG)
            System.out.println("Pendrive Found..");
        else
            System.out.println("Pendrive Not Found ...");
    } catch (Exception e) {
        e.printStackTrace();
    }

} 