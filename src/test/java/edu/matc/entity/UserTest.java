package edu.matc.entity;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by kvang on 9/6/17.
 */
public class UserTest {

    private final Logger logger = Logger.getLogger(this.getClass());
    User user1;
    User user2;
    User user3;
    User user4;

    LocalDate now = LocalDate.now();


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void calculateAge() throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-d");
        String date1 = "1985-03-23";
        LocalDate testDateOfBirth1 = LocalDate.parse(date1, formatter);

        user1 = new User();
        user1.setDateOfBirth(testDateOfBirth1);
        long age1 = ChronoUnit.YEARS.between(user1.getDateOfBirth(),now);

        logger.info((int)age1);

        assertEquals(32,(int)age1);
        assertNotEquals(31, (int)age1);


        String date2 = "1988-05-20";
        LocalDate testDateOfBirth2 = LocalDate.parse(date2, formatter);
        user2 = new User();
        user2.setDateOfBirth(testDateOfBirth2);
        long age2 = ChronoUnit.YEARS.between(user2.getDateOfBirth(),now);

        logger.info((int)age2);

        assertEquals(29,(int)age2);
        assertNotEquals(30, (int)age2);

        String date3 = "2008-12-20";
        LocalDate testDateOfBirth3 = LocalDate.parse(date3, formatter);
        user3 = new User();
        user3.setDateOfBirth(testDateOfBirth3);
        long age3 = ChronoUnit.YEARS.between(user3.getDateOfBirth(),now);

        logger.info((int)age3);

        assertEquals(8,(int)age3);
        assertNotEquals(9, (int)age3);

        String date4 = "2015-04-13";
        LocalDate testDateOfBirth4 = LocalDate.parse(date4, formatter);
        user4 = new User();
        user4.setDateOfBirth(testDateOfBirth4);
        long age4 = ChronoUnit.YEARS.between(user4.getDateOfBirth(),now);

        logger.info((int)age4);

        assertEquals(2,(int)age4);
        assertNotEquals(3, (int)age4);
    }



}