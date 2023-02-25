/*******************************************************************************
 * Copyright (c) 2019 Eclipse RDF4J contributors.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 *******************************************************************************/
package org.eclipse.rdf4j.sail.shacl.config;

import static org.eclipse.rdf4j.model.util.Values.literal;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.CACHE_SELECT_NODES;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.GLOBAL_LOG_VALIDATION_EXECUTION;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.LOG_VALIDATION_PLANS;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.LOG_VALIDATION_VIOLATIONS;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.PARALLEL_VALIDATION;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.PERFORMANCE_LOGGING;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.RDFS_SUB_CLASS_REASONING;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.SERIALIZABLE_VALIDATION;
import static org.eclipse.rdf4j.sail.shacl.config.ShaclSailSchema.VALIDATION_ENABLED;

import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.rdf4j.common.annotation.Experimental;
import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Model;
import org.eclipse.rdf4j.model.Resource;
import org.eclipse.rdf4j.model.impl.BooleanLiteral;
import org.eclipse.rdf4j.model.util.Configurations;
import org.eclipse.rdf4j.model.vocabulary.CONFIG;
import org.eclipse.rdf4j.model.vocabulary.RDF4J;
import org.eclipse.rdf4j.sail.config.AbstractDelegatingSailImplConfig;
import org.eclipse.rdf4j.sail.config.SailConfigException;
import org.eclipse.rdf4j.sail.config.SailImplConfig;
import org.eclipse.rdf4j.sail.shacl.ShaclSail;

/**
 * A {@link SailImplConfig} for {@link ShaclSail} configuration.
 *
 * @author Jeen Broekstra
 */
public class ShaclSailConfig extends AbstractDelegatingSailImplConfig {

	public static final boolean PARALLEL_VALIDATION_DEFAULT = true;
	public static final boolean LOG_VALIDATION_PLANS_DEFAULT = false;
	public static final boolean LOG_VALIDATION_VIOLATIONS_DEFAULT = false;
	public static final boolean VALIDATION_ENABLED_DEFAULT = true;
	public static final boolean CACHE_SELECT_NODES_DEFAULT = true;
	public static final boolean GLOBAL_LOG_VALIDATION_EXECUTION_DEFAULT = false;
	public static final boolean RDFS_SUB_CLASS_REASONING_DEFAULT = true;
	public static final boolean PERFORMANCE_LOGGING_DEFAULT = false;
	public static final boolean SERIALIZABLE_VALIDATION_DEFAULT = true;
	public static final boolean ECLIPSE_RDF4J_SHACL_EXTENSIONS_DEFAULT = false;
	public static final boolean DASH_DATA_SHAPES_DEFAULT = false;
	public final static long VALIDATION_RESULTS_LIMIT_TOTAL_DEFAULT = 1_000_000;
	public final static long VALIDATION_RESULTS_LIMIT_PER_CONSTRAINT_DEFAULT = 1_000;
	public final static long TRANSACTIONAL_VALIDATION_LIMIT_DEFAULT = 500_000;
	public final static Set<IRI> SHAPES_GRAPHS_DEFAULT = Set.of(RDF4J.SHACL_SHAPE_GRAPH);

	private boolean parallelValidation = PARALLEL_VALIDATION_DEFAULT;
	private boolean logValidationPlans = LOG_VALIDATION_PLANS_DEFAULT;
	private boolean logValidationViolations = LOG_VALIDATION_VIOLATIONS_DEFAULT;
	private boolean validationEnabled = VALIDATION_ENABLED_DEFAULT;
	private boolean cacheSelectNodes = CACHE_SELECT_NODES_DEFAULT;
	private boolean globalLogValidationExecution = GLOBAL_LOG_VALIDATION_EXECUTION_DEFAULT;
	private boolean rdfsSubClassReasoning = RDFS_SUB_CLASS_REASONING_DEFAULT;
	private boolean performanceLogging = PERFORMANCE_LOGGING_DEFAULT;
	private boolean serializableValidation = SERIALIZABLE_VALIDATION_DEFAULT;
	private boolean eclipseRdf4jShaclExtensions = ECLIPSE_RDF4J_SHACL_EXTENSIONS_DEFAULT;
	private boolean dashDataShapes = DASH_DATA_SHAPES_DEFAULT;
	private long validationResultsLimitTotal = VALIDATION_RESULTS_LIMIT_TOTAL_DEFAULT;
	private long validationResultsLimitPerConstraint = VALIDATION_RESULTS_LIMIT_PER_CONSTRAINT_DEFAULT;
	private long transactionalValidationLimit = TRANSACTIONAL_VALIDATION_LIMIT_DEFAULT;
	private Set<IRI> shapesGraphs = SHAPES_GRAPHS_DEFAULT;

	public ShaclSailConfig() {
		super(ShaclSailFactory.SAIL_TYPE);
	}

	public ShaclSailConfig(SailImplConfig delegate) {
		super(ShaclSailFactory.SAIL_TYPE, delegate);
	}

	public boolean isLogValidationPlans() {
		return logValidationPlans;
	}

	public void setLogValidationPlans(boolean logValidationPlans) {
		this.logValidationPlans = logValidationPlans;
	}

	public boolean isLogValidationViolations() {
		return logValidationViolations;
	}

	public void setLogValidationViolations(boolean logValidationViolations) {
		this.logValidationViolations = logValidationViolations;
	}

	public boolean isGlobalLogValidationExecution() {
		return globalLogValidationExecution;
	}

	public void setGlobalLogValidationExecution(boolean globalLogValidationExecution) {
		this.globalLogValidationExecution = globalLogValidationExecution;
	}

	public boolean isValidationEnabled() {
		return validationEnabled;
	}

	public void setValidationEnabled(boolean validationEnabled) {
		this.validationEnabled = validationEnabled;
	}

	public boolean isParallelValidation() {
		return parallelValidation;
	}

	public void setParallelValidation(boolean parallelValidation) {
		this.parallelValidation = parallelValidation;
	}

	public boolean isCacheSelectNodes() {
		return cacheSelectNodes;
	}

	public void setCacheSelectNodes(boolean cacheSelectNodes) {
		this.cacheSelectNodes = cacheSelectNodes;
	}

	public boolean isRdfsSubClassReasoning() {
		return rdfsSubClassReasoning;
	}

	public void setRdfsSubClassReasoning(boolean rdfsSubClassReasoning) {
		this.rdfsSubClassReasoning = rdfsSubClassReasoning;
	}

	public boolean isPerformanceLogging() {
		return performanceLogging;
	}

	public void setPerformanceLogging(boolean performanceLogging) {
		this.performanceLogging = performanceLogging;
	}

	public boolean isSerializableValidation() {
		return serializableValidation;
	}

	public void setSerializableValidation(boolean serializableValidation) {
		this.serializableValidation = serializableValidation;
	}

	@Experimental
	public boolean isEclipseRdf4jShaclExtensions() {
		return eclipseRdf4jShaclExtensions;
	}

	@Experimental
	public void setEclipseRdf4jShaclExtensions(boolean eclipseRdf4jShaclExtensions) {
		this.eclipseRdf4jShaclExtensions = eclipseRdf4jShaclExtensions;
	}

	@Experimental
	public boolean isDashDataShapes() {
		return dashDataShapes;
	}

	@Experimental
	public void setDashDataShapes(boolean dashDataShapes) {
		this.dashDataShapes = dashDataShapes;
	}

	public long getValidationResultsLimitTotal() {
		return validationResultsLimitTotal;
	}

	public long getValidationResultsLimitPerConstraint() {
		return validationResultsLimitPerConstraint;
	}

	public void setValidationResultsLimitTotal(long validationResultsLimitTotal) {
		this.validationResultsLimitTotal = validationResultsLimitTotal;
	}

	public void setValidationResultsLimitPerConstraint(long validationResultsLimitPerConstraint) {
		this.validationResultsLimitPerConstraint = validationResultsLimitPerConstraint;
	}

	public long getTransactionalValidationLimit() {
		return transactionalValidationLimit;
	}

	public void setTransactionalValidationLimit(long transactionalValidationLimit) {
		this.transactionalValidationLimit = transactionalValidationLimit;
	}

	public Set<IRI> getShapesGraphs() {
		return shapesGraphs;
	}

	public void setShapesGraphs(Set<IRI> shapesGraphs) {
		this.shapesGraphs = shapesGraphs;
	}

	@Override
	public Resource export(Model m) {
		Resource implNode = super.export(m);

		m.add(implNode, CONFIG.Shacl.parallelValidation, BooleanLiteral.valueOf(isParallelValidation()));
		m.add(implNode, CONFIG.Shacl.logValidationPlans, BooleanLiteral.valueOf(isLogValidationPlans()));
		m.add(implNode, CONFIG.Shacl.logValidationViolations, BooleanLiteral.valueOf(isLogValidationViolations()));
		m.add(implNode, CONFIG.Shacl.validationEnabled, BooleanLiteral.valueOf(isValidationEnabled()));
		m.add(implNode, CONFIG.Shacl.cacheSelectNodes, BooleanLiteral.valueOf(isCacheSelectNodes()));
		m.add(implNode, CONFIG.Shacl.globalLogValidationExecution,
				BooleanLiteral.valueOf(isGlobalLogValidationExecution()));
		m.add(implNode, CONFIG.Shacl.rdfsSubClassReasoning, BooleanLiteral.valueOf(isRdfsSubClassReasoning()));
		m.add(implNode, CONFIG.Shacl.performanceLogging, BooleanLiteral.valueOf(isPerformanceLogging()));
		m.add(implNode, CONFIG.Shacl.serializableValidation, BooleanLiteral.valueOf(isSerializableValidation()));
		m.add(implNode, CONFIG.Shacl.eclipseRdf4jShaclExtensions,
				BooleanLiteral.valueOf(isEclipseRdf4jShaclExtensions()));
		m.add(implNode, CONFIG.Shacl.dashDataShapes, BooleanLiteral.valueOf(isDashDataShapes()));

		m.add(implNode, CONFIG.Shacl.validationResultsLimitTotal,
				literal(getValidationResultsLimitTotal()));
		m.add(implNode, CONFIG.Shacl.validationResultsLimitPerConstraint,
				literal(getValidationResultsLimitPerConstraint()));

		m.add(implNode, CONFIG.Shacl.transactionalValidationLimit,
				literal(getTransactionalValidationLimit()));

		for (IRI shapesGraph : shapesGraphs) {
			m.add(implNode, CONFIG.Shacl.shapesGraph, shapesGraph);
		}

		return implNode;
	}

	@Override
	public void parse(Model m, Resource implNode) throws SailConfigException {
		super.parse(m, implNode);

		try {
			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.parallelValidation, PARALLEL_VALIDATION)
					.ifPresent(l -> setParallelValidation(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.logValidationPlans, LOG_VALIDATION_PLANS)
					.ifPresent(l -> setLogValidationPlans(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.logValidationViolations, LOG_VALIDATION_VIOLATIONS)
					.ifPresent(l -> setLogValidationViolations(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.validationEnabled, VALIDATION_ENABLED)
					.ifPresent(l -> setValidationEnabled(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.cacheSelectNodes, CACHE_SELECT_NODES)
					.ifPresent(l -> setCacheSelectNodes(l.booleanValue()));

			Configurations
					.getLiteralValue(m, implNode, CONFIG.Shacl.globalLogValidationExecution,
							GLOBAL_LOG_VALIDATION_EXECUTION)
					.ifPresent(l -> setGlobalLogValidationExecution(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.rdfsSubClassReasoning, RDFS_SUB_CLASS_REASONING)
					.ifPresent(l -> setRdfsSubClassReasoning(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.performanceLogging, PERFORMANCE_LOGGING)
					.ifPresent(l -> setPerformanceLogging(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.serializableValidation, SERIALIZABLE_VALIDATION)
					.ifPresent(l -> setSerializableValidation(l.booleanValue()));

			Configurations
					.getLiteralValue(m, implNode, CONFIG.Shacl.eclipseRdf4jShaclExtensions,
							ShaclSailSchema.ECLIPSE_RDF4J_SHACL_EXTENSIONS)
					.ifPresent(l -> setEclipseRdf4jShaclExtensions(l.booleanValue()));

			Configurations.getLiteralValue(m, implNode, CONFIG.Shacl.dashDataShapes, ShaclSailSchema.DASH_DATA_SHAPES)
					.ifPresent(l -> setDashDataShapes(l.booleanValue()));

			Configurations
					.getLiteralValue(m, implNode, CONFIG.Shacl.validationResultsLimitTotal,
							ShaclSailSchema.VALIDATION_RESULTS_LIMIT_TOTAL)
					.ifPresent(l -> setValidationResultsLimitTotal(l.longValue()));

			Configurations
					.getLiteralValue(m, implNode, CONFIG.Shacl.validationResultsLimitPerConstraint,
							ShaclSailSchema.VALIDATION_RESULTS_LIMIT_PER_CONSTRAINT)
					.ifPresent(l -> setValidationResultsLimitPerConstraint(l.longValue()));

			Configurations
					.getLiteralValue(m, implNode, CONFIG.Shacl.transactionalValidationLimit,
							ShaclSailSchema.TRANSACTIONAL_VALIDATION_LIMIT)
					.ifPresent(l -> setTransactionalValidationLimit(l.longValue()));

			setShapesGraphs(
					Configurations
							.getPropertyValues(m, implNode, CONFIG.Shacl.shapesGraph, ShaclSailSchema.SHAPES_GRAPH)
							.stream()
							.peek(v -> {
								if (!v.isIRI()) {
									throw new IllegalArgumentException(
											"Expected IRI but found " + v.getClass().getSimpleName() + "for value "
													+ v.stringValue());
								}
							})
							.map(o -> ((IRI) o))
							.collect(Collectors.toUnmodifiableSet())
			);

		} catch (IllegalArgumentException e) {
			throw new SailConfigException("error parsing Sail configuration", e);
		}

	}

}
