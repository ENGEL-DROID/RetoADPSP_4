package consultas;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import mapping.HibernateUtil;
import mapping.Prueba;
import mapping.Pueblos;
import mapping.Usuarios;

public class Consultas {

	public static void main(String[] args) {

		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
//		Usuarios u = new Usuarios();
//		u.setUsuario("User01");
//		u.setContraseña("1234");
//		session.save(u);
//		tx.commit();
//		System.out.println("Query creada con éxito!");
//		
////		// se cierran las sesiones:
//		session.close();
//		sesion.close();
		
		Pueblos p = new Pueblos();
		p.setNombre("Pueblo1");
		p.setDescripcion("Un pueblo lejano");
		p.setMarks("Algunas marcas");
		p.setMunicipio("Un municipio");
		p.setTerritorio("Territorio1");
		session.save(p);
		tx.commit();
		System.out.println("Pueblo creado con éxito!");
		
//		// se cierran las sesiones:
		session.close();
		sesion.close();

	}

}
