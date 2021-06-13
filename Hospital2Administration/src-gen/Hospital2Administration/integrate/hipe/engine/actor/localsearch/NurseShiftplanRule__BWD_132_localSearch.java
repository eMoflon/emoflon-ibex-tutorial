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

public class NurseShiftplanRule__BWD_132_localSearch extends GenericLocalSearchActor{
	EdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	EdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	CachedEdgeExplorer edge_explorer_7;
	PACExplorer pac_explorer;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_3_2_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_4_2_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration pac_explorer_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.multi_lookup = (o) -> ((HospitalExample.Room) o).getLies();
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Room) return edge_explorer_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 3, 0, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> ((Hospital2Administration.PatientToPatient) o).getTarget();
						edge_explorer_3 = new CachedEdgeExplorer(this, 2, 1, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> {EObject result = ((Hospital2Administration.StaffToStaff) o).getSource(); return (result instanceof HospitalExample.Nurse ? result : null);};
						edge_explorer_4 = new CachedEdgeExplorer(this, 6, 4, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> ((HospitalExample.Nurse) o).getResponsible();
						edge_explorer_5_methods.multi_opposite_lookup = (o) -> ((HospitalExample.Room) o).getNurses();
						edge_explorer_5 = new EdgeExplorer(this, 4, 3, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((Hospital2Administration.PatientToPatient) o).getSource();
						edge_explorer_6 = new CachedEdgeExplorer(this, 2, 0, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> ((Hospital2Administration.StaffToStaff) o).getTarget();
						edge_explorer_7 = new CachedEdgeExplorer(this, 6, 5, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		pac_explorer = new PACExplorer(this, Arrays.asList(new Integer[] {1,5,7,8}), node.getAllOverlaps().get(0));
		name2explorer.put("pac_explorer", pac_explorer);
	}
	
	@Override
	protected void initializeOrchestration() {
		edge_explorer_0_orchestration = initializeOrchestration(node.getOrchestrations().get(0).getPlan());
		edge_explorer_1_orchestration = initializeOrchestration(node.getOrchestrations().get(1).getPlan());
		edge_explorer_2_orchestration = initializeOrchestration(node.getOrchestrations().get(2).getPlan());
		edge_explorer_3_0_orchestration = initializeOrchestration(node.getOrchestrations().get(3).getPlan());
		edge_explorer_3_1_orchestration = initializeOrchestration(node.getOrchestrations().get(4).getPlan());
		edge_explorer_3_2_orchestration = initializeOrchestration(node.getOrchestrations().get(5).getPlan());
		edge_explorer_4_0_orchestration = initializeOrchestration(node.getOrchestrations().get(6).getPlan());
		edge_explorer_4_1_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_4_2_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		pac_explorer_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("NurseShiftplanRule__BWD_production"), this::returnTrue  , false ));
		ports.add(new PortJunction(node.getPorts().getPort().get(1), getSelf(), name2actor.get("NurseShiftplanRule__CONSISTENCY_148_localSearch"), this::returnTrue  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Patient_object_SP1": 
				{
					
					// p1
					HMatch match_0 = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_2_orchestration, match_0);
				}
				break;
			case "PatientToPatient_object_SP2": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					
					// pToP
					HMatch match_2 = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_3_1_orchestration, match_2);
				}
				break;
			case "Room_object_SP3": 
				{
					
					// ro
					HMatch match_3 = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_1_orchestration, match_3);
				}
				break;
			case "Nurse_object_SP0": 
				{
					
					// s1
					HMatch match_4 = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_4_2_orchestration, match_4);
				}
				break;
			case "StaffToStaff_object_SP0": 
				{
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_7.registerSourceObject(objs[0]);
					
					// sToS
					HMatch match_6 = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_4_1_orchestration, match_6);
				}
				break;
			case "NurseShiftplanRule__TRG_127_localSearch": 
				{
					if(pac_explorer.register(match)) {
						HMatch acMatch_0 = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
						acMatch_0.getNodes()[1] = objs[0];
						acMatch_0.getNodes()[5] = objs[1];
						acMatch_0.getNodes()[7] = objs[2];
						acMatch_0.getNodes()[8] = objs[3];
						
						// start search
						currentDepth++;
						start(pac_explorer_orchestration, acMatch_0);
						currentDepth--;
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
			case "Patient_object_SP1": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "PatientToPatient_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Room_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "Nurse_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "StaffToStaff_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			case "NurseShiftplanRule__TRG_127_localSearch": 
				if(pac_explorer.deregister(match)) {
					OverlapMatch acMatch_0 = new OverlapMatch(4);
					acMatch_0.getNodes()[0] = match.getNodes()[0];
					acMatch_0.getNodes()[1] = match.getNodes()[1];
					acMatch_0.getNodes()[2] = match.getNodes()[2];
					acMatch_0.getNodes()[3] = match.getNodes()[3];
					Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
					if(o2Matches_0 != null) {
						if(!o2Matches_0.isEmpty()) {
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
	protected void addReference(ReferenceAdded msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "Room_lies_Patient": 
			{
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "PatientToPatient_target_Patient": 
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "StaffToStaff_source_Staff": 
			if(msg.target instanceof HospitalExample.Nurse) {
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			}
			
			if(msg.target instanceof HospitalExample.Nurse) {
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			}
			
			if(msg.target instanceof HospitalExample.Nurse) {
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			}
			
			break;
		case "Nurse_responsible_Room": 
			{
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[4] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "PatientToPatient_source_Patient": 
			{
				edge_explorer_6.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_6_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "StaffToStaff_target_Staff": 
			{
				edge_explorer_7.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_7.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("NurseShiftplanRule__BWD_132_localSearch", 9);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
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
		case "Room_lies_Patient": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[0].equals(msg.target))
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
						if(m.getNodes()[0].equals(msg.target))
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
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "PatientToPatient_target_Patient": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_3.add(m);
					}
					if(!toBeRemoved_3.isEmpty()) {
						sendDeletedMatches(toBeRemoved_3);
					}
				}
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_4 = obj2matches.get(msg.source);
				if(matches_4 != null && !matches_4.isEmpty()) {
					Collection<HMatch> toBeRemoved_4 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_4) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_5.add(m);
					}
					if(!toBeRemoved_5.isEmpty()) {
						sendDeletedMatches(toBeRemoved_5);
					}
				}
				break;
		case "StaffToStaff_source_Staff": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_6 = obj2matches.get(msg.source);
				if(matches_6 != null && !matches_6.isEmpty()) {
					Collection<HMatch> toBeRemoved_6 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_6) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				break;
		case "Nurse_responsible_Room": 
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				break;
		case "PatientToPatient_source_Patient": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "StaffToStaff_target_Staff": 
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				edge_explorer_7.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
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
		// register NurseShiftplanRule__TRG
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[1];
		oMatch_Nodes_0[1] = objs[5];
		oMatch_Nodes_0[2] = objs[7];
		oMatch_Nodes_0[3] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		
		// register p1
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 == null) {
			matches_0 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[0], matches_0);
		}
		matches_0.add(match);
		
		// register pToP
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
		
		// register s1
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register sToS
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister NurseShiftplanRule__TRG
		OverlapMatch oMatch_0 = new OverlapMatch(4);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[1];
		oMatch_Nodes_0[1] = objs[5];
		oMatch_Nodes_0[2] = objs[7];
		oMatch_Nodes_0[3] = objs[8];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister p1
		Collection<HMatch> matches_0 = obj2matches.get(objs[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		
		// deregister pToP
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister ro
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister s1
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister sToS
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
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

