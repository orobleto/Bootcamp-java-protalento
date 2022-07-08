package com.protalento.Clase16;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LeerPropiedades {
	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/database.properties"));
			System.out.println(properties.getProperty("url"));
			System.out.println(properties.getProperty("usuario"));
			System.out.println(properties.getProperty("clave"));
			System.out.println(properties.getProperty("driver"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
