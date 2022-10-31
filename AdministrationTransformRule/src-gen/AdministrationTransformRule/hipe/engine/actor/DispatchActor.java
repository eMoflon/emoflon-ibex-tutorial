package AdministrationTransformRule.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShift(), obj -> {
			AdministrationExample.Shift _shift = (AdministrationExample.Shift) obj;
			incUtil.newMessage();
			name2actor.get("Shift_object").tell(new ObjectAdded<AdministrationExample.Shift>(incUtil, _shift), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getTreatment(), obj -> {
			AdministrationExample.Treatment _treatment = (AdministrationExample.Treatment) obj;
			incUtil.newMessage();
			name2actor.get("Treatment_object").tell(new ObjectAdded<AdministrationExample.Treatment>(incUtil, _treatment), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff(), obj -> {
			AdministrationExample.Staff _staff = (AdministrationExample.Staff) obj;
			incUtil.newMessage();
			name2actor.get("Staff_object").tell(new ObjectAdded<AdministrationExample.Staff>(incUtil, _staff), getSelf());
			incUtil.newMessage();
			name2actor.get("Person_object").tell(new ObjectAdded<AdministrationExample.Person>(incUtil, _staff), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration(), obj -> {
			AdministrationExample.Administration _administration = (AdministrationExample.Administration) obj;
			incUtil.newMessage();
			name2actor.get("Administration_object").tell(new ObjectAdded<AdministrationExample.Administration>(incUtil, _administration), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan(), obj -> {
			AdministrationExample.Shiftplan _shiftplan = (AdministrationExample.Shiftplan) obj;
			incUtil.newMessage();
			name2actor.get("Shiftplan_object").tell(new ObjectAdded<AdministrationExample.Shiftplan>(incUtil, _shiftplan), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient(), obj -> {
			AdministrationExample.Patient _patient = (AdministrationExample.Patient) obj;
			incUtil.newMessage();
			name2actor.get("Patient_object").tell(new ObjectAdded<AdministrationExample.Patient>(incUtil, _patient), getSelf());
			incUtil.newMessage();
			name2actor.get("Person_object").tell(new ObjectAdded<AdministrationExample.Person>(incUtil, _patient), getSelf());
		});
		type2addConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPerson(), obj -> {
			AdministrationExample.Person _person = (AdministrationExample.Person) obj;
			incUtil.newMessage();
			name2actor.get("Person_object").tell(new ObjectAdded<AdministrationExample.Person>(incUtil, _person), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan_Shifts(), notification -> {
			incUtil.newMessage();
			name2actor.get("Shiftplan_shifts_0_reference").tell(new ReferenceAdded<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil,(AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getNewValue(), "AdministrationExample.Shiftplan_shifts_Shift"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("Patient_treatment_0_reference").tell(new ReferenceAdded<AdministrationExample.Patient, AdministrationExample.Treatment>(incUtil,(AdministrationExample.Patient) notification.getNotifier(), (AdministrationExample.Treatment) notification.getNewValue(), "AdministrationExample.Patient_treatment_Treatment"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_CoveredBy(), notification -> {
			incUtil.newMessage();
			name2actor.get("Patient_coveredBy_0_reference").tell(new ReferenceAdded<AdministrationExample.Patient, AdministrationExample.Shiftplan>(incUtil,(AdministrationExample.Patient) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getNewValue(), "AdministrationExample.Patient_coveredBy_Shiftplan"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_ShiftPlan(), notification -> {
			incUtil.newMessage();
			name2actor.get("Staff_shiftPlan_0_reference").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getNewValue(), "AdministrationExample.Staff_shiftPlan_Shiftplan"), getSelf());
		});
		feature2addEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("Staff_treatment_0_reference").tell(new ReferenceAdded<AdministrationExample.Staff, AdministrationExample.Treatment>(incUtil,(AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Treatment) notification.getNewValue(), "AdministrationExample.Staff_treatment_Treatment"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan_Shifts(), notification -> {
			incUtil.newMessage();
			name2actor.get("Shiftplan_shifts_0_reference").tell(new ReferenceDeleted<AdministrationExample.Shiftplan, AdministrationExample.Shift>(incUtil, (AdministrationExample.Shiftplan) notification.getNotifier(), (AdministrationExample.Shift) notification.getOldValue(), "AdministrationExample.Shiftplan_shifts_Shift"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("Patient_treatment_0_reference").tell(new ReferenceDeleted<AdministrationExample.Patient, AdministrationExample.Treatment>(incUtil, (AdministrationExample.Patient) notification.getNotifier(), (AdministrationExample.Treatment) notification.getOldValue(), "AdministrationExample.Patient_treatment_Treatment"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient_CoveredBy(), notification -> {
			incUtil.newMessage();
			name2actor.get("Patient_coveredBy_0_reference").tell(new ReferenceDeleted<AdministrationExample.Patient, AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Patient) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getOldValue(), "AdministrationExample.Patient_coveredBy_Shiftplan"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_ShiftPlan(), notification -> {
			incUtil.newMessage();
			name2actor.get("Staff_shiftPlan_0_reference").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Shiftplan) notification.getOldValue(), "AdministrationExample.Staff_shiftPlan_Shiftplan"), getSelf());
		});
		feature2removeEdgeConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff_Treatment(), notification -> {
			incUtil.newMessage();
			name2actor.get("Staff_treatment_0_reference").tell(new ReferenceDeleted<AdministrationExample.Staff, AdministrationExample.Treatment>(incUtil, (AdministrationExample.Staff) notification.getNotifier(), (AdministrationExample.Treatment) notification.getOldValue(), "AdministrationExample.Staff_treatment_Treatment"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof AdministrationExample.Administration) {
			incUtil.newMessage();
			name2actor.get("Administration_object").tell(new ObjectDeleted<AdministrationExample.Administration>(incUtil, (AdministrationExample.Administration) node), getSelf());
		}
		if (node instanceof AdministrationExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_object").tell(new ObjectDeleted<AdministrationExample.Patient>(incUtil, (AdministrationExample.Patient) node), getSelf());
		}
		if (node instanceof AdministrationExample.Shiftplan) {
			incUtil.newMessage();
			name2actor.get("Shiftplan_object").tell(new ObjectDeleted<AdministrationExample.Shiftplan>(incUtil, (AdministrationExample.Shiftplan) node), getSelf());
		}
		if (node instanceof AdministrationExample.Shift) {
			incUtil.newMessage();
			name2actor.get("Shift_object").tell(new ObjectDeleted<AdministrationExample.Shift>(incUtil, (AdministrationExample.Shift) node), getSelf());
		}
		if (node instanceof AdministrationExample.Person) {
			incUtil.newMessage();
			name2actor.get("Person_object").tell(new ObjectDeleted<AdministrationExample.Person>(incUtil, (AdministrationExample.Person) node), getSelf());
		}
		if (node instanceof AdministrationExample.Staff) {
			incUtil.newMessage();
			name2actor.get("Staff_object").tell(new ObjectDeleted<AdministrationExample.Staff>(incUtil, (AdministrationExample.Staff) node), getSelf());
		}
		if (node instanceof AdministrationExample.Treatment) {
			incUtil.newMessage();
			name2actor.get("Treatment_object").tell(new ObjectDeleted<AdministrationExample.Treatment>(incUtil, (AdministrationExample.Treatment) node), getSelf());
		}
	}
}

