package tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

import mapping.Datos;
import mapping.Estaciones;
import mapping.Galeria;
import mapping.HibernateUtil;
import mapping.Lugares;
import mapping.Pueblos;
import mapping.Usuarios;

class Consultas_Tests {
	
	@Test
	public Usuarios usuario() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Usuarios u = new Usuarios("Pedro", "1234");
		session.save(u);
		tx.commit();
		
		String queryH = "from Usuarios where usuario = 'Pedro'";
		Query q = session.createQuery(queryH);
		Usuarios usu = (Usuarios) q.uniqueResult();
		session.close();
		assertEquals(u.getUsuario(),usu.getUsuario());
		assertEquals(u.getContrasenia(),usu.getContrasenia());
		return u;
	}
	
	
	@Test
	public void Galeria() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		File fi = new File("foto.jpg");
		byte[] img = null;
		try {
			img = Files.readAllBytes(fi.toPath());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Galeria g = new Galeria(usuario(), img);
		session.save(g);
		tx.commit();
		
		String queryH = "from Galeria g where g.Usuarios.usuario = 'Pedro'";
		Query q = session.createQuery(queryH);
		Galeria gal = (Galeria) q.uniqueResult();
		session.close();
		assertEquals(g.getId(),gal.getId());
		assertEquals(g.getFoto(),gal.getFoto());
		assertEquals(g.getUsuarios().getUsuario(),gal.getUsuarios().getUsuario());
	}
	
	
	@Test
	public void Pueblos() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Pueblos p = new Pueblos("Lezama", "Muy bonito","marks","Lezama", "Vizcaya");
		session.save(p);
		tx.commit();
		
		String queryH = "from Pueblos where nombre = 'Lezama'";
		Query q = session.createQuery(queryH);
		Pueblos pue = (Pueblos) q.uniqueResult();
		session.close();
		assertEquals(p.getNombre(),pue.getNombre());
		assertEquals(p.getDescripcion(),pue.getDescripcion());
		assertEquals(p.getId(),pue.getId());
		assertEquals(p.getMarks(),pue.getMarks());
		assertEquals(p.getMunicipio(),pue.getMunicipio());
		assertEquals(p.getTerritorio(),pue.getTerritorio());
	}
	
	
	@Test
	public void Lugares() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Lugares l = new Lugares("Lugar1", "Lugar bonito", "Rio", "Rios", "municipio1", "territorio1");
		session.save(l);
		tx.commit();
		
		String queryH = "from Lugares where nombre = 'Lugar1'";
		Query q = session.createQuery(queryH);
		Lugares lug = (Lugares) q.uniqueResult();
		session.close();
		assertEquals(l.getNombre(),lug.getNombre());
		assertEquals(l.getDescripcion(),lug.getDescripcion());
		assertEquals(l.getId(),lug.getId());
		assertEquals(l.getMarks(),lug.getMarks());
		assertEquals(l.getMunicipio(),lug.getMunicipio());
		assertEquals(l.getTerritorio(),lug.getTerritorio());
		assertEquals(l.getTipo(),lug.getTipo());
	}
	
	
	@Test
	void FavoritosTest() {
		
	}
	
	
	@Test
	void EstacionesTest() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		Estaciones e = new Estaciones("Abadinio", "Vizcaya", "Calle Principal 23", 345, 400, 325, 230, 1);
		session.save(e);
		tx.commit();
		
		// Consulta:
		String hql = "from Estaciones where nombre = 'Abadinio'";
		Query q = session.createQuery(hql);
		Estaciones eI = (Estaciones) q.uniqueResult();
		
		// se cierran las sesiones:
		session.close();
//		sesion.close();
		
		assertEquals(e, eI);
	}
	
	
	@Test
	void DatosTest() {
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
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
		Datos d = new Datos(fechaF, horaF, 95, 56, 34, "AF02", 25, 54, 250, "SO23", "Abadinio", 1);
		session.save(d);
		tx.commit();
		
		// Consulta:
		String hql = "from Datos where icaestacion = 'Abadinio'";
		Query q = session.createQuery(hql);
		Datos dI = (Datos) q.uniqueResult();
		
		// se cierran las sesiones:
		session.close();
//		sesion.close();
		
		assertEquals(d, dI);
	}
	

}
