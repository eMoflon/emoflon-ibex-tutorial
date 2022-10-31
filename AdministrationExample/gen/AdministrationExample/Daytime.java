package AdministrationExample;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

public enum Daytime implements Enumerator {
	
	 NIGHT(0, "night", "night"), EARLY(1, "early", "early"), LATE(2, "late", "late");
	
	public static final int night_VALUE = 0;
	public static final int early_VALUE = 1;
	public static final int late_VALUE = 2;
	
	private static final Daytime[] VALUES_ARRAY = new Daytime[] {NIGHT,EARLY,LATE};

	public static final List<Daytime> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public static Daytime get(String literal) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		Daytime result = VALUES_ARRAY[i];
		if (result.toString().equals(literal)) {
			return result;
		}
	}
	return null;
	}

	public static Daytime getByName(String name) {
	for (int i = 0; i < VALUES_ARRAY.length; ++i) {
		Daytime result = VALUES_ARRAY[i];
		if (result.getName().equals(name)) {
			return result;
		}
	}
	return null;
	}

	public static Daytime get(int value) {
		switch (value) {
		case night_VALUE:
			return NIGHT;
		case early_VALUE:
			return EARLY;
		case late_VALUE:
			return LATE;
		}
		return null;
	}

	private final int value;

	private final String name;

	private final String literal;

	private Daytime(int value, String name, String literal) {
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

