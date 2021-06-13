package Hospital2Administration.initbwd.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.network.ObjectNode;

import hipe.generic.actor.GenericObjectActor;

import hipe.generic.actor.junction.util.HiPEConfig;
		
public class Staff_object_SP2 extends GenericObjectActor<AdministrationExample.Staff> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<AdministrationExample.Staff>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_1_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeMatch<AdministrationExample.Staff>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("DoctorToPatient_t_treatment_incoming_TRG__FILTER_NAC_TRG_37_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeLeft<AdministrationExample.Staff>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("Staff_shiftPlan_1_reference"), this::check_constraint_12 , 0   ));
	}
	
	public boolean check_constraint_12(AdministrationExample.Staff s2, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nursesalary csp_4 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nursesalary();
		csp_4.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getSalary(), "double"));
		csp_4.solve();
		
		return csp_4.isSatisfied();
	}
	
}


