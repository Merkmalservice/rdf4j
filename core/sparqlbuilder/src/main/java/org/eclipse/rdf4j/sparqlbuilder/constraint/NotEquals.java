package org.eclipse.rdf4j.sparqlbuilder.constraint;

import java.util.List;

import org.eclipse.rdf4j.sparqlbuilder.core.Variable;
import org.eclipse.rdf4j.sparqlbuilder.rdf.RdfValue;

public class NotEquals extends Expression<NotEquals> {
	private List<RdfValue> options;
	private Variable var;

	public NotEquals(Variable var, RdfValue... options) {
		super(null, ", ");
		setOperatorName(var.getQueryString() + " " + BinaryOperator.NOT_EQUALS.getQueryString());
		parenthesize(true);
		addOperand(options);
	}
}
