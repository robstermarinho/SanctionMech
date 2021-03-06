package CaseStudy;

import java.util.Hashtable;

import jamder.Environment;
import jamder.Organization;
import jamder.norms.*;
import jamder.roles.AgentRole;



public class N3 extends Norm{
	//Construtor
	
	public N3 ( String name, 
				NormType normType, 
				AgentRole restrictAgentRoleClass, 
				Organization contextOrganizationClass, 
				NormAction action,
				Hashtable<String, NormConstraint> normConstraint,
				Hashtable<String, Norm> sactionPunishment){
		
		super(name, normType, restrictAgentRoleClass, contextOrganizationClass, action, normConstraint);
		setSactionPunishment(sactionPunishment);
	}

}