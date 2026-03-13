package com.fasterxml.jackson.databind.type;

import E1.a;
import Xa.h;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.LookupCache;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.x509.DisplayText;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class TypeFactory implements Serializable {
    private static final Class<?> CLS_BOOL;
    private static final Class<?> CLS_INT;
    private static final Class<?> CLS_LONG;
    protected static final SimpleType CORE_TYPE_BOOL;
    protected static final SimpleType CORE_TYPE_COMPARABLE;
    protected static final SimpleType CORE_TYPE_ENUM;
    protected static final SimpleType CORE_TYPE_INT;
    protected static final SimpleType CORE_TYPE_JSON_NODE;
    protected static final SimpleType CORE_TYPE_LONG;
    protected static final SimpleType CORE_TYPE_OBJECT;
    protected static final SimpleType CORE_TYPE_STRING;
    protected final ClassLoader _classLoader;
    protected final TypeModifier[] _modifiers;
    protected final TypeParser _parser;
    protected final LookupCache<Object, JavaType> _typeCache;
    private static final JavaType[] NO_TYPES = new JavaType[0];
    protected static final TypeFactory instance = new TypeFactory();
    protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
    private static final Class<?> CLS_STRING = String.class;
    private static final Class<?> CLS_OBJECT = Object.class;
    private static final Class<?> CLS_COMPARABLE = Comparable.class;
    private static final Class<?> CLS_ENUM = Enum.class;
    private static final Class<?> CLS_JSON_NODE = JsonNode.class;

    static {
        Class<?> cls = Boolean.TYPE;
        CLS_BOOL = cls;
        Class<?> cls2 = Integer.TYPE;
        CLS_INT = cls2;
        Class<?> cls3 = Long.TYPE;
        CLS_LONG = cls3;
        CORE_TYPE_BOOL = new SimpleType(cls);
        CORE_TYPE_INT = new SimpleType(cls2);
        CORE_TYPE_LONG = new SimpleType(cls3);
        CORE_TYPE_STRING = new SimpleType(String.class);
        CORE_TYPE_OBJECT = new SimpleType(Object.class);
        CORE_TYPE_COMPARABLE = new SimpleType(Comparable.class);
        CORE_TYPE_ENUM = new SimpleType(Enum.class);
        CORE_TYPE_JSON_NODE = new SimpleType(JsonNode.class);
    }

    private TypeFactory() {
        this(null);
    }

    private TypeBindings _bindingsForSubtype(JavaType javaType, int i3, Class<?> cls, boolean z2) {
        PlaceholderForType[] placeholderForTypeArr = new PlaceholderForType[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            placeholderForTypeArr[i10] = new PlaceholderForType(i10);
        }
        JavaType findSuperType = _fromClass(null, cls, TypeBindings.create(cls, placeholderForTypeArr)).findSuperType(javaType.getRawClass());
        if (findSuperType == null) {
            throw new IllegalArgumentException(AbstractC1482f.i("Internal error: unable to locate supertype (", javaType.getRawClass().getName(), ") from resolved subtype ", cls.getName()));
        }
        String _resolveTypePlaceholders = _resolveTypePlaceholders(javaType, findSuperType);
        if (_resolveTypePlaceholders != null && !z2) {
            throw new IllegalArgumentException("Failed to specialize base type " + javaType.toCanonical() + " as " + cls.getName() + ", problem: " + _resolveTypePlaceholders);
        }
        JavaType[] javaTypeArr = new JavaType[i3];
        for (int i11 = 0; i11 < i3; i11++) {
            JavaType actualType = placeholderForTypeArr[i11].actualType();
            if (actualType == null) {
                actualType = unknownType();
            }
            javaTypeArr[i11] = actualType;
        }
        return TypeBindings.create(cls, javaTypeArr);
    }

    private JavaType _collectionType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else {
            if (typeParameters.size() != 1) {
                throw new IllegalArgumentException(h.k(cls, new StringBuilder("Strange Collection type "), ": cannot determine type parameters"));
            }
            javaType2 = typeParameters.get(0);
        }
        return CollectionType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    private JavaType _mapType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType _unknownType;
        TypeBindings typeBindings2;
        JavaType javaType2;
        JavaType[] javaTypeArr2;
        JavaType javaType3;
        JavaType javaType4;
        Class<?> cls2;
        if (cls == Properties.class) {
            _unknownType = CORE_TYPE_STRING;
        } else {
            List<JavaType> typeParameters = typeBindings.getTypeParameters();
            int size = typeParameters.size();
            if (size != 0) {
                if (size != 2) {
                    throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", ClassUtil.nameOf(cls), Integer.valueOf(size), size == 1 ? "" : "s", typeBindings));
                }
                JavaType javaType5 = typeParameters.get(0);
                typeBindings2 = typeBindings;
                javaType2 = javaType;
                javaTypeArr2 = javaTypeArr;
                javaType3 = typeParameters.get(1);
                javaType4 = javaType5;
                cls2 = cls;
                return MapType.construct(cls2, typeBindings2, javaType2, javaTypeArr2, javaType4, javaType3);
            }
            _unknownType = _unknownType();
        }
        cls2 = cls;
        typeBindings2 = typeBindings;
        javaType2 = javaType;
        javaTypeArr2 = javaTypeArr;
        javaType4 = _unknownType;
        javaType3 = javaType4;
        return MapType.construct(cls2, typeBindings2, javaType2, javaTypeArr2, javaType4, javaType3);
    }

    private JavaType _referenceType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType javaType2;
        List<JavaType> typeParameters = typeBindings.getTypeParameters();
        if (typeParameters.isEmpty()) {
            javaType2 = _unknownType();
        } else {
            if (typeParameters.size() != 1) {
                throw new IllegalArgumentException(h.k(cls, new StringBuilder("Strange Reference type "), ": cannot determine type parameters"));
            }
            javaType2 = typeParameters.get(0);
        }
        return ReferenceType.construct(cls, typeBindings, javaType, javaTypeArr, javaType2);
    }

    private String _resolveTypePlaceholders(JavaType javaType, JavaType javaType2) throws IllegalArgumentException {
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters2.size();
        int size2 = typeParameters.size();
        int i3 = 0;
        while (i3 < size2) {
            JavaType javaType3 = typeParameters.get(i3);
            JavaType unknownType = i3 < size ? typeParameters2.get(i3) : unknownType();
            if (!_verifyAndResolvePlaceholders(javaType3, unknownType) && !javaType3.hasRawClass(Object.class) && ((i3 != 0 || !javaType.isMapLikeType() || !unknownType.hasRawClass(Object.class)) && (!javaType3.isInterface() || !javaType3.isTypeOrSuperTypeOf(unknownType.getRawClass())))) {
                return String.format("Type parameter #%d/%d differs; can not specialize %s with %s", Integer.valueOf(i3 + 1), Integer.valueOf(size2), javaType3.toCanonical(), unknownType.toCanonical());
            }
            i3++;
        }
        return null;
    }

    private boolean _verifyAndResolvePlaceholders(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).actualType(javaType);
            return true;
        }
        if (javaType.getRawClass() != javaType2.getRawClass()) {
            return false;
        }
        List<JavaType> typeParameters = javaType.getBindings().getTypeParameters();
        List<JavaType> typeParameters2 = javaType2.getBindings().getTypeParameters();
        int size = typeParameters.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!_verifyAndResolvePlaceholders(typeParameters.get(i3), typeParameters2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static TypeFactory defaultInstance() {
        return instance;
    }

    public static JavaType unknownType() {
        return defaultInstance()._unknownType();
    }

    public JavaType _applyModifiers(Type type, JavaType javaType) {
        if (this._modifiers == null) {
            return javaType;
        }
        javaType.getBindings();
        TypeModifier[] typeModifierArr = this._modifiers;
        if (typeModifierArr.length <= 0) {
            return javaType;
        }
        TypeModifier typeModifier = typeModifierArr[0];
        throw null;
    }

    public JavaType _constructSimple(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        JavaType _findWellKnownSimple;
        return (!typeBindings.isEmpty() || (_findWellKnownSimple = _findWellKnownSimple(cls)) == null) ? _newSimpleType(cls, typeBindings, javaType, javaTypeArr) : _findWellKnownSimple;
    }

    public Class<?> _findPrimitive(String str) {
        if ("int".equals(str)) {
            return Integer.TYPE;
        }
        if ("long".equals(str)) {
            return Long.TYPE;
        }
        if ("float".equals(str)) {
            return Float.TYPE;
        }
        if ("double".equals(str)) {
            return Double.TYPE;
        }
        if ("boolean".equals(str)) {
            return Boolean.TYPE;
        }
        if ("byte".equals(str)) {
            return Byte.TYPE;
        }
        if ("char".equals(str)) {
            return Character.TYPE;
        }
        if ("short".equals(str)) {
            return Short.TYPE;
        }
        if ("void".equals(str)) {
            return Void.TYPE;
        }
        return null;
    }

    public JavaType _findWellKnownSimple(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == CLS_BOOL) {
                return CORE_TYPE_BOOL;
            }
            if (cls == CLS_INT) {
                return CORE_TYPE_INT;
            }
            if (cls == CLS_LONG) {
                return CORE_TYPE_LONG;
            }
            return null;
        }
        if (cls == CLS_STRING) {
            return CORE_TYPE_STRING;
        }
        if (cls == CLS_OBJECT) {
            return CORE_TYPE_OBJECT;
        }
        if (cls == CLS_JSON_NODE) {
            return CORE_TYPE_JSON_NODE;
        }
        return null;
    }

    public JavaType _fromAny(ClassStack classStack, Type type, TypeBindings typeBindings) {
        JavaType _fromWildcard;
        if (type instanceof Class) {
            _fromWildcard = _fromClass(classStack, (Class) type, EMPTY_BINDINGS);
        } else if (type instanceof ParameterizedType) {
            _fromWildcard = _fromParamType(classStack, (ParameterizedType) type, typeBindings);
        } else {
            if (type instanceof JavaType) {
                return (JavaType) type;
            }
            if (type instanceof GenericArrayType) {
                _fromWildcard = _fromArrayType(classStack, (GenericArrayType) type, typeBindings);
            } else if (type instanceof TypeVariable) {
                _fromWildcard = _fromVariable(classStack, (TypeVariable) type, typeBindings);
            } else {
                if (!(type instanceof WildcardType)) {
                    StringBuilder sb2 = new StringBuilder("Unrecognized Type: ");
                    sb2.append(type == null ? "[null]" : type.toString());
                    throw new IllegalArgumentException(sb2.toString());
                }
                _fromWildcard = _fromWildcard(classStack, (WildcardType) type, typeBindings);
            }
        }
        return _applyModifiers(type, _fromWildcard);
    }

    public JavaType _fromArrayType(ClassStack classStack, GenericArrayType genericArrayType, TypeBindings typeBindings) {
        return ArrayType.construct(_fromAny(classStack, genericArrayType.getGenericComponentType(), typeBindings), typeBindings);
    }

    public JavaType _fromClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        ClassStack child;
        JavaType _resolveSuperClass;
        JavaType[] _resolveSuperInterfaces;
        Class<?> cls2;
        TypeBindings typeBindings2;
        TypeFactory typeFactory;
        JavaType javaType;
        JavaType _findWellKnownSimple = _findWellKnownSimple(cls);
        if (_findWellKnownSimple != null) {
            return _findWellKnownSimple;
        }
        Object asKey = (typeBindings == null || typeBindings.isEmpty()) ? cls : typeBindings.asKey(cls);
        JavaType javaType2 = this._typeCache.get(asKey);
        if (javaType2 != null) {
            return javaType2;
        }
        if (classStack == null) {
            child = new ClassStack(cls);
        } else {
            ClassStack find = classStack.find(cls);
            if (find != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, EMPTY_BINDINGS);
                find.addSelfReference(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            child = classStack.child(cls);
        }
        ClassStack classStack2 = child;
        if (cls.isArray()) {
            javaType = ArrayType.construct(_fromAny(classStack2, cls.getComponentType(), typeBindings), typeBindings);
            typeFactory = this;
        } else {
            if (cls.isInterface()) {
                _resolveSuperInterfaces = _resolveSuperInterfaces(classStack2, cls, typeBindings);
                _resolveSuperClass = null;
            } else {
                _resolveSuperClass = _resolveSuperClass(classStack2, cls, typeBindings);
                _resolveSuperInterfaces = _resolveSuperInterfaces(classStack2, cls, typeBindings);
            }
            JavaType[] javaTypeArr = _resolveSuperInterfaces;
            JavaType javaType3 = _resolveSuperClass;
            if (cls == Properties.class) {
                SimpleType simpleType = CORE_TYPE_STRING;
                cls2 = cls;
                typeBindings2 = typeBindings;
                javaType2 = MapType.construct(cls2, typeBindings2, javaType3, javaTypeArr, simpleType, simpleType);
            } else {
                cls2 = cls;
                typeBindings2 = typeBindings;
                if (javaType3 != null) {
                    javaType2 = javaType3.refine(cls2, typeBindings2, javaType3, javaTypeArr);
                }
            }
            typeFactory = this;
            if (javaType2 == null) {
                javaType = typeFactory._fromWellKnownClass(classStack2, cls2, typeBindings2, javaType3, javaTypeArr);
                typeFactory = this;
                if (javaType == null && (javaType = typeFactory._fromWellKnownInterface(classStack2, cls2, typeBindings2, javaType3, javaTypeArr)) == null) {
                    javaType = _newSimpleType(cls2, typeBindings2, javaType3, javaTypeArr);
                }
            } else {
                javaType = javaType2;
            }
        }
        classStack2.resolveSelfReferences(javaType);
        if (!javaType.hasHandlers()) {
            typeFactory._typeCache.putIfAbsent(asKey, javaType);
        }
        return javaType;
    }

    public JavaType _fromParamType(ClassStack classStack, ParameterizedType parameterizedType, TypeBindings typeBindings) {
        TypeBindings create;
        Class<?> cls = (Class) parameterizedType.getRawType();
        if (cls == CLS_ENUM) {
            return CORE_TYPE_ENUM;
        }
        if (cls == CLS_COMPARABLE) {
            return CORE_TYPE_COMPARABLE;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
        if (length == 0) {
            create = EMPTY_BINDINGS;
        } else {
            JavaType[] javaTypeArr = new JavaType[length];
            for (int i3 = 0; i3 < length; i3++) {
                javaTypeArr[i3] = _fromAny(classStack, actualTypeArguments[i3], typeBindings);
            }
            create = TypeBindings.create(cls, javaTypeArr);
        }
        return _fromClass(classStack, cls, create);
    }

    public JavaType _fromVariable(ClassStack classStack, TypeVariable<?> typeVariable, TypeBindings typeBindings) {
        Type[] bounds;
        String name = typeVariable.getName();
        if (typeBindings == null) {
            throw new IllegalArgumentException(a.k("Null `bindings` passed (type variable \"", name, "\")"));
        }
        JavaType findBoundType = typeBindings.findBoundType(name);
        if (findBoundType != null) {
            return findBoundType;
        }
        if (typeBindings.hasUnbound(name)) {
            return CORE_TYPE_OBJECT;
        }
        TypeBindings withUnboundVariable = typeBindings.withUnboundVariable(name);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return _fromAny(classStack, bounds[0], withUnboundVariable);
    }

    public JavaType _fromWellKnownClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        if (typeBindings == null) {
            typeBindings = EMPTY_BINDINGS;
        }
        if (cls == Map.class) {
            return _mapType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == Collection.class) {
            return _collectionType(cls, typeBindings, javaType, javaTypeArr);
        }
        if (cls == AtomicReference.class) {
            return _referenceType(cls, typeBindings, javaType, javaTypeArr);
        }
        return null;
    }

    public JavaType _fromWellKnownInterface(ClassStack classStack, Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        for (JavaType javaType2 : javaTypeArr) {
            JavaType refine = javaType2.refine(cls, typeBindings, javaType, javaTypeArr);
            if (refine != null) {
                return refine;
            }
        }
        return null;
    }

    public JavaType _fromWildcard(ClassStack classStack, WildcardType wildcardType, TypeBindings typeBindings) {
        return _fromAny(classStack, wildcardType.getUpperBounds()[0], typeBindings);
    }

    public JavaType _newSimpleType(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        return new SimpleType(cls, typeBindings, javaType, javaTypeArr);
    }

    public JavaType _resolveSuperClass(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type genericSuperclass = ClassUtil.getGenericSuperclass(cls);
        if (genericSuperclass == null) {
            return null;
        }
        return _fromAny(classStack, genericSuperclass, typeBindings);
    }

    public JavaType[] _resolveSuperInterfaces(ClassStack classStack, Class<?> cls, TypeBindings typeBindings) {
        Type[] genericInterfaces = ClassUtil.getGenericInterfaces(cls);
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return NO_TYPES;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i3 = 0; i3 < length; i3++) {
            javaTypeArr[i3] = _fromAny(classStack, genericInterfaces[i3], typeBindings);
        }
        return javaTypeArr;
    }

    public JavaType _unknownType() {
        return CORE_TYPE_OBJECT;
    }

    public Class<?> classForName(String str, boolean z2, ClassLoader classLoader) throws ClassNotFoundException {
        return Class.forName(str, true, classLoader);
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, Class<?> cls2) {
        return constructCollectionType(cls, _fromClass(null, cls2, EMPTY_BINDINGS));
    }

    public JavaType constructFromCanonical(String str) throws IllegalArgumentException {
        return this._parser.parse(str);
    }

    public JavaType constructGeneralizedType(JavaType javaType, Class<?> cls) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == cls) {
            return javaType;
        }
        JavaType findSuperType = javaType.findSuperType(cls);
        if (findSuperType != null) {
            return findSuperType;
        }
        if (cls.isAssignableFrom(rawClass)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
    }

    public MapType constructMapType(Class<? extends Map> cls, Class<?> cls2, Class<?> cls3) {
        JavaType _fromClass;
        JavaType _fromClass2;
        if (cls == Properties.class) {
            _fromClass = CORE_TYPE_STRING;
            _fromClass2 = _fromClass;
        } else {
            TypeBindings typeBindings = EMPTY_BINDINGS;
            _fromClass = _fromClass(null, cls2, typeBindings);
            _fromClass2 = _fromClass(null, cls3, typeBindings);
        }
        return constructMapType(cls, _fromClass, _fromClass2);
    }

    public JavaType constructParametricType(Class<?> cls, TypeBindings typeBindings) {
        return _applyModifiers(cls, _fromClass(null, cls, typeBindings));
    }

    public JavaType constructSpecializedType(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        return constructSpecializedType(javaType, cls, false);
    }

    public JavaType constructType(Type type) {
        return _fromAny(null, type, EMPTY_BINDINGS);
    }

    public Class<?> findClass(String str) throws ClassNotFoundException {
        Throwable th;
        Class<?> _findPrimitive;
        if (str.indexOf(46) < 0 && (_findPrimitive = _findPrimitive(str)) != null) {
            return _findPrimitive;
        }
        ClassLoader classLoader = getClassLoader();
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (classLoader != null) {
            try {
                return classForName(str, true, classLoader);
            } catch (Exception e10) {
                th = ClassUtil.getRootCause(e10);
            }
        } else {
            th = null;
        }
        try {
            return classForName(str);
        } catch (Exception e11) {
            if (th == null) {
                th = ClassUtil.getRootCause(e11);
            }
            ClassUtil.throwIfRTE(th);
            throw new ClassNotFoundException(th.getMessage(), th);
        }
    }

    public JavaType[] findTypeParameters(JavaType javaType, Class<?> cls) {
        JavaType findSuperType = javaType.findSuperType(cls);
        return findSuperType == null ? NO_TYPES : findSuperType.getBindings().typeParameterArray();
    }

    public ClassLoader getClassLoader() {
        return this._classLoader;
    }

    public JavaType resolveMemberType(Type type, TypeBindings typeBindings) {
        return _fromAny(null, type, typeBindings);
    }

    @Deprecated
    public JavaType uncheckedSimpleType(Class<?> cls) {
        return _constructSimple(cls, EMPTY_BINDINGS, null, null);
    }

    public TypeFactory(LookupCache<Object, JavaType> lookupCache) {
        this._typeCache = lookupCache == null ? new LRUMap<>(16, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE) : lookupCache;
        this._parser = new TypeParser(this);
        this._modifiers = null;
        this._classLoader = null;
    }

    public Class<?> classForName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        if (r0 == java.util.EnumSet.class) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JavaType constructSpecializedType(com.fasterxml.jackson.databind.JavaType r4, java.lang.Class<?> r5, boolean r6) throws java.lang.IllegalArgumentException {
        /*
            r3 = this;
            java.lang.Class r0 = r4.getRawClass()
            if (r0 != r5) goto L7
            goto L62
        L7:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r0 != r1) goto L14
            com.fasterxml.jackson.databind.type.TypeBindings r6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS
            com.fasterxml.jackson.databind.JavaType r5 = r3._fromClass(r2, r5, r6)
            goto L97
        L14:
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L9c
            boolean r1 = r4.isContainerType()
            if (r1 == 0) goto L70
            boolean r1 = r4.isMapLikeType()
            if (r1 == 0) goto L47
            java.lang.Class<java.util.HashMap> r0 = java.util.HashMap.class
            if (r5 == r0) goto L36
            java.lang.Class<java.util.LinkedHashMap> r0 = java.util.LinkedHashMap.class
            if (r5 == r0) goto L36
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r5 == r0) goto L36
            java.lang.Class<java.util.TreeMap> r0 = java.util.TreeMap.class
            if (r5 != r0) goto L70
        L36:
            com.fasterxml.jackson.databind.JavaType r6 = r4.getKeyType()
            com.fasterxml.jackson.databind.JavaType r0 = r4.getContentType()
            com.fasterxml.jackson.databind.type.TypeBindings r6 = com.fasterxml.jackson.databind.type.TypeBindings.create(r5, r6, r0)
            com.fasterxml.jackson.databind.JavaType r5 = r3._fromClass(r2, r5, r6)
            goto L97
        L47:
            boolean r1 = r4.isCollectionLikeType()
            if (r1 == 0) goto L70
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            if (r5 == r1) goto L63
            java.lang.Class<java.util.LinkedList> r1 = java.util.LinkedList.class
            if (r5 == r1) goto L63
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            if (r5 == r1) goto L63
            java.lang.Class<java.util.TreeSet> r1 = java.util.TreeSet.class
            if (r5 != r1) goto L5e
            goto L63
        L5e:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            if (r0 != r1) goto L70
        L62:
            return r4
        L63:
            com.fasterxml.jackson.databind.JavaType r6 = r4.getContentType()
            com.fasterxml.jackson.databind.type.TypeBindings r6 = com.fasterxml.jackson.databind.type.TypeBindings.create(r5, r6)
            com.fasterxml.jackson.databind.JavaType r5 = r3._fromClass(r2, r5, r6)
            goto L97
        L70:
            com.fasterxml.jackson.databind.type.TypeBindings r0 = r4.getBindings()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L81
            com.fasterxml.jackson.databind.type.TypeBindings r6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS
            com.fasterxml.jackson.databind.JavaType r5 = r3._fromClass(r2, r5, r6)
            goto L97
        L81:
            java.lang.reflect.TypeVariable[] r0 = r5.getTypeParameters()
            int r0 = r0.length
            if (r0 != 0) goto L8f
            com.fasterxml.jackson.databind.type.TypeBindings r6 = com.fasterxml.jackson.databind.type.TypeFactory.EMPTY_BINDINGS
            com.fasterxml.jackson.databind.JavaType r5 = r3._fromClass(r2, r5, r6)
            goto L97
        L8f:
            com.fasterxml.jackson.databind.type.TypeBindings r6 = r3._bindingsForSubtype(r4, r0, r5, r6)
            com.fasterxml.jackson.databind.JavaType r5 = r3._fromClass(r2, r5, r6)
        L97:
            com.fasterxml.jackson.databind.JavaType r4 = r5.withHandlersFrom(r4)
            return r4
        L9c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = com.fasterxml.jackson.databind.util.ClassUtil.nameOf(r5)
            java.lang.String r4 = com.fasterxml.jackson.databind.util.ClassUtil.getTypeDescription(r4)
            java.lang.String r0 = "Class "
            java.lang.String r1 = " not subtype of "
            java.lang.String r4 = p0.AbstractC1482f.i(r0, r5, r1, r4)
            r6.<init>(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.type.TypeFactory.constructSpecializedType(com.fasterxml.jackson.databind.JavaType, java.lang.Class, boolean):com.fasterxml.jackson.databind.JavaType");
    }

    public CollectionType constructCollectionType(Class<? extends Collection> cls, JavaType javaType) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded(cls, javaType);
        CollectionType collectionType = (CollectionType) _fromClass(null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty() && javaType != null) {
            JavaType contentType = collectionType.findSuperType(Collection.class).getContentType();
            if (!contentType.equals(javaType)) {
                throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", ClassUtil.nameOf(cls), javaType, contentType));
            }
        }
        return collectionType;
    }

    public MapType constructMapType(Class<? extends Map> cls, JavaType javaType, JavaType javaType2) {
        TypeBindings createIfNeeded = TypeBindings.createIfNeeded(cls, new JavaType[]{javaType, javaType2});
        MapType mapType = (MapType) _fromClass(null, cls, createIfNeeded);
        if (createIfNeeded.isEmpty()) {
            JavaType findSuperType = mapType.findSuperType(Map.class);
            JavaType keyType = findSuperType.getKeyType();
            if (keyType.equals(javaType)) {
                JavaType contentType = findSuperType.getContentType();
                if (!contentType.equals(javaType2)) {
                    throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", ClassUtil.nameOf(cls), javaType2, contentType));
                }
            } else {
                throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", ClassUtil.nameOf(cls), javaType, keyType));
            }
        }
        return mapType;
    }
}
