package tn.esprit.spring.service;

import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IMissionService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionServiceImplTest {

	@Autowired
	IMissionService ms; 

	/*@Test
	public void testRetrieveAllMissions() {
		List<Mission> listMissions = ms.retrieveAllMissions(); 
		// if there are 7 users in DB : 
		Assert.assertEquals(2, listMissions.size());
	}*/
	
	
	@Test
	public void testAddMission() throws ParseException {

		Mission m = new Mission("Souleima", "etudiant a esprit"); 
		Mission missionAdded = ms.addMission(m); 
		Assert.assertEquals(m.getName(), missionAdded.getName());
	}
 
	@Test
	public void testModifyUser() throws ParseException   {

		Mission m = new Mission("Souleima89", "esprit etud"); 
		Mission missionUpdated  = ms.updateMission(m); 
		Assert.assertEquals(m.getName(), missionUpdated.getName());
	}

	/*@Test
	public void testRetrieveMission() {
		Mission missionRetrieved = ms.retrieveMission("1"); 
		Assert.assertEquals(1L, missionRetrieved.getId().longValue());
	}*/
	
	/*@Test
	public void testDeleteMission() {
		ms.deleteMission("0");
		Assert.assertNull(ms.retrieveMission("0"));
	}*/
	
}
