package AdministrationTransformRule.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.JunctionNode;

public class patientCovered_17_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_2);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("patientCovered_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_2(HMatch match, int index) {
		AdministrationExample.Staff s1 = (AdministrationExample.Staff) match.getNodes()[0];
		AdministrationExample.Shiftplan shiftPlan = (AdministrationExample.Shiftplan) match.getNodes()[6];
		AdministrationExample.Shift earlyshift = (AdministrationExample.Shift) match.getNodes()[8];
		AdministrationExample.Shiftplan shiftPlan2 = (AdministrationExample.Shiftplan) match.getNodes()[2];
		AdministrationExample.Shift nightshift = (AdministrationExample.Shift) match.getNodes()[7];
		AdministrationExample.Staff s = (AdministrationExample.Staff) match.getNodes()[5];
		AdministrationExample.Shift lateshift = (AdministrationExample.Shift) match.getNodes()[3];
		boolean predicate = !earlyshift.equals(lateshift) && !lateshift.equals(nightshift) && !s.equals(s1) && !shiftPlan.equals(shiftPlan2);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

