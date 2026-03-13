package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import i2.u;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BeanDeserializerBase extends StdDeserializer<Object> implements ContextualDeserializer, ResolvableDeserializer, Serializable {
    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    protected SettableAnyProperty _anySetter;
    protected JsonDeserializer<Object> _arrayDelegateDeserializer;
    protected final Map<String, SettableBeanProperty> _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected ExternalTypeHandler _externalTypeIdHandler;
    protected final Set<String> _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final Set<String> _includableProps;
    protected final ValueInjector[] _injectables;
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected final JsonFormat.Shape _serializationShape;
    protected transient HashMap<ClassKey, JsonDeserializer<Object>> _subDeserializers;
    protected UnwrappedPropertyHandler _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;
    protected boolean _vanillaProcessing;

    public BeanDeserializerBase(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z2, Set<String> set2, boolean z10) {
        super(beanDescription.getType());
        this._beanType = beanDescription.getType();
        ValueInstantiator valueInstantiator = beanDeserializerBuilder.getValueInstantiator();
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = null;
        this._arrayDelegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._beanProperties = beanPropertyMap;
        this._backRefs = map;
        this._ignorableProps = set;
        this._ignoreAllUnknown = z2;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBuilder.getAnySetter();
        List<ValueInjector> injectables = beanDeserializerBuilder.getInjectables();
        ValueInjector[] valueInjectorArr = (injectables == null || injectables.isEmpty()) ? null : (ValueInjector[]) injectables.toArray(new ValueInjector[injectables.size()]);
        this._injectables = valueInjectorArr;
        ObjectIdReader objectIdReader = beanDeserializerBuilder.getObjectIdReader();
        this._objectIdReader = objectIdReader;
        this._nonStandardCreation = this._unwrappedPropertyHandler != null || valueInstantiator.canCreateUsingDelegate() || valueInstantiator.canCreateFromObjectWith() || !valueInstantiator.canCreateUsingDefault();
        this._serializationShape = beanDescription.findExpectedFormat(null).getShape();
        this._needViewProcesing = z10;
        this._vanillaProcessing = !this._nonStandardCreation && valueInjectorArr == null && !z10 && objectIdReader == null;
    }

    private JsonDeserializer<Object> _findDelegateDeserializer(DeserializationContext deserializationContext, JavaType javaType, AnnotatedWithParams annotatedWithParams) throws JsonMappingException {
        BeanProperty.Std std = new BeanProperty.Std(TEMP_PROPERTY_NAME, javaType, null, annotatedWithParams, PropertyMetadata.STD_OPTIONAL);
        TypeDeserializer typeDeserializer = (TypeDeserializer) javaType.getTypeHandler();
        if (typeDeserializer == null) {
            typeDeserializer = deserializationContext.getConfig().findTypeDeserializer(javaType);
        }
        JsonDeserializer<?> jsonDeserializer = (JsonDeserializer) javaType.getValueHandler();
        JsonDeserializer<?> findDeserializer = jsonDeserializer == null ? findDeserializer(deserializationContext, javaType, std) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, std, javaType);
        return typeDeserializer != null ? new TypeWrappedDeserializer(typeDeserializer.forProperty(std), findDeserializer) : findDeserializer;
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z2 = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z2 || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z2) {
            ClassUtil.throwIfRTE(th);
        }
        return th;
    }

    public Object _convertObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, JsonDeserializer<Object> jsonDeserializer) throws IOException {
        TokenBuffer bufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        if (obj instanceof String) {
            bufferForInputBuffering.writeString((String) obj);
        } else if (obj instanceof Long) {
            bufferForInputBuffering.writeNumber(((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            bufferForInputBuffering.writeNumber(((Integer) obj).intValue());
        } else {
            bufferForInputBuffering.writeObject(obj);
        }
        JsonParser asParser = bufferForInputBuffering.asParser();
        asParser.nextToken();
        return jsonDeserializer.deserialize(asParser, deserializationContext);
    }

    public final JsonDeserializer<Object> _delegateDeserializer() {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer == null ? this._arrayDelegateDeserializer : jsonDeserializer;
    }

    public abstract Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public NameTransformer _findPropertyUnwrapper(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        NameTransformer findUnwrappingNameTransformer;
        AnnotatedMember member = settableBeanProperty.getMember();
        if (member == null || (findUnwrappingNameTransformer = deserializationContext.getAnnotationIntrospector().findUnwrappingNameTransformer(member)) == null) {
            return null;
        }
        if (settableBeanProperty instanceof CreatorProperty) {
            deserializationContext.reportBadDefinition(getValueType(), "Cannot define Creator property \"" + settableBeanProperty.getName() + "\" as `@JsonUnwrapped`: combination not yet supported");
        }
        return findUnwrappingNameTransformer;
    }

    public JsonDeserializer<Object> _findSubclassDeserializer(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        JsonDeserializer<Object> jsonDeserializer;
        synchronized (this) {
            HashMap<ClassKey, JsonDeserializer<Object>> hashMap = this._subDeserializers;
            jsonDeserializer = hashMap == null ? null : hashMap.get(new ClassKey(obj.getClass()));
        }
        if (jsonDeserializer != null) {
            return jsonDeserializer;
        }
        JsonDeserializer<Object> findRootValueDeserializer = deserializationContext.findRootValueDeserializer(deserializationContext.constructType(obj.getClass()));
        if (findRootValueDeserializer == null) {
            return findRootValueDeserializer;
        }
        synchronized (this) {
            try {
                if (this._subDeserializers == null) {
                    this._subDeserializers = new HashMap<>();
                }
                this._subDeserializers.put(new ClassKey(obj.getClass()), findRootValueDeserializer);
            } finally {
            }
        }
        return findRootValueDeserializer;
    }

    public BeanDeserializerBase _handleByNameInclusion(DeserializationContext deserializationContext, AnnotationIntrospector annotationIntrospector, BeanDeserializerBase beanDeserializerBase, AnnotatedMember annotatedMember) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JsonIgnoreProperties.Value findPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, annotatedMember);
        if (findPropertyIgnoralByName.getIgnoreUnknown() && !this._ignoreAllUnknown) {
            beanDeserializerBase = beanDeserializerBase.withIgnoreAllUnknown(true);
        }
        Set<String> findIgnoredForDeserialization = findPropertyIgnoralByName.findIgnoredForDeserialization();
        Set<String> set = beanDeserializerBase._ignorableProps;
        if (findIgnoredForDeserialization.isEmpty()) {
            findIgnoredForDeserialization = set;
        } else if (set != null && !set.isEmpty()) {
            HashSet hashSet = new HashSet(set);
            hashSet.addAll(findIgnoredForDeserialization);
            findIgnoredForDeserialization = hashSet;
        }
        Set<String> set2 = beanDeserializerBase._includableProps;
        Set<String> combineNamesToInclude = IgnorePropertiesUtil.combineNamesToInclude(set2, annotationIntrospector.findPropertyInclusionByName(config, annotatedMember).getIncluded());
        return (findIgnoredForDeserialization == set && combineNamesToInclude == set2) ? beanDeserializerBase : beanDeserializerBase.withByNameInclusion(findIgnoredForDeserialization, combineNamesToInclude);
    }

    public Object _handleTypedObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Object obj2) throws IOException {
        JsonDeserializer<Object> deserializer = this._objectIdReader.getDeserializer();
        if (deserializer.handledType() != obj2.getClass()) {
            obj2 = _convertObjectId(jsonParser, deserializationContext, obj2, deserializer);
        }
        ObjectIdReader objectIdReader = this._objectIdReader;
        ObjectIdGenerator<?> objectIdGenerator = objectIdReader.generator;
        objectIdReader.getClass();
        deserializationContext.findObjectId(obj2, objectIdGenerator, null).bindItem(obj);
        SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
        return settableBeanProperty != null ? settableBeanProperty.setAndReturn(obj, obj2) : obj;
    }

    public void _replaceProperty(BeanPropertyMap beanPropertyMap, SettableBeanProperty[] settableBeanPropertyArr, SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        beanPropertyMap.replace(settableBeanProperty, settableBeanProperty2);
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (settableBeanPropertyArr[i3] == settableBeanProperty) {
                    settableBeanPropertyArr[i3] = settableBeanProperty2;
                    return;
                }
            }
        }
    }

    public SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) {
        Class<?> rawClass;
        Class<?> outerClass;
        JsonDeserializer<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        if ((valueDeserializer instanceof BeanDeserializerBase) && !((BeanDeserializerBase) valueDeserializer).getValueInstantiator().canCreateUsingDefault() && (outerClass = ClassUtil.getOuterClass((rawClass = settableBeanProperty.getType().getRawClass()))) != null && outerClass == this._beanType.getRawClass()) {
            for (Constructor<?> constructor : rawClass.getConstructors()) {
                if (constructor.getParameterCount() == 1 && outerClass.equals(constructor.getParameterTypes()[0])) {
                    if (deserializationContext.canOverrideAccessModifiers()) {
                        ClassUtil.checkAndFixAccess(constructor, deserializationContext.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    return new InnerClassProperty(settableBeanProperty, constructor);
                }
            }
        }
        return settableBeanProperty;
    }

    public SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        String managedReferenceName = settableBeanProperty.getManagedReferenceName();
        if (managedReferenceName == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty findBackReference = settableBeanProperty.getValueDeserializer().findBackReference(managedReferenceName);
        if (findBackReference == null) {
            return (SettableBeanProperty) deserializationContext.reportBadDefinition(this._beanType, AbstractC1482f.i("Cannot handle managed/back reference ", ClassUtil.name(managedReferenceName), ": no back reference property found from type ", ClassUtil.getTypeDescription(settableBeanProperty.getType())));
        }
        JavaType javaType = this._beanType;
        JavaType type = findBackReference.getType();
        boolean isContainerType = settableBeanProperty.getType().isContainerType();
        if (!type.getRawClass().isAssignableFrom(javaType.getRawClass())) {
            JavaType javaType2 = this._beanType;
            String name = ClassUtil.name(managedReferenceName);
            String typeDescription = ClassUtil.getTypeDescription(type);
            String name2 = javaType.getRawClass().getName();
            StringBuilder t3 = u.t("Cannot handle managed/back reference ", name, ": back reference type (", typeDescription, ") not compatible with managed type (");
            t3.append(name2);
            t3.append(")");
            deserializationContext.reportBadDefinition(javaType2, t3.toString());
        }
        return new ManagedReferenceProperty(settableBeanProperty, managedReferenceName, findBackReference, isContainerType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.fromDefaults != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.deser.SettableBeanProperty _resolveMergeAndNullSettings(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.deser.SettableBeanProperty r5, com.fasterxml.jackson.databind.PropertyMetadata r6) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r3 = this;
            com.fasterxml.jackson.databind.PropertyMetadata$MergeInfo r0 = r6.getMergeInfo()
            if (r0 == 0) goto L3a
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r5.getValueDeserializer()
            com.fasterxml.jackson.databind.DeserializationConfig r2 = r4.getConfig()
            java.lang.Boolean r2 = r1.supportsUpdate(r2)
            if (r2 != 0) goto L19
            boolean r1 = r0.fromDefaults
            if (r1 == 0) goto L27
            goto L26
        L19:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L27
            boolean r6 = r0.fromDefaults
            if (r6 != 0) goto L26
            r4.handleBadMerge(r1)
        L26:
            return r5
        L27:
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = r0.getter
            com.fasterxml.jackson.databind.MapperFeature r1 = com.fasterxml.jackson.databind.MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS
            boolean r1 = r4.isEnabled(r1)
            r0.fixAccess(r1)
            boolean r1 = r5 instanceof com.fasterxml.jackson.databind.deser.impl.SetterlessProperty
            if (r1 != 0) goto L3a
            com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty r5 = com.fasterxml.jackson.databind.deser.impl.MergingSettableBeanProperty.construct(r5, r0)
        L3a:
            com.fasterxml.jackson.databind.deser.NullValueProvider r4 = r3.findValueNullProvider(r4, r5, r6)
            if (r4 == 0) goto L45
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = r5.withNullProvider(r4)
            return r4
        L45:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.BeanDeserializerBase._resolveMergeAndNullSettings(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.PropertyMetadata):com.fasterxml.jackson.databind.deser.SettableBeanProperty");
    }

    public SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        ObjectIdInfo objectIdInfo = settableBeanProperty.getObjectIdInfo();
        JsonDeserializer<Object> valueDeserializer = settableBeanProperty.getValueDeserializer();
        return (objectIdInfo == null && (valueDeserializer == null ? null : valueDeserializer.getObjectIdReader()) == null) ? settableBeanProperty : new ObjectIdReferenceProperty(settableBeanProperty, objectIdInfo);
    }

    public abstract BeanDeserializerBase asArrayDeserializer();

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        BeanPropertyMap beanPropertyMap;
        BeanPropertyMap withCaseInsensitivity;
        ObjectIdInfo findObjectIdInfo;
        JavaType javaType;
        ObjectIdGenerator<?> objectIdGeneratorInstance;
        SettableBeanProperty settableBeanProperty;
        ObjectIdReader objectIdReader = this._objectIdReader;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        AnnotatedMember member = StdDeserializer._neitherNull(beanProperty, annotationIntrospector) ? beanProperty.getMember() : null;
        if (member != null && (findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member)) != null) {
            ObjectIdInfo findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
            Class<? extends ObjectIdGenerator<?>> generatorType = findObjectReferenceInfo.getGeneratorType();
            deserializationContext.objectIdResolverInstance(member, findObjectReferenceInfo);
            if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                PropertyName propertyName = findObjectReferenceInfo.getPropertyName();
                SettableBeanProperty findProperty = findProperty(propertyName);
                if (findProperty == null) {
                    return (JsonDeserializer) deserializationContext.reportBadDefinition(this._beanType, AbstractC1482f.i("Invalid Object Id definition for ", ClassUtil.nameOf(handledType()), ": cannot find property with name ", ClassUtil.name(propertyName)));
                }
                javaType = findProperty.getType();
                objectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(findObjectReferenceInfo.getScope());
                settableBeanProperty = findProperty;
            } else {
                javaType = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) generatorType), ObjectIdGenerator.class)[0];
                objectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(member, findObjectReferenceInfo);
                settableBeanProperty = null;
            }
            JavaType javaType2 = javaType;
            objectIdReader = ObjectIdReader.construct(javaType2, findObjectReferenceInfo.getPropertyName(), objectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType2), settableBeanProperty, null);
        }
        BeanDeserializerBase withObjectIdReader = (objectIdReader == null || objectIdReader == this._objectIdReader) ? this : withObjectIdReader(objectIdReader);
        if (member != null) {
            withObjectIdReader = _handleByNameInclusion(deserializationContext, annotationIntrospector, withObjectIdReader, member);
        }
        JsonFormat.Value findFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
        if (findFormatOverrides != null) {
            r3 = findFormatOverrides.hasShape() ? findFormatOverrides.getShape() : null;
            Boolean feature = findFormatOverrides.getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
            if (feature != null && (withCaseInsensitivity = (beanPropertyMap = this._beanProperties).withCaseInsensitivity(feature.booleanValue())) != beanPropertyMap) {
                withObjectIdReader = withObjectIdReader.withBeanProperties(withCaseInsensitivity);
            }
        }
        if (r3 == null) {
            r3 = this._serializationShape;
        }
        return r3 == JsonFormat.Shape.ARRAY ? withObjectIdReader.asArrayDeserializer() : withObjectIdReader;
    }

    public Object deserializeFromBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> _delegateDeserializer = _delegateDeserializer();
        if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromBoolean()) {
            return this._valueInstantiator.createFromBoolean(deserializationContext, jsonParser.currentToken() == JsonToken.VALUE_TRUE);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.DOUBLE || numberType == JsonParser.NumberType.FLOAT) {
            JsonDeserializer<Object> _delegateDeserializer = _delegateDeserializer();
            if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromDouble()) {
                return this._valueInstantiator.createFromDouble(deserializationContext, jsonParser.getDoubleValue());
            }
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        }
        if (numberType != JsonParser.NumberType.BIG_DECIMAL) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
        }
        JsonDeserializer<Object> _delegateDeserializer2 = _delegateDeserializer();
        if (_delegateDeserializer2 == null || this._valueInstantiator.canCreateFromBigDecimal()) {
            return this._valueInstantiator.createFromBigDecimal(deserializationContext, jsonParser.getDecimalValue());
        }
        Object createUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer2.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate2);
        }
        return createUsingDelegate2;
    }

    public Object deserializeFromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> _delegateDeserializer = _delegateDeserializer();
        if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            return (embeddedObject == null || this._beanType.isTypeOrSuperTypeOf(embeddedObject.getClass())) ? embeddedObject : deserializationContext.handleWeirdNativeValue(this._beanType, embeddedObject, jsonParser);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeFromNumber(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> _delegateDeserializer = _delegateDeserializer();
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.INT) {
            if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromInt(deserializationContext, jsonParser.getIntValue());
            }
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        }
        if (numberType == JsonParser.NumberType.LONG) {
            if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromInt()) {
                return this._valueInstantiator.createFromLong(deserializationContext, jsonParser.getLongValue());
            }
            Object createUsingDelegate2 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate2);
            }
            return createUsingDelegate2;
        }
        if (numberType != JsonParser.NumberType.BIG_INTEGER) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "no suitable creator method found to deserialize from Number value (%s)", jsonParser.getNumberValue());
        }
        if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromBigInteger()) {
            return this._valueInstantiator.createFromBigInteger(deserializationContext, jsonParser.getBigIntegerValue());
        }
        Object createUsingDelegate3 = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate3);
        }
        return createUsingDelegate3;
    }

    public abstract Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public Object deserializeFromObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object readObjectReference = this._objectIdReader.readObjectReference(jsonParser, deserializationContext);
        ObjectIdReader objectIdReader = this._objectIdReader;
        ObjectIdGenerator<?> objectIdGenerator = objectIdReader.generator;
        objectIdReader.getClass();
        ReadableObjectId findObjectId = deserializationContext.findObjectId(readObjectReference, objectIdGenerator, null);
        Object resolve = findObjectId.resolve();
        if (resolve != null) {
            return resolve;
        }
        throw new UnresolvedForwardReference(jsonParser, "Could not resolve Object Id [" + readObjectReference + "] (for " + this._beanType + ").", jsonParser.getCurrentLocation(), findObjectId);
    }

    public Object deserializeFromObjectUsingNonDefault(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> _delegateDeserializer = _delegateDeserializer();
        if (_delegateDeserializer != null) {
            Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, createUsingDelegate);
            }
            return createUsingDelegate;
        }
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        Class<?> rawClass = this._beanType.getRawClass();
        return ClassUtil.isNonStaticInnerClass(rawClass) ? deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "non-static inner classes like this can only by instantiated using default, no-argument constructor", new Object[0]) : NativeImageUtil.needsReflectionConfiguration(rawClass) ? deserializationContext.handleMissingInstantiator(rawClass, null, jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator): this appears to be a native image, in which case you may need to configure reflection for the class that is to be deserialized", new Object[0]) : deserializationContext.handleMissingInstantiator(rawClass, getValueInstantiator(), jsonParser, "cannot deserialize from Object value (no delegate- or property-based Creator)", new Object[0]);
    }

    public Object deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._objectIdReader != null) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> _delegateDeserializer = _delegateDeserializer();
        if (_delegateDeserializer == null || this._valueInstantiator.canCreateFromString()) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Object createUsingDelegate = this._valueInstantiator.createUsingDelegate(deserializationContext, _delegateDeserializer.deserialize(jsonParser, deserializationContext));
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDelegate);
        }
        return createUsingDelegate;
    }

    public Object deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializeFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        Object objectId;
        if (this._objectIdReader != null) {
            if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
                return _handleTypedObjectId(jsonParser, deserializationContext, typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext), objectId);
            }
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken != null) {
                if (currentToken.isScalarValue()) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
                if (currentToken == JsonToken.START_OBJECT) {
                    currentToken = jsonParser.nextToken();
                }
                if (currentToken == JsonToken.FIELD_NAME && this._objectIdReader.maySerializeAsObject() && this._objectIdReader.isValidReferencePropertyName(jsonParser.currentName(), jsonParser)) {
                    return deserializeFromObjectId(jsonParser, deserializationContext);
                }
            }
        }
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        Map<String, SettableBeanProperty> map = this._backRefs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        Object findDeserializationConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null || (findDeserializationConverter = annotationIntrospector.findDeserializationConverter(settableBeanProperty.getMember())) == null) {
            return null;
        }
        Converter<Object, Object> converterInstance = deserializationContext.converterInstance(settableBeanProperty.getMember(), findDeserializationConverter);
        JavaType inputType = converterInstance.getInputType(deserializationContext.getTypeFactory());
        return new StdDelegatingDeserializer(converterInstance, inputType, deserializationContext.findNonContextualValueDeserializer(inputType));
    }

    public SettableBeanProperty findProperty(PropertyName propertyName) {
        return findProperty(propertyName.getSimpleName());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        try {
            return this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e10) {
            return ClassUtil.throwAsMappingException(deserializationContext, e10);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> getKnownPropertyNames() {
        ArrayList arrayList = new ArrayList();
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getName());
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public ObjectIdReader getObjectIdReader() {
        return this._objectIdReader;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._beanType;
    }

    public void handleIgnoredProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES)) {
            throw IgnoredPropertyException.from(jsonParser, obj, str, getKnownPropertyNames());
        }
        jsonParser.skipChildren();
    }

    public Object handlePolymorphic(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        JsonDeserializer<Object> _findSubclassDeserializer = _findSubclassDeserializer(deserializationContext, obj, tokenBuffer);
        if (_findSubclassDeserializer == null) {
            if (tokenBuffer != null) {
                obj = handleUnknownProperties(deserializationContext, obj, tokenBuffer);
            }
            return jsonParser != null ? deserialize(jsonParser, deserializationContext, obj) : obj;
        }
        if (tokenBuffer != null) {
            tokenBuffer.writeEndObject();
            JsonParser asParser = tokenBuffer.asParser();
            asParser.nextToken();
            obj = _findSubclassDeserializer.deserialize(asParser, deserializationContext, obj);
        }
        return jsonParser != null ? _findSubclassDeserializer.deserialize(jsonParser, deserializationContext, obj) : obj;
    }

    public Object handleUnknownProperties(DeserializationContext deserializationContext, Object obj, TokenBuffer tokenBuffer) throws IOException {
        tokenBuffer.writeEndObject();
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != JsonToken.END_OBJECT) {
            String currentName = asParser.currentName();
            asParser.nextToken();
            handleUnknownProperty(asParser, deserializationContext, obj, currentName);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (this._ignoreAllUnknown) {
            jsonParser.skipChildren();
            return;
        }
        if (IgnorePropertiesUtil.shouldIgnore(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
        }
        super.handleUnknownProperty(jsonParser, deserializationContext, obj, str);
    }

    public void handleUnknownVanilla(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (IgnorePropertiesUtil.shouldIgnore(str, this._ignorableProps, this._includableProps)) {
            handleIgnoredProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty == null) {
            handleUnknownProperty(jsonParser, deserializationContext, obj, str);
            return;
        }
        try {
            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, str);
        } catch (Exception e10) {
            wrapAndThrow(e10, obj, str, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Class<?> handledType() {
        return this._beanType.getRawClass();
    }

    public void injectValues(DeserializationContext deserializationContext, Object obj) throws IOException {
        for (ValueInjector valueInjector : this._injectables) {
            valueInjector.inject(deserializationContext, obj);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.POJO;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        SettableBeanProperty[] settableBeanPropertyArr;
        JsonDeserializer<Object> valueDeserializer;
        JsonDeserializer<Object> unwrappingDeserializer;
        boolean z2 = false;
        ExternalTypeHandler.Builder builder = null;
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            settableBeanPropertyArr = this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig());
            if (this._ignorableProps != null || this._includableProps != null) {
                int length = settableBeanPropertyArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    if (IgnorePropertiesUtil.shouldIgnore(settableBeanPropertyArr[i3].getName(), this._ignorableProps, this._includableProps)) {
                        settableBeanPropertyArr[i3].markAsIgnorable();
                    }
                }
            }
        } else {
            settableBeanPropertyArr = null;
        }
        Iterator<SettableBeanProperty> it = this._beanProperties.iterator();
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            if (!next.hasValueDeserializer()) {
                JsonDeserializer<Object> findConvertingDeserializer = findConvertingDeserializer(deserializationContext, next);
                if (findConvertingDeserializer == null) {
                    findConvertingDeserializer = deserializationContext.findNonContextualValueDeserializer(next.getType());
                }
                _replaceProperty(this._beanProperties, settableBeanPropertyArr, next, next.withValueDeserializer(findConvertingDeserializer));
            }
        }
        Iterator<SettableBeanProperty> it2 = this._beanProperties.iterator();
        UnwrappedPropertyHandler unwrappedPropertyHandler = null;
        while (it2.hasNext()) {
            SettableBeanProperty next2 = it2.next();
            SettableBeanProperty _resolveManagedReferenceProperty = _resolveManagedReferenceProperty(deserializationContext, next2.withValueDeserializer(deserializationContext.handlePrimaryContextualization(next2.getValueDeserializer(), next2, next2.getType())));
            if (!(_resolveManagedReferenceProperty instanceof ManagedReferenceProperty)) {
                _resolveManagedReferenceProperty = _resolvedObjectIdProperty(deserializationContext, _resolveManagedReferenceProperty);
            }
            NameTransformer _findPropertyUnwrapper = _findPropertyUnwrapper(deserializationContext, _resolveManagedReferenceProperty);
            if (_findPropertyUnwrapper == null || (unwrappingDeserializer = (valueDeserializer = _resolveManagedReferenceProperty.getValueDeserializer()).unwrappingDeserializer(_findPropertyUnwrapper)) == valueDeserializer || unwrappingDeserializer == null) {
                SettableBeanProperty _resolveInnerClassValuedProperty = _resolveInnerClassValuedProperty(deserializationContext, _resolveMergeAndNullSettings(deserializationContext, _resolveManagedReferenceProperty, _resolveManagedReferenceProperty.getMetadata()));
                if (_resolveInnerClassValuedProperty != next2) {
                    _replaceProperty(this._beanProperties, settableBeanPropertyArr, next2, _resolveInnerClassValuedProperty);
                }
                if (_resolveInnerClassValuedProperty.hasValueTypeDeserializer()) {
                    TypeDeserializer valueTypeDeserializer = _resolveInnerClassValuedProperty.getValueTypeDeserializer();
                    if (valueTypeDeserializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                        if (builder == null) {
                            builder = ExternalTypeHandler.builder(this._beanType);
                        }
                        builder.addExternal(_resolveInnerClassValuedProperty, valueTypeDeserializer);
                        this._beanProperties.remove(_resolveInnerClassValuedProperty);
                    }
                }
            } else {
                SettableBeanProperty withValueDeserializer = _resolveManagedReferenceProperty.withValueDeserializer(unwrappingDeserializer);
                if (unwrappedPropertyHandler == null) {
                    unwrappedPropertyHandler = new UnwrappedPropertyHandler();
                }
                unwrappedPropertyHandler.addProperty(withValueDeserializer);
                this._beanProperties.remove(withValueDeserializer);
            }
        }
        SettableAnyProperty settableAnyProperty = this._anySetter;
        if (settableAnyProperty != null && !settableAnyProperty.hasValueDeserializer()) {
            SettableAnyProperty settableAnyProperty2 = this._anySetter;
            this._anySetter = settableAnyProperty2.withValueDeserializer(findDeserializer(deserializationContext, settableAnyProperty2.getType(), this._anySetter.getProperty()));
        }
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._beanType;
                deserializationContext.reportBadDefinition(javaType, AbstractC1482f.j("Invalid delegate-creator definition for ", ClassUtil.getTypeDescription(javaType), ": value instantiator (", ClassUtil.classNameOf(this._valueInstantiator), ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'"));
            }
            this._delegateDeserializer = _findDelegateDeserializer(deserializationContext, delegateType, this._valueInstantiator.getDelegateCreator());
        }
        if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._beanType;
                deserializationContext.reportBadDefinition(javaType2, AbstractC1482f.j("Invalid delegate-creator definition for ", ClassUtil.getTypeDescription(javaType2), ": value instantiator (", ClassUtil.classNameOf(this._valueInstantiator), ") returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'"));
            }
            this._arrayDelegateDeserializer = _findDelegateDeserializer(deserializationContext, arrayDelegateType, this._valueInstantiator.getArrayDelegateCreator());
        }
        if (settableBeanPropertyArr != null) {
            this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, settableBeanPropertyArr, this._beanProperties);
        }
        if (builder != null) {
            this._externalTypeIdHandler = builder.build(this._beanProperties);
            this._nonStandardCreation = true;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        if (unwrappedPropertyHandler != null) {
            this._nonStandardCreation = true;
        }
        if (this._vanillaProcessing && !this._nonStandardCreation) {
            z2 = true;
        }
        this._vanillaProcessing = z2;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public abstract JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer);

    public abstract BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap);

    public abstract BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    public abstract BeanDeserializerBase withIgnoreAllUnknown(boolean z2);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader);

    public void wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    public Object wrapInstantiationProblem(Throwable th, DeserializationContext deserializationContext) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (deserializationContext == null) {
            throw new IllegalArgumentException(th.getMessage(), th);
        }
        if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.throwIfRTE(th);
        }
        return deserializationContext.handleInstantiationProblem(this._beanType.getRawClass(), null, th);
    }

    public SettableBeanProperty findProperty(String str) {
        PropertyBasedCreator propertyBasedCreator;
        BeanPropertyMap beanPropertyMap = this._beanProperties;
        SettableBeanProperty find = beanPropertyMap == null ? null : beanPropertyMap.find(str);
        return (find != null || (propertyBasedCreator = this._propertyBasedCreator) == null) ? find : propertyBasedCreator.findCreatorProperty(str);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase) {
        this(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, boolean z2) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanDeserializerBase._beanProperties;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = z2;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = nameTransformer != null || beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        UnwrappedPropertyHandler unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        if (nameTransformer != null) {
            unwrappedPropertyHandler = unwrappedPropertyHandler != null ? unwrappedPropertyHandler.renameAll(nameTransformer) : unwrappedPropertyHandler;
            this._beanProperties = beanDeserializerBase._beanProperties.renameAll(nameTransformer);
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties;
        }
        this._unwrappedPropertyHandler = unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._objectIdReader = objectIdReader;
        if (objectIdReader == null) {
            this._beanProperties = beanDeserializerBase._beanProperties;
            this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        } else {
            this._beanProperties = beanDeserializerBase._beanProperties.withProperty(new ObjectIdValueProperty(objectIdReader, PropertyMetadata.STD_REQUIRED));
            this._vanillaProcessing = false;
        }
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = set;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = set2;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._beanProperties = beanDeserializerBase._beanProperties.withoutProperties(set, set2);
    }

    public BeanDeserializerBase(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase._beanType);
        this._beanType = beanDeserializerBase._beanType;
        this._valueInstantiator = beanDeserializerBase._valueInstantiator;
        this._delegateDeserializer = beanDeserializerBase._delegateDeserializer;
        this._arrayDelegateDeserializer = beanDeserializerBase._arrayDelegateDeserializer;
        this._propertyBasedCreator = beanDeserializerBase._propertyBasedCreator;
        this._beanProperties = beanPropertyMap;
        this._backRefs = beanDeserializerBase._backRefs;
        this._ignorableProps = beanDeserializerBase._ignorableProps;
        this._ignoreAllUnknown = beanDeserializerBase._ignoreAllUnknown;
        this._includableProps = beanDeserializerBase._includableProps;
        this._anySetter = beanDeserializerBase._anySetter;
        this._injectables = beanDeserializerBase._injectables;
        this._objectIdReader = beanDeserializerBase._objectIdReader;
        this._nonStandardCreation = beanDeserializerBase._nonStandardCreation;
        this._unwrappedPropertyHandler = beanDeserializerBase._unwrappedPropertyHandler;
        this._needViewProcesing = beanDeserializerBase._needViewProcesing;
        this._serializationShape = beanDeserializerBase._serializationShape;
        this._vanillaProcessing = beanDeserializerBase._vanillaProcessing;
    }
}
