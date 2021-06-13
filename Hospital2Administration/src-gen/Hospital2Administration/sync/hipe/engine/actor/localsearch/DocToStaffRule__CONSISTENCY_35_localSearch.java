package Hospital2Administration.sync.hipe.engine.actor.localsearch;

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

public class DocToStaffRule__CONSISTENCY_35_localSearch extends GenericLocalSearchActor{
	ConstraintChecker constraint_checker;
	ConstraintChecker constraint_checker_0;
	ConstraintChecker constraint_checker_1;
	ConstraintChecker constraint_checker_2;
	CachedEdgeExplorer edge_explorer;
	CachedEdgeExplorer edge_explorer_3;
	CachedEdgeExplorer edge_explorer_4;
	CachedEdgeExplorer edge_explorer_5;
	CachedEdgeExplorer edge_explorer_6;
	EdgeExplorer edge_explorer_7;
	EdgeExplorer edge_explorer_8;
	CachedEdgeExplorer edge_explorer_9;
	CachedEdgeExplorer edge_explorer_10;
	EdgeExplorer edge_explorer_11;
	EdgeExplorer edge_explorer_12;
	CachedEdgeExplorer edge_explorer_13;
	CachedEdgeExplorer edge_explorer_14;
	CachedEdgeExplorer edge_explorer_15;
	CachedEdgeExplorer edge_explorer_16;
	EdgeExplorer edge_explorer_17;
	CachedEdgeExplorer edge_explorer_18;
	CachedEdgeExplorer edge_explorer_19;
	NACExplorer nac_checker;
	NACExplorer nac_checker_0;
	
	SearchOrchestration edge_explorer_0_orchestration;
	SearchOrchestration edge_explorer_1_orchestration;
	SearchOrchestration edge_explorer_2_orchestration;
	SearchOrchestration edge_explorer_3_0_orchestration;
	SearchOrchestration edge_explorer_3_1_orchestration;
	SearchOrchestration edge_explorer_4_0_orchestration;
	SearchOrchestration edge_explorer_4_1_orchestration;
	SearchOrchestration edge_explorer_5_0_orchestration;
	SearchOrchestration edge_explorer_5_1_orchestration;
	SearchOrchestration edge_explorer_5_2_orchestration;
	SearchOrchestration edge_explorer_6_0_orchestration;
	SearchOrchestration edge_explorer_6_1_orchestration;
	SearchOrchestration edge_explorer_7_0_orchestration;
	SearchOrchestration edge_explorer_7_1_orchestration;
	SearchOrchestration edge_explorer_8_0_orchestration;
	SearchOrchestration edge_explorer_9_0_orchestration;
	SearchOrchestration edge_explorer_10_0_orchestration;
	SearchOrchestration edge_explorer_11_0_orchestration;
	SearchOrchestration edge_explorer_11_1_orchestration;
	SearchOrchestration edge_explorer_12_0_orchestration;
	SearchOrchestration edge_explorer_13_0_orchestration;
	SearchOrchestration edge_explorer_14_0_orchestration;
	SearchOrchestration edge_explorer_14_1_orchestration;
	SearchOrchestration edge_explorer_15_0_orchestration;
	SearchOrchestration edge_explorer_16_0_orchestration;
	SearchOrchestration edge_explorer_17_0_orchestration;
	SearchOrchestration edge_explorer_18_0_orchestration;
	SearchOrchestration edge_explorer_19_0_orchestration;
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
						edge_explorer_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCREATE__TRG__sp();
						edge_explorer = new CachedEdgeExplorer(this, 9, 5, edge_explorer_methods);
		name2explorer.put("edge_explorer", edge_explorer);
		EdgeLookupMethods edge_explorer_3_methods = new EdgeLookupMethods();
						edge_explorer_3_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCREATE__CORR__stot();
						edge_explorer_3 = new CachedEdgeExplorer(this, 9, 8, edge_explorer_3_methods);
		name2explorer.put("edge_explorer_3", edge_explorer_3);
		EdgeLookupMethods edge_explorer_4_methods = new EdgeLookupMethods();
						edge_explorer_4_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCREATE__SRC__s1();
						edge_explorer_4 = new CachedEdgeExplorer(this, 9, 2, edge_explorer_4_methods);
		name2explorer.put("edge_explorer_4", edge_explorer_4);
		EdgeLookupMethods edge_explorer_5_methods = new EdgeLookupMethods();
						edge_explorer_5_methods.unique_lookup = (o) -> ((Hospital2Administration.HospitalToAdministration) o).getSource();
						edge_explorer_5 = new CachedEdgeExplorer(this, 7, 1, edge_explorer_5_methods);
		name2explorer.put("edge_explorer_5", edge_explorer_5);
		EdgeLookupMethods edge_explorer_6_methods = new EdgeLookupMethods();
						edge_explorer_6_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCONTEXT__TRG__v();
						edge_explorer_6 = new CachedEdgeExplorer(this, 9, 6, edge_explorer_6_methods);
		name2explorer.put("edge_explorer_6", edge_explorer_6);
		EdgeLookupMethods edge_explorer_7_methods = new EdgeLookupMethods();
						edge_explorer_7_methods.unique_lookup = (o) -> ((AdministrationExample.Staff) o).getShiftPlan();
						edge_explorer_7_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Staff) return o.equals(edge_explorer_7_methods.unique_lookup.apply(result)) ? result : null; else return null;};
						edge_explorer_7 = new EdgeExplorer(this, 3, 5, edge_explorer_7_methods);
		name2explorer.put("edge_explorer_7", edge_explorer_7);
		EdgeLookupMethods edge_explorer_8_methods = new EdgeLookupMethods();
						edge_explorer_8_methods.multi_lookup = (o) -> ((HospitalExample.Hospital) o).getStaff().stream().filter(obj -> obj instanceof HospitalExample.Doctor).collect(Collectors.toList());
						edge_explorer_8_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof HospitalExample.Hospital) return edge_explorer_8_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_8 = new EdgeExplorer(this, 1, 2, edge_explorer_8_methods);
		name2explorer.put("edge_explorer_8", edge_explorer_8);
		EdgeLookupMethods edge_explorer_9_methods = new EdgeLookupMethods();
						edge_explorer_9_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCONTEXT__CORR__htov();
						edge_explorer_9 = new CachedEdgeExplorer(this, 9, 7, edge_explorer_9_methods);
		name2explorer.put("edge_explorer_9", edge_explorer_9);
		EdgeLookupMethods edge_explorer_10_methods = new EdgeLookupMethods();
						edge_explorer_10_methods.unique_lookup = (o) -> ((Hospital2Administration.StaffToStaff) o).getTarget();
						edge_explorer_10 = new CachedEdgeExplorer(this, 8, 3, edge_explorer_10_methods);
		name2explorer.put("edge_explorer_10", edge_explorer_10);
		EdgeLookupMethods edge_explorer_11_methods = new EdgeLookupMethods();
						edge_explorer_11_methods.unique_lookup = (o) -> ((HospitalExample.Staff) o).getWorks();
						edge_explorer_11_methods.multi_opposite_lookup = (o) -> ((HospitalExample.Department) o).getStaff().stream().filter(obj -> obj instanceof HospitalExample.Doctor).collect(Collectors.toList());
						edge_explorer_11 = new EdgeExplorer(this, 2, 0, edge_explorer_11_methods);
		name2explorer.put("edge_explorer_11", edge_explorer_11);
		EdgeLookupMethods edge_explorer_12_methods = new EdgeLookupMethods();
						edge_explorer_12_methods.multi_lookup = (o) -> ((AdministrationExample.Administration) o).getStaff();
						edge_explorer_12_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Administration) return edge_explorer_12_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_12 = new EdgeExplorer(this, 6, 3, edge_explorer_12_methods);
		name2explorer.put("edge_explorer_12", edge_explorer_12);
		EdgeLookupMethods edge_explorer_13_methods = new EdgeLookupMethods();
						edge_explorer_13_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCONTEXT__SRC__d();
						edge_explorer_13 = new CachedEdgeExplorer(this, 9, 0, edge_explorer_13_methods);
		name2explorer.put("edge_explorer_13", edge_explorer_13);
		EdgeLookupMethods edge_explorer_14_methods = new EdgeLookupMethods();
						edge_explorer_14_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCREATE__TRG__sh();
						edge_explorer_14 = new CachedEdgeExplorer(this, 9, 4, edge_explorer_14_methods);
		name2explorer.put("edge_explorer_14", edge_explorer_14);
		EdgeLookupMethods edge_explorer_15_methods = new EdgeLookupMethods();
						edge_explorer_15_methods.unique_lookup = (o) -> ((Hospital2Administration.HospitalToAdministration) o).getTarget();
						edge_explorer_15 = new CachedEdgeExplorer(this, 7, 6, edge_explorer_15_methods);
		name2explorer.put("edge_explorer_15", edge_explorer_15);
		EdgeLookupMethods edge_explorer_16_methods = new EdgeLookupMethods();
						edge_explorer_16_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCONTEXT__SRC__h();
						edge_explorer_16 = new CachedEdgeExplorer(this, 9, 1, edge_explorer_16_methods);
		name2explorer.put("edge_explorer_16", edge_explorer_16);
		EdgeLookupMethods edge_explorer_17_methods = new EdgeLookupMethods();
						edge_explorer_17_methods.multi_lookup = (o) -> ((AdministrationExample.Shiftplan) o).getShifts();
						edge_explorer_17_methods.unique_opposite_lookup = (o) -> {EObject result = ((EObject) o).eContainer(); if(result instanceof AdministrationExample.Shiftplan) return edge_explorer_17_methods.multi_lookup.apply(result).contains(o) ? result : null; else return null;};
						edge_explorer_17 = new EdgeExplorer(this, 5, 4, edge_explorer_17_methods);
		name2explorer.put("edge_explorer_17", edge_explorer_17);
		EdgeLookupMethods edge_explorer_18_methods = new EdgeLookupMethods();
						edge_explorer_18_methods.unique_lookup = (o) -> ((Hospital2Administration.DocToStaffRule__Marker) o).getCREATE__TRG__s2();
						edge_explorer_18 = new CachedEdgeExplorer(this, 9, 3, edge_explorer_18_methods);
		name2explorer.put("edge_explorer_18", edge_explorer_18);
		EdgeLookupMethods edge_explorer_19_methods = new EdgeLookupMethods();
						edge_explorer_19_methods.unique_lookup = (o) -> {EObject result = ((Hospital2Administration.StaffToStaff) o).getSource(); return (result instanceof HospitalExample.Doctor ? result : null);};
						edge_explorer_19 = new CachedEdgeExplorer(this, 8, 2, edge_explorer_19_methods);
		name2explorer.put("edge_explorer_19", edge_explorer_19);
		nac_checker = new NACExplorer(this, Arrays.asList(new Integer[] {3,5}), node.getAllOverlaps().get(0));
		name2explorer.put("nac_checker", nac_checker);
		nac_checker_0 = new NACExplorer(this, Arrays.asList(new Integer[] {4,5}), node.getAllOverlaps().get(1));
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
		edge_explorer_5_0_orchestration = initializeOrchestration(node.getOrchestrations().get(7).getPlan());
		edge_explorer_5_1_orchestration = initializeOrchestration(node.getOrchestrations().get(8).getPlan());
		edge_explorer_5_2_orchestration = initializeOrchestration(node.getOrchestrations().get(9).getPlan());
		edge_explorer_6_0_orchestration = initializeOrchestration(node.getOrchestrations().get(10).getPlan());
		edge_explorer_6_1_orchestration = initializeOrchestration(node.getOrchestrations().get(11).getPlan());
		edge_explorer_7_0_orchestration = initializeOrchestration(node.getOrchestrations().get(12).getPlan());
		edge_explorer_7_1_orchestration = initializeOrchestration(node.getOrchestrations().get(13).getPlan());
		edge_explorer_8_0_orchestration = initializeOrchestration(node.getOrchestrations().get(14).getPlan());
		edge_explorer_9_0_orchestration = initializeOrchestration(node.getOrchestrations().get(15).getPlan());
		edge_explorer_10_0_orchestration = initializeOrchestration(node.getOrchestrations().get(16).getPlan());
		edge_explorer_11_0_orchestration = initializeOrchestration(node.getOrchestrations().get(17).getPlan());
		edge_explorer_11_1_orchestration = initializeOrchestration(node.getOrchestrations().get(18).getPlan());
		edge_explorer_12_0_orchestration = initializeOrchestration(node.getOrchestrations().get(19).getPlan());
		edge_explorer_13_0_orchestration = initializeOrchestration(node.getOrchestrations().get(20).getPlan());
		edge_explorer_14_0_orchestration = initializeOrchestration(node.getOrchestrations().get(21).getPlan());
		edge_explorer_14_1_orchestration = initializeOrchestration(node.getOrchestrations().get(22).getPlan());
		edge_explorer_15_0_orchestration = initializeOrchestration(node.getOrchestrations().get(23).getPlan());
		edge_explorer_16_0_orchestration = initializeOrchestration(node.getOrchestrations().get(24).getPlan());
		edge_explorer_17_0_orchestration = initializeOrchestration(node.getOrchestrations().get(25).getPlan());
		edge_explorer_18_0_orchestration = initializeOrchestration(node.getOrchestrations().get(26).getPlan());
		edge_explorer_19_0_orchestration = initializeOrchestration(node.getOrchestrations().get(27).getPlan());
		nac_checker_orchestration = initializeOrchestration(node.getOrchestrations().get(28).getPlan());
		nac_checker_0_orchestration = initializeOrchestration(node.getOrchestrations().get(29).getPlan());
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor) {
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DocToStaffRule__CONSISTENCY_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void added(MatchAdded<HMatch> msg) {
		initialMessage = msg.initialMessage;

		HMatch match = msg.input;
		Object[] objs = match.getNodes();
		switch(match.creator) {
			case "Department_object_SP3": 
				{
					
					// d
					HMatch match_0 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_0.getNodes()[0] = objs[0];
					start(edge_explorer_11_1_orchestration, match_0);
				}
				break;
			case "Hospital_object_SP3": 
				{
					
					// h
					HMatch match_1 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_1.getNodes()[1] = objs[0];
					start(edge_explorer_5_2_orchestration, match_1);
				}
				break;
			case "Doctor_object_SP0": 
				{
					
					// s1
					HMatch match_2 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_2.getNodes()[2] = objs[0];
					start(edge_explorer_4_1_orchestration, match_2);
				}
				break;
			case "Staff_object_SP3": 
				{
					
					// s2
					HMatch match_3 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_3.getNodes()[3] = objs[0];
					start(edge_explorer_7_1_orchestration, match_3);
				}
				break;
			case "Shift_object_SP2": 
				{
					
					// sh
					HMatch match_4 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_4.getNodes()[4] = objs[0];
					start(edge_explorer_14_1_orchestration, match_4);
				}
				break;
			case "Shiftplan_object_SP0": 
				{
					
					// sp
					HMatch match_5 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_5.getNodes()[5] = objs[0];
					start(edge_explorer_2_orchestration, match_5);
				}
				break;
			case "Administration_object_SP2": 
				{
					
					// v
					HMatch match_6 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_6.getNodes()[6] = objs[0];
					start(edge_explorer_6_1_orchestration, match_6);
				}
				break;
			case "HospitalToAdministration_object_SP2": 
				{
					edge_explorer_5.registerSourceObject(objs[0]);
					edge_explorer_15.registerSourceObject(objs[0]);
					
					// htov
					HMatch match_7 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_7.getNodes()[7] = objs[0];
					start(edge_explorer_5_1_orchestration, match_7);
				}
				break;
			case "StaffToStaff_object_SP0": 
				{
					edge_explorer_10.registerSourceObject(objs[0]);
					edge_explorer_19.registerSourceObject(objs[0]);
					
					// stot
					HMatch match_8 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_8.getNodes()[8] = objs[0];
					start(edge_explorer_3_1_orchestration, match_8);
				}
				break;
			case "DocToStaffRule__Marker_object": 
				{
					edge_explorer.registerSourceObject(objs[0]);
					edge_explorer_3.registerSourceObject(objs[0]);
					edge_explorer_4.registerSourceObject(objs[0]);
					edge_explorer_6.registerSourceObject(objs[0]);
					edge_explorer_9.registerSourceObject(objs[0]);
					edge_explorer_13.registerSourceObject(objs[0]);
					edge_explorer_14.registerSourceObject(objs[0]);
					edge_explorer_16.registerSourceObject(objs[0]);
					edge_explorer_18.registerSourceObject(objs[0]);
					
					// DocToStaffRule_eMoflon_ProtocolNode
					HMatch match_9 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					match_9.getNodes()[9] = objs[0];
					start(edge_explorer_1_orchestration, match_9);
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
			case "Department_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 0);
				break;
			case "Hospital_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 1);
				break;
			case "Doctor_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 2);
				break;
			case "Staff_object_SP3": 
				removeMatchesUsedBy(match.getNodes()[0], 3);
				break;
			case "Shift_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 4);
				break;
			case "Shiftplan_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 5);
				break;
			case "Administration_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 6);
				break;
			case "HospitalToAdministration_object_SP2": 
				removeMatchesUsedBy(match.getNodes()[0], 7);
				break;
			case "StaffToStaff_object_SP0": 
				removeMatchesUsedBy(match.getNodes()[0], 8);
				break;
			case "DocToStaffRule__Marker_object": 
				removeMatchesUsedBy(match.getNodes()[0], 9);
				break;
			case "DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG_8_localSearch": 
				if(nac_checker.deregister(match)) {
					HMatch acMatch_0 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					Object[] acMatch_nodes_0 = acMatch_0.getNodes();
					Object[] objs_0 = match.getNodes();
					acMatch_nodes_0[3] = objs_0[0];
					acMatch_nodes_0[5] = objs_0[1];
					start(nac_checker_orchestration, acMatch_0);
				}
				break;
			case "DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG_12_localSearch": 
				if(nac_checker_0.deregister(match)) {
					HMatch acMatch_1 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
					Object[] acMatch_nodes_1 = acMatch_1.getNodes();
					Object[] objs_1 = match.getNodes();
					acMatch_nodes_1[4] = objs_1[1];
					acMatch_nodes_1[5] = objs_1[0];
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
		case "DocToStaffRule__Marker_CREATE__TRG__sp_Shiftplan": 
			{
				edge_explorer.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CREATE__CORR__stot_StaffToStaff": 
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[8] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_3.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[8] = msg.target;
				currentDepth++;
				start(edge_explorer_3_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CREATE__SRC__s1_Doctor": 
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_4.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_4_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "HospitalToAdministration_source_Hospital": 
			{
				edge_explorer_5.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_5.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_5.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_5_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CONTEXT__TRG__v_Administration": 
			{
				edge_explorer_6.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[6] = msg.target;
				currentDepth++;
				start(edge_explorer_6_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_6.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[6] = msg.target;
				currentDepth++;
				start(edge_explorer_6_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Staff_shiftPlan_Shiftplan": 
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[3] = msg.source;
				objs[5] = msg.target;
				currentDepth++;
				start(edge_explorer_7_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Hospital_staff_Staff": 
			if(msg.target instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[1] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_8_0_orchestration, match);
				currentDepth--;
			}
			}
			
			break;
		case "DocToStaffRule__Marker_CONTEXT__CORR__htov_HospitalToAdministration": 
			{
				edge_explorer_9.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[7] = msg.target;
				currentDepth++;
				start(edge_explorer_9_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "StaffToStaff_target_Staff": 
			{
				edge_explorer_10.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[8] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_10_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Staff_works_Department": 
			if(msg.source instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_11_0_orchestration, match);
				currentDepth--;
			}
			}
			
			if(msg.source instanceof HospitalExample.Doctor) {
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[2] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_11_0_orchestration, match);
				currentDepth--;
			}
			}
			
			break;
		case "Administration_staff_Staff": 
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[6] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_12_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CONTEXT__SRC__d_Department": 
			{
				edge_explorer_13.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[0] = msg.target;
				currentDepth++;
				start(edge_explorer_13_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CREATE__TRG__sh_Shift": 
			{
				edge_explorer_14.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_14_0_orchestration, match);
				currentDepth--;
			}
			
			{
				edge_explorer_14.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_14_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "HospitalToAdministration_target_Administration": 
			{
				edge_explorer_15.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[7] = msg.source;
				objs[6] = msg.target;
				currentDepth++;
				start(edge_explorer_15_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CONTEXT__SRC__h_Hospital": 
			{
				edge_explorer_16.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[1] = msg.target;
				currentDepth++;
				start(edge_explorer_16_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "Shiftplan_shifts_Shift": 
			{
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[5] = msg.source;
				objs[4] = msg.target;
				currentDepth++;
				start(edge_explorer_17_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "DocToStaffRule__Marker_CREATE__TRG__s2_Staff": 
			{
				edge_explorer_18.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[9] = msg.source;
				objs[3] = msg.target;
				currentDepth++;
				start(edge_explorer_18_0_orchestration, match);
				currentDepth--;
			}
			
			break;
		case "StaffToStaff_source_Staff": 
			if(msg.target instanceof HospitalExample.Doctor) {
			{
				edge_explorer_19.registerEdge(msg.source, msg.target);
				HMatch match = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
				Object[] objs = match.getNodes();
				objs[8] = msg.source;
				objs[2] = msg.target;
				currentDepth++;
				start(edge_explorer_19_0_orchestration, match);
				currentDepth--;
			}
			}
			
			break;
		}
		
		msg.initialMessage.decrement();
	}

	@Override
	protected void removeReference(ReferenceDeleted msg) {
		initialMessage = msg.initialMessage;
		
		switch(msg.refName) {
		case "DocToStaffRule__Marker_CREATE__TRG__sp_Shiftplan": 
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_0 = obj2matches.get(msg.source);
				if(matches_0 != null && !matches_0.isEmpty()) {
					Collection<HMatch> toBeRemoved_0 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_0) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_0.add(m);
					}
					if(!toBeRemoved_0.isEmpty()) {
						sendDeletedMatches(toBeRemoved_0);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_1 = obj2matches.get(msg.source);
				if(matches_1 != null && !matches_1.isEmpty()) {
					Collection<HMatch> toBeRemoved_1 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_1) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_1.add(m);
					}
					if(!toBeRemoved_1.isEmpty()) {
						sendDeletedMatches(toBeRemoved_1);
					}
				}
				edge_explorer.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_2 = obj2matches.get(msg.source);
				if(matches_2 != null && !matches_2.isEmpty()) {
					Collection<HMatch> toBeRemoved_2 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_2) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_2.add(m);
					}
					if(!toBeRemoved_2.isEmpty()) {
						sendDeletedMatches(toBeRemoved_2);
					}
				}
				break;
		case "DocToStaffRule__Marker_CREATE__CORR__stot_StaffToStaff": 
				edge_explorer_3.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_3 = obj2matches.get(msg.source);
				if(matches_3 != null && !matches_3.isEmpty()) {
					Collection<HMatch> toBeRemoved_3 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_3) {
						if(m.getNodes()[8].equals(msg.target))
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
						if(m.getNodes()[8].equals(msg.target))
							toBeRemoved_4.add(m);
					}
					if(!toBeRemoved_4.isEmpty()) {
						sendDeletedMatches(toBeRemoved_4);
					}
				}
				break;
		case "DocToStaffRule__Marker_CREATE__SRC__s1_Doctor": 
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
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
				edge_explorer_4.deregisterEdge(msg.source, msg.target);
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
		case "HospitalToAdministration_source_Hospital": 
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_7 = obj2matches.get(msg.source);
				if(matches_7 != null && !matches_7.isEmpty()) {
					Collection<HMatch> toBeRemoved_7 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_7) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_7.add(m);
					}
					if(!toBeRemoved_7.isEmpty()) {
						sendDeletedMatches(toBeRemoved_7);
					}
				}
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_8 = obj2matches.get(msg.source);
				if(matches_8 != null && !matches_8.isEmpty()) {
					Collection<HMatch> toBeRemoved_8 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_8) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_8.add(m);
					}
					if(!toBeRemoved_8.isEmpty()) {
						sendDeletedMatches(toBeRemoved_8);
					}
				}
				edge_explorer_5.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_9 = obj2matches.get(msg.source);
				if(matches_9 != null && !matches_9.isEmpty()) {
					Collection<HMatch> toBeRemoved_9 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_9) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_9.add(m);
					}
					if(!toBeRemoved_9.isEmpty()) {
						sendDeletedMatches(toBeRemoved_9);
					}
				}
				break;
		case "DocToStaffRule__Marker_CONTEXT__TRG__v_Administration": 
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_10 = obj2matches.get(msg.source);
				if(matches_10 != null && !matches_10.isEmpty()) {
					Collection<HMatch> toBeRemoved_10 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_10) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_10.add(m);
					}
					if(!toBeRemoved_10.isEmpty()) {
						sendDeletedMatches(toBeRemoved_10);
					}
				}
				edge_explorer_6.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_11 = obj2matches.get(msg.source);
				if(matches_11 != null && !matches_11.isEmpty()) {
					Collection<HMatch> toBeRemoved_11 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_11) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_11.add(m);
					}
					if(!toBeRemoved_11.isEmpty()) {
						sendDeletedMatches(toBeRemoved_11);
					}
				}
				break;
		case "Staff_shiftPlan_Shiftplan": 
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
				Collection<HMatch> matches_13 = obj2matches.get(msg.source);
				if(matches_13 != null && !matches_13.isEmpty()) {
					Collection<HMatch> toBeRemoved_13 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_13) {
						if(m.getNodes()[5].equals(msg.target))
							toBeRemoved_13.add(m);
					}
					if(!toBeRemoved_13.isEmpty()) {
						sendDeletedMatches(toBeRemoved_13);
					}
				}
				break;
		case "Hospital_staff_Staff": 
				Collection<HMatch> matches_14 = obj2matches.get(msg.source);
				if(matches_14 != null && !matches_14.isEmpty()) {
					Collection<HMatch> toBeRemoved_14 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_14) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_14.add(m);
					}
					if(!toBeRemoved_14.isEmpty()) {
						sendDeletedMatches(toBeRemoved_14);
					}
				}
				break;
		case "DocToStaffRule__Marker_CONTEXT__CORR__htov_HospitalToAdministration": 
				edge_explorer_9.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_15 = obj2matches.get(msg.source);
				if(matches_15 != null && !matches_15.isEmpty()) {
					Collection<HMatch> toBeRemoved_15 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_15) {
						if(m.getNodes()[7].equals(msg.target))
							toBeRemoved_15.add(m);
					}
					if(!toBeRemoved_15.isEmpty()) {
						sendDeletedMatches(toBeRemoved_15);
					}
				}
				break;
		case "StaffToStaff_target_Staff": 
				edge_explorer_10.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_16 = obj2matches.get(msg.source);
				if(matches_16 != null && !matches_16.isEmpty()) {
					Collection<HMatch> toBeRemoved_16 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_16) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_16.add(m);
					}
					if(!toBeRemoved_16.isEmpty()) {
						sendDeletedMatches(toBeRemoved_16);
					}
				}
				break;
		case "Staff_works_Department": 
				Collection<HMatch> matches_17 = obj2matches.get(msg.source);
				if(matches_17 != null && !matches_17.isEmpty()) {
					Collection<HMatch> toBeRemoved_17 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_17) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_17.add(m);
					}
					if(!toBeRemoved_17.isEmpty()) {
						sendDeletedMatches(toBeRemoved_17);
					}
				}
				Collection<HMatch> matches_18 = obj2matches.get(msg.source);
				if(matches_18 != null && !matches_18.isEmpty()) {
					Collection<HMatch> toBeRemoved_18 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_18) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_18.add(m);
					}
					if(!toBeRemoved_18.isEmpty()) {
						sendDeletedMatches(toBeRemoved_18);
					}
				}
				break;
		case "Administration_staff_Staff": 
				Collection<HMatch> matches_19 = obj2matches.get(msg.source);
				if(matches_19 != null && !matches_19.isEmpty()) {
					Collection<HMatch> toBeRemoved_19 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_19) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_19.add(m);
					}
					if(!toBeRemoved_19.isEmpty()) {
						sendDeletedMatches(toBeRemoved_19);
					}
				}
				break;
		case "DocToStaffRule__Marker_CONTEXT__SRC__d_Department": 
				edge_explorer_13.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_20 = obj2matches.get(msg.source);
				if(matches_20 != null && !matches_20.isEmpty()) {
					Collection<HMatch> toBeRemoved_20 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_20) {
						if(m.getNodes()[0].equals(msg.target))
							toBeRemoved_20.add(m);
					}
					if(!toBeRemoved_20.isEmpty()) {
						sendDeletedMatches(toBeRemoved_20);
					}
				}
				break;
		case "DocToStaffRule__Marker_CREATE__TRG__sh_Shift": 
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_21 = obj2matches.get(msg.source);
				if(matches_21 != null && !matches_21.isEmpty()) {
					Collection<HMatch> toBeRemoved_21 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_21) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_21.add(m);
					}
					if(!toBeRemoved_21.isEmpty()) {
						sendDeletedMatches(toBeRemoved_21);
					}
				}
				edge_explorer_14.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_22 = obj2matches.get(msg.source);
				if(matches_22 != null && !matches_22.isEmpty()) {
					Collection<HMatch> toBeRemoved_22 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_22) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_22.add(m);
					}
					if(!toBeRemoved_22.isEmpty()) {
						sendDeletedMatches(toBeRemoved_22);
					}
				}
				break;
		case "HospitalToAdministration_target_Administration": 
				edge_explorer_15.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_23 = obj2matches.get(msg.source);
				if(matches_23 != null && !matches_23.isEmpty()) {
					Collection<HMatch> toBeRemoved_23 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_23) {
						if(m.getNodes()[6].equals(msg.target))
							toBeRemoved_23.add(m);
					}
					if(!toBeRemoved_23.isEmpty()) {
						sendDeletedMatches(toBeRemoved_23);
					}
				}
				break;
		case "DocToStaffRule__Marker_CONTEXT__SRC__h_Hospital": 
				edge_explorer_16.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_24 = obj2matches.get(msg.source);
				if(matches_24 != null && !matches_24.isEmpty()) {
					Collection<HMatch> toBeRemoved_24 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_24) {
						if(m.getNodes()[1].equals(msg.target))
							toBeRemoved_24.add(m);
					}
					if(!toBeRemoved_24.isEmpty()) {
						sendDeletedMatches(toBeRemoved_24);
					}
				}
				break;
		case "Shiftplan_shifts_Shift": 
				Collection<HMatch> matches_25 = obj2matches.get(msg.source);
				if(matches_25 != null && !matches_25.isEmpty()) {
					Collection<HMatch> toBeRemoved_25 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_25) {
						if(m.getNodes()[4].equals(msg.target))
							toBeRemoved_25.add(m);
					}
					if(!toBeRemoved_25.isEmpty()) {
						sendDeletedMatches(toBeRemoved_25);
					}
				}
				break;
		case "DocToStaffRule__Marker_CREATE__TRG__s2_Staff": 
				edge_explorer_18.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_26 = obj2matches.get(msg.source);
				if(matches_26 != null && !matches_26.isEmpty()) {
					Collection<HMatch> toBeRemoved_26 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_26) {
						if(m.getNodes()[3].equals(msg.target))
							toBeRemoved_26.add(m);
					}
					if(!toBeRemoved_26.isEmpty()) {
						sendDeletedMatches(toBeRemoved_26);
					}
				}
				break;
		case "StaffToStaff_source_Staff": 
				edge_explorer_19.deregisterEdge(msg.source, msg.target);
				Collection<HMatch> matches_27 = obj2matches.get(msg.source);
				if(matches_27 != null && !matches_27.isEmpty()) {
					Collection<HMatch> toBeRemoved_27 = HiPEMultiUtil.createSet();
					for(HMatch m : matches_27) {
						if(m.getNodes()[2].equals(msg.target))
							toBeRemoved_27.add(m);
					}
					if(!toBeRemoved_27.isEmpty()) {
						sendDeletedMatches(toBeRemoved_27);
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
		oMatch_Nodes_0[0] = objs[3];
		oMatch_Nodes_0[1] = objs[5];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 == null) {
			oMatches_0 = new HashSet<>();
			overlap2matches_0.put(oMatch_0, oMatches_0);
		}
		oMatches_0.add(match);
		
		// register DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_1 = new OverlapMatch(2);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[4];
		oMatch_Nodes_1[1] = objs[5];
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
		
		// register s1
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 == null) {
			matches_2 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[2], matches_2);
		}
		matches_2.add(match);
		
		// register s2
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 == null) {
			matches_3 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[3], matches_3);
		}
		matches_3.add(match);
		
		// register sh
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 == null) {
			matches_4 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[4], matches_4);
		}
		matches_4.add(match);
		
		// register sp
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 == null) {
			matches_5 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[5], matches_5);
		}
		matches_5.add(match);
		
		// register v
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 == null) {
			matches_6 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[6], matches_6);
		}
		matches_6.add(match);
		
		// register htov
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 == null) {
			matches_7 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[7], matches_7);
		}
		matches_7.add(match);
		
		// register stot
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 == null) {
			matches_8 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[8], matches_8);
		}
		matches_8.add(match);
		
		// register DocToStaffRule_eMoflon_ProtocolNode
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 == null) {
			matches_9 = HiPEMultiUtil.createSet();
			obj2matches.put(objs[9], matches_9);
		}
		matches_9.add(match);
		
	}
	
	protected void deregisterMatch(HMatch match) {
		allMatches.remove(match);
		
		Object[] objs = match.getNodes();
		// deregister DocToStaffRule_s2_shiftPlan_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_0 = new OverlapMatch(2);
		Object[] oMatch_Nodes_0 = oMatch_0.getNodes();
		oMatch_Nodes_0[0] = objs[3];
		oMatch_Nodes_0[1] = objs[5];
		Collection<HMatch> oMatches_0 = overlap2matches_0.get(oMatch_0);
		if(oMatches_0 != null) {
			oMatches_0.remove(match);
		}
		
		// deregister DocToStaffRule_sp_shifts_outgoing_TRG__FILTER_NAC_TRG
		OverlapMatch oMatch_1 = new OverlapMatch(2);
		Object[] oMatch_Nodes_1 = oMatch_1.getNodes();
		oMatch_Nodes_1[0] = objs[4];
		oMatch_Nodes_1[1] = objs[5];
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
		
		// deregister s1
		Collection<HMatch> matches_2 = obj2matches.get(objs[2]);
		if(matches_2 != null) {
			matches_2.remove(match);
		}
		
		// deregister s2
		Collection<HMatch> matches_3 = obj2matches.get(objs[3]);
		if(matches_3 != null) {
			matches_3.remove(match);
		}
		
		// deregister sh
		Collection<HMatch> matches_4 = obj2matches.get(objs[4]);
		if(matches_4 != null) {
			matches_4.remove(match);
		}
		
		// deregister sp
		Collection<HMatch> matches_5 = obj2matches.get(objs[5]);
		if(matches_5 != null) {
			matches_5.remove(match);
		}
		
		// deregister v
		Collection<HMatch> matches_6 = obj2matches.get(objs[6]);
		if(matches_6 != null) {
			matches_6.remove(match);
		}
		
		// deregister htov
		Collection<HMatch> matches_7 = obj2matches.get(objs[7]);
		if(matches_7 != null) {
			matches_7.remove(match);
		}
		
		// deregister stot
		Collection<HMatch> matches_8 = obj2matches.get(objs[8]);
		if(matches_8 != null) {
			matches_8.remove(match);
		}
		
		// deregister DocToStaffRule_eMoflon_ProtocolNode
		Collection<HMatch> matches_9 = obj2matches.get(objs[9]);
		if(matches_9 != null) {
			matches_9.remove(match);
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
		if(obj instanceof AdministrationExample.Staff) {
			HMatch match_3 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
			match_3.getNodes()[3] = obj;
			Collection<HMatch> formerMatches_3 = obj2matches.get(obj);
			if(formerMatches_3 != null) {
				
				formerMatches_3 = formerMatches_3.stream().filter(m -> !constraint_checker.check(m) || !constraint_checker_0.check(m) || !constraint_checker_1.check(m) || !constraint_checker_2.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_3);
			}
			start(edge_explorer_7_1_orchestration, match_3);
		}
		if(obj instanceof HospitalExample.Doctor) {
			HMatch match_2 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
			match_2.getNodes()[2] = obj;
			Collection<HMatch> formerMatches_2 = obj2matches.get(obj);
			if(formerMatches_2 != null) {
				
				formerMatches_2 = formerMatches_2.stream().filter(m -> !constraint_checker_1.check(m) || !constraint_checker_2.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_2);
			}
			start(edge_explorer_4_1_orchestration, match_2);
		}
		if(obj instanceof HospitalExample.Department) {
			HMatch match_0 = new LocalSearchMatch("DocToStaffRule__CONSISTENCY_35_localSearch", 10);
			match_0.getNodes()[0] = obj;
			Collection<HMatch> formerMatches_0 = obj2matches.get(obj);
			if(formerMatches_0 != null) {
				
				formerMatches_0 = formerMatches_0.stream().filter(m -> !constraint_checker_0.check(m)).collect(Collectors.toList());
				sendDeletedMatches(formerMatches_0);
			}
			start(edge_explorer_11_1_orchestration, match_0);
		}
		
		message.initialMessage.decrement();
	}
				
	public boolean constraint_checker_method(HMatch match) {
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_doctorsalary csp_6 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_doctorsalary();
		csp_6.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getSalary(), "double"));
		csp_6.solve();
		
		boolean predicate = csp_6.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_0_method(HMatch match) {
		HospitalExample.Department d = (HospitalExample.Department) match.getNodes()[0];
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_7 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_7.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, d.getDID(), "int"));
		csp_7.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getDInt(), "int"));
		csp_7.solve();
		
		boolean predicate = csp_7.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_1_method(HMatch match) {
		HospitalExample.Doctor s1 = (HospitalExample.Doctor) match.getNodes()[2];
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[3];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_incrementingStaffID csp_8 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_incrementingStaffID();
		csp_8.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s1.getStaffID(), "int"));
		csp_8.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getStaffID(), "int"));
		csp_8.solve();
		
		boolean predicate = csp_8.isSatisfied();
		return predicate;
	}
	
	public boolean constraint_checker_2_method(HMatch match) {
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[3];
		HospitalExample.Doctor s1 = (HospitalExample.Doctor) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nametoname csp_9 = new org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administration.UserDefined_nametoname();
		csp_9.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, " ", "java.lang.String"));
		csp_9.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getFirstName(), "java.lang.String"));
		csp_9.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getLastName(), "java.lang.String"));
		csp_9.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s1.getName(), "java.lang.String"));
		csp_9.solve();
		
		boolean predicate = csp_9.isSatisfied();
		return predicate;
	}
	
	
}

