package CaseStudy;

import java.util.Hashtable;

import jamder.Organization;
import jamder.norms.*;
import jamder.roles.AgentRole;


public class N1 extends Norm{
	//Construtor
	
	public N1 (String name, NormType normType, AgentRole restrictAgentRoleClass, Organization contextOrganizationClass, NormAction action,Hashtable<String, NormConstraint> normConstraint ){
		
		super(name, normType, restrictAgentRoleClass, contextOrganizationClass, action, normConstraint);
		
	}}
