package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TokenStreamFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.UnsupportedTypeSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NativeImageUtil;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BeanSerializerFactory extends BasicSerializerFactory implements Serializable {
    public static final BeanSerializerFactory instance = new BeanSerializerFactory(null);

    public BeanSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        super(serializerFactoryConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeanPropertyWriter _constructWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, PropertyBuilder propertyBuilder, boolean z2, AnnotatedMember annotatedMember) throws JsonMappingException {
        PropertyName fullName = beanPropertyDefinition.getFullName();
        JavaType type = annotatedMember.getType();
        BeanProperty.Std std = new BeanProperty.Std(fullName, type, beanPropertyDefinition.getWrapperName(), annotatedMember, beanPropertyDefinition.getMetadata());
        JsonSerializer<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, annotatedMember);
        if (findSerializerFromAnnotation instanceof ResolvableSerializer) {
            ((ResolvableSerializer) findSerializerFromAnnotation).resolve(serializerProvider);
        }
        return propertyBuilder.buildWriter(serializerProvider, beanPropertyDefinition, type, serializerProvider.handlePrimaryContextualization(findSerializerFromAnnotation, std), findPropertyTypeSerializer(type, serializerProvider.getConfig(), annotatedMember), (type.isContainerType() || type.isReferenceType()) ? findPropertyContentTypeSerializer(type, serializerProvider.getConfig(), annotatedMember) : null, annotatedMember, z2);
    }

    public JsonSerializer<?> _createSerializer2(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer;
        SerializationConfig config = serializerProvider.getConfig();
        JsonSerializer<?> jsonSerializer2 = null;
        if (javaType.isContainerType()) {
            if (!z2) {
                z2 = usesStaticTyping(config, beanDescription, null);
            }
            jsonSerializer = buildContainerSerializer(serializerProvider, javaType, beanDescription, z2);
            if (jsonSerializer != null) {
                return jsonSerializer;
            }
        } else {
            if (javaType.isReferenceType()) {
                jsonSerializer = findReferenceSerializer(serializerProvider, (ReferenceType) javaType, beanDescription, z2);
            } else {
                Iterator<Serializers> it = customSerializers().iterator();
                while (it.hasNext() && (jsonSerializer2 = it.next().findSerializer(config, javaType, beanDescription)) == null) {
                }
                jsonSerializer = jsonSerializer2;
            }
            if (jsonSerializer == null) {
                jsonSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription);
            }
        }
        if (jsonSerializer == null && (jsonSerializer = findSerializerByLookup(javaType, config, beanDescription, z2)) == null && (jsonSerializer = findSerializerByPrimaryType(serializerProvider, javaType, beanDescription, z2)) == null && (jsonSerializer = findBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, z2)) == null) {
            jsonSerializer = serializerProvider.getUnknownTypeSerializer(beanDescription.getBeanClass());
        }
        if (jsonSerializer == null || !this._factoryConfig.hasSerializerModifiers()) {
            return jsonSerializer;
        }
        Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
        if (it2.hasNext()) {
            throw b.e(it2);
        }
        return jsonSerializer;
    }

    public JsonSerializer<?> _findUnsupportedTypeSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        String checkUnsupportedType = BeanUtil.checkUnsupportedType(javaType);
        if (checkUnsupportedType == null || serializerProvider.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeSerializer(javaType, checkUnsupportedType);
    }

    public boolean _isUnserializableJacksonType(SerializerProvider serializerProvider, JavaType javaType) {
        Class<?> rawClass = javaType.getRawClass();
        return ObjectMapper.class.isAssignableFrom(rawClass) || ObjectReader.class.isAssignableFrom(rawClass) || ObjectWriter.class.isAssignableFrom(rawClass) || DatabindContext.class.isAssignableFrom(rawClass) || TokenStreamFactory.class.isAssignableFrom(rawClass) || JsonParser.class.isAssignableFrom(rawClass) || JsonGenerator.class.isAssignableFrom(rawClass);
    }

    public JsonSerializer<Object> constructBeanOrAddOnSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        if (beanDescription.getBeanClass() == Object.class) {
            return serializerProvider.getUnknownTypeSerializer(Object.class);
        }
        JsonSerializer<?> _findUnsupportedTypeSerializer = _findUnsupportedTypeSerializer(serializerProvider, javaType, beanDescription);
        if (_findUnsupportedTypeSerializer != null) {
            return _findUnsupportedTypeSerializer;
        }
        if (_isUnserializableJacksonType(serializerProvider, javaType)) {
            return new ToEmptyObjectSerializer(javaType);
        }
        SerializationConfig config = serializerProvider.getConfig();
        BeanSerializerBuilder constructBeanSerializerBuilder = constructBeanSerializerBuilder(beanDescription);
        constructBeanSerializerBuilder.setConfig(config);
        List<BeanPropertyWriter> findBeanProperties = findBeanProperties(serializerProvider, beanDescription, constructBeanSerializerBuilder);
        List<BeanPropertyWriter> arrayList = findBeanProperties == null ? new ArrayList<>() : removeOverlappingTypeIds(serializerProvider, beanDescription, constructBeanSerializerBuilder, findBeanProperties);
        serializerProvider.getAnnotationIntrospector().findAndAddVirtualProperties(config, beanDescription.getClassInfo(), arrayList);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            if (it.hasNext()) {
                throw b.e(it);
            }
        }
        List<BeanPropertyWriter> filterBeanProperties = filterBeanProperties(config, beanDescription, filterUnwantedJDKProperties(config, beanDescription, arrayList));
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
        }
        constructBeanSerializerBuilder.setObjectIdWriter(constructObjectIdHandler(serializerProvider, beanDescription, filterBeanProperties));
        constructBeanSerializerBuilder.setProperties(filterBeanProperties);
        constructBeanSerializerBuilder.setFilterId(findFilterId(config, beanDescription));
        AnnotatedMember findAnyGetter = beanDescription.findAnyGetter();
        if (findAnyGetter != null) {
            JavaType type = findAnyGetter.getType();
            JavaType contentType = type.getContentType();
            TypeSerializer createTypeSerializer = createTypeSerializer(config, contentType);
            JsonSerializer<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, findAnyGetter);
            if (findSerializerFromAnnotation == null) {
                findSerializerFromAnnotation = MapSerializer.construct(null, type, config.isEnabled(MapperFeature.USE_STATIC_TYPING), createTypeSerializer, null, null, null);
            }
            constructBeanSerializerBuilder.setAnyGetter(new AnyGetterWriter(new BeanProperty.Std(PropertyName.construct(findAnyGetter.getName()), contentType, null, findAnyGetter, PropertyMetadata.STD_OPTIONAL), findAnyGetter, findSerializerFromAnnotation));
        }
        processViews(config, constructBeanSerializerBuilder);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it3 = this._factoryConfig.serializerModifiers().iterator();
            if (it3.hasNext()) {
                throw b.e(it3);
            }
        }
        try {
            JsonSerializer<?> build = constructBeanSerializerBuilder.build();
            if (build != null) {
                return build;
            }
            if (javaType.isRecordType() && !NativeImageUtil.needsReflectionConfiguration(javaType.getRawClass())) {
                return constructBeanSerializerBuilder.createDummy();
            }
            JsonSerializer<?> findSerializerByAddonType = findSerializerByAddonType(config, javaType, beanDescription, z2);
            return (findSerializerByAddonType == null && beanDescription.hasKnownClassAnnotations()) ? constructBeanSerializerBuilder.createDummy() : findSerializerByAddonType;
        } catch (RuntimeException e10) {
            return (JsonSerializer) serializerProvider.reportBadTypeDefinition(beanDescription, "Failed to construct BeanSerializer for %s: (%s) %s", beanDescription.getType(), e10.getClass().getName(), e10.getMessage());
        }
    }

    public BeanSerializerBuilder constructBeanSerializerBuilder(BeanDescription beanDescription) {
        return new BeanSerializerBuilder(beanDescription);
    }

    public BeanPropertyWriter constructFilteredBeanWriter(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        return FilteredBeanPropertyWriter.constructViewBased(beanPropertyWriter, clsArr);
    }

    public ObjectIdWriter constructObjectIdHandler(SerializerProvider serializerProvider, BeanDescription beanDescription, List<BeanPropertyWriter> list) throws JsonMappingException {
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return null;
        }
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        if (generatorType != ObjectIdGenerators$PropertyGenerator.class) {
            return ObjectIdWriter.construct(serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0], objectIdInfo.getPropertyName(), serializerProvider.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo), objectIdInfo.getAlwaysAsId());
        }
        String simpleName = objectIdInfo.getPropertyName().getSimpleName();
        int size = list.size();
        for (int i3 = 0; i3 != size; i3++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i3);
            if (simpleName.equals(beanPropertyWriter.getName())) {
                if (i3 > 0) {
                    list.remove(i3);
                    list.add(0, beanPropertyWriter);
                }
                return ObjectIdWriter.construct(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(objectIdInfo, beanPropertyWriter), objectIdInfo.getAlwaysAsId());
            }
        }
        throw new IllegalArgumentException(AbstractC1482f.i("Invalid Object Id definition for ", ClassUtil.getTypeDescription(beanDescription.getType()), ": cannot find property with name ", ClassUtil.name(simpleName)));
    }

    public PropertyBuilder constructPropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return new PropertyBuilder(serializationConfig, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createSerializer(SerializerProvider serializerProvider, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType;
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        JsonSerializer<?> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, introspect.getClassInfo());
        if (findSerializerFromAnnotation != null) {
            return findSerializerFromAnnotation;
        }
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        boolean z2 = false;
        if (annotationIntrospector == null) {
            refineSerializationType = javaType;
        } else {
            try {
                refineSerializationType = annotationIntrospector.refineSerializationType(config, introspect.getClassInfo(), javaType);
            } catch (JsonMappingException e10) {
                return (JsonSerializer) serializerProvider.reportBadTypeDefinition(introspect, e10.getMessage(), new Object[0]);
            }
        }
        if (refineSerializationType != javaType) {
            if (!refineSerializationType.hasRawClass(javaType.getRawClass())) {
                introspect = config.introspect(refineSerializationType);
            }
            z2 = true;
        }
        Converter<Object, Object> findSerializationConverter = introspect.findSerializationConverter();
        if (findSerializationConverter == null) {
            return _createSerializer2(serializerProvider, refineSerializationType, introspect, z2);
        }
        JavaType outputType = findSerializationConverter.getOutputType(serializerProvider.getTypeFactory());
        if (!outputType.hasRawClass(refineSerializationType.getRawClass())) {
            introspect = config.introspect(outputType);
            findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, introspect.getClassInfo());
        }
        if (findSerializerFromAnnotation == null && !outputType.isJavaLangObject()) {
            findSerializerFromAnnotation = _createSerializer2(serializerProvider, outputType, introspect, true);
        }
        return new StdDelegatingSerializer(findSerializationConverter, outputType, findSerializerFromAnnotation);
    }

    @Override // com.fasterxml.jackson.databind.ser.BasicSerializerFactory
    public Iterable<Serializers> customSerializers() {
        return this._factoryConfig.serializers();
    }

    public List<BeanPropertyWriter> filterBeanProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyWriter> list) {
        JsonIgnoreProperties.Value defaultPropertyIgnorals = serializationConfig.getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Set<String> findIgnoredForSerialization = defaultPropertyIgnorals != null ? defaultPropertyIgnorals.findIgnoredForSerialization() : null;
        JsonIncludeProperties.Value defaultPropertyInclusions = serializationConfig.getDefaultPropertyInclusions(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        Set<String> included = defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null;
        if (included != null || (findIgnoredForSerialization != null && !findIgnoredForSerialization.isEmpty())) {
            Iterator<BeanPropertyWriter> it = list.iterator();
            while (it.hasNext()) {
                if (IgnorePropertiesUtil.shouldIgnore(it.next().getName(), findIgnoredForSerialization, included)) {
                    it.remove();
                }
            }
        }
        return list;
    }

    public List<BeanPropertyWriter> filterUnwantedJDKProperties(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyWriter> list) {
        if (beanDescription.getType().isTypeOrSubTypeOf(CharSequence.class) && list.size() == 1) {
            AnnotatedMember member = list.get(0).getMember();
            if ((member instanceof AnnotatedMethod) && "isEmpty".equals(member.getName()) && member.getDeclaringClass() == CharSequence.class) {
                list.remove(0);
            }
        }
        return list;
    }

    public JsonSerializer<Object> findBeanOrAddOnSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        if (isPotentialBeanType(javaType.getRawClass()) || ClassUtil.isEnumType(javaType.getRawClass())) {
            return constructBeanOrAddOnSerializer(serializerProvider, javaType, beanDescription, z2);
        }
        return null;
    }

    public List<BeanPropertyWriter> findBeanProperties(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder) throws JsonMappingException {
        SerializerProvider serializerProvider2;
        List<BeanPropertyDefinition> findProperties = beanDescription.findProperties();
        SerializationConfig config = serializerProvider.getConfig();
        removeIgnorableTypes(config, beanDescription, findProperties);
        if (config.isEnabled(MapperFeature.REQUIRE_SETTERS_FOR_GETTERS)) {
            removeSetterlessGetters(config, beanDescription, findProperties);
        }
        if (findProperties.isEmpty()) {
            return null;
        }
        boolean usesStaticTyping = usesStaticTyping(config, beanDescription, null);
        PropertyBuilder constructPropertyBuilder = constructPropertyBuilder(config, beanDescription);
        ArrayList arrayList = new ArrayList(findProperties.size());
        for (BeanPropertyDefinition beanPropertyDefinition : findProperties) {
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (!beanPropertyDefinition.isTypeId()) {
                AnnotationIntrospector.ReferenceProperty findReferenceType = beanPropertyDefinition.findReferenceType();
                if (findReferenceType == null || !findReferenceType.isBackReference()) {
                    if (accessor instanceof AnnotatedMethod) {
                        serializerProvider2 = serializerProvider;
                        arrayList.add(_constructWriter(serializerProvider2, beanPropertyDefinition, constructPropertyBuilder, usesStaticTyping, (AnnotatedMethod) accessor));
                    } else {
                        serializerProvider2 = serializerProvider;
                        arrayList.add(_constructWriter(serializerProvider2, beanPropertyDefinition, constructPropertyBuilder, usesStaticTyping, (AnnotatedField) accessor));
                    }
                    serializerProvider = serializerProvider2;
                }
            } else if (accessor != null) {
                beanSerializerBuilder.setTypeId(accessor);
            }
        }
        return arrayList;
    }

    public TypeSerializer findPropertyContentTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType contentType = javaType.getContentType();
        TypeResolverBuilder<?> findPropertyContentTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyContentTypeResolver(serializationConfig, annotatedMember, javaType);
        return findPropertyContentTypeResolver == null ? createTypeSerializer(serializationConfig, contentType) : findPropertyContentTypeResolver.buildTypeSerializer(serializationConfig, contentType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, contentType));
    }

    public TypeSerializer findPropertyTypeSerializer(JavaType javaType, SerializationConfig serializationConfig, AnnotatedMember annotatedMember) throws JsonMappingException {
        TypeResolverBuilder<?> findPropertyTypeResolver = serializationConfig.getAnnotationIntrospector().findPropertyTypeResolver(serializationConfig, annotatedMember, javaType);
        return findPropertyTypeResolver == null ? createTypeSerializer(serializationConfig, javaType) : findPropertyTypeResolver.buildTypeSerializer(serializationConfig, javaType, serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, annotatedMember, javaType));
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        return ClassUtil.canBeABeanType(cls) == null && !ClassUtil.isProxyType(cls);
    }

    public void processViews(SerializationConfig serializationConfig, BeanSerializerBuilder beanSerializerBuilder) {
        List<BeanPropertyWriter> properties = beanSerializerBuilder.getProperties();
        boolean isEnabled = serializationConfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        int size = properties.size();
        BeanPropertyWriter[] beanPropertyWriterArr = new BeanPropertyWriter[size];
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            BeanPropertyWriter beanPropertyWriter = properties.get(i10);
            Class<?>[] views = beanPropertyWriter.getViews();
            if (views != null && views.length != 0) {
                i3++;
                beanPropertyWriterArr[i10] = constructFilteredBeanWriter(beanPropertyWriter, views);
            } else if (isEnabled) {
                beanPropertyWriterArr[i10] = beanPropertyWriter;
            }
        }
        if (isEnabled && i3 == 0) {
            return;
        }
        beanSerializerBuilder.setFilteredProperties(beanPropertyWriterArr);
    }

    public void removeIgnorableTypes(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        AnnotationIntrospector annotationIntrospector = serializationConfig.getAnnotationIntrospector();
        HashMap hashMap = new HashMap();
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (next.getAccessor() == null) {
                it.remove();
            } else {
                Class<?> rawPrimaryType = next.getRawPrimaryType();
                Boolean bool = (Boolean) hashMap.get(rawPrimaryType);
                if (bool == null) {
                    bool = serializationConfig.getConfigOverride(rawPrimaryType).getIsIgnoredType();
                    if (bool == null && (bool = annotationIntrospector.isIgnorableType(serializationConfig.introspectClassAnnotations(rawPrimaryType).getClassInfo())) == null) {
                        bool = Boolean.FALSE;
                    }
                    hashMap.put(rawPrimaryType, bool);
                }
                if (bool.booleanValue()) {
                    it.remove();
                }
            }
        }
    }

    public List<BeanPropertyWriter> removeOverlappingTypeIds(SerializerProvider serializerProvider, BeanDescription beanDescription, BeanSerializerBuilder beanSerializerBuilder, List<BeanPropertyWriter> list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            BeanPropertyWriter beanPropertyWriter = list.get(i3);
            TypeSerializer typeSerializer = beanPropertyWriter.getTypeSerializer();
            if (typeSerializer != null && typeSerializer.getTypeInclusion() == JsonTypeInfo.As.EXTERNAL_PROPERTY) {
                PropertyName construct = PropertyName.construct(typeSerializer.getPropertyName());
                Iterator<BeanPropertyWriter> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BeanPropertyWriter next = it.next();
                    if (next != beanPropertyWriter && next.wouldConflictWithName(construct)) {
                        beanPropertyWriter.assignTypeSerializer(null);
                        break;
                    }
                }
            }
        }
        return list;
    }

    public void removeSetterlessGetters(SerializationConfig serializationConfig, BeanDescription beanDescription, List<BeanPropertyDefinition> list) {
        Iterator<BeanPropertyDefinition> it = list.iterator();
        while (it.hasNext()) {
            BeanPropertyDefinition next = it.next();
            if (!next.couldDeserialize() && !next.isExplicitlyIncluded()) {
                it.remove();
            }
        }
    }
}
