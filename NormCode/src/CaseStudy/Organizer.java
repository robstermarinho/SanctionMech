package CaseStudy;

import jamder.Organization;
import jamder.agents.GenericAgent;
import jamder.behavioural.Action;
import jamder.roles.AgentRole;
import jamder.roles.ProactiveAgentRole;

public class Organizer extends ProactiveAgentRole{

	public Organizer(String name, Organization owner, GenericAgent player) {
		super(name, owner, player);	
		addAction("submitPaper", new Action("submitPaper"));
		initialize();
	}

}
