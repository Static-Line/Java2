Hospital.java:

public class Hospital {

       public static void main (String[] args)

       { Doctor doctor = new Doctor();

       Nurse nurse = new Nurse();

       Administrator administrator = new Administrator();

       Surgeon surgeon = new Surgeon();

       Receptionist receptionist = new Receptionist();

       Janitor janitor = new Janitor();

       doctor.diagnose();

       nurse.care();

       administrator.budget();

       surgeon.operate();

       receptionist.type();

       receptionist.call();

       janitor.clean();

       }
   }

Doctor.java:

public class Doctor {
   public void diagnose()

   {

   System.out.println ("Doctor will check the patients");

   }
   }

Nurse.java:

public class Nurse {
   public void care() {

       System.out.println ("Nurse will care about patients");

       }

       }

Administrator .java:

public class Administrator {
   public void budget() {

       System.out.println ("Administrator will prepare financial budgets");

       }

       }

Surgeon.java:

public class Surgeon {
   public void operate()
   {
       System.out.println ("Surgeon will operate the patients");

   }

   }

Receptionist.java:

public class Receptionist {
  
   public void type() {
System.out.println ("Receptionist will type");

   }
   public void call() {

   System.out.println ("Receptionist will lift the calls");

   }

   }

Janitor.java:

public class Janitor {
   public void clean() {

   System.out.println ("Janitor will clean the hospital");

   }

   }