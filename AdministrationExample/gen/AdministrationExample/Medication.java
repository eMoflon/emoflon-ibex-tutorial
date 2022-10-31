package AdministrationExample;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum Medication implements Enumerator {
	
	 WEAK(0, "weak", "weak"), MEDIUM(1, "medium", "medium"), STRONG(2, "strong", "strong"), PENDING(3, "pending", "pending");
	
	public static final int weak_VALUE = 0;
	public static final int medium_VALUE = 1;
	public static final int strong_VALUE = 2;
	public static final int pending_VALUE = 3;
	
	private static final Medication[] VALUES_ARRAY = new Medication[] {WEAK,MEDIUM,STRONG,PENDING};

	public static final List<Medication> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static Medication get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		Medication result = VALUES_ARRAY[i];
		if (result.toString().equals(literal)) {
			return result;
		}
	}
	return null;
	}

	public static Medication getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		Medication result = VALUES_ARRAY[i];
		if (result.getName().equals(name)) {
			return result;
		}
	}
	return null;
	}

	public static Medication get(int value) {
		switch (value) {
		case weak_VALUE:
			return WEAK;
		case medium_VALUE:
			return MEDIUM;
		case strong_VALUE:
			return STRONG;
		case pending_VALUE:
			return PENDING;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private Medication(int value, String name, String literal) {
	this.value = value;
	this.name = name;
	this.literal = literal;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getName() {
	return name;
	}

	@Override
	public String getLiteral() {
		return literal;
	}

	@Override
	public String toString() {
	return literal;
	}

}

