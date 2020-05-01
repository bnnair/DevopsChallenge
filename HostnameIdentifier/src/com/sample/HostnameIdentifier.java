package com.sample;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostnameIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println("I am on " + myHost.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
	
	}

}
