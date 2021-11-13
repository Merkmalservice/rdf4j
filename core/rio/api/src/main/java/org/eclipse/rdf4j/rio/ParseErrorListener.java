/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.rio;

/**
 * An interface defining methods for receiving warning and error messages from an RDF parser.
 */
public interface ParseErrorListener {

	/**
	 * Reports a warning from the parser. Warning messages are generated by the parser when it encounters data that is
	 * syntactically correct but which is likely to be a typo. Examples are the use of unknown or deprecated RDF URIs,
	 * e.g. <var>rdfs:Property</var> instead of <var>rdf:Property</var>.
	 *
	 * @param msg    A warning message.
	 * @param lineNo A line number related to the warning, or -1 if not available or applicable.
	 * @param colNo  A column number related to the warning, or -1 if not available or applicable.
	 */
	void warning(String msg, long lineNo, long colNo);

	/**
	 * Reports an error from the parser. Error messages are generated by the parser when it encounters an error in the
	 * RDF document. The parser will try its best to recover from the error and continue parsing when
	 * <var>stopAtFirstError</var> has been set to <var>false</var>.
	 *
	 * @param msg    A error message.
	 * @param lineNo A line number related to the error, or -1 if not available or applicable.
	 * @param colNo  A column number related to the error, or -1 if not available or applicable.
	 * @see org.eclipse.rdf4j.rio.RDFParser#setStopAtFirstError
	 */
	void error(String msg, long lineNo, long colNo);

	/**
	 * Reports a fatal error from the parser. A fatal error is an error of which the RDF parser cannot recover. The
	 * parser will stop parsing directly after it reported the fatal error. Example fatal errors are unbalanced start-
	 * and end-tags in an XML-encoded RDF document.
	 *
	 * @param msg    A error message.
	 * @param lineNo A line number related to the error, or -1 if not available or applicable.
	 * @param colNo  A column number related to the error, or -1 if not available or applicable.
	 */
	void fatalError(String msg, long lineNo, long colNo);
}
