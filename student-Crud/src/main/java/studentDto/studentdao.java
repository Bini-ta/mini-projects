package studentDto;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.Crud.domain.student;
@Repository
public class studentdao {
		
		@Autowired
		EntityManager manager;
		
		
		public void save(student student) {
			Session session = manager.unwrap(Session.class);
			session.save(student);
		}
		public List<student> findAll() {
			// create a session
			Session session = manager.unwrap(Session.class);

			// create a query
			Query<student> query = session.createQuery("from Student", student.class);

			// execute the query
			List<student> students = query.getResultList();

			List<student> students;
			// return the result
			return students;
		}

		public void deletestudent(int id) {
			Session session = manager.unwrap(Session.class);

			student student = session.get(student.class, id);

			session.delete(student);

		}
		public void updatestudent(student student) {
			 Session session =manager.unwrap(Session.class);
		     session.saveOrUpdate(student);
		}
		public student getstudent(int id) {
			Session session = manager.unwrap(Session.class);

			// create a query
			Query<student> query = session.createQuery("from student where id = " +id, student.class);

			// execute the query
			student students = query.getSingleResult();

			// return the result
			return students;
		}

	}	
