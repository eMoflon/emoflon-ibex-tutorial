package Hospital2Administration.cc.hipe.engine.actor.localsearch;

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

public class DocToStaffRule__CC_16_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	ConstraintChecker constraint_checker_1;
	ConstraintChecker constraint_checker_2;
	EdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	EdgeExplorer edge_explorer_4;
	EdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	EdgeExplorer edge_explorer_7;
	EdgeExplorer edge_explorer_8;
	NACExplorer nac_checker;
	NACExplorer nac_checker_0;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_4_2_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_5_2_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration nac_checker_orchestration;
	SearchOrchestration nac_checker_0_orchestration;
	
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_0 = new HashMap<>();
	private Map<OverlapMatch, Collection<HMatch>> overlap2matches_1 = new HashMap<>();
	
	@Override
	protected void initializeSearchComponents() {
		constraint_checker = new ConstraintChecker(this, this::constraint_checker_method);
		name2explorer.put("constraint_checker", constraint_checker);
		constraint_checker_0 = new ConstraintChecker(this, this::constraint_checker_0_method);
		name2explorer.put("constraint_checker_0", constraint_checker_0);
		constraint_checker_1 = new ConstraintChecker(this, this::constraint_checker_1_method);
		name2explorer.put("constraint_checker_1", constraint_checker_1);
		constraint_checker_2 = new ConstraintChecker(this, this::constraint_checker_2_method);
		name2explorer.put("constraint_checker_2", constraint_checker_2);
		EdgeLookupMethods edge_explorer_methods = new EdgeLookupMethods();
						edge_explorer_methods.multi_lookup = (o) -> ((HospitalExample.Hospital) o).getStaff().stream().filter(obj -> obj instanceof HospitalExample.Doctor).collect(Collectors.toList());
						edge_explorer_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Hospital) return edge_explorer_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer = new EdgeExplorer(this, 1, 4, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> ((Hospital2Administration.HospitalToAdministration) o).getSource();
						edge_explorer_3 = new CachedEdgeExplorer(this, 2, 1, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.multi_lookup = (o) -> ((AdministrationExample.Shiftplan) o).getShifts();
						edge_explorer_4_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Shiftplan) return edge_explorer_4_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_4 = new EdgeExplorer(this, 7, 6, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.multi_lookup = (o) -> ((AdministrationExample.Administration) o).getStaff();
						edge_explorer_5_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Administration) return edge_explorer_5_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_5 = new EdgeExplorer(this, 3, 5, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((Hospital2Administration.HospitalToAdministration) o).getTarget();
						edge_explorer_6 = new CachedEdgeExplorer(this, 2, 3, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> ((HospitalExample.Staff) o).getWorks();
						edge_explorer_7_methods.multi_opposite_lookup = (o) -> ((HospitalExample.Department) o).getStaff().stream().filter(obj -> obj instanceof HospitalExample.Doctor).collect(Collectors.toList());
						edge_explorer_7 = new EdgeExplorer(this, 4, 0, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.unique_lookup = (o) -> ((AdministrationExample.Staff) o).getShiftPlan();
						edge_explorer_8_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Staff) return o.equals(edge_explorer_8_methods.unique_lookup.apply(result)) ? result : null; else return null;};
						edge_explorer_8 = new EdgeExplorer(this, 5, 7, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {5,7}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
		nac_checker_0 = new NACExplorer(this, Arrays.asList(new Integer[] {6,7}), node.getAllOverlaps().get(1));
		name2explorer.put("nac_checker_0", nac_checker_0);
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
		edge_explorer_4_2_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_5_2_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		nac_checker_0_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DocToStaffRule__CC_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Department_object_SP2": 
				{
					
					// d
					HMatch match_0 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_7_1_orchestration, match_0);
				}
				break;
			case "Hospital_object_SP2": 
				{
					
					// h
					HMatch match_1 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_1_orchestration, match_1);
				}
				break;
			case "HospitalToAdministration_object_SP0": 
				{
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					
					// htov
					HMatch match_2 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_3_1_orchestration, match_2);
				}
				break;
			case "Administration_object_SP0": 
				{
					
					// v
					HMatch match_3 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_5_1_orchestration, match_3);
				}
				break;
			case "Doctor_object_SP0": 
				{
					
					// s1
					HMatch match_4 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_2_orchestration, match_4);
				}
				break;
			case "Staff_object_SP0": 
				{
					
					// s2
					HMatch match_5 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_5_2_orchestration, match_5);
				}
				break;
			case "Shift_object_SP0": 
				{
					
					// sh
					HMatch match_6 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_4_2_orchestration, match_6);
				}
				break;
			case "Shiftplan_object_SP0": 
				{
					
					// sp
					HMatch match_7 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					match_7.getNodes()[7] = objs[0];
					start(edge_explorer_4_1_orchestration, match_7);
				}
				break;
			case "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch": 
				{
					if(nac_checker.register(match)) {
						OverlapMatch acMatch_0 = new OverlapMatch(2);
						Object[] acMatch_nodes_0 = acMatch_0.getNodes();
						acMatch_nodes_0[0] = objs[0];
						acMatch_nodes_0[1] = objs[1];
						
						Collection<HMatch> o2Matches_0 = overlap2matches_0.get(acMatch_0);
						if(o2Matches_0 != null && !o2Matches_0.isEmpty()) {
							sendDeletedMatches(o2Matches_0);
							o2Matches_0.clear();
						}
					}
				}
				break;
			case "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch": 
				{
					if(nac_checker_0.register(match)) {
						OverlapMatch acMatch_1 = new OverlapMatch(2);
						Object[] acMatch_nodes_1 = acMatch_1.getNodes();
						acMatch_nodes_1[0] = objs[1];
						acMatch_nodes_1[1] = objs[0];
						
						Collection<HMatch> o2Matches_1 = overlap2matches_1.get(acMatch_1);
						if(o2Matches_1 != null && !o2Matches_1.isEmpty()) {
							sendDeletedMatches(o2Matches_1);
							o2Matches_1.clear();
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
			case "Department_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "Hospital_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "HospitalToAdministration_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Administration_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "Doctor_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "Staff_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "Shift_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			case "Shiftplan_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 7);
				break;
			case "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[5] = objs_0[0];
					acMatch_nodes_0[7] = objs_0[1];
					start(nac_checker_orchestration, acMatch_0);
				}
				break;
			case "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch": 
				if(nac_checker_0.deregister(match)) {
					HMatch acMatch_1 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
					Object[] acMatch_nodes_1 = acMatch_1.getNodes();
					Object[] objs_1 = match.getNodes();
					acMatch_nodes_1[6] = objs_1[1];
					acMatch_nodes_1[7] = objs_1[0];
					start(nac_checker_0_orchestration, acMatch_1);
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
		case "Hospital_staff_Staff": 
			if(msg.target instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[1] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			}
			
			if(msg.target instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[1] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			}
			
			if(msg.target instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[1] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			}
			
			break;
		case "HospitalToAdministration_source_Hospital": 
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Shiftplan_shifts_Shift": 
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[6] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[6] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[6] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Administration_staff_Staff": 
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "HospitalToAdministration_target_Administration": 
			{
				edge_explorer_6.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_6_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Staff_works_Department": 
			if(msg.source instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[4] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			}
			
			if(msg.source instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[4] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			}
			
			break;
		case "Staff_shiftPlan_Shiftplan": 
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
				Object[] objs = match.getNodes();
				objs[5] = msg.source;
				objs[7] = msg.target;
				currentDepth++;
				start(edge_explorer_8_0_orchestration, match);
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
		case "Hospital_staff_Staff": 
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[4].equals(msg.target))
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
						if(m.getNodes()[4].equals(msg.target))
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
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "HospitalToAdministration_source_Hospital": 
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
				break;
		case "Shiftplan_shifts_Shift": 
				Collection<HMatch> matches_5 = obj2matches.get(msg.source);
				if(matches_5 != null && !matches_5.isEmpty()) {
					Collection<HMatch> toBeRemoved_5 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_5) {
						if(m.getNodes()[6].equals(msg.target))
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
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_6.add(m);
					}
					if(!toBeRemoved_6.isEmpty()) {
						sendDeletedMatches(toBeRemoved_6);
					}
				}
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				break;
		case "Administration_staff_Staff": 
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				break;
		case "HospitalToAdministration_target_Administration": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				break;
		case "Staff_works_Department": 
				Collection<HMatch> matches_12 = obj2matches.get(msg.source);
				if(matches_12 != null && !matches_12.isEmpty()) {
					Collection<HMatch> toBeRemoved_12 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_12) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_12.add(m);
					}
					if(!toBeRemoved_12.isEmpty()) {
						sendDeletedMatches(toBeRemoved_12);
					}
				}
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "Staff_shiftPlan_Shiftplan": 
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
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
		// register DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[5];
		oMatch_Nodes_0[1] = objs[7];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_1 = new OverlapMatch(2);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[6];
		oMatch_Nodes_1[1] = objs[7];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 == null) {
			oMatches_1 = new HashSet<>();
			overlap2matches_1.put(oMatch_1, oMatches_1);
		}
		oMatches_1.add(match);
		
		
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
		
		// register htov
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register v
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
		
		// register s2
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register sh
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register sp
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[5];
		oMatch_Nodes_0[1] = objs[7];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_1 = new OverlapMatch(2);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[6];
		oMatch_Nodes_1[1] = objs[7];
		Collection<HMatch> oMatches_1 = overlap2matches_1.get(oMatch_1);
		if(oMatches_1 != null) {
			oMatches_1.remove(match);
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
		
		// deregister htov
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister v
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister s1
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister s2
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister sh
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister sp
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
		}
		
	}
	
	@Override
	protected void changeAttribute(AttributeChanged message) {
		initialMessage = message.initialMessage;

		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof HospitalExample.Doctor) {
			HMatch match_4 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
			match_4.getNodes()[4] = obj;
			Collection<HMatch> formerMatches_4 = obj2matches.get(obj);
			if(formerMatches_4 != null) {
				
				formerMatches_4 = formerMatches_4.stream().filter(m -> !constraint_checker_1.check(m) || !constraint_checker_2.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_4);
			}
			start(edge_explorer_2_orchestration, match_4);
		}
		if(obj instanceof AdministrationExample.Staff) {
			HMatch match_5 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
			match_5.getNodes()[5] = obj;
			Collection<HMatch> formerMatches_5 = obj2matches.get(obj);
			if(formerMatches_5 != null) {
				
				formerMatches_5 = formerMatches_5.stream().filter(m -> !constraint_checker.check(m) || !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_5);
			}
			start(edge_explorer_5_2_orchestration, match_5);
		}
		if(obj instanceof HospitalExample.Department) {
			HMatch match_0 = new LocalSearchMatch("DocToStaffRule__CC_16_localSearch", 8);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_7_1_orchestration, match_0);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_doctorsalary csp_4 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_doctorsalary();
		csp_4.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getSalary(), "double"));
		csp_4.solve();
		
		boolean predicate = csp_4.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		HospitalExample.Department d = (HospitalExample.Department) match.getNodes()[0];
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_5 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, d.getDID(), "int"));
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getDInt(), "int"));
		csp_5.solve();
		
		boolean predicate = csp_5.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_1_method(HMatch match) {
		HospitalExample.Doctor s1 = (HospitalExample.Doctor) match.getNodes()[4];
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[5];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_incrementingStaffID csp_6 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_incrementingStaffID();
		csp_6.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s1.getStaffID(), "int"));
		csp_6.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getStaffID(), "int"));
		csp_6.solve();
		
		boolean predicate = csp_6.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_2_method(HMatch match) {
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[5];
		HospitalExample.Doctor s1 = (HospitalExample.Doctor) match.getNodes()[4];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nametoname csp_7 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nametoname();
		csp_7.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, " ", "java.lang.String"));
		csp_7.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getFirstName(), "java.lang.String"));
		csp_7.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getLastName(), "java.lang.String"));
		csp_7.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s1.getName(), "java.lang.String"));
		csp_7.solve();
		
		boolean predicate = csp_7.isSatisfied();
		return predicate;
	}
	
	
}

