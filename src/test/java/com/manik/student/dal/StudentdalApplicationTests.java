package com.manik.student.dal;






import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.manik.student.dal.enties.Student;
import com.manik.student.dal.respos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
@Autowired
private StudentRepository studentRespository; 

	@Test
	public void  testCreateStudent() {
		Student student = new Student();
		student.setSname("John");
		student.setCourse("JavaWebService");
		student.setFee(30d);
	
		
		
		studentRespository.save(student);
		
	}
	
	@Test
	

public void testfindStudentbyId() {
	Student  student= studentRespository.findById(2l).get();
		
	 
		
System.out.println(student);
	}
	
	
//	@Test
//	public void testUpdateStudent() {
//  Optional <Student> student=studentRespository.findById(2l);
//  if(student.isPresent()) {
//  Student s=student.get();
//student.putFee();
//  studentRespository.save(s);
// 
//  
//  }else {
//	  System.out.println("student not found for id");
//  }

  @Test
  public void testDelete() {
	  Student student=new Student();
	  student.setId(1l);
	  studentRespository.delete(student);
	  
  }
  
		
  @Test
  public void testupdate(){
	 Student student=studentRespository.findById(2l).get();
	student.setFee(20d);
	 studentRespository.save(student);
	 
	  
  }
		
	}
	

