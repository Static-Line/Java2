
public class Hospital {

       public static void main (String[] args)

       { 
       
       Doctor doctor = new Doctor();

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