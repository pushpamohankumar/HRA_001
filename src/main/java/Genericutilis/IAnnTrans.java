package Genericutilis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

import com.HRA;

public class IAnnTrans implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod,
			Class<?> occurringClazz) {
		//annotation.setRetryAnalyzer((Class<? extends IRetryAnalyzer>) com.HRA.GenericUtilis.RetryImpClass.class);
	}

}
