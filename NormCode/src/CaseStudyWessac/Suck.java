package CaseStudyWessac;

import jamder.agents.GenericAgent;
import jamder.behavioural.Action;

public class Suck extends Action {

	public Suck(String name) {
		super(name);
	}

	@Override
	public void execute() {
		Place room;
		Object obj=((GenericAgent)getAgent()).getEnvironment().getObject("Place");
		if (obj instanceof Place){
			room=(Place)obj;
			room.setDirty(false);
			System.out.println("Suck "+room.getName());
		}
	}

}
