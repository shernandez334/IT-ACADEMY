package Module4.L2exercise2;

import Module4_Testing.L2exercise2.Person;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestObjects {
    @Test
    public void testEqualObjects(){
        Person person1 = new Person("David", 34);
        Person person2 = person1;
        Assertions.assertThat(person1).isSameAs(person2);
    }

    @Test
    public void testNotEqualObjects(){
        Person person1 = new Person("David", 43);
        Person person2 = new Person("David", 43);
        Assertions.assertThat(person1).isNotSameAs(person2);
    }
}
