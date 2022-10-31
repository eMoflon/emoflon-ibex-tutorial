package AdministrationTransformRule.hipe.engine.actor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

import akka.actor.ActorRef;

import hipe.engine.actor.GenericNotificationActor;
import hipe.engine.util.IncUtil;

public class NotificationActor extends GenericNotificationActor {
	
	public NotificationActor(ActorRef dispatchActor, IncUtil incUtil, boolean cascadingNotifications) {
		super(dispatchActor, incUtil, cascadingNotifications);
	}
	
	@Override
	protected void initializeExploration() {
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getTreatment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Staff _staff = (AdministrationExample.Staff) obj;
			if(_staff.getShiftPlan() != null)
				children.add(_staff.getShiftPlan());
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Administration _administration = (AdministrationExample.Administration) obj;
			children.addAll(_administration.getStaff());
			children.addAll(_administration.getPatient());
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Shiftplan _shiftplan = (AdministrationExample.Shiftplan) obj;
			children.addAll(_shiftplan.getShifts());
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Patient _patient = (AdministrationExample.Patient) obj;
			if(_patient.getTreatment() != null)
				children.add(_patient.getTreatment());
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPerson(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

