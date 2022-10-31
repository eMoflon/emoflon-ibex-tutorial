package AdministrationTransformRule.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.function.BiFunction;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.AbstractCountJunctionActor;

import hipe.network.CountJunctionNode;

public class findTreatment_15_count extends AbstractCountJunctionActor{
	public static final int COUNT_findTreatment_treatment2treatment = 0;
	
	@SuppressWarnings("unchecked")
	@Override
	protected void initActor(InitGenActor m) {
		super.initActor(m);
		
		for(int i = 0; i<1; i++) {
			leftElements.add(HiPEMultiUtil.createMap());
			rightElements.add(HiPEMultiUtil.createMap());
			left2Right.add(HiPEMultiUtil.createMap());
		}
		num_of_constraints = 1;
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, CountJunctionNode node) {
		constraints.add(this::check_constraint_3);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("staff_production"), this::returnTrue , 0  , false ));
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
	
	public boolean check_constraint_3(HMatch match, int index) {
		boolean predicate = getCount(match, COUNT_findTreatment_treatment2treatment) < 3.0;
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

