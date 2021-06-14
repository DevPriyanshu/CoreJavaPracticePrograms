package callByValueAndCallByReference;


public class Priyansh 
	{
		public static void main(String[] args) 
		{
			Student s =new Student();
			s.login("anup", "123"); //call by value
			
			Student s1 = new Student();
			s1.setEmail("ak67");
			s1.setPassword("123");
			s1.loginStudent(s1); //call By reference
		}
	}

	class Student
	{
		private String email,password;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		public void login(String n, String p)
		{
			if(n.equals("ak67") && p.equals("123"))
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Failed");
			}
		}
		public void loginStudent(Student s) //Passing non-primitive data types
		{
			if(s.getEmail().equals("ak67") && s.getPassword().equals("123"))
			{
				System.out.println("Success");
			}
			else
			{
				System.out.println("Failed");
			}
		}
	}

