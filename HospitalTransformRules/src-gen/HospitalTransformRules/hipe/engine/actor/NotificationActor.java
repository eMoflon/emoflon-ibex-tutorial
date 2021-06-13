package HospitalTransformRules.hipe.engine.actor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

import akka.actor.ActorRef;

import hipe.engine.actor.GenericNotificationActor;
import hipe.engine.util.IncUtil;

public class NotificationActor extends GenericNotificationActor {
	
	public NotificationActor(ActorRef dispatchActor, IncUtil incUtil) {
		super(dispatchActor, incUtil);
	}
	
	@Override
	protected void initializeExploration() {
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Hospital _hospital = (HospitalExample.Hospital) obj;
			if(_hospital.getReception() != null)
				children.add(_hospital.getReception());
			children.addAll(_hospital.getStaff());
			children.addAll(_hospital.getDepartment());
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Reception _reception = (HospitalExample.Reception) obj;
			children.addAll(_reception.getWaits());
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Department _department = (HospitalExample.Department) obj;
			children.addAll(_department.getRooms());
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Room _room = (HospitalExample.Room) obj;
			children.addAll(_room.getLies());
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

