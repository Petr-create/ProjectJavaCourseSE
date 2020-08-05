package LessonTest;

import homework.compareto.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PersonTest {
    private Person man1;
    private Person man2;

    @Before
    public void createTwoPerson(){
        man1 = new Person("Nik", "Nikname", 20);
        man2 = new Person("Nik", "Nikname", 20);
    }
    @Test
    public void twoPersonShouldEqualNameAndSurname(){
        Assert.assertEquals(true, man1.equals(man2));
    }

    @Test
    public void shouldPersonToString(){
        Assert.assertEquals("Person ( name=Nik surname=Nikname age=20)", man1.toString());
    }
}
