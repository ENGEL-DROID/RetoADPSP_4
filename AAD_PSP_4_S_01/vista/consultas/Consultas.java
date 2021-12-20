package consultas;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import mapping.Datos;
import mapping.Estaciones;
import mapping.Favoritos;
import mapping.Galeria;
import mapping.HibernateUtil;
import mapping.Lugares;
import mapping.Pueblos;
import mapping.Usuarios;

public class Consultas {

	public static void main(String[] args) {

		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Usuarios u = new Usuarios("Usuario_01", "1234");
//		session.save(u);
//		tx.commit();
//		System.out.println("Uasuario creado con éxito!");

		
		File fi = new File("foto.jpg");
		byte[] img = null;
		try {
			img = Files.readAllBytes(fi.toPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Galeria g = new Galeria(u, img);
//		session.save(g);
//		tx.commit();
//		System.out.println("Galería creada con éxito!");
		
		
		Pueblos p = new Pueblos("Muskiz", "Pueblo costero", "Playa", "Zierbena", "Vizcaya");
//		session.save(p);
//		tx.commit();
//		System.out.println("Pueblo creado con éxito!");
		
		
		Lugares l = new Lugares("Reserva Natural" , "Pantano Vasco", "Humedal", "Reserva", "Basauri", "Vizcaya");
//		session.save(l);
//		tx.commit();
//		System.out.println("Lugar creado con éxito!");
		
		
		Favoritos f = new Favoritos( "Usuario_01", p.getId(), l.getId());
//		session.save(f);
//		tx.commit();
//		System.out.println("Favorito creado con éxito!");
		
		
		Estaciones e = new Estaciones("Abadiño", "Vizcaya", "Calle Principal 23", 345, 400, 325, 230, 3);
//		session.save(e);
//		tx.commit();
//		System.out.println("Estación creada con éxito!");
		
		String fecha = "10/01/2020";
		String hora = "11:00";
		Date fechaF = null;
		Date horaF = null;
		try {
			fechaF = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
			horaF = new SimpleDateFormat("hh:mm").parse(hora);
		} catch (ParseException e1) {
			e1.printStackTrace();
		} 
		Datos d = new Datos(fechaF, horaF, 95, 56, 34, "AF02", 25, 54, 250, "SO23", "Abadiño", 1);
//		session.save(d);
//		tx.commit();
//		System.out.println("Datos creados con éxito!");
		
		
		// se cierran las sesiones:
		session.close();
		sesion.close();

	}

}
