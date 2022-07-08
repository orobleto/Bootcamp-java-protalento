package com.protalento.Clase16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;

public class LeerURL {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.google.com/");
			InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

			String linea;
			String html = "";
			while ((linea = bufferedReader.readLine()) != null) {
				html += linea;
			}
			System.out.println(html);
			JOptionPane.showMessageDialog(null, html);
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
