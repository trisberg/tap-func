package functions;

import org.junit.jupiter.api.Test;

import functions.models.Employee;
import functions.models.Person;

public class HireTests {
  
  @Test
  public void testNameCase() throws Exception {

    Person input = new Person();
    input.setFirstName("john");
    input.setLastName("doe");

    Employee output = new Hire().apply(input);

    assert(output.getPerson().getFirstName().equals("John"));
    assert(output.getPerson().getLastName().equals("Doe"));
  }

}
