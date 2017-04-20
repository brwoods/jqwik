package net.jqwik.descriptor;

import net.jqwik.api.*;
import org.junit.platform.engine.*;
import org.junit.platform.engine.support.descriptor.*;

import java.lang.reflect.*;

public abstract class AbstractMethodDescriptor extends AbstractTestDescriptor implements PropertyContext {
	private final Method targetMethod;
	private final Class containerClass;

	public AbstractMethodDescriptor(UniqueId uniqueId, Method targetMethod, Class containerClass) {
		super(uniqueId, determineDisplayName(targetMethod));
		this.containerClass = containerClass;
		this.targetMethod = targetMethod;
		setSource(new MethodSource(this.targetMethod));
	}

	protected static String determineDisplayName(Method targetMethod) {
		return targetMethod.getName();
	}

	public Method getTargetMethod() {
		return targetMethod;
	}

	public Class getContainerClass() {
		return containerClass;
	}

	public String getLabel() {
		return getDisplayName();
	}

	@Override
	public Type getType() {
		return Type.TEST;
	}

}