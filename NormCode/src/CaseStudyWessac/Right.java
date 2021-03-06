package CaseStudyWessac;

import jamder.agents.GenericAgent;
import jamder.behavioural.Action;
import jamder.behavioural.Condition;
import jamder.norms.NormType;

public class Right extends Action {
	
	
	public Right(String name) {
		super(name);
	}

	public void execute() {
		Place room;
		Object obj=((GenericAgent)getAgent()).getEnvironment().getObject("Place");
		if (obj instanceof Place){
			room=(Place)obj;
			System.out.println("Right "+ room.getName());
			room.next();
		}
	}

}
