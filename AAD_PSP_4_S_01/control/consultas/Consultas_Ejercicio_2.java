//package consultas;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//
//public class Consultas_Ejercicio_2 {
//
//	public static void main(String[] args) {
//
//		SessionFactory sesion = HibernateUtil.getSessionFactory();
//		Session session = sesion.openSession();
//		Transaction tx = session.beginTransaction();
//		
////		1 - Insertar nuevo departamento de INFORMATICA:
//		Departamentos dep = new Departamentos((byte) 50);
//		dep.setDnombre("INFORMATICA");
//		dep.setLoc("MADRID");
//		session.save(dep);
//		tx.commit();
//		System.out.println("Departamento creado con éxito!");
//		
////		// se cierran las sesiones:
//		session.close();
//		sesion.close();
//		
////		2 - Insertar un empleado de informatica que sea DIRECTOR y con salario de 2300:
//		// se obtiene el departamento de INFORMATICA de la bbdd:
//		String hql = "from Departamentos as d where d.dnombre='INFORMATICA' ";
//		Query q = session.createQuery(hql);
//		Departamentos dI = (Departamentos) q.uniqueResult();
//		System.out.println("Departamento: " + dI.getDnombre());
////		Departamentos dI = (Departamentos) session.get(Departamentos.class, (byte) 50);
//		// se crea el nuevo empleado y se ingresa a la bbdd:
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date fecha = null;
//		try {
//			fecha = sdf.parse("2021-12-04");
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		Empleados emp = new Empleados();
//		emp.setEmpNo((short) 7940);
//		emp.setDepartamentos(dI);
//		emp.setApellido("PEREZ");
//		emp.setOficio("DIRECTOR");
//		emp.setDir((short) 7839);
//		emp.setFechaAlt(fecha);
//		emp.setSalario((float) 2300);
//		emp.setComision((float) 500);
//		session.save(emp);
//		tx.commit();
//		System.out.println("Empleado insertado con éxito!");
//
//		// se cierran las sesiones:
//		session.close();
//		sesion.close();
//		
//		
////		3 - Modificamos el salario de GIL a 1300:
//		// se obtiene el empleado (siempre q sólo exista uno con ese apellido):
//		hql = "from Empleados as e where e.apellido='GIL' ";
//		q = session.createQuery(hql);
//		Empleados modE = (Empleados) q.uniqueResult();
//		System.out.println("Apellido: " + modE.getApellido());
//		// se modifica el salario:
//		modE.setSalario((float) 1300);
//		session.update(modE);
//		tx.commit();
//		System.out.println("Empleado actualizado con éxito!");
//		
//		// se cierran las sesiones:
//		session.close();
//		sesion.close();
//		
//		
////		4 - Eliminamos los empleados del departamento 20:
//		// se obtienen los id de los empleados del departamento 20:
//		hql = "select e.empNo, e.departamentos.deptNo from Empleados as e where e.departamentos.deptNo=20";
//		q = session.createQuery(hql);
//		List<Object[]> filas = q.list();
//		// se eliminan los empleados:
//		for (Object[] obj : filas) {
//			Empleados delE = new Empleados((short) obj[0] , new Departamentos((byte) 20));
//			session.delete(delE);
//		}
//		tx.commit();
//		System.out.println("Empleados eliminados con éxito!");
//		
//		// se cierran las sesiones:
//		session.close();
//		sesion.close();
//		
//		
////		5 - Eliminar un empleado del departamento de CONTABILIDAD cuyo salario sea el mayor de ese departamento:
//		// se obtienen el id del empleado y el id del departamento:
//		hql = "from Empleados as e where e.salario= (select max(e.salario) from Empleados as e where e.departamentos.dnombre='CONTABILIDAD' )";
//		q = session.createQuery(hql);
//		Empleados eDel = (Empleados) q.uniqueResult();
//		System.out.println("Nro empleado: " + eDel.getEmpNo() + " Nro departamento: " + eDel.getDepartamentos().getDeptNo());
//		// se ejecuta la query para eliminar dicho empleado:
//		session.delete(eDel);
//		tx.commit();
//		System.out.println("Empleado eliminado con éxito!");
//		
//		// se cierran las sesiones:
//		session.close();
//		sesion.close();
//	}
//
//}
