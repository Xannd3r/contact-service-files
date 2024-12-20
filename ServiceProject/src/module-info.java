module ServiceProject {
	
	exports com.contactservice;
	requires org.junit.jupiter.api;

}


/*
 * 
 * Below is the ravings of a madman, read if you want a look at my thought process
 * 
 * 
 /*  Note to self, deleting the module-info the is made by default and recreated it. This literally
 * fixed all the issues I was having with the the build path and import issues*/
 /*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *                      ================================================
 *                      =  	Runs: 21/21                                =
 *                      =  	Errors: 0                                  =
 *                      =  	Failures: 0                                =
 *                      =  	Test Coverage: 86.4%                       =
 *                      =  	Covered Instructions : 868                 =
 *                      =  	Missed Instructions : 137                  =
 *                      =  	Total Instructions 1005                    =
 *                      =  	TaskTest = pass                            =
 *                      =  	TaskServiceTest = pass                     =
 *                      =  	ContactServiceTest = pass                  =
 *                      =  	ContactTest = pass                         =
 *                      =  	AppointmentTest = pass                     =
 *                      =  	AppointmentServiceTest = pass              =
 *                      ================================================
 * 
 * 
 *                ============================================================
 *                                  Test Coverage Break-Down
 *                ============================================================
 * 
 * 
 * 
 * 
 * 
 *     ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 *                               :::::com.appointmentservice:::::
 *     ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 * 
 *                                  Coverage : 83.2
 *                                  Coverage Instructions : 327
 *                                  Missed Instructions : 66
 *                                  Total Instructions : 393
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *                            + + + + + Appointment.java + + + + +
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 *                    
 * 
 * 
 *                                    1 of 4 branches missed
 * 
 *            if (appointmentId == null || appointmentId.length() > 10) 1 of 4 branches missed
 *                throw new IllegalArgumentException("Invalid Appointment Date");
 *                          this.appointmentId = appointmentId;
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *                          + + + + + AppointmentService.java+ + + + +       
 *      -----------------------------------------------------------------------------------------
 * 
 *  
 * 
 * 	                                          All hit
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *                         + + + + + AppointmentServiceTest.java+ + + + +     
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 *     assertThrows(IllegalArgumentException.class, () -> service.addAppointment(appointment2));
 *       assertThrows(IllegalArgumentException.class, () -> service.deleteAppointment("99999"));
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *      
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 *                           + + + + +  AppointmentTest.java+ + + + + 
 *
 *
 *                       new Appointment(null, futureDate, "Description");
                              });
 *                       new Appointment("12345", pastDate, "Description");
                              });
 *                       new Appointment("12345", futureDate, null);
                               });
        
        
        
      
        
        
        
        
 * 
 *      |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 *                              :::::com.contactserviceservice:::::
 *      |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||| 
 * 
 * 
 *                                 Coverage : 85.3
 *                                 Coverage Instructions : 249
 *                                 Missed Instructions : 43
 *                                 Total Instructions : 292
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *      
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 *                    + + + + + Contact.java: 1 of 4 1 of 6 branches missed + + + + + 
 * 
 * 
 * 						if (contactId == null || contactId.length() > 10)
 *						 if (firstName == null || firstName.length() > 10)
            			throw new IllegalArgumentException("Invalid First Name");
        					if (lastName == null || lastName.length() > 10)
            		throw new IllegalArgumentException("Invalid Last Name");
        			if (phone == null || phone.length() != 10 || !phone.matches("\\d+"))
 * 				if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Invalid First Name");
 *					if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Invalid Last Name");           
 * 					if (phone == null || phone.length() != 10 || !phone.matches("\\d+"))
            throw new IllegalArgumentException("Invalid Phone Number");
 * 						if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Invalid Address");
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *     
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 *                   + + + + +  ContactService.java 1 of 2 branches missed+ + + + + 
 * 
 *  
 *  
 * if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
   if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found");
    if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }
        if (firstName != null) contact.setFirstName(firstName);
        if (lastName != null) contact.setLastName(lastName);
        if (phone != null) contact.setPhone(phone);
        if (address != null) contact.setAddress(address);                 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *      
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 *  
 * 
 * 
 *                        + + + + + ContactServiceTest.java+ + + + + 
 * 
 * 
 * 
 *                                            All Hit
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *      
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *                        + + + + + ContactTest.java+ + + + + 
 * 
 * 
 * 
 * 
 * 
 * new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
 * new Contact("12345", "John", "Doe", "12345", "123 Main St");
        });
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 *                             :::::com.taskservice:::::
 *      ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
 * 
 *                                 Coverage : 91.2
 *                                 Coverage Instructions : 292
 *                                 Missed Instructions : 28
 *                                 Total Instructions : 320
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *     
 *      -----------------------------------------------------------------------------------------
 * 
  
 * 
 * 
 *                   + + + + + Task.java+ + + + + : 2 of 4 Branches Missed
 * 
 * 
 * 
 * 
 *if (taskId == null || taskId.length() > 10)
 * if (name == null || name.length() > 20)
 * if (description == null || description.length() > 50)
 * if (name == null || name.length() > 20)
            throw new IllegalArgumentException("Invalid Task Name");
   if (description == null || description.length() > 50)
            throw new IllegalArgumentException("Invalid Task Description");         
            
            
            
     
            
            
            
            
            
 *      -----------------------------------------------------------------------------------------
 *      
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 *                    + + + + + TaskService.java+ + + + + 
 * 
 * 
 * 
 * 
 * if (tasks.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task ID already exists");
 * if (!tasks.containsKey(taskId)) {
            throw new IllegalArgumentException("Task ID not found");
 * if (task == null) {
            throw new IllegalArgumentException("Task ID not found");
        }
        if (name != null) task.setName(name);
        if (description != null) task.setDescription(description);
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *      -----------------------------------------------------------------------------------------
 *    
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 *                        + + + + + TaskServieceTest.java+ + + + + 
 * 
 * 
 * 
 * 
 * All Hit
 * 
 * 
 
 
 
 
 
 
 
 
 
 *      -----------------------------------------------------------------------------------------
 *      
 *      -----------------------------------------------------------------------------------------
 * 
 * 
 *
 * 
 * 
 * 
 *                                + + + + + TaskTest.java+ + + + + 
 * 
 * 
 * 
 * 
 * new Task(null, "Test Task", "This is a test description.");
        });
 * new Task("12345", "This name is way too long for a valid task name", "Description");
        });
 *  new Task("12345", "Task Name", null);
        });
 * 
 *
 *
 *
 *
 *
 *
 *
 *
 * 
 *                ============================================================
 *                              End of Test Coverage Break-Down
 *                ============================================================
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ...........................................................................
 *                          Clean this code up
 * ...........................................................................
 * 
 * ============================================================
 *                         Appointment.java
 * ============================================================
 * !!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!
 * 
 * 
 * public class Appointment {
    private final String appointmentId;
    private final Date appointmentDate;
    private final String description;

    public Appointment(String appointmentId, Date appointmentDate, String description) {
        if (appointmentId == null || appointmentId.length() > 10) {
            throw new IllegalArgumentException("Invalid Appointment ID");
        }
        if (appointmentDate == null || appointmentDate.before(new Date())) {
            throw new IllegalArgumentException("Invalid Appointment Date");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Invalid Appointment Description");
        }

        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.description = description;
    }
     
    
    
    
    
    =================================
 /* Contact.java
  * ==================================
 * !!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!
 * 
 * 
 * 
 * public class Contact {
    private final String contactId; // Unique ID
    private String firstName;       // First Name
    private String lastName;        // Last Name
    private String phone;           // Phone Number
    private String address;         // Address

    // Constructor
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

 * 
 * 
 * ====================================
 * Task.java
 * ====================================
 * !!!!!!!!!!!!!!DONE!!!!!!!!!!!!!!!!!!
 * 
 * 
 * 
 * public class Task {
	// The unique identifier for the task
    private final String taskId;
   // The name of the task
    private String name;
 // The description of the task
    private String description;

    // Constructor
    
    /**
     * Constructor to create a Task object with validation.
     * @param taskId Unique identifier for the task
     * @param name Name of the task
     * @param description Description of the task
     
    
    public Task(String taskId, String name, String description) {
        if (taskId == null || taskId.length() > 10) {
            throw new IllegalArgumentException("Task ID cannot be null or longer than 10 characters.");
        }
        if (name == null || name.length() > 20) {
            throw new IllegalArgumentException("Name cannot be null or longer than 20 characters.");
        }
        if (description == null || description.length() > 50) {
            throw new IllegalArgumentException("Description cannot be null or longer than 50 characters.");
        }

        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

 * 
 * 
 */


