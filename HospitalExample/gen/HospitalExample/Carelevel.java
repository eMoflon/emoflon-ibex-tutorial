package HospitalExample;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum Carelevel implements Enumerator {
	
	 WEAK(0, "WEAK", "WEAK"), MEDIUM(1, "MEDIUM", "MEDIUM"), STRONG(2, "STRONG", "STRONG"), PENDING(3, "PENDING", "PENDING");
	
	public static final int WEAK_VALUE = 0;
	public static final int MEDIUM_VALUE = 1;
	public static final int STRONG_VALUE = 2;
	public static final int PENDING_VALUE = 3;
	
	private static final Carelevel[] VALUES_ARRAY = new Carelevel[] {WEAK,MEDIUM,STRONG,PENDING};

	public static final List<Carelevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static Carelevel get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		Carelevel result = VALUES_ARRAY[i];
		if (result.toString().equals(literal)) {
			return result;
		}
	}
	return null;
	}

	public static Carelevel getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		Carelevel result = VALUES_ARRAY[i];
		if (result.getName().equals(name)) {
			return result;
		}
	}
	return null;
	}

	public static Carelevel get(int value) {
		switch (value) {
		case WEAK_VALUE:
			return WEAK;
		case MEDIUM_VALUE:
			return MEDIUM;
		case STRONG_VALUE:
			return STRONG;
		case PENDING_VALUE:
			return PENDING;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private Carelevel(int value, String name, String literal) {
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

