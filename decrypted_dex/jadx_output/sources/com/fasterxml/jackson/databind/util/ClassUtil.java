package com.fasterxml.jackson.databind.util;

import E1.a;
import Xa.h;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.stub.StubApp;
import i2.u;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ClassUtil {
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    private static final Ctor[] NO_CTORS = new Ctor[0];
    private static final Iterator<?> EMPTY_ITERATOR = Collections.emptyIterator();

    public static final class Ctor {
        private transient Annotation[] _annotations;
        public final Constructor<?> _ctor;
        private transient Annotation[][] _paramAnnotations;
        private int _paramCount = -1;

        public Ctor(Constructor<?> constructor) {
            this._ctor = constructor;
        }

        public Constructor<?> getConstructor() {
            return this._ctor;
        }

        public Annotation[] getDeclaredAnnotations() {
            Annotation[] annotationArr = this._annotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[] declaredAnnotations = this._ctor.getDeclaredAnnotations();
            this._annotations = declaredAnnotations;
            return declaredAnnotations;
        }

        public Class<?> getDeclaringClass() {
            return this._ctor.getDeclaringClass();
        }

        public int getParamCount() {
            int i3 = this._paramCount;
            if (i3 >= 0) {
                return i3;
            }
            int parameterCount = this._ctor.getParameterCount();
            this._paramCount = parameterCount;
            return parameterCount;
        }

        public Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this._paramAnnotations;
            if (annotationArr != null) {
                return annotationArr;
            }
            Annotation[][] parameterAnnotations = this._ctor.getParameterAnnotations();
            this._paramAnnotations = parameterAnnotations;
            return parameterAnnotations;
        }
    }

    private static void _addRawSuperTypes(Class<?> cls, Class<?> cls2, Collection<Class<?>> collection, boolean z2) {
        if (cls == cls2 || cls == null || cls == Object.class) {
            return;
        }
        if (z2) {
            if (collection.contains(cls)) {
                return;
            } else {
                collection.add(cls);
            }
        }
        for (Class<?> cls3 : _interfaces(cls)) {
            _addRawSuperTypes(cls3, cls2, collection, true);
        }
        _addRawSuperTypes(cls.getSuperclass(), cls2, collection, true);
    }

    private static Method[] _failGetClassMethods(Class<?> cls, Throwable th) throws IllegalArgumentException {
        String name = cls.getName();
        String name2 = th.getClass().getName();
        String message = th.getMessage();
        StringBuilder t3 = u.t(StubApp.getString2(11074), name, StubApp.getString2(11075), name2, StubApp.getString2(3046));
        t3.append(message);
        throw new IllegalArgumentException(t3.toString(), th);
    }

    private static Class<?>[] _interfaces(Class<?> cls) {
        return cls.getInterfaces();
    }

    public static String apostrophed(String str) {
        if (str == null) {
            return StubApp.getString2(10790);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('\'');
        sb2.append(str);
        sb2.append('\'');
        return sb2.toString();
    }

    public static String backticked(String str) {
        if (str == null) {
            return StubApp.getString2(10790);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append('`');
        sb2.append(str);
        sb2.append('`');
        return sb2.toString();
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return StubApp.getString2(2112);
        }
        if (cls.isArray()) {
            return StubApp.getString2(986);
        }
        if (Enum.class.isAssignableFrom(cls)) {
            return StubApp.getString2(11076);
        }
        if (cls.isPrimitive()) {
            return StubApp.getString2(11077);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void checkAndFixAccess(Member member, boolean z2) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z2 || isJDKClass(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e10) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException(StubApp.getString2(11084) + member + StubApp.getString2(11085) + member.getDeclaringClass().getName() + StubApp.getString2(11086) + e10.getMessage());
        } catch (RuntimeException e11) {
            if (!StubApp.getString2(11078).equals(e11.getClass().getSimpleName())) {
                throw e11;
            }
            String simpleName = member.getClass().getSimpleName();
            String name = member.getName();
            String nameOf = nameOf(member.getDeclaringClass());
            String name2 = e11.getClass().getName();
            String message = e11.getMessage();
            StringBuilder t3 = u.t(StubApp.getString2(11079), simpleName, StubApp.getString2(11080), name, StubApp.getString2(11081));
            a.v(t3, nameOf, StubApp.getString2(11082), name2, StubApp.getString2(11083));
            t3.append(message);
            throw new IllegalArgumentException(t3.toString(), e11);
        }
    }

    public static String classNameOf(Object obj) {
        if (obj == null) {
            return StubApp.getString2(10790);
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Class<?> classOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e10) {
            exc.addSuppressed(e10);
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T createInstance(Class<T> cls, boolean z2) throws IllegalArgumentException {
        Constructor findConstructor = findConstructor(cls, z2);
        if (findConstructor == null) {
            throw new IllegalArgumentException(h.k(cls, new StringBuilder(StubApp.getString2(3483)), StubApp.getString2(11087)));
        }
        try {
            return (T) findConstructor.newInstance(new Object[0]);
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, StubApp.getString2(10679) + cls.getName() + StubApp.getString2(10680) + e10.getMessage());
            return null;
        }
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException(h.k(cls, new StringBuilder(StubApp.getString2(3483)), StubApp.getString2(11088)));
    }

    public static <T> Iterator<T> emptyIterator() {
        return (Iterator<T>) EMPTY_ITERATOR;
    }

    public static String exceptionMessage(Throwable th) {
        return th instanceof JacksonException ? ((JacksonException) th).getOriginalMessage() : (!(th instanceof InvocationTargetException) || th.getCause() == null) ? th.getMessage() : th.getCause().getMessage();
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        return isObjectOrPrimitive(cls) ? NO_ANNOTATIONS : cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z2) throws IllegalArgumentException {
        String string2 = StubApp.getString2(11089);
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (z2) {
                checkAndFixAccess(declaredConstructor, z2);
                return declaredConstructor;
            }
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                return declaredConstructor;
            }
            throw new IllegalArgumentException(string2 + cls.getName() + StubApp.getString2("11090"));
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e10) {
            unwrapAndThrowAsIAE(e10, StubApp.getString2(11091) + cls.getName() + StubApp.getString2(10680) + e10.getMessage());
            return null;
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        return !enumSet.isEmpty() ? findEnumType((Enum<?>) enumSet.iterator().next()) : EnumTypeLocator.instance.enumTypeFor(enumSet);
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r8 : cls.getEnumConstants()) {
                    if (name.equals(r8.name())) {
                        return r8;
                    }
                }
            }
        }
        return null;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z2) {
        if (cls == null || cls == cls2 || cls == Object.class) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(8);
        _addRawSuperTypes(cls, cls2, arrayList, z2);
        return arrayList;
    }

    public static List<Class<?>> findSuperClasses(Class<?> cls, Class<?> cls2, boolean z2) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z2) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static String getClassDescription(Object obj) {
        if (obj == null) {
            return StubApp.getString2(351);
        }
        return nameOf(obj instanceof Class ? (Class) obj : obj.getClass());
    }

    public static Method[] getClassMethods(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                return _failGetClassMethods(cls, e10);
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (Throwable th) {
                    return _failGetClassMethods(cls, th);
                }
            } catch (ClassNotFoundException e11) {
                e10.addSuppressed(e11);
                return _failGetClassMethods(cls, e10);
            }
        } catch (Throwable th2) {
            return _failGetClassMethods(cls, th2);
        }
    }

    public static Ctor[] getConstructors(Class<?> cls) {
        if (cls.isInterface() || isObjectOrPrimitive(cls)) {
            return NO_CTORS;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        Ctor[] ctorArr = new Ctor[length];
        for (int i3 = 0; i3 < length; i3++) {
            ctorArr[i3] = new Ctor(declaredConstructors[i3]);
        }
        return ctorArr;
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if (hasEnclosingMethod(cls)) {
                    return null;
                }
                return getEnclosingClass(cls);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static Throwable getRootCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    public static String getTypeDescription(JavaType javaType) {
        if (javaType == null) {
            return StubApp.getString2(10790);
        }
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append('`');
        sb2.append(javaType.toCanonical());
        sb2.append('`');
        return sb2.toString();
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        return obj != null && obj.getClass() == cls;
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        return (isObjectOrPrimitive(cls) || cls.getEnclosingMethod() == null) ? false : true;
    }

    public static boolean isBogusClass(Class<?> cls) {
        return cls == Void.class || cls == Void.TYPE || cls == NoClass.class;
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isEnumType(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    public static boolean isJDKClass(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith(StubApp.getString2(8445)) || name.startsWith(StubApp.getString2(11092));
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj == null || isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class<?> cls, boolean z2) {
        try {
            boolean isStatic = Modifier.isStatic(cls.getModifiers());
            if (!isStatic && hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (z2 || isStatic) {
                return null;
            }
            if (getEnclosingClass(cls) != null) {
                return "non-static member class";
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        return (Modifier.isStatic(cls.getModifiers()) || getEnclosingClass(cls) == null) ? false : true;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        return cls == CLS_OBJECT || cls.isPrimitive();
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        return name.startsWith(StubApp.getString2(11093)) || name.startsWith(StubApp.getString2(11094));
    }

    public static boolean isRecordType(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            return StubApp.getString2(11095).equals(superclass.getName());
        }
        return false;
    }

    public static String name(String str) {
        return str == null ? StubApp.getString2(10790) : apostrophed(str);
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return StubApp.getString2(10790);
        }
        int i3 = 0;
        while (cls.isArray()) {
            i3++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder(simpleName);
            do {
                sb2.append(StubApp.getString2(11096));
                i3--;
            } while (i3 > 0);
            simpleName = sb2.toString();
        }
        return backticked(simpleName);
    }

    public static <T> T nonNull(T t3, T t10) {
        return t3 == null ? t10 : t3;
    }

    public static String nonNullString(String str) {
        return str == null ? "" : str;
    }

    public static String nullOrToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static String quotedOr(Object obj, String str) {
        return obj == null ? str : String.format(StubApp.getString2(11097), obj);
    }

    public static Class<?> rawClass(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static void throwAsIAE(Throwable th) {
        throwAsIAE(th, th.getMessage());
    }

    public static <T> T throwAsMappingException(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        throw JsonMappingException.from(deserializationContext, iOException.getMessage()).withCause(iOException);
    }

    public static Throwable throwIfError(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th;
    }

    public static Throwable throwIfIOE(Throwable th) throws IOException {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        return th;
    }

    public static Throwable throwIfRTE(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        return th;
    }

    public static Throwable throwRootCauseIfIOE(Throwable th) throws IOException {
        return throwIfIOE(getRootCause(th));
    }

    public static void unwrapAndThrowAsIAE(Throwable th) {
        throwAsIAE(getRootCause(th));
    }

    public static void verifyMustOverride(Class<?> cls, Object obj, String str) {
        if (obj.getClass() == cls) {
            return;
        }
        throw new IllegalStateException(AbstractC1482f.k(u.t(StubApp.getString2(11098), obj.getClass().getName(), StubApp.getString2(11099), cls.getName(), StubApp.getString2(11100)), str, StubApp.getString2(620)));
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException(h.k(cls, new StringBuilder(StubApp.getString2(3483)), StubApp.getString2(11088)));
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static void throwAsIAE(Throwable th, String str) {
        throwIfRTE(th);
        throwIfError(th);
        throw new IllegalArgumentException(str, th);
    }

    public static void unwrapAndThrowAsIAE(Throwable th, String str) {
        throwAsIAE(getRootCause(th), str);
    }

    public static class EnumTypeLocator {
        static final EnumTypeLocator instance = new EnumTypeLocator();
        private final Field enumMapTypeField;
        private final Field enumSetTypeField;
        private final String failForEnumMap;
        private final String failForEnumSet;

        private EnumTypeLocator() {
            String obj;
            Field field;
            String obj2;
            Field field2 = null;
            try {
                field = locateField(EnumSet.class, StubApp.getString2("11068"), Class.class);
                obj = null;
            } catch (Exception e10) {
                obj = e10.toString();
                field = null;
            }
            this.enumSetTypeField = field;
            this.failForEnumSet = obj;
            try {
                field2 = locateField(EnumMap.class, StubApp.getString2("11069"), Class.class);
                obj2 = null;
            } catch (Exception e11) {
                obj2 = e11.toString();
            }
            this.enumMapTypeField = field2;
            this.failForEnumMap = obj2;
        }

        private Object get(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        private static Field locateField(Class<?> cls, String str, Class<?> cls2) throws Exception {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName()) && field.getType() == cls2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            throw new IllegalStateException(AbstractC1482f.j(StubApp.getString2(11070), str, StubApp.getString2(11071), cls.getName(), StubApp.getString2(620)));
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumSet<?> enumSet) {
            Field field = this.enumSetTypeField;
            if (field != null) {
                return (Class) get(enumSet, field);
            }
            throw new IllegalStateException(StubApp.getString2(11073) + this.failForEnumSet);
        }

        public Class<? extends Enum<?>> enumTypeFor(EnumMap<?, ?> enumMap) {
            Field field = this.enumMapTypeField;
            if (field != null) {
                return (Class) get(enumMap, field);
            }
            throw new IllegalStateException(StubApp.getString2(11072) + this.failForEnumMap);
        }
    }

    public static String name(PropertyName propertyName) {
        if (propertyName == null) {
            return StubApp.getString2(10790);
        }
        return apostrophed(propertyName.getSimpleName());
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum<?>) enumMap.keySet().iterator().next());
        }
        return EnumTypeLocator.instance.enumTypeFor(enumMap);
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e10) {
                exc.addSuppressed(e10);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                exc.addSuppressed(e11);
            }
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> r02) {
        return r02.getDeclaringClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static String nameOf(Named named) {
        if (named == null) {
            return StubApp.getString2(10790);
        }
        return apostrophed(named.getName());
    }
}
