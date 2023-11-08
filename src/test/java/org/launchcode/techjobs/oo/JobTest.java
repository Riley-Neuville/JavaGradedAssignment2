package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Employer employer = new Employer("Company");
        Location location = new Location("Place");
        PositionType positionType = new PositionType("BossMan");
        CoreCompetency coreCompetency = new CoreCompetency("Skillz");
        Job job1 = new Job("TestJob1",employer,location, positionType, coreCompetency);
        Job job2 = new Job("TestJob2",employer,location, positionType, coreCompetency);
        boolean comparison = job1.getId() == job2.getId();
        assertFalse(comparison);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Product tester", job1.getName());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());


    }




    @Test
    public void testJobsForEquality(){
        Employer employer = new Employer("Company");
        Location location = new Location("Place");
        PositionType positionType = new PositionType("BossMan");
        CoreCompetency coreCompetency = new CoreCompetency("Skillz");
        Job job1 = new Job("TestJob1",employer,location, positionType, coreCompetency);
        Job job2 = new Job("TestJob1",employer,location, positionType, coreCompetency);
        assertFalse(job1.equals(job2));
        //comment
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Employer employer = new Employer("Company");
        Location location = new Location("Place");
        PositionType positionType = new PositionType("BossMan");
        CoreCompetency coreCompetency = new CoreCompetency("Skillz");
        Job job1 = new Job("TestJob1",employer,location, positionType, coreCompetency);
        assertTrue(job1.toString().startsWith(System.lineSeparator()));
        assertTrue(job1.toString().endsWith(System.lineSeparator()));
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Employer employer = new Employer("Company");
        Location location = new Location("Place");
        PositionType positionType = new PositionType("BossMan");
        CoreCompetency coreCompetency = new CoreCompetency("Skillz");
        Job job1 = new Job("TestJob1", employer, location, positionType, coreCompetency);
        assertEquals(job1.toString(),
                System.lineSeparator() + """
                        ID:\s""" + job1.getId() + """
                                                
                        Name: TestJob1
                        Employer: Company
                        Location: Place
                        Position Type: BossMan
                        Core Competency: Skillz""" + System.lineSeparator());
    }
    @Test
            public void testToStringHandlesEmptyField() {
        Employer employer2 = new Employer("");
        Location location2 = new Location("");
        PositionType positionType2 = new PositionType("");
        CoreCompetency coreCompetency2 = new CoreCompetency("");
        Job job2 = new Job("TestJob2", employer2, location2, positionType2, coreCompetency2);
        assertEquals(job2.toString(),
                System.lineSeparator() + """
                        ID:\s""" + job2.getId() + """
                                                
                        Name: TestJob2
                        Employer: Data not available
                        Location: Data not available
                        Position Type: Data not available
                        Core Competency: Data not available""" + System.lineSeparator());
    }
    @Test
            public void TestToStringHandlesEmptyFieldExists(){
        Employer employer2 = new Employer("");
        Location location2 = new Location("");
        PositionType positionType2 = new PositionType("");
        CoreCompetency coreCompetency2 = new CoreCompetency("");
        Job job3 = new Job("",employer2,location2, positionType2, coreCompetency2);
        assertEquals(job3.toString(), "OOPS! This job does not seem to exist.");
    }
}
