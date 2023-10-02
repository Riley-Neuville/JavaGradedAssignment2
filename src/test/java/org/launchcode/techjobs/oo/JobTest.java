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
    public void testEquals(){
        Employer employer = new Employer("Company");
        Location location = new Location("Place");
        PositionType positionType = new PositionType("BossMan");
        CoreCompetency coreCompetency = new CoreCompetency("Skillz");
        Job job1 = new Job("TestJob1",employer,location, positionType, coreCompetency);
        Job job2 = new Job("TestJob2",employer,location, positionType, coreCompetency);
        assertFalse(job1.equals(job2));
    }
}
