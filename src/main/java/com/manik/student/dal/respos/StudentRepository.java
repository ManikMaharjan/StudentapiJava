package com.manik.student.dal.respos;





import org.springframework.data.repository.CrudRepository;

import com.manik.student.dal.enties.Student;


public interface StudentRepository extends CrudRepository<Student,Long>{

	
//	void save(Optional<Student> student);

//	static Optional<Student> findOne(long l) {
//		// TODO Auto-generated method stub
//		return student;
//	}




	
}
