package Hospital2Administration.integrate.hipe.engine.actor.localsearch;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.match.OverlapMatch;
import hipe.engine.match.LocalSearchMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;
import hipe.engine.message.production.MatchAdded;
import hipe.engine.message.production.MatchDeleted;
import hipe.engine.util.HiPEMultiUtil;

import hipe.network.LocalSearchNode;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;
import hipe.generic.actor.local.GenericLocalSearchActor;
import hipe.generic.actor.local.search.*;
import hipe.generic.actor.local.search.misc.*;

import org.eclipse.emf.ecore.EObject;

public class PatientInRoom__SRC_258_localSearch extends GenericLocalSearchActor{
	EdgeExplorer edge_explorer;
	EdgeExplorer edge_explorer_3;
	EdgeExplorer edge_explorer_4;
	NACExplorer nac_checker;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration nac_checker_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.multi_lookup = (o) -> ((HospitalExample.Department) o).getRooms();
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Department) return edge_explorer_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 0, 3, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.multi_lookup = (o) -> ((HospitalExample.Hospital) o).getDepartment();
						edge_explorer_3_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Hospital) return edge_explorer_3_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_3 = new EdgeExplorer(this, 1, 0, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.multi_lookup = (o) -> ((HospitalExample.Room) o).getLies();
						edge_explorer_4_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Room) return edge_explorer_4_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_4 = new EdgeExplorer(this, 3, 2, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {2}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PatientInRoom__FWD_263_localSearch"), this::returnTrue  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PatientInRoom__SRC_production"), this::returnTrue  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Department_object_SP0": 
				{
					
					// d
					HMatch match_0 = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_1_orchestration, match_0);
				}
				break;
			case "Hospital_object_SP3": 
				{
					
					// h
					HMatch match_1 = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_3_1_orchestration, match_1);
				}
				break;
			case "Patient_object_SP2": 
				{
					
					// p1
					HMatch match_2 = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_4_1_orchestration, match_2);
				}
				break;
			case "Room_object_SP2": 
				{
					
					// ro
					HMatch match_3 = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_2_orchestration, match_3);
				}
				break;
			case "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_247_localSearch": 
				{
					if(nac_checker.register(match)) {
						OverlapMatch acMatch_0 = new OverlapMatch(1);
						Object[] acMatch_nodes_0 = acMatch_0.getNodes();
						acMatch_nodes_0[0] = objs[1];
						
						Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
						if(o2Matches_0 != null && !o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removed(MatchDeleted<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		switch(match.creator) {
			case "Department_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "Hospital_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Patient_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Room_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC_247_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[2] = objs_0[1];
					start(nac_checker_orchestration, acMatch_0);
				}
				break;
			default: throw new RuntimeException("Detected unknown match from " + msg.input.creator);
		}
		
		msg.initialMessage.decrement();
	}
	
	@Override
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Department_rooms_Room": 
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[0] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[0] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[0] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Hospital_department_Department": 
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[1] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[1] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Room_lies_Patient": 
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("PatientInRoom__SRC_258_localSearch", 4);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Department_rooms_Room": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "Hospital_department_Department": 
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "Room_lies_Patient": 
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				break;
		}
		
		msg.initialMessage.decrement();
	}
	
	
	@Override
	protected void registerMatch(HMatch match) {
		allMatches.add(match);
		
		Object[] objs = match.getNodes();
		// register PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[2];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register d
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register h
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 == null) {
			matches_1 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[1], matches_1);
		}
		matches_1.add(match);
		
		// register p1
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register ro
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister PatientInRoom_p1_waits_incoming_SRC__FILTER_NAC_SRC
		OverlapMatch oMatch_0 = new OverlapMatch(1);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[2];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister d
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister h
		Collection<HMatch> matches_1 = obj2matches.get(objs[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
		
		// deregister p1
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister ro
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
				
	
}
