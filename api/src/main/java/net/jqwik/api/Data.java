package net.jqwik.api;

import java.lang.annotation.*;

import org.apiguardian.api.*;

import static org.apiguardian.api.API.Status.*;

/**
 * Used to annotate methods that can provide data points for property methods.
 * Those methods must return an instance of {@linkplain Iterable}.
 *
 * {@code value} is used as reference name. If it is not specified, the method's name is used instead.
 */
@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(status = MAINTAINED, since = "1.0")
public @interface Data {
	String value() default "";
}
