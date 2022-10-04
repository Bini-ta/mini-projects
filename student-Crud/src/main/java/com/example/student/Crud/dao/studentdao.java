package com.example.student.Crud.dao;

import java.util.List;

import com.example.student.Crud.domain.student;
	import javax.persistence.EntityManager;

	import org.hibernate.Session;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	@Repository
	public class studentdao {
			
			@Autowired
			static
			EntityManager manager;
			
			
			public static void save(student student) {
				Session session = manager.unwrap(Session.class);
				session.save(student);
			}
			public static List<student> findAll() {
				// create a session
				Session session = manager.unwrap(Session.class);

				// create a query
				Query<student> query = session.createQuery("from Student", student.class);

				// execute the query
				List<student> students = query.getResultList();
				return students;
			}

			public void deletestudent(int id) {
				Session session = manager.unwrap(Session.class);

				student student = session.get(student.class, id);

				session.delete(student);

			}
			public static void updatestudent(student student) {
				 Session session =manager.unwrap(Session.class);
			     session.update(student);
			}
			public static student getstudent(int id) {
				Session session = manager.unwrap(Session.class);

				// create a query
				Query<student> query = session.createQuery("from student where id = " +id, student.class);

				// execute the query
				student students = query.getSingleResult();

				// return the result
				return students;
			}

		}
	
	
	
	
	
	
	
	
