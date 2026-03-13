package kotlin.jvm.internal;

import E1.a;
import i2.u;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Intrinsics {

    @SinceKotlin(version = "1.4")
    public static class Kotlin {
        private Kotlin() {
        }
    }

    private Intrinsics() {
    }

    public static boolean areEqual(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void checkExpressionValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(AbstractC1482f.g(str, " must not be null"))));
        }
    }

    public static void checkFieldIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(AbstractC1482f.i("Field specified as non-null is null: ", str, ".", str2))));
        }
    }

    public static void checkHasClass(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e10) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException(a.k("Class ", replace, " is not found. Please update the Kotlin runtime to the latest version"), e10)));
        }
    }

    public static void checkNotNull(Object obj) {
        if (obj == null) {
            throwJavaNpe();
        }
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(AbstractC1482f.g(str, " must not be null"))));
        }
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullNPE(str);
        }
    }

    public static void checkParameterIsNotNull(Object obj, String str) {
        if (obj == null) {
            throwParameterIsNullIAE(str);
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(AbstractC1482f.i("Method specified as non-null returned null: ", str, ".", str2))));
        }
    }

    public static int compare(int i3, int i10) {
        if (i3 < i10) {
            return -1;
        }
        return i3 == i10 ? 0 : 1;
    }

    private static String createParameterIsNullExceptionMessage(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i3 = 0;
        while (!stackTrace[i3].getClassName().equals(name)) {
            i3++;
        }
        while (stackTrace[i3].getClassName().equals(name)) {
            i3++;
        }
        StackTraceElement stackTraceElement = stackTrace[i3];
        StringBuilder t3 = u.t("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
        t3.append(str);
        return t3.toString();
    }

    public static void needClassReification() {
        throwUndefinedForReified();
    }

    public static void reifiedOperationMarker(int i3, String str) {
        throwUndefinedForReified();
    }

    private static <T extends Throwable> T sanitizeStackTrace(T t3) {
        return (T) sanitizeStackTrace(t3, Intrinsics.class.getName());
    }

    public static String stringPlus(String str, Object obj) {
        return str + obj;
    }

    public static void throwAssert() {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError()));
    }

    public static void throwIllegalArgument() {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException()));
    }

    public static void throwIllegalState() {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException()));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe() {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException()));
    }

    public static void throwNpe() {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException()));
    }

    private static void throwParameterIsNullIAE(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(createParameterIsNullExceptionMessage(str))));
    }

    private static void throwParameterIsNullNPE(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(createParameterIsNullExceptionMessage(str))));
    }

    public static void throwUndefinedForReified() {
        throwUndefinedForReified("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void throwUninitializedProperty(String str) {
        throw ((UninitializedPropertyAccessException) sanitizeStackTrace(new UninitializedPropertyAccessException(str)));
    }

    public static void throwUninitializedPropertyAccessException(String str) {
        throwUninitializedProperty("lateinit property " + str + " has not been initialized");
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d8, Double d10) {
        return d8 == null ? d10 == null : d10 != null && d8.doubleValue() == d10.doubleValue();
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throwJavaNpe(str);
        }
    }

    public static int compare(long j, long j3) {
        if (j < j3) {
            return -1;
        }
        return j == j3 ? 0 : 1;
    }

    public static void needClassReification(String str) {
        throwUndefinedForReified(str);
    }

    public static void reifiedOperationMarker(int i3, String str, String str2) {
        throwUndefinedForReified(str2);
    }

    public static <T extends Throwable> T sanitizeStackTrace(T t3, String str) {
        StackTraceElement[] stackTrace = t3.getStackTrace();
        int length = stackTrace.length;
        int i3 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i3 = i10;
            }
        }
        t3.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i3 + 1, length));
        return t3;
    }

    public static void throwAssert(String str) {
        throw ((AssertionError) sanitizeStackTrace(new AssertionError(str)));
    }

    public static void throwIllegalArgument(String str) {
        throw ((IllegalArgumentException) sanitizeStackTrace(new IllegalArgumentException(str)));
    }

    public static void throwIllegalState(String str) {
        throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
    }

    @SinceKotlin(version = "1.4")
    public static void throwJavaNpe(String str) {
        throw ((NullPointerException) sanitizeStackTrace(new NullPointerException(str)));
    }

    public static void throwNpe(String str) {
        throw ((KotlinNullPointerException) sanitizeStackTrace(new KotlinNullPointerException(str)));
    }

    public static void throwUndefinedForReified(String str) {
        throw new UnsupportedOperationException(str);
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Double d8, double d10) {
        return d8 != null && d8.doubleValue() == d10;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(double d8, Double d10) {
        return d10 != null && d8 == d10.doubleValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f10, Float f11) {
        return f10 == null ? f11 == null : f11 != null && f10.floatValue() == f11.floatValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    @SinceKotlin(version = "1.1")
    public static boolean areEqual(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    public static void checkFieldIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkReturnedValueIsNotNull(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) sanitizeStackTrace(new IllegalStateException(str)));
        }
    }

    public static void checkHasClass(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e10) {
            throw ((ClassNotFoundException) sanitizeStackTrace(new ClassNotFoundException(AbstractC1482f.i("Class ", replace, " is not found: this code requires the Kotlin runtime of version at least ", str2), e10)));
        }
    }
}
