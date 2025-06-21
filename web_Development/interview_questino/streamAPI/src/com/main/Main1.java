package com.main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;




public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Course> techCourses = List.of(
				 new Course("Java Programming Masterclass", "Programming", 92, 180000),
		            new Course("Python for Data Science", "Data Science", 95, 200000),
		            new Course("React - The Complete Guide", "Web Development", 90, 175000),
		            new Course("Node.js, Express, MongoDB & More", "Web Development", 88, 160000),
		            new Course("SQL for Data Analysts", "Data & Databases", 87, 140000),
		            new Course("Docker & Kubernetes Mastery", "DevOps", 91, 190000),
		            new Course("Machine Learning A-Z", "Data Science", 93, 220000),
		            new Course("Ethical Hacking & Cybersecurity", "Security", 89, 170000),
		            new Course("Advanced Java Concurrency", "Programming", 94, 210000),
		            new Course("Full-Stack Web Development", "Web Development", 85, 250000),
		            new Course("Introduction to Marketing", "Marketing", 80, 80000),
		            new Course("Data Visualization with Tableau", "Data Science", 91, 165000),
		            new Course("Cloud Computing Fundamentals (AWS)", "Cloud", 86, 150000),
		            new Course("Spring Boot Microservices", "Programming", 96, 230000)
		        );
		
		/*
		 Map<String, List<Course>> CourseByCategory=techCourses.stream().collect(Collectors.groupingBy(Course::Category));
		 
		
		CourseByCategory.forEach((String k,List<Course> v)->{
			
			System.out.println(k+" ");
			v.forEach((Course c)->{
				System.out.println(c.toString());
			}  );
			
		});
		
		
		
		 
		 List<Course> highestRatedCourse= techCourses.stream().filter(x->x.reviewScore()>90).toList();
		 
		 highestRatedCourse.forEach(x->System.out.println(x));
		
		 
		 List<String> CourseName= techCourses.stream().map(x->x.name()).toList();
		 
		
		 CourseName.forEach(System.out::println);
		 
		 
		 
		 List<Course> rs=techCourses.stream().filter(x->x.Category()=="Data Science").map(x->x.fee()>200000 ? x:null).toList();
		 
		 
		 rs.forEach(x->{
		 if(x!=null)
			 System.out.println(x);});
			 
			  
		 
		
		
		Comparator<Course> feesCompare=(Course o1,Course o2)->{
			
			if(o1.fee()<o2.fee())
				return 1;
			else if(o1.fee()>o2.fee())
				return -1;
			
			return 0;
		};
		
		Comparator<Course> nameCompare=(Course o1,Course o2)->{
		return	o1.name().compareTo(o2.name());
		};
		 
		 
		 List<Course> rs=techCourses.stream().sorted(feesCompare).skip(5).toList();
		rs.forEach((x)->{
			System.out.println(x);
		});	
		System.out.println("--------------------");
		 List<Course> rs1=techCourses.stream().sorted(nameCompare).toList();
			rs1.forEach((x)->{
				System.out.println(x);
			});	
			*/
			
			Optional<Double> rs4=techCourses.stream().map((o)->{
				return o.fee();
			}).reduce(Double::sum);
		
			System.out.println(rs4.get());
			
			
			Map<Boolean,List<Course>> h1=new HashMap<>();
			
			 techCourses.stream().forEach((x)->{
				 
				 if(x.reviewScore()>=90)
					 System.out.println("true"+" "+x);
				 else
					 System.out.println("false"+" "+x);
			 
			 });
		
	}

}
