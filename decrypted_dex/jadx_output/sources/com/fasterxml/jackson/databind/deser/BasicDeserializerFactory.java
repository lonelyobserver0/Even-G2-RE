package com.fasterxml.jackson.databind.deser;

import Xa.h;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConstructorDetector;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import com.fasterxml.jackson.databind.deser.std.EnumDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jdk14.JDK14Util;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BasicDeserializerFactory extends DeserializerFactory implements Serializable {
    protected final DeserializerFactoryConfig _factoryConfig;
    private static final Class<?> CLASS_OBJECT = Object.class;
    private static final Class<?> CLASS_STRING = String.class;
    private static final Class<?> CLASS_CHAR_SEQUENCE = CharSequence.class;
    private static final Class<?> CLASS_ITERABLE = Iterable.class;
    private static final Class<?> CLASS_MAP_ENTRY = Map.Entry.class;
    private static final Class<?> CLASS_SERIALIZABLE = Serializable.class;
    protected static final PropertyName UNWRAPPED_CREATOR_PARAM_NAME = new PropertyName("@JsonUnwrapped");

    /* renamed from: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor;

        static {
            int[] iArr = new int[ConstructorDetector.SingleArgConstructor.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor = iArr;
            try {
                iArr[ConstructorDetector.SingleArgConstructor.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.REQUIRE_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[ConstructorDetector.SingleArgConstructor.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[JsonCreator.Mode.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode = iArr2;
            try {
                iArr2[JsonCreator.Mode.DELEGATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.PROPERTIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[JsonCreator.Mode.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class ContainerDefaultMappings {
        static final HashMap<String, Class<? extends Collection>> _collectionFallbacks;
        static final HashMap<String, Class<? extends Map>> _mapFallbacks;

        static {
            HashMap<String, Class<? extends Collection>> hashMap = new HashMap<>();
            hashMap.put(Collection.class.getName(), ArrayList.class);
            hashMap.put(List.class.getName(), ArrayList.class);
            hashMap.put(Set.class.getName(), HashSet.class);
            hashMap.put(SortedSet.class.getName(), TreeSet.class);
            hashMap.put(Queue.class.getName(), LinkedList.class);
            hashMap.put(AbstractList.class.getName(), ArrayList.class);
            hashMap.put(AbstractSet.class.getName(), HashSet.class);
            hashMap.put(Deque.class.getName(), LinkedList.class);
            hashMap.put(NavigableSet.class.getName(), TreeSet.class);
            _collectionFallbacks = hashMap;
            HashMap<String, Class<? extends Map>> hashMap2 = new HashMap<>();
            hashMap2.put(Map.class.getName(), LinkedHashMap.class);
            hashMap2.put(AbstractMap.class.getName(), LinkedHashMap.class);
            hashMap2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
            hashMap2.put(SortedMap.class.getName(), TreeMap.class);
            hashMap2.put(NavigableMap.class.getName(), TreeMap.class);
            hashMap2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
            _mapFallbacks = hashMap2;
        }

        public static Class<?> findCollectionFallback(JavaType javaType) {
            return _collectionFallbacks.get(javaType.getRawClass().getName());
        }

        public static Class<?> findMapFallback(JavaType javaType) {
            return _mapFallbacks.get(javaType.getRawClass().getName());
        }
    }

    public static class CreatorCollectionState {
        private int _explicitConstructorCount;
        private int _explicitFactoryCount;
        private List<CreatorCandidate> _implicitConstructorCandidates;
        private List<CreatorCandidate> _implicitFactoryCandidates;
        public final BeanDescription beanDesc;
        public final DeserializationContext context;
        public final Map<AnnotatedWithParams, BeanPropertyDefinition[]> creatorParams;
        public final CreatorCollector creators;
        public final VisibilityChecker<?> vchecker;

        public CreatorCollectionState(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, CreatorCollector creatorCollector, Map<AnnotatedWithParams, BeanPropertyDefinition[]> map) {
            this.context = deserializationContext;
            this.beanDesc = beanDescription;
            this.vchecker = visibilityChecker;
            this.creators = creatorCollector;
            this.creatorParams = map;
        }

        public void addImplicitConstructorCandidate(CreatorCandidate creatorCandidate) {
            if (this._implicitConstructorCandidates == null) {
                this._implicitConstructorCandidates = new LinkedList();
            }
            this._implicitConstructorCandidates.add(creatorCandidate);
        }

        public void addImplicitFactoryCandidate(CreatorCandidate creatorCandidate) {
            if (this._implicitFactoryCandidates == null) {
                this._implicitFactoryCandidates = new LinkedList();
            }
            this._implicitFactoryCandidates.add(creatorCandidate);
        }

        public AnnotationIntrospector annotationIntrospector() {
            return this.context.getAnnotationIntrospector();
        }

        public boolean hasExplicitConstructors() {
            return this._explicitConstructorCount > 0;
        }

        public boolean hasExplicitFactories() {
            return this._explicitFactoryCount > 0;
        }

        public boolean hasImplicitConstructorCandidates() {
            return this._implicitConstructorCandidates != null;
        }

        public boolean hasImplicitFactoryCandidates() {
            return this._implicitFactoryCandidates != null;
        }

        public List<CreatorCandidate> implicitConstructorCandidates() {
            return this._implicitConstructorCandidates;
        }

        public List<CreatorCandidate> implicitFactoryCandidates() {
            return this._implicitFactoryCandidates;
        }

        public void increaseExplicitConstructorCount() {
            this._explicitConstructorCount++;
        }

        public void increaseExplicitFactoryCount() {
            this._explicitFactoryCount++;
        }
    }

    public BasicDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        this._factoryConfig = deserializerFactoryConfig;
    }

    private boolean _checkIfCreatorPropertyBased(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, BeanPropertyDefinition beanPropertyDefinition) {
        String name;
        if ((beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) && annotationIntrospector.findInjectableValue(annotatedWithParams.getParameter(0)) == null) {
            return (beanPropertyDefinition == null || (name = beanPropertyDefinition.getName()) == null || name.isEmpty() || !beanPropertyDefinition.couldSerialize()) ? false : true;
        }
        return true;
    }

    private void _checkImplicitlyNamedConstructors(DeserializationContext deserializationContext, BeanDescription beanDescription, VisibilityChecker<?> visibilityChecker, AnnotationIntrospector annotationIntrospector, CreatorCollector creatorCollector, List<AnnotatedWithParams> list) throws JsonMappingException {
        int i3;
        Iterator<AnnotatedWithParams> it = list.iterator();
        AnnotatedWithParams annotatedWithParams = null;
        AnnotatedWithParams annotatedWithParams2 = null;
        SettableBeanProperty[] settableBeanPropertyArr = null;
        while (true) {
            if (!it.hasNext()) {
                annotatedWithParams = annotatedWithParams2;
                break;
            }
            AnnotatedWithParams next = it.next();
            if (visibilityChecker.isCreatorVisible(next)) {
                int parameterCount = next.getParameterCount();
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[parameterCount];
                int i10 = 0;
                while (true) {
                    if (i10 < parameterCount) {
                        AnnotatedParameter parameter = next.getParameter(i10);
                        PropertyName _findParamName = _findParamName(parameter, annotationIntrospector);
                        if (_findParamName != null && !_findParamName.isEmpty()) {
                            settableBeanPropertyArr2[i10] = constructCreatorProperty(deserializationContext, beanDescription, _findParamName, parameter.getIndex(), parameter, null);
                            i10++;
                        }
                    } else {
                        if (annotatedWithParams2 != null) {
                            break;
                        }
                        annotatedWithParams2 = next;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                    }
                }
            }
        }
        if (annotatedWithParams != null) {
            creatorCollector.addPropertyCreator(annotatedWithParams, false, settableBeanPropertyArr);
            BasicBeanDescription basicBeanDescription = (BasicBeanDescription) beanDescription;
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                PropertyName fullName = settableBeanProperty.getFullName();
                if (!basicBeanDescription.hasProperty(fullName)) {
                    basicBeanDescription.addProperty(SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), settableBeanProperty.getMember(), fullName));
                }
            }
        }
    }

    private KeyDeserializer _createEnumKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        BeanDescription introspect = config.introspect(javaType);
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findKeyDeserializerFromAnnotation != null) {
            return findKeyDeserializerFromAnnotation;
        }
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, introspect);
        if (_findCustomEnumDeserializer != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, _findCustomEnumDeserializer);
        }
        JsonDeserializer<Object> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, introspect.getClassInfo());
        if (findDeserializerFromAnnotation != null) {
            return StdKeyDeserializers.constructDelegatingKeyDeserializer(config, javaType, findDeserializerFromAnnotation);
        }
        EnumResolver constructEnumResolver = constructEnumResolver(rawClass, config, introspect.findJsonValueAccessor());
        for (AnnotatedMethod annotatedMethod : introspect.getFactoryMethods()) {
            if (_hasCreatorAnnotation(deserializationContext, annotatedMethod)) {
                if (annotatedMethod.getParameterCount() != 1 || !annotatedMethod.getRawReturnType().isAssignableFrom(rawClass)) {
                    StringBuilder sb2 = new StringBuilder("Unsuitable method (");
                    sb2.append(annotatedMethod);
                    sb2.append(") decorated with @JsonCreator (for Enum type ");
                    throw new IllegalArgumentException(h.k(rawClass, sb2, ")"));
                }
                if (annotatedMethod.getRawParameterType(0) == String.class) {
                    if (config.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(annotatedMethod.getMember(), deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver, annotatedMethod);
                }
            }
        }
        return StdKeyDeserializers.constructEnumKeyDeserializer(constructEnumResolver);
    }

    private PropertyName _findParamName(AnnotatedParameter annotatedParameter, AnnotationIntrospector annotationIntrospector) {
        if (annotationIntrospector == null) {
            return null;
        }
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedParameter);
        if (findNameForDeserialization != null && !findNameForDeserialization.isEmpty()) {
            return findNameForDeserialization;
        }
        String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null || findImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(findImplicitPropertyName);
    }

    private JavaType _mapAbstractType2(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        javaType.getRawClass();
        if (!this._factoryConfig.hasAbstractTypeResolvers()) {
            return null;
        }
        Iterator<AbstractTypeResolver> it = this._factoryConfig.abstractTypeResolvers().iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
        return null;
    }

    public void _addExplicitAnyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate, ConstructorDetector constructorDetector) throws JsonMappingException {
        PropertyName propertyName;
        boolean z2;
        int findOnlyParamWithoutInjection;
        if (1 != creatorCandidate.paramCount()) {
            if (constructorDetector.singleArgCreatorDefaultsToProperties() || (findOnlyParamWithoutInjection = creatorCandidate.findOnlyParamWithoutInjection()) < 0 || !(constructorDetector.singleArgCreatorDefaultsToDelegating() || creatorCandidate.paramName(findOnlyParamWithoutInjection) == null)) {
                _addExplicitPropertyCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            } else {
                _addExplicitDelegatingCreator(deserializationContext, beanDescription, creatorCollector, creatorCandidate);
                return;
            }
        }
        AnnotatedParameter parameter = creatorCandidate.parameter(0);
        JacksonInject.Value injection = creatorCandidate.injection(0);
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$cfg$ConstructorDetector$SingleArgConstructor[constructorDetector.singleArgMode().ordinal()];
        if (i3 == 1) {
            propertyName = null;
            z2 = false;
        } else if (i3 == 2) {
            PropertyName paramName = creatorCandidate.paramName(0);
            if (paramName == null) {
                _validateNamedPropertyParameter(deserializationContext, beanDescription, creatorCandidate, 0, paramName, injection);
            }
            propertyName = paramName;
            z2 = true;
        } else {
            if (i3 == 3) {
                deserializationContext.reportBadTypeDefinition(beanDescription, "Single-argument constructor (%s) is annotated but no 'mode' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", creatorCandidate.creator());
                return;
            }
            BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
            PropertyName explicitParamName = creatorCandidate.explicitParamName(0);
            z2 = (explicitParamName == null && injection == null) ? false : true;
            if (!z2 && propertyDef != null) {
                explicitParamName = creatorCandidate.paramName(0);
                z2 = explicitParamName != null && propertyDef.couldSerialize();
            }
            propertyName = explicitParamName;
        }
        if (z2) {
            creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, new SettableBeanProperty[]{constructCreatorProperty(deserializationContext, beanDescription, propertyName, 0, parameter, injection)});
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        BeanPropertyDefinition propertyDef2 = creatorCandidate.propertyDef(0);
        if (propertyDef2 != null) {
            ((POJOPropertyBuilder) propertyDef2).removeConstructors();
        }
    }

    public void _addExplicitConstructorCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, boolean z2) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker = creatorCollectionState.vchecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = creatorCollectionState.creatorParams;
        AnnotatedConstructor findDefaultConstructor = beanDescription.findDefaultConstructor();
        if (findDefaultConstructor != null && (!creatorCollector.hasDefaultCreator() || _hasCreatorAnnotation(deserializationContext, findDefaultConstructor))) {
            creatorCollector.setDefaultCreator(findDefaultConstructor);
        }
        for (AnnotatedConstructor annotatedConstructor : beanDescription.getConstructors()) {
            JsonCreator.Mode findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotatedConstructor);
            if (JsonCreator.Mode.DISABLED != findCreatorAnnotation) {
                if (findCreatorAnnotation != null) {
                    int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[findCreatorAnnotation.ordinal()];
                    if (i3 == 1) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitDelegatingCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, null));
                    } else if (i3 != 2) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitAnyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, map.get(annotatedConstructor)), deserializationContext.getConfig().getConstructorDetector());
                    } else {
                        deserializationContext2 = deserializationContext;
                        _addExplicitPropertyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, map.get(annotatedConstructor)));
                    }
                    creatorCollectionState.increaseExplicitConstructorCount();
                    deserializationContext = deserializationContext2;
                } else if (z2 && visibilityChecker.isCreatorVisible(annotatedConstructor)) {
                    creatorCollectionState.addImplicitConstructorCandidate(CreatorCandidate.construct(annotationIntrospector, annotatedConstructor, map.get(annotatedConstructor)));
                }
            }
        }
    }

    public void _addExplicitDelegatingCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        BeanDescription beanDescription2;
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i3 = -1;
        int i10 = 0;
        while (i10 < paramCount) {
            AnnotatedParameter parameter = creatorCandidate.parameter(i10);
            JacksonInject.Value injection = creatorCandidate.injection(i10);
            if (injection != null) {
                deserializationContext2 = deserializationContext;
                beanDescription2 = beanDescription;
                settableBeanPropertyArr[i10] = constructCreatorProperty(deserializationContext2, beanDescription2, null, i10, parameter, injection);
            } else {
                deserializationContext2 = deserializationContext;
                beanDescription2 = beanDescription;
                if (i3 < 0) {
                    i3 = i10;
                } else {
                    deserializationContext2.reportBadTypeDefinition(beanDescription2, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", Integer.valueOf(i3), Integer.valueOf(i10), creatorCandidate);
                }
            }
            i10++;
            deserializationContext = deserializationContext2;
            beanDescription = beanDescription2;
        }
        DeserializationContext deserializationContext3 = deserializationContext;
        BeanDescription beanDescription3 = beanDescription;
        if (i3 < 0) {
            deserializationContext3.reportBadTypeDefinition(beanDescription3, "No argument left as delegating for Creator %s: exactly one required", creatorCandidate);
        }
        if (paramCount != 1) {
            creatorCollector.addDelegatingCreator(creatorCandidate.creator(), true, settableBeanPropertyArr, i3);
            return;
        }
        _handleSingleArgumentCreator(creatorCollector, creatorCandidate.creator(), true, true);
        BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
        if (propertyDef != null) {
            ((POJOPropertyBuilder) propertyDef).removeConstructors();
        }
    }

    public void _addExplicitFactoryCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, boolean z2) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker = creatorCollectionState.vchecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = creatorCollectionState.creatorParams;
        for (AnnotatedMethod annotatedMethod : beanDescription.getFactoryMethods()) {
            JsonCreator.Mode findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotatedMethod);
            int parameterCount = annotatedMethod.getParameterCount();
            if (findCreatorAnnotation == null) {
                if (z2 && parameterCount == 1 && visibilityChecker.isCreatorVisible(annotatedMethod)) {
                    creatorCollectionState.addImplicitFactoryCandidate(CreatorCandidate.construct(annotationIntrospector, annotatedMethod, null));
                }
            } else if (findCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                if (parameterCount == 0) {
                    creatorCollector.setDefaultCreator(annotatedMethod);
                } else {
                    int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonCreator$Mode[findCreatorAnnotation.ordinal()];
                    if (i3 == 1) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitDelegatingCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedMethod, null));
                    } else if (i3 != 2) {
                        deserializationContext2 = deserializationContext;
                        _addExplicitAnyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedMethod, map.get(annotatedMethod)), ConstructorDetector.DEFAULT);
                    } else {
                        deserializationContext2 = deserializationContext;
                        _addExplicitPropertyCreator(deserializationContext2, beanDescription, creatorCollector, CreatorCandidate.construct(annotationIntrospector, annotatedMethod, map.get(annotatedMethod)));
                    }
                    creatorCollectionState.increaseExplicitFactoryCount();
                    deserializationContext = deserializationContext2;
                }
            }
        }
    }

    public void _addExplicitPropertyCreator(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCollector creatorCollector, CreatorCandidate creatorCandidate) throws JsonMappingException {
        DeserializationContext deserializationContext2;
        CreatorCandidate creatorCandidate2;
        BeanDescription beanDescription2;
        PropertyName propertyName;
        AnnotatedParameter annotatedParameter;
        BasicDeserializerFactory basicDeserializerFactory;
        int paramCount = creatorCandidate.paramCount();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[paramCount];
        int i3 = 0;
        while (i3 < paramCount) {
            JacksonInject.Value injection = creatorCandidate.injection(i3);
            AnnotatedParameter parameter = creatorCandidate.parameter(i3);
            PropertyName paramName = creatorCandidate.paramName(i3);
            if (paramName == null) {
                if (deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(parameter) != null) {
                    _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                }
                PropertyName findImplicitParamName = creatorCandidate.findImplicitParamName(i3);
                basicDeserializerFactory = this;
                deserializationContext2 = deserializationContext;
                beanDescription2 = beanDescription;
                CreatorCandidate creatorCandidate3 = creatorCandidate;
                basicDeserializerFactory._validateNamedPropertyParameter(deserializationContext2, beanDescription2, creatorCandidate3, i3, findImplicitParamName, injection);
                creatorCandidate2 = creatorCandidate3;
                propertyName = findImplicitParamName;
                annotatedParameter = parameter;
            } else {
                deserializationContext2 = deserializationContext;
                creatorCandidate2 = creatorCandidate;
                beanDescription2 = beanDescription;
                propertyName = paramName;
                annotatedParameter = parameter;
                basicDeserializerFactory = this;
            }
            settableBeanPropertyArr[i3] = basicDeserializerFactory.constructCreatorProperty(deserializationContext2, beanDescription2, propertyName, i3, annotatedParameter, injection);
            i3++;
            creatorCandidate = creatorCandidate2;
            deserializationContext = deserializationContext2;
            beanDescription = beanDescription2;
        }
        creatorCollector.addPropertyCreator(creatorCandidate.creator(), true, settableBeanPropertyArr);
    }

    public void _addImplicitConstructorCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, List<CreatorCandidate> list) throws JsonMappingException {
        VisibilityChecker<?> visibilityChecker;
        boolean z2;
        AnnotatedWithParams annotatedWithParams;
        VisibilityChecker<?> visibilityChecker2;
        SettableBeanProperty[] settableBeanPropertyArr;
        boolean z10;
        int i3;
        BasicDeserializerFactory basicDeserializerFactory = this;
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker3 = creatorCollectionState.vchecker;
        boolean singleArgCreatorDefaultsToProperties = config.getConstructorDetector().singleArgCreatorDefaultsToProperties();
        LinkedList linkedList = null;
        for (CreatorCandidate creatorCandidate : list) {
            int paramCount = creatorCandidate.paramCount();
            AnnotatedWithParams creator = creatorCandidate.creator();
            if (paramCount == 1) {
                BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
                if (singleArgCreatorDefaultsToProperties || basicDeserializerFactory._checkIfCreatorPropertyBased(annotationIntrospector, creator, propertyDef)) {
                    JacksonInject.Value injection = creatorCandidate.injection(0);
                    PropertyName paramName = creatorCandidate.paramName(0);
                    if (paramName != null || (paramName = creatorCandidate.findImplicitParamName(0)) != null || injection != null) {
                        creatorCollector.addPropertyCreator(creator, false, new SettableBeanProperty[]{basicDeserializerFactory.constructCreatorProperty(deserializationContext, beanDescription, paramName, 0, creatorCandidate.parameter(0), injection)});
                        basicDeserializerFactory = this;
                        visibilityChecker = visibilityChecker3;
                        z2 = singleArgCreatorDefaultsToProperties;
                    }
                } else {
                    basicDeserializerFactory._handleSingleArgumentCreator(creatorCollector, creator, false, visibilityChecker3.isCreatorVisible(creator));
                    if (propertyDef != null) {
                        ((POJOPropertyBuilder) propertyDef).removeConstructors();
                    }
                }
                visibilityChecker = visibilityChecker3;
                z2 = singleArgCreatorDefaultsToProperties;
            } else {
                AnnotatedWithParams annotatedWithParams2 = creator;
                SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[paramCount];
                int i10 = 0;
                int i11 = 0;
                int i12 = -1;
                int i13 = 0;
                while (i13 < paramCount) {
                    int i14 = i12;
                    AnnotatedParameter parameter = annotatedWithParams2.getParameter(i13);
                    BeanPropertyDefinition propertyDef2 = creatorCandidate.propertyDef(i13);
                    JacksonInject.Value findInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                    PropertyName fullName = propertyDef2 == null ? null : propertyDef2.getFullName();
                    if (propertyDef2 == null || !propertyDef2.isExplicitlyNamed()) {
                        annotatedWithParams = annotatedWithParams2;
                        visibilityChecker2 = visibilityChecker3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        PropertyName propertyName = fullName;
                        z10 = singleArgCreatorDefaultsToProperties;
                        i3 = i14;
                        if (findInjectableValue != null) {
                            i11++;
                            settableBeanPropertyArr[i13] = constructCreatorProperty(deserializationContext, beanDescription, propertyName, i13, parameter, findInjectableValue);
                        } else if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                            _reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                        } else if (i3 < 0) {
                            i12 = i13;
                            i13++;
                            settableBeanPropertyArr2 = settableBeanPropertyArr;
                            annotatedWithParams2 = annotatedWithParams;
                            visibilityChecker3 = visibilityChecker2;
                            singleArgCreatorDefaultsToProperties = z10;
                        }
                    } else {
                        i10++;
                        annotatedWithParams = annotatedWithParams2;
                        visibilityChecker2 = visibilityChecker3;
                        settableBeanPropertyArr = settableBeanPropertyArr2;
                        PropertyName propertyName2 = fullName;
                        z10 = singleArgCreatorDefaultsToProperties;
                        i3 = i14;
                        settableBeanPropertyArr[i13] = constructCreatorProperty(deserializationContext, beanDescription, propertyName2, i13, parameter, findInjectableValue);
                    }
                    i12 = i3;
                    i13++;
                    settableBeanPropertyArr2 = settableBeanPropertyArr;
                    annotatedWithParams2 = annotatedWithParams;
                    visibilityChecker3 = visibilityChecker2;
                    singleArgCreatorDefaultsToProperties = z10;
                }
                AnnotatedWithParams annotatedWithParams3 = annotatedWithParams2;
                visibilityChecker = visibilityChecker3;
                z2 = singleArgCreatorDefaultsToProperties;
                basicDeserializerFactory = this;
                SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                int i15 = i12;
                if (i10 > 0 || i11 > 0) {
                    if (i10 + i11 == paramCount) {
                        creatorCollector.addPropertyCreator(annotatedWithParams3, false, settableBeanPropertyArr3);
                    } else if (i10 == 0 && i11 + 1 == paramCount) {
                        creatorCollector.addDelegatingCreator(annotatedWithParams3, false, settableBeanPropertyArr3, 0);
                    } else {
                        PropertyName findImplicitParamName = creatorCandidate.findImplicitParamName(i15);
                        if (findImplicitParamName == null || findImplicitParamName.isEmpty()) {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(i15), annotatedWithParams3);
                        }
                    }
                }
                if (!creatorCollector.hasDefaultCreator()) {
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                    }
                    linkedList.add(annotatedWithParams3);
                }
            }
            visibilityChecker3 = visibilityChecker;
            singleArgCreatorDefaultsToProperties = z2;
        }
        VisibilityChecker<?> visibilityChecker4 = visibilityChecker3;
        if (linkedList == null || creatorCollector.hasDelegatingCreator() || creatorCollector.hasPropertyBasedCreator()) {
            return;
        }
        basicDeserializerFactory._checkImplicitlyNamedConstructors(deserializationContext, beanDescription, visibilityChecker4, annotationIntrospector, creatorCollector, linkedList);
    }

    public void _addImplicitFactoryCreators(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, List<CreatorCandidate> list) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        BasicDeserializerFactory basicDeserializerFactory = this;
        BeanDescription beanDescription = creatorCollectionState.beanDesc;
        CreatorCollector creatorCollector = creatorCollectionState.creators;
        AnnotationIntrospector annotationIntrospector = creatorCollectionState.annotationIntrospector();
        VisibilityChecker<?> visibilityChecker = creatorCollectionState.vchecker;
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = creatorCollectionState.creatorParams;
        for (CreatorCandidate creatorCandidate : list) {
            int paramCount = creatorCandidate.paramCount();
            AnnotatedWithParams creator = creatorCandidate.creator();
            BeanPropertyDefinition[] beanPropertyDefinitionArr = map.get(creator);
            if (paramCount == 1) {
                BeanPropertyDefinition propertyDef = creatorCandidate.propertyDef(0);
                if (basicDeserializerFactory._checkIfCreatorPropertyBased(annotationIntrospector, creator, propertyDef)) {
                    SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[paramCount];
                    int i3 = 0;
                    int i10 = 0;
                    int i11 = 0;
                    AnnotatedParameter annotatedParameter = null;
                    while (i3 < paramCount) {
                        AnnotatedParameter parameter = creator.getParameter(i3);
                        BeanPropertyDefinition beanPropertyDefinition = beanPropertyDefinitionArr == null ? null : beanPropertyDefinitionArr[i3];
                        JacksonInject.Value findInjectableValue = annotationIntrospector.findInjectableValue(parameter);
                        PropertyName fullName = beanPropertyDefinition == null ? null : beanPropertyDefinition.getFullName();
                        if (beanPropertyDefinition == null || !beanPropertyDefinition.isExplicitlyNamed()) {
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            PropertyName propertyName = fullName;
                            if (findInjectableValue != null) {
                                i11++;
                                basicDeserializerFactory = this;
                                settableBeanPropertyArr[i3] = basicDeserializerFactory.constructCreatorProperty(deserializationContext, beanDescription, propertyName, i3, parameter, findInjectableValue);
                            } else {
                                basicDeserializerFactory = this;
                                if (annotationIntrospector.findUnwrappingNameTransformer(parameter) != null) {
                                    basicDeserializerFactory._reportUnwrappedCreatorProperty(deserializationContext, beanDescription, parameter);
                                } else if (annotatedParameter == null) {
                                    annotatedParameter = parameter;
                                }
                            }
                        } else {
                            i10++;
                            settableBeanPropertyArr = settableBeanPropertyArr2;
                            settableBeanPropertyArr[i3] = basicDeserializerFactory.constructCreatorProperty(deserializationContext, beanDescription, fullName, i3, parameter, findInjectableValue);
                            basicDeserializerFactory = this;
                        }
                        i3++;
                        settableBeanPropertyArr2 = settableBeanPropertyArr;
                    }
                    SettableBeanProperty[] settableBeanPropertyArr3 = settableBeanPropertyArr2;
                    if (i10 > 0 || i11 > 0) {
                        if (i10 + i11 == paramCount) {
                            creatorCollector.addPropertyCreator(creator, false, settableBeanPropertyArr3);
                        } else if (i10 == 0 && i11 + 1 == paramCount) {
                            creatorCollector.addDelegatingCreator(creator, false, settableBeanPropertyArr3, 0);
                        } else {
                            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", Integer.valueOf(annotatedParameter == null ? -1 : annotatedParameter.getIndex()), creator);
                        }
                    }
                } else {
                    basicDeserializerFactory._handleSingleArgumentCreator(creatorCollector, creator, false, visibilityChecker.isCreatorVisible(creator));
                    if (propertyDef != null) {
                        ((POJOPropertyBuilder) propertyDef).removeConstructors();
                    }
                }
            }
        }
    }

    public void _addRecordConstructor(DeserializationContext deserializationContext, CreatorCollectionState creatorCollectionState, AnnotatedConstructor annotatedConstructor, List<String> list) throws JsonMappingException {
        int parameterCount = annotatedConstructor.getParameterCount();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        SettableBeanProperty[] settableBeanPropertyArr = new SettableBeanProperty[parameterCount];
        int i3 = 0;
        while (i3 < parameterCount) {
            AnnotatedParameter parameter = annotatedConstructor.getParameter(i3);
            JacksonInject.Value findInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(parameter);
            if (findNameForDeserialization == null || findNameForDeserialization.isEmpty()) {
                findNameForDeserialization = PropertyName.construct(list.get(i3));
            }
            DeserializationContext deserializationContext2 = deserializationContext;
            settableBeanPropertyArr[i3] = constructCreatorProperty(deserializationContext2, creatorCollectionState.beanDesc, findNameForDeserialization, i3, parameter, findInjectableValue);
            i3++;
            deserializationContext = deserializationContext2;
        }
        creatorCollectionState.creators.addPropertyCreator(annotatedConstructor, false, settableBeanPropertyArr);
    }

    public ValueInstantiator _constructDefaultValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        ArrayList arrayList;
        AnnotatedConstructor findRecordConstructor;
        DeserializationConfig config = deserializationContext.getConfig();
        VisibilityChecker<?> defaultVisibilityChecker = config.getDefaultVisibilityChecker(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        ConstructorDetector constructorDetector = config.getConstructorDetector();
        CreatorCollectionState creatorCollectionState = new CreatorCollectionState(deserializationContext, beanDescription, defaultVisibilityChecker, new CreatorCollector(beanDescription, config), _findCreatorsFromProperties(deserializationContext, beanDescription));
        _addExplicitFactoryCreators(deserializationContext, creatorCollectionState, !constructorDetector.requireCtorAnnotation());
        if (beanDescription.getType().isConcrete()) {
            if (beanDescription.getType().isRecordType() && (findRecordConstructor = JDK14Util.findRecordConstructor(deserializationContext, beanDescription, (arrayList = new ArrayList()))) != null) {
                _addRecordConstructor(deserializationContext, creatorCollectionState, findRecordConstructor, arrayList);
                return creatorCollectionState.creators.constructValueInstantiator(deserializationContext);
            }
            if (!beanDescription.isNonStaticInnerClass()) {
                _addExplicitConstructorCreators(deserializationContext, creatorCollectionState, constructorDetector.shouldIntrospectorImplicitConstructors(beanDescription.getBeanClass()));
                if (creatorCollectionState.hasImplicitConstructorCandidates() && !creatorCollectionState.hasExplicitConstructors()) {
                    _addImplicitConstructorCreators(deserializationContext, creatorCollectionState, creatorCollectionState.implicitConstructorCandidates());
                }
            }
        }
        if (creatorCollectionState.hasImplicitFactoryCandidates() && !creatorCollectionState.hasExplicitFactories() && !creatorCollectionState.hasExplicitConstructors()) {
            _addImplicitFactoryCreators(deserializationContext, creatorCollectionState, creatorCollectionState.implicitFactoryCandidates());
        }
        return creatorCollectionState.creators.constructValueInstantiator(deserializationContext);
    }

    public Map<AnnotatedWithParams, BeanPropertyDefinition[]> _findCreatorsFromProperties(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        Map<AnnotatedWithParams, BeanPropertyDefinition[]> map = Collections.EMPTY_MAP;
        for (BeanPropertyDefinition beanPropertyDefinition : beanDescription.findProperties()) {
            Iterator<AnnotatedParameter> constructorParameters = beanPropertyDefinition.getConstructorParameters();
            while (constructorParameters.hasNext()) {
                AnnotatedParameter next = constructorParameters.next();
                AnnotatedWithParams owner = next.getOwner();
                BeanPropertyDefinition[] beanPropertyDefinitionArr = map.get(owner);
                int index = next.getIndex();
                if (beanPropertyDefinitionArr == null) {
                    if (map.isEmpty()) {
                        map = new LinkedHashMap<>();
                    }
                    beanPropertyDefinitionArr = new BeanPropertyDefinition[owner.getParameterCount()];
                    map.put(owner, beanPropertyDefinitionArr);
                } else if (beanPropertyDefinitionArr[index] != null) {
                    deserializationContext.reportBadTypeDefinition(beanDescription, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", Integer.valueOf(index), owner, beanPropertyDefinitionArr[index], beanPropertyDefinition);
                }
                beanPropertyDefinitionArr[index] = beanPropertyDefinition;
            }
        }
        return map;
    }

    public JsonDeserializer<?> _findCustomArrayDeserializer(ArrayType arrayType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            ArrayType arrayType2 = arrayType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> findArrayDeserializer = it.next().findArrayDeserializer(arrayType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (findArrayDeserializer != null) {
                return findArrayDeserializer;
            }
            arrayType = arrayType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<Object> _findCustomBeanDeserializer(JavaType javaType, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findBeanDeserializer = it.next().findBeanDeserializer(javaType, deserializationConfig, beanDescription);
            if (findBeanDeserializer != null) {
                return findBeanDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionDeserializer(CollectionType collectionType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            CollectionType collectionType2 = collectionType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> findCollectionDeserializer = it.next().findCollectionDeserializer(collectionType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (findCollectionDeserializer != null) {
                return findCollectionDeserializer;
            }
            collectionType = collectionType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomCollectionLikeDeserializer(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            CollectionLikeType collectionLikeType2 = collectionLikeType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> findCollectionLikeDeserializer = it.next().findCollectionLikeDeserializer(collectionLikeType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (findCollectionLikeDeserializer != null) {
                return findCollectionLikeDeserializer;
            }
            collectionLikeType = collectionLikeType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomEnumDeserializer(Class<?> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findEnumDeserializer = it.next().findEnumDeserializer(cls, deserializationConfig, beanDescription);
            if (findEnumDeserializer != null) {
                return findEnumDeserializer;
            }
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapDeserializer(MapType mapType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            MapType mapType2 = mapType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            KeyDeserializer keyDeserializer2 = keyDeserializer;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> findMapDeserializer = it.next().findMapDeserializer(mapType2, deserializationConfig2, beanDescription2, keyDeserializer2, typeDeserializer2, jsonDeserializer2);
            if (findMapDeserializer != null) {
                return findMapDeserializer;
            }
            mapType = mapType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            keyDeserializer = keyDeserializer2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomMapLikeDeserializer(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, KeyDeserializer keyDeserializer, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            MapLikeType mapLikeType2 = mapLikeType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            KeyDeserializer keyDeserializer2 = keyDeserializer;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> findMapLikeDeserializer = it.next().findMapLikeDeserializer(mapLikeType2, deserializationConfig2, beanDescription2, keyDeserializer2, typeDeserializer2, jsonDeserializer2);
            if (findMapLikeDeserializer != null) {
                return findMapLikeDeserializer;
            }
            mapLikeType = mapLikeType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            keyDeserializer = keyDeserializer2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomReferenceDeserializer(ReferenceType referenceType, DeserializationConfig deserializationConfig, BeanDescription beanDescription, TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            DeserializationConfig deserializationConfig2 = deserializationConfig;
            BeanDescription beanDescription2 = beanDescription;
            TypeDeserializer typeDeserializer2 = typeDeserializer;
            JsonDeserializer<?> jsonDeserializer2 = jsonDeserializer;
            JsonDeserializer<?> findReferenceDeserializer = it.next().findReferenceDeserializer(referenceType2, deserializationConfig2, beanDescription2, typeDeserializer2, jsonDeserializer2);
            if (findReferenceDeserializer != null) {
                return findReferenceDeserializer;
            }
            referenceType = referenceType2;
            deserializationConfig = deserializationConfig2;
            beanDescription = beanDescription2;
            typeDeserializer = typeDeserializer2;
            jsonDeserializer = jsonDeserializer2;
        }
        return null;
    }

    public JsonDeserializer<?> _findCustomTreeNodeDeserializer(Class<? extends JsonNode> cls, DeserializationConfig deserializationConfig, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<Deserializers> it = this._factoryConfig.deserializers().iterator();
        while (it.hasNext()) {
            JsonDeserializer<?> findTreeNodeDeserializer = it.next().findTreeNodeDeserializer(cls, deserializationConfig, beanDescription);
            if (findTreeNodeDeserializer != null) {
                return findTreeNodeDeserializer;
            }
        }
        return null;
    }

    public JavaType _findRemappedType(DeserializationConfig deserializationConfig, Class<?> cls) throws JsonMappingException {
        JavaType mapAbstractType = mapAbstractType(deserializationConfig, deserializationConfig.constructType(cls));
        if (mapAbstractType == null || mapAbstractType.hasRawClass(cls)) {
            return null;
        }
        return mapAbstractType;
    }

    public PropertyMetadata _getSetterInfo(DeserializationContext deserializationContext, BeanProperty beanProperty, PropertyMetadata propertyMetadata) {
        Nulls nulls;
        JsonSetter.Value findSetterInfo;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedMember member = beanProperty.getMember();
        Nulls nulls2 = null;
        if (member != null) {
            if (annotationIntrospector == null || (findSetterInfo = annotationIntrospector.findSetterInfo(member)) == null) {
                nulls = null;
            } else {
                nulls2 = findSetterInfo.nonDefaultValueNulls();
                nulls = findSetterInfo.nonDefaultContentNulls();
            }
            JsonSetter.Value setterInfo = config.getConfigOverride(beanProperty.getType().getRawClass()).getSetterInfo();
            if (setterInfo != null) {
                if (nulls2 == null) {
                    nulls2 = setterInfo.nonDefaultValueNulls();
                }
                if (nulls == null) {
                    nulls = setterInfo.nonDefaultContentNulls();
                }
            }
        } else {
            nulls = null;
        }
        JsonSetter.Value defaultSetterInfo = config.getDefaultSetterInfo();
        if (nulls2 == null) {
            nulls2 = defaultSetterInfo.nonDefaultValueNulls();
        }
        if (nulls == null) {
            nulls = defaultSetterInfo.nonDefaultContentNulls();
        }
        return (nulls2 == null && nulls == null) ? propertyMetadata : propertyMetadata.withNulls(nulls2, nulls);
    }

    public boolean _handleSingleArgumentCreator(CreatorCollector creatorCollector, AnnotatedWithParams annotatedWithParams, boolean z2, boolean z10) {
        Class<?> rawParameterType = annotatedWithParams.getRawParameterType(0);
        if (rawParameterType == String.class || rawParameterType == CLASS_CHAR_SEQUENCE) {
            if (z2 || z10) {
                creatorCollector.addStringCreator(annotatedWithParams, z2);
            }
            return true;
        }
        if (rawParameterType == Integer.TYPE || rawParameterType == Integer.class) {
            if (z2 || z10) {
                creatorCollector.addIntCreator(annotatedWithParams, z2);
            }
            return true;
        }
        if (rawParameterType == Long.TYPE || rawParameterType == Long.class) {
            if (z2 || z10) {
                creatorCollector.addLongCreator(annotatedWithParams, z2);
            }
            return true;
        }
        if (rawParameterType == Double.TYPE || rawParameterType == Double.class) {
            if (z2 || z10) {
                creatorCollector.addDoubleCreator(annotatedWithParams, z2);
            }
            return true;
        }
        if (rawParameterType == Boolean.TYPE || rawParameterType == Boolean.class) {
            if (z2 || z10) {
                creatorCollector.addBooleanCreator(annotatedWithParams, z2);
            }
            return true;
        }
        if (rawParameterType == BigInteger.class && (z2 || z10)) {
            creatorCollector.addBigIntegerCreator(annotatedWithParams, z2);
        }
        if (rawParameterType == BigDecimal.class && (z2 || z10)) {
            creatorCollector.addBigDecimalCreator(annotatedWithParams, z2);
        }
        if (!z2) {
            return false;
        }
        creatorCollector.addDelegatingCreator(annotatedWithParams, z2, null, 0);
        return true;
    }

    public boolean _hasCreatorAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        JsonCreator.Mode findCreatorAnnotation;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        return (annotationIntrospector == null || (findCreatorAnnotation = annotationIntrospector.findCreatorAnnotation(deserializationContext.getConfig(), annotated)) == null || findCreatorAnnotation == JsonCreator.Mode.DISABLED) ? false : true;
    }

    public CollectionType _mapAbstractCollectionType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> findCollectionFallback = ContainerDefaultMappings.findCollectionFallback(javaType);
        if (findCollectionFallback != null) {
            return (CollectionType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, findCollectionFallback, true);
        }
        return null;
    }

    public MapType _mapAbstractMapType(JavaType javaType, DeserializationConfig deserializationConfig) {
        Class<?> findMapFallback = ContainerDefaultMappings.findMapFallback(javaType);
        if (findMapFallback != null) {
            return (MapType) deserializationConfig.getTypeFactory().constructSpecializedType(javaType, findMapFallback, true);
        }
        return null;
    }

    public void _reportUnwrappedCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedParameter annotatedParameter) throws JsonMappingException {
        deserializationContext.reportBadTypeDefinition(beanDescription, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", Integer.valueOf(annotatedParameter.getIndex()));
    }

    public void _validateNamedPropertyParameter(DeserializationContext deserializationContext, BeanDescription beanDescription, CreatorCandidate creatorCandidate, int i3, PropertyName propertyName, JacksonInject.Value value) throws JsonMappingException {
        if (propertyName == null && value == null) {
            deserializationContext.reportBadTypeDefinition(beanDescription, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", Integer.valueOf(i3), creatorCandidate);
        }
    }

    public ValueInstantiator _valueInstantiatorInstance(DeserializationConfig deserializationConfig, Annotated annotated, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof ValueInstantiator) {
            return (ValueInstantiator) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + obj.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        Class cls = (Class) obj;
        if (ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (!ValueInstantiator.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(h.k(cls, new StringBuilder("AnnotationIntrospector returned Class "), "; expected Class<ValueInstantiator>"));
        }
        deserializationConfig.getHandlerInstantiator();
        return (ValueInstantiator) ClassUtil.createInstance(cls, deserializationConfig.canOverrideAccessModifiers());
    }

    public SettableBeanProperty constructCreatorProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, PropertyName propertyName, int i3, AnnotatedParameter annotatedParameter, JacksonInject.Value value) throws JsonMappingException {
        PropertyName findWrapperName;
        PropertyMetadata propertyMetadata;
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            propertyMetadata = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
            findWrapperName = null;
        } else {
            PropertyMetadata construct = PropertyMetadata.construct(annotationIntrospector.hasRequiredMarker(annotatedParameter), annotationIntrospector.findPropertyDescription(annotatedParameter), annotationIntrospector.findPropertyIndex(annotatedParameter), annotationIntrospector.findPropertyDefaultValue(annotatedParameter));
            findWrapperName = annotationIntrospector.findWrapperName(annotatedParameter);
            propertyMetadata = construct;
        }
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedParameter, annotatedParameter.getType());
        BeanProperty.Std std = new BeanProperty.Std(propertyName, resolveMemberAndTypeAnnotations, findWrapperName, annotatedParameter, propertyMetadata);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, resolveMemberAndTypeAnnotations);
        }
        CreatorProperty construct2 = CreatorProperty.construct(propertyName, resolveMemberAndTypeAnnotations, std.getWrapperName(), typeDeserializer, beanDescription.getClassAnnotations(), annotatedParameter, i3, value, _getSetterInfo(deserializationContext, std, propertyMetadata));
        JsonDeserializer<?> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, annotatedParameter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? construct2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, construct2, resolveMemberAndTypeAnnotations)) : construct2;
    }

    public EnumResolver constructEnumResolver(Class<?> cls, DeserializationConfig deserializationConfig, AnnotatedMember annotatedMember) {
        if (annotatedMember == null) {
            return EnumResolver.constructFor(deserializationConfig, cls);
        }
        if (deserializationConfig.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(annotatedMember.getMember(), deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return EnumResolver.constructUsingMethod(deserializationConfig, cls, annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createArrayDeserializer(DeserializationContext deserializationContext, ArrayType arrayType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType contentType = arrayType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomArrayDeserializer = _findCustomArrayDeserializer(arrayType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomArrayDeserializer == null) {
            if (jsonDeserializer == null) {
                Class<?> rawClass = contentType.getRawClass();
                if (contentType.isPrimitive()) {
                    return PrimitiveArrayDeserializers.forType(rawClass);
                }
                if (rawClass == String.class) {
                    return StringArrayDeserializer.instance;
                }
            }
            _findCustomArrayDeserializer = new ObjectArrayDeserializer(arrayType, jsonDeserializer, typeDeserializer2);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            if (it.hasNext()) {
                throw b.e(it);
            }
        }
        return _findCustomArrayDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createCollectionDeserializer(com.fasterxml.jackson.databind.DeserializationContext r10, com.fasterxml.jackson.databind.type.CollectionType r11, com.fasterxml.jackson.databind.BeanDescription r12) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r9 = this;
            com.fasterxml.jackson.databind.JavaType r0 = r11.getContentType()
            java.lang.Object r1 = r0.getValueHandler()
            r7 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r7 = (com.fasterxml.jackson.databind.JsonDeserializer) r7
            com.fasterxml.jackson.databind.DeserializationConfig r4 = r10.getConfig()
            java.lang.Object r1 = r0.getTypeHandler()
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = (com.fasterxml.jackson.databind.jsontype.TypeDeserializer) r1
            if (r1 != 0) goto L1b
            com.fasterxml.jackson.databind.jsontype.TypeDeserializer r1 = r9.findTypeDeserializer(r4, r0)
        L1b:
            r2 = r9
            r3 = r11
            r5 = r12
            r6 = r1
            com.fasterxml.jackson.databind.JsonDeserializer r11 = r2._findCustomCollectionDeserializer(r3, r4, r5, r6, r7)
            r1 = r6
            if (r11 != 0) goto L3a
            java.lang.Class r12 = r3.getRawClass()
            if (r7 != 0) goto L3a
            java.lang.Class<java.util.EnumSet> r6 = java.util.EnumSet.class
            boolean r12 = r6.isAssignableFrom(r12)
            if (r12 == 0) goto L3a
            com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer r11 = new com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer
            r12 = 0
            r11.<init>(r0, r12)
        L3a:
            if (r11 != 0) goto Lad
            boolean r12 = r3.isInterface()
            if (r12 != 0) goto L4b
            boolean r12 = r3.isAbstract()
            if (r12 == 0) goto L49
            goto L4b
        L49:
            r12 = r5
            goto L77
        L4b:
            com.fasterxml.jackson.databind.type.CollectionType r12 = r9._mapAbstractCollectionType(r3, r4)
            if (r12 != 0) goto L70
            java.lang.Object r11 = r3.getTypeHandler()
            if (r11 == 0) goto L5c
            com.fasterxml.jackson.databind.deser.AbstractDeserializer r11 = com.fasterxml.jackson.databind.deser.AbstractDeserializer.constructForNonPOJO(r5)
            goto L49
        L5c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Cannot find a deserializer for non-concrete Collection type "
            r11.<init>(r12)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L70:
            com.fasterxml.jackson.databind.BeanDescription r3 = r4.introspectForCreation(r12)
            r8 = r3
            r3 = r12
            r12 = r8
        L77:
            if (r11 != 0) goto Lad
            com.fasterxml.jackson.databind.deser.ValueInstantiator r11 = r9.findValueInstantiator(r10, r12)
            boolean r12 = r11.canCreateUsingDefault()
            if (r12 != 0) goto L98
            java.lang.Class<java.util.concurrent.ArrayBlockingQueue> r12 = java.util.concurrent.ArrayBlockingQueue.class
            boolean r12 = r3.hasRawClass(r12)
            if (r12 == 0) goto L91
            com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer
            r10.<init>(r3, r7, r1, r11)
            return r10
        L91:
            com.fasterxml.jackson.databind.JsonDeserializer r10 = com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers.findForCollection(r10, r3)
            if (r10 == 0) goto L98
            return r10
        L98:
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r10 = r0.hasRawClass(r10)
            if (r10 == 0) goto La7
            com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer
            r10.<init>(r3, r7, r11)
        La5:
            r11 = r10
            goto Lad
        La7:
            com.fasterxml.jackson.databind.deser.std.CollectionDeserializer r10 = new com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
            r10.<init>(r3, r7, r1, r11)
            goto La5
        Lad:
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r10 = r2._factoryConfig
            boolean r10 = r10.hasDeserializerModifiers()
            if (r10 == 0) goto Lcb
            com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig r10 = r2._factoryConfig
            java.lang.Iterable r10 = r10.deserializerModifiers()
            java.util.Iterator r10 = r10.iterator()
            boolean r12 = r10.hasNext()
            if (r12 != 0) goto Lc6
            goto Lcb
        Lc6:
            java.lang.ClassCastException r10 = com.mapbox.common.b.e(r10)
            throw r10
        Lcb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createCollectionDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createCollectionLikeDeserializer(DeserializationContext deserializationContext, CollectionLikeType collectionLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = collectionLikeType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomCollectionLikeDeserializer = _findCustomCollectionLikeDeserializer(collectionLikeType, config, beanDescription, typeDeserializer, jsonDeserializer);
        if (_findCustomCollectionLikeDeserializer == null || !this._factoryConfig.hasDeserializerModifiers()) {
            return _findCustomCollectionLikeDeserializer;
        }
        Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
        return _findCustomCollectionLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createEnumDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomEnumDeserializer = _findCustomEnumDeserializer(rawClass, config, beanDescription);
        if (_findCustomEnumDeserializer == null) {
            if (rawClass == Enum.class) {
                return AbstractDeserializer.constructForNonPOJO(beanDescription);
            }
            ValueInstantiator _constructDefaultValueInstantiator = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
            SettableBeanProperty[] fromObjectArguments = _constructDefaultValueInstantiator == null ? null : _constructDefaultValueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            Iterator<AnnotatedMethod> it = beanDescription.getFactoryMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedMethod next = it.next();
                if (_hasCreatorAnnotation(deserializationContext, next)) {
                    if (next.getParameterCount() == 0) {
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForNoArgsCreator(config, rawClass, next);
                    } else {
                        if (!next.getRawReturnType().isAssignableFrom(rawClass)) {
                            deserializationContext.reportBadDefinition(javaType, "Invalid `@JsonCreator` annotated Enum factory method [" + next.toString() + "]: needs to return compatible type");
                        }
                        _findCustomEnumDeserializer = EnumDeserializer.deserializerForCreator(config, rawClass, next, _constructDefaultValueInstantiator, fromObjectArguments);
                    }
                }
            }
            if (_findCustomEnumDeserializer == null) {
                _findCustomEnumDeserializer = new EnumDeserializer(constructEnumResolver(rawClass, config, beanDescription.findJsonValueAccessor()), Boolean.valueOf(config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS)));
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
        }
        return _findCustomEnumDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public KeyDeserializer createKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        BeanDescription beanDescription;
        DeserializationConfig config = deserializationContext.getConfig();
        KeyDeserializer keyDeserializer = null;
        if (this._factoryConfig.hasKeyDeserializers()) {
            beanDescription = config.introspectClassAnnotations(javaType);
            Iterator<KeyDeserializers> it = this._factoryConfig.keyDeserializers().iterator();
            while (it.hasNext() && (keyDeserializer = it.next().findKeyDeserializer(javaType, config, beanDescription)) == null) {
            }
        } else {
            beanDescription = null;
        }
        if (keyDeserializer == null) {
            if (beanDescription == null) {
                beanDescription = config.introspectClassAnnotations(javaType.getRawClass());
            }
            keyDeserializer = findKeyDeserializerFromAnnotation(deserializationContext, beanDescription.getClassInfo());
            if (keyDeserializer == null) {
                keyDeserializer = javaType.isEnumType() ? _createEnumKeyDeserializer(deserializationContext, javaType) : StdKeyDeserializers.findStringBasedKeyDeserializer(config, javaType);
            }
        }
        if (keyDeserializer == null || !this._factoryConfig.hasDeserializerModifiers()) {
            return keyDeserializer;
        }
        Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
        if (it2.hasNext()) {
            throw b.e(it2);
        }
        return keyDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.fasterxml.jackson.databind.JsonDeserializer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.fasterxml.jackson.databind.JsonDeserializer<?>] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.fasterxml.jackson.databind.deser.std.MapDeserializer] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonDeserializer<?> createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext r18, com.fasterxml.jackson.databind.type.MapType r19, com.fasterxml.jackson.databind.BeanDescription r20) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BasicDeserializerFactory.createMapDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.type.MapType, com.fasterxml.jackson.databind.BeanDescription):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createMapLikeDeserializer(DeserializationContext deserializationContext, MapLikeType mapLikeType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType keyType = mapLikeType.getKeyType();
        JavaType contentType = mapLikeType.getContentType();
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        KeyDeserializer keyDeserializer = (KeyDeserializer) keyType.getValueHandler();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        JsonDeserializer<?> _findCustomMapLikeDeserializer = _findCustomMapLikeDeserializer(mapLikeType, config, beanDescription, keyDeserializer, typeDeserializer, jsonDeserializer);
        if (_findCustomMapLikeDeserializer == null || !this._factoryConfig.hasDeserializerModifiers()) {
            return _findCustomMapLikeDeserializer;
        }
        Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
        return _findCustomMapLikeDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createReferenceDeserializer(DeserializationContext deserializationContext, ReferenceType referenceType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) contentType.getValueHandler();
        DeserializationConfig config = deserializationContext.getConfig();
        TypeDeserializer typeDeserializer = (TypeDeserializer) contentType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = findTypeDeserializer(config, contentType);
        }
        TypeDeserializer typeDeserializer2 = typeDeserializer;
        JsonDeserializer<?> _findCustomReferenceDeserializer = _findCustomReferenceDeserializer(referenceType, config, beanDescription, typeDeserializer2, jsonDeserializer);
        if (_findCustomReferenceDeserializer == null && referenceType.isTypeOrSubTypeOf(AtomicReference.class)) {
            return new AtomicReferenceDeserializer(referenceType, referenceType.getRawClass() == AtomicReference.class ? null : findValueInstantiator(deserializationContext, beanDescription), typeDeserializer2, jsonDeserializer);
        }
        if (_findCustomReferenceDeserializer == null || !this._factoryConfig.hasDeserializerModifiers()) {
            return _findCustomReferenceDeserializer;
        }
        Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
        if (it.hasNext()) {
            throw b.e(it);
        }
        return _findCustomReferenceDeserializer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<?> createTreeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        JsonDeserializer<?> _findCustomTreeNodeDeserializer = _findCustomTreeNodeDeserializer(rawClass, deserializationConfig, beanDescription);
        return _findCustomTreeNodeDeserializer != null ? _findCustomTreeNodeDeserializer : JsonNodeDeserializer.getDeserializer(rawClass);
    }

    public JsonDeserializer<Object> findContentDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findContentDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findContentDeserializer);
    }

    public JsonDeserializer<?> findDefaultDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType javaType2;
        JavaType javaType3;
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass == CLASS_OBJECT || rawClass == CLASS_SERIALIZABLE) {
            DeserializationConfig config = deserializationContext.getConfig();
            if (this._factoryConfig.hasAbstractTypeResolvers()) {
                javaType2 = _findRemappedType(config, List.class);
                javaType3 = _findRemappedType(config, Map.class);
            } else {
                javaType2 = null;
                javaType3 = null;
            }
            return new UntypedObjectDeserializer(javaType2, javaType3);
        }
        if (rawClass == CLASS_STRING || rawClass == CLASS_CHAR_SEQUENCE) {
            return StringDeserializer.instance;
        }
        Class<?> cls = CLASS_ITERABLE;
        if (rawClass == cls) {
            TypeFactory typeFactory = deserializationContext.getTypeFactory();
            JavaType[] findTypeParameters = typeFactory.findTypeParameters(javaType, cls);
            return createCollectionDeserializer(deserializationContext, typeFactory.constructCollectionType(Collection.class, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]), beanDescription);
        }
        if (rawClass == CLASS_MAP_ENTRY) {
            JavaType containedTypeOrUnknown = javaType.containedTypeOrUnknown(0);
            JavaType containedTypeOrUnknown2 = javaType.containedTypeOrUnknown(1);
            TypeDeserializer typeDeserializer = (TypeDeserializer) containedTypeOrUnknown2.getTypeHandler();
            if (typeDeserializer == null) {
                typeDeserializer = findTypeDeserializer(deserializationContext.getConfig(), containedTypeOrUnknown2);
            }
            return new MapEntryDeserializer(javaType, (KeyDeserializer) containedTypeOrUnknown.getValueHandler(), (JsonDeserializer<Object>) containedTypeOrUnknown2.getValueHandler(), typeDeserializer);
        }
        String name = rawClass.getName();
        if (rawClass.isPrimitive() || name.startsWith("java.")) {
            JsonDeserializer<?> find = NumberDeserializers.find(rawClass, name);
            if (find == null) {
                find = DateDeserializers.find(rawClass, name);
            }
            if (find != null) {
                return find;
            }
        }
        if (rawClass == TokenBuffer.class) {
            return new TokenBufferDeserializer();
        }
        JsonDeserializer<?> findOptionalStdDeserializer = findOptionalStdDeserializer(deserializationContext, javaType, beanDescription);
        return findOptionalStdDeserializer != null ? findOptionalStdDeserializer : JdkDeserializers.find(deserializationContext, rawClass, name);
    }

    public JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializer = annotationIntrospector.findDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.deserializerInstance(annotated, findDeserializer);
    }

    public KeyDeserializer findKeyDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) throws JsonMappingException {
        Object findKeyDeserializer;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) == null) {
            return null;
        }
        return deserializationContext.keyDeserializerInstance(annotated, findKeyDeserializer);
    }

    public JsonDeserializer<?> findOptionalStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findDeserializer(javaType, deserializationContext.getConfig(), beanDescription);
    }

    public TypeDeserializer findPropertyContentTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(deserializationConfig, annotatedMember, javaType);
        JavaType contentType = javaType.getContentType();
        return findPropertyContentTypeResolver == null ? findTypeDeserializer(deserializationConfig, contentType) : findPropertyContentTypeResolver.buildTypeDeserializer(deserializationConfig, contentType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, contentType));
    }

    public TypeDeserializer findPropertyTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyTypeResolver = deserializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(deserializationConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return findTypeDeserializer(deserializationConfig, javaType);
        }
        try {
            return findPropertyTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, annotatedMember, javaType));
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e10), javaType).withCause(e10);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public TypeDeserializer findTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType mapAbstractType;
        AnnotatedClass classInfo = deserializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder findTypeResolver = deserializationConfig.getAnnotationIntrospector().findTypeResolver(deserializationConfig, classInfo, javaType);
        if (findTypeResolver == null && (findTypeResolver = deserializationConfig.getDefaultTyper(javaType)) == null) {
            return null;
        }
        Collection<NamedType> collectAndResolveSubtypesByTypeId = deserializationConfig.getSubtypeResolver().collectAndResolveSubtypesByTypeId(deserializationConfig, classInfo);
        if (findTypeResolver.getDefaultImpl() == null && javaType.isAbstract() && (mapAbstractType = mapAbstractType(deserializationConfig, javaType)) != null && !mapAbstractType.hasRawClass(javaType.getRawClass())) {
            findTypeResolver = findTypeResolver.withDefaultImpl(mapAbstractType.getRawClass());
        }
        try {
            return findTypeResolver.buildTypeDeserializer(deserializationConfig, javaType, collectAndResolveSubtypesByTypeId);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            throw InvalidDefinitionException.from((JsonParser) null, ClassUtil.exceptionMessage(e10), javaType).withCause(e10);
        }
    }

    public ValueInstantiator findValueInstantiator(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        AnnotatedClass classInfo = beanDescription.getClassInfo();
        Object findValueInstantiator = deserializationContext.getAnnotationIntrospector().findValueInstantiator(classInfo);
        ValueInstantiator _valueInstantiatorInstance = findValueInstantiator != null ? _valueInstantiatorInstance(config, classInfo, findValueInstantiator) : null;
        if (_valueInstantiatorInstance == null && (_valueInstantiatorInstance = JDKValueInstantiators.findStdValueInstantiator(config, beanDescription.getBeanClass())) == null) {
            _valueInstantiatorInstance = _constructDefaultValueInstantiator(deserializationContext, beanDescription);
        }
        if (this._factoryConfig.hasValueInstantiators()) {
            Iterator<ValueInstantiators> it = this._factoryConfig.valueInstantiators().iterator();
            if (it.hasNext()) {
                throw b.e(it);
            }
        }
        return _valueInstantiatorInstance != null ? _valueInstantiatorInstance.createContextual(deserializationContext, beanDescription) : _valueInstantiatorInstance;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JavaType mapAbstractType(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException {
        JavaType _mapAbstractType2;
        while (true) {
            _mapAbstractType2 = _mapAbstractType2(deserializationConfig, javaType);
            if (_mapAbstractType2 == null) {
                return javaType;
            }
            Class<?> rawClass = javaType.getRawClass();
            Class<?> rawClass2 = _mapAbstractType2.getRawClass();
            if (rawClass == rawClass2 || !rawClass.isAssignableFrom(rawClass2)) {
                break;
            }
            javaType = _mapAbstractType2;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + javaType + " to " + _mapAbstractType2 + ": latter is not a subtype of former");
    }

    public JavaType resolveMemberAndTypeAnnotations(DeserializationContext deserializationContext, AnnotatedMember annotatedMember, JavaType javaType) throws JsonMappingException {
        KeyDeserializer keyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && javaType.getKeyType() != null && (keyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotatedMember, annotationIntrospector.findKeyDeserializer(annotatedMember))) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerInstance);
            javaType.getKeyType();
        }
        if (javaType.hasContentType()) {
            JsonDeserializer<Object> deserializerInstance = deserializationContext.deserializerInstance(annotatedMember, annotationIntrospector.findContentDeserializer(annotatedMember));
            if (deserializerInstance != null) {
                javaType = javaType.withContentValueHandler(deserializerInstance);
            }
            TypeDeserializer findPropertyContentTypeDeserializer = findPropertyContentTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
            if (findPropertyContentTypeDeserializer != null) {
                javaType = javaType.withContentTypeHandler(findPropertyContentTypeDeserializer);
            }
        }
        TypeDeserializer findPropertyTypeDeserializer = findPropertyTypeDeserializer(deserializationContext.getConfig(), javaType, annotatedMember);
        if (findPropertyTypeDeserializer != null) {
            javaType = javaType.withTypeHandler(findPropertyTypeDeserializer);
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotatedMember, javaType);
    }
}
