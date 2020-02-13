package ru.crabgore.interviewlesson1converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class ConverterTest {

    @Test
    public void ConvertToMS_Do_UnitTest() {
        ConvertTo convertTo = new ConvertToMS();
        float actual = convertTo.Do(5);
        assertThat(actual, is(1.3888888f));
    }
}
