package aszka;

import aszka.dao.TeamDao;
import aszka.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

	@Autowired
	TeamDao teamDao;

	@RequestMapping("/teams")
	public List<Team> getTeams() {
		return teamDao.findAll();
	}

	@RequestMapping("/teams/{name}")
	public Team getTeam(@PathVariable String name) {
		return teamDao.findByName(name);
	}

}
