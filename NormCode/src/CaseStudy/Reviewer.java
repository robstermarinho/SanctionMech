package CaseStudy;

import jamder.Organization;
import jamder.agents.GenericAgent;
import jamder.behavioural.Action;
import jamder.structural.Belief;
import jamder.structural.LeafGoal;

public class Reviewer extends Organizer {
	
	public Reviewer(String name, Organization owner, GenericAgent player) {
		super(name, owner, player);	
		
		addBelief("name", new Belief("name", "String", "name"));
		addGoal("reviewPapers", new LeafGoal("reviewPapers", "String", "reviewPapers"));
		addAction("reviewPaper", new Action("reviewPaper"));
		
		initialize();
	}

}
