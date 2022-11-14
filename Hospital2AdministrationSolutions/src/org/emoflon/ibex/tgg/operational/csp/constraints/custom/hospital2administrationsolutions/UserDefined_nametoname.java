package org.emoflon.ibex.tgg.operational.csp.constraints.custom.hospital2administrationsolutions;

import java.util.Random;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;
import org.emoflon.ibex.tgg.operational.csp.constraints.Concat;

public class UserDefined_nametoname extends Concat
{

	   /**
	    * Constraint nametoname(v0, v1, v2, v3)
	    * 
	    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
	    */
		@Override
		public void solve() {
			if (variables.size() != 4)
				throw new RuntimeException("The CSP -NAMETONAME- needs exactly 4 variables");
			
			final String [] firstNames = {"Lucy" ,"Lukas",	"Ella", "Konstantin",	"Amy",	"Ben",	"Emely",	"Jonas",	"Finja",	"Elias",	"Amelie",	"Niklas",	"Luise",	"David",	"Frieda",	"Oskar",	"Katharina",	"Philipp",	"Romy",	"Leon",	"Juna",	"Noah",	"Theresa",	"Luis",	"Eva",	"Paul",	"Julia",	"Finn",	"Anna",	"Felix",	"Carla",	"Julian",
			"Paulina",	"Maximilian",	"Elisabeth",	"Henry",	"Rosa",	"Tim",	"Mia",	"Karl",	"Maya",	"Friedrich",	"Selma",	"Peter",	"Edda",	"Quirin",	"Flora", "Liam",	"Berenike",	"Linus",	"Simone",	"Quentin",	"Elena",	"Meike",	"Johannes",	"Susanne",	"Alexander",	"Annika",	"Anton",	"Augusta", "Aras", "Alba",	"Asis",	"Wilma",	"Adrian",	"Annegret",	"Arthur",	"Aglaia",	"Adam",	"Aaliyah",
			"Arian",	"Annabelle",	"Amos",	"Alma",	"Arik",	"Alicia",	"Ake", "Anette",	"Altfried",	"Astrid",	"Ari",	"Anisha",	"Andreas",	"Antke",	"Allessandro",	"Abigail",};
			final String [] lastNames = { "Smith", 	"Johnson",	"Williams", 	"Brown",	"Jones",	"Miller",	"Davis",	"Garcia",	"Rodriguez",	"Wilson",	"Martinez",	"Anderson",	"Taylor",	"Thomas",	"Hernandez",
					"Moore",	"Martin",	"Jackson",	"Thompson",	"White",	"Lopez",	"Lee",	"Gonzalez",	"Harris",	"Clark",	"Lewis", 	"Robinson",	"Walker",	"Perez",	"Hall",	"Young",
					"Allen", 	"Sanchez", 	"Wright",	"King",	"Scott",	"Green",	"Baker",	"Adams",	"Nelson",	"Hill",	"Ramirez", "Campbell",	"Mitchell",	"Roberts",	"Carter",	"Phillips",
					"Evans",	"Turner",	"Torres",	"Parker",	"Collins",	"Edwards",	"Stewart",	"Flores",	"Morris",	"Nguyen",	"Murphy", "Rivera", "Cook", "Peterson", "Cooper", "Reed", "Bailey",};
			
			final Random random = new Random();

			RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
			RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
			RuntimeTGGAttributeConstraintVariable v2 = variables.get(2);
			RuntimeTGGAttributeConstraintVariable v3 = variables.get(3);
			String bindingStates = getBindingStates(v0, v1, v2, v3);

		  	switch(bindingStates) {
		  		case "BBBB": 
		  		case "BBBF": 
		  		case "BBFB": 
		  		case "BFFB": 
		  		case "BFBB": 
		  		case "BFBF": 
		  		case "BBFF": super.solve(); 
		  		break; 
		  		case "BFFF":
		  		
		  		String firstName = firstNames[random.nextInt(firstNames.length)];
		  			v1.bindToValue(firstName);
		  		String lastName = lastNames[random.nextInt(lastNames.length)];
		  			v2.bindToValue(lastName);
		  			v3.bindToValue(firstName + v0.getValue() + lastName);
		  		setSatisfied(true);	
		  			break;
		  			
		  			
		  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
		  		 	}
		  	}
		}


