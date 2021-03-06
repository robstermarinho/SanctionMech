package CaseStudyWessac;

import jamder.agents.GenericAgent;
import jamder.behavioural.Action;
import jamder.behavioural.Condition;
import jamder.norms.NormType;
import jamder.roles.AgentRole;

public class NextAction extends Action {
	private Condition cleft;
	private Condition cright;
	private Condition csuck;
	
	public NextAction(String name, Condition cleft, Condition cright, Condition csuck) {
		super(name);
		this.cleft=cleft;
		this.cright=cright;
		this.csuck=csuck;
	}

	@Override
	public void execute() {
		Place room;
		Object obj=((GenericAgent)getAgent()).getEnvironment().getObject("Place");
		if (obj instanceof Place){
			room=(Place)obj;
			if (room!=null){
				if (room.isDirty()){
					csuck.setValue(true);
					cright.setValue(false);
					cleft.setValue(false);
				}else{
					if (room.getName().equalsIgnoreCase("roomA")){
						csuck.setValue(false);
						cright.setValue(true);
						cleft.setValue(false);
					}else{
						if (room.getName().equalsIgnoreCase("roomB")){
							csuck.setValue(false);
							cright.setValue(false);
							cleft.setValue(true);
						}
					}
				}
	//			for (AgentRole iterable_element : getAllAgentRoles().values()) {
	//			}
			}
		}
	}

}
