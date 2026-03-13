package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonKey;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$None;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.fasterxml.jackson.databind.annotation.JsonValueInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.ext.Java7Support;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JacksonAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    protected transient LRUMap<Class<?>, Boolean> _annotationsInside = new LRUMap<>(48, 48);
    protected boolean _cfgConstructorPropertiesImpliesCreator = true;
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_SER = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    private static final Class<? extends Annotation>[] ANNOTATIONS_TO_INFER_DESER = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};

    /* renamed from: com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion;

        static {
            int[] iArr = new int[JsonSerialize.Inclusion.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion = iArr;
            try {
                iArr[JsonSerialize.Inclusion.ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[JsonSerialize.Inclusion.NON_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[JsonSerialize.Inclusion.NON_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[JsonSerialize.Inclusion.NON_EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[JsonSerialize.Inclusion.DEFAULT_INCLUSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        try {
            Java7Support.instance();
        } catch (Throwable unused) {
        }
    }

    private JsonMappingException _databindException(String str) {
        return new JsonMappingException(null, str);
    }

    private final Boolean _findSortAlpha(Annotated annotated) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotated, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null || !jsonPropertyOrder.alphabetic()) {
            return null;
        }
        return Boolean.TRUE;
    }

    private boolean _primitiveAndWrapper(Class<?> cls, Class<?> cls2) {
        return cls.isPrimitive() ? cls == ClassUtil.primitiveType(cls2) : cls2.isPrimitive() && cls2 == ClassUtil.primitiveType(cls);
    }

    private JsonInclude.Value _refinePropertyInclusion(Annotated annotated, JsonInclude.Value value) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null) {
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$databind$annotation$JsonSerialize$Inclusion[jsonSerialize.include().ordinal()];
            if (i3 == 1) {
                return value.withValueInclusion(JsonInclude.Include.ALWAYS);
            }
            if (i3 == 2) {
                return value.withValueInclusion(JsonInclude.Include.NON_NULL);
            }
            if (i3 == 3) {
                return value.withValueInclusion(JsonInclude.Include.NON_DEFAULT);
            }
            if (i3 == 4) {
                return value.withValueInclusion(JsonInclude.Include.NON_EMPTY);
            }
        }
        return value;
    }

    private List<NamedType> findSubtypesCheckRepeatedNames(String str, JsonSubTypes.Type[] typeArr) {
        ArrayList arrayList = new ArrayList(typeArr.length);
        HashSet hashSet = new HashSet();
        for (JsonSubTypes.Type type : typeArr) {
            String name = type.name();
            if (!name.isEmpty() && hashSet.contains(name)) {
                throw new IllegalArgumentException(AbstractC1482f.j("Annotated type [", str, "] got repeated subtype name [", name, "]"));
            }
            hashSet.add(name);
            arrayList.add(new NamedType(type.value(), name));
            for (String str2 : type.names()) {
                if (!str2.isEmpty() && hashSet.contains(str2)) {
                    throw new IllegalArgumentException(AbstractC1482f.j("Annotated type [", str, "] got repeated subtype name [", str2, "]"));
                }
                hashSet.add(str2);
                arrayList.add(new NamedType(type.value(), str2));
            }
        }
        return arrayList;
    }

    public Class<?> _classIfExplicit(Class<?> cls) {
        if (cls == null || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        return cls;
    }

    public StdTypeResolverBuilder _constructNoTypeResolverBuilder() {
        return StdTypeResolverBuilder.noTypeInfoBuilder();
    }

    public StdTypeResolverBuilder _constructStdTypeResolverBuilder() {
        return new StdTypeResolverBuilder();
    }

    public BeanPropertyWriter _constructVirtualProperty(JsonAppend.Attr attr, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        PropertyMetadata propertyMetadata = attr.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        String value = attr.value();
        PropertyName _propertyName = _propertyName(attr.propName(), attr.propNamespace());
        if (!_propertyName.hasSimpleName()) {
            _propertyName = PropertyName.construct(value);
        }
        return AttributePropertyWriter.construct(value, SimpleBeanPropertyDefinition.construct(mapperConfig, new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), value, javaType), _propertyName, propertyMetadata, attr.include()), annotatedClass.getAnnotations(), javaType);
    }

    public PropertyName _findConstructorName(Annotated annotated) {
        if (!(annotated instanceof AnnotatedParameter)) {
            return null;
        }
        ((AnnotatedParameter) annotated).getOwner();
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder] */
    public TypeResolverBuilder<?> _findTypeResolver(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) {
        TypeResolverBuilder<?> _constructStdTypeResolverBuilder;
        JsonTypeInfo jsonTypeInfo = (JsonTypeInfo) _findAnnotation(annotated, JsonTypeInfo.class);
        JsonTypeResolver jsonTypeResolver = (JsonTypeResolver) _findAnnotation(annotated, JsonTypeResolver.class);
        if (jsonTypeResolver != null) {
            if (jsonTypeInfo == null) {
                return null;
            }
            _constructStdTypeResolverBuilder = mapperConfig.typeResolverBuilderInstance(annotated, jsonTypeResolver.value());
        } else {
            if (jsonTypeInfo == null) {
                return null;
            }
            if (jsonTypeInfo.use() == JsonTypeInfo.Id.NONE) {
                return _constructNoTypeResolverBuilder();
            }
            _constructStdTypeResolverBuilder = _constructStdTypeResolverBuilder();
        }
        JsonTypeIdResolver jsonTypeIdResolver = (JsonTypeIdResolver) _findAnnotation(annotated, JsonTypeIdResolver.class);
        TypeIdResolver typeIdResolverInstance = jsonTypeIdResolver != null ? mapperConfig.typeIdResolverInstance(annotated, jsonTypeIdResolver.value()) : null;
        if (typeIdResolverInstance != null) {
            typeIdResolverInstance.init(javaType);
        }
        ?? init = _constructStdTypeResolverBuilder.init(jsonTypeInfo.use(), typeIdResolverInstance);
        JsonTypeInfo.As include = jsonTypeInfo.include();
        if (include == JsonTypeInfo.As.EXTERNAL_PROPERTY && (annotated instanceof AnnotatedClass)) {
            include = JsonTypeInfo.As.PROPERTY;
        }
        TypeResolverBuilder typeProperty = init.inclusion(include).typeProperty(jsonTypeInfo.property());
        Class<?> defaultImpl = jsonTypeInfo.defaultImpl();
        if (defaultImpl != JsonTypeInfo.None.class && !defaultImpl.isAnnotation()) {
            typeProperty = typeProperty.defaultImpl(defaultImpl);
        }
        return typeProperty.typeIdVisibility(jsonTypeInfo.visible());
    }

    public boolean _isIgnorable(Annotated annotated) {
        JsonIgnore jsonIgnore = (JsonIgnore) _findAnnotation(annotated, JsonIgnore.class);
        if (jsonIgnore != null) {
            return jsonIgnore.value();
        }
        return false;
    }

    public PropertyName _propertyName(String str, String str2) {
        return str.isEmpty() ? PropertyName.USE_DEFAULT : (str2 == null || str2.isEmpty()) ? PropertyName.construct(str) : PropertyName.construct(str, str2);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
        JsonAppend jsonAppend = (JsonAppend) _findAnnotation(annotatedClass, JsonAppend.class);
        if (jsonAppend == null) {
            return;
        }
        boolean prepend = jsonAppend.prepend();
        JsonAppend.Attr[] attrs = jsonAppend.attrs();
        int length = attrs.length;
        JavaType javaType = null;
        for (int i3 = 0; i3 < length; i3++) {
            if (javaType == null) {
                javaType = mapperConfig.constructType(Object.class);
            }
            BeanPropertyWriter _constructVirtualProperty = _constructVirtualProperty(attrs[i3], mapperConfig, annotatedClass, javaType);
            if (prepend) {
                list.add(i3, _constructVirtualProperty);
            } else {
                list.add(_constructVirtualProperty);
            }
        }
        JsonAppend.Prop[] props = jsonAppend.props();
        int length2 = props.length;
        for (int i10 = 0; i10 < length2; i10++) {
            BeanPropertyWriter _constructVirtualProperty2 = _constructVirtualProperty(props[i10], mapperConfig, annotatedClass);
            if (prepend) {
                list.add(i10, _constructVirtualProperty2);
            } else {
                list.add(_constructVirtualProperty2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.fasterxml.jackson.databind.introspect.VisibilityChecker, com.fasterxml.jackson.databind.introspect.VisibilityChecker<?>] */
    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        JsonAutoDetect jsonAutoDetect = (JsonAutoDetect) _findAnnotation(annotatedClass, JsonAutoDetect.class);
        return jsonAutoDetect == null ? visibilityChecker : visibilityChecker.with(jsonAutoDetect);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> contentUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (contentUsing = jsonDeserialize.contentUsing()) == JsonDeserializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findContentSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> contentUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (contentUsing = jsonSerialize.contentUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return contentUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode();
        }
        if (!this._cfgConstructorPropertiesImpliesCreator || !mapperConfig.isEnabled(MapperFeature.INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES)) {
            return null;
        }
        boolean z2 = annotated instanceof AnnotatedConstructor;
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator == null) {
            return null;
        }
        return jsonCreator.mode();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        return ClassUtil.findFirstAnnotatedEnumValue(cls, JsonEnumDefaultValue.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedMember, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.contentConverter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializationConverter(Annotated annotated) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.converter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findDeserializer(Annotated annotated) {
        Class<? extends JsonDeserializer> using;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (using = jsonDeserialize.using()) == JsonDeserializer.None.class) {
            return null;
        }
        return using;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        JsonAlias jsonAlias;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonAlias = (JsonAlias) field.getAnnotation(JsonAlias.class)) != null) {
                String[] value = jsonAlias.value();
                if (value.length != 0) {
                    String name = field.getName();
                    int length = enumArr.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (name.equals(enumArr[i3].name())) {
                            strArr[i3] = value;
                        }
                    }
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        JsonProperty jsonProperty;
        HashMap hashMap = null;
        for (Field field : cls.getDeclaredFields()) {
            if (field.isEnumConstant() && (jsonProperty = (JsonProperty) field.getAnnotation(JsonProperty.class)) != null) {
                String value = jsonProperty.value();
                if (!value.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(field.getName(), value);
                }
            }
        }
        if (hashMap != null) {
            int length = enumArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                String str = (String) hashMap.get(enumArr[i3].name());
                if (str != null) {
                    strArr[i3] = str;
                }
            }
        }
        return strArr;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findFilterId(Annotated annotated) {
        JsonFilter jsonFilter = (JsonFilter) _findAnnotation(annotated, JsonFilter.class);
        if (jsonFilter == null) {
            return null;
        }
        String value = jsonFilter.value();
        if (value.isEmpty()) {
            return null;
        }
        return value;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonFormat.Value findFormat(Annotated annotated) {
        JsonFormat jsonFormat = (JsonFormat) _findAnnotation(annotated, JsonFormat.class);
        if (jsonFormat == null) {
            return null;
        }
        return JsonFormat.Value.from(jsonFormat);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        PropertyName _findConstructorName = _findConstructorName(annotatedMember);
        if (_findConstructorName == null) {
            return null;
        }
        return _findConstructorName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        String name;
        JacksonInject jacksonInject = (JacksonInject) _findAnnotation(annotatedMember, JacksonInject.class);
        if (jacksonInject == null) {
            return null;
        }
        JacksonInject.Value from = JacksonInject.Value.from(jacksonInject);
        if (from.hasId()) {
            return from;
        }
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            name = annotatedMethod.getParameterCount() == 0 ? annotatedMember.getRawType().getName() : annotatedMethod.getRawParameterType(0).getName();
        } else {
            name = annotatedMember.getRawType().getName();
        }
        return from.withId(name);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue = findInjectableValue(annotatedMember);
        if (findInjectableValue == null) {
            return null;
        }
        return findInjectableValue.getId();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeyDeserializer(Annotated annotated) {
        Class<? extends KeyDeserializer> keyUsing;
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        if (jsonDeserialize == null || (keyUsing = jsonDeserialize.keyUsing()) == KeyDeserializer.None.class) {
            return null;
        }
        return keyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findKeySerializer(Annotated annotated) {
        Class<? extends JsonSerializer> keyUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (keyUsing = jsonSerialize.keyUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return keyUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findMergeInfo(Annotated annotated) {
        JsonMerge jsonMerge = (JsonMerge) _findAnnotation(annotated, JsonMerge.class);
        if (jsonMerge == null) {
            return null;
        }
        return jsonMerge.value().asBoolean();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForDeserialization(Annotated annotated) {
        boolean z2;
        JsonSetter jsonSetter = (JsonSetter) _findAnnotation(annotated, JsonSetter.class);
        if (jsonSetter != null) {
            String value = jsonSetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            return PropertyName.construct(jsonProperty.value(), (namespace == null || !namespace.isEmpty()) ? namespace : null);
        }
        if (z2 || _hasOneOf(annotated, ANNOTATIONS_TO_INFER_DESER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findNameForSerialization(Annotated annotated) {
        boolean z2;
        JsonGetter jsonGetter = (JsonGetter) _findAnnotation(annotated, JsonGetter.class);
        if (jsonGetter != null) {
            String value = jsonGetter.value();
            if (!value.isEmpty()) {
                return PropertyName.construct(value);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            String namespace = jsonProperty.namespace();
            return PropertyName.construct(jsonProperty.value(), (namespace == null || !namespace.isEmpty()) ? namespace : null);
        }
        if (z2 || _hasOneOf(annotated, ANNOTATIONS_TO_INFER_SER)) {
            return PropertyName.USE_DEFAULT;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        JsonNaming jsonNaming = (JsonNaming) _findAnnotation(annotatedClass, JsonNaming.class);
        if (jsonNaming == null) {
            return null;
        }
        return jsonNaming.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findNullSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> nullsUsing;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null || (nullsUsing = jsonSerialize.nullsUsing()) == JsonSerializer.None.class) {
            return null;
        }
        return nullsUsing;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        JsonIdentityInfo jsonIdentityInfo = (JsonIdentityInfo) _findAnnotation(annotated, JsonIdentityInfo.class);
        if (jsonIdentityInfo == null || jsonIdentityInfo.generator() == ObjectIdGenerators$None.class) {
            return null;
        }
        return new ObjectIdInfo(PropertyName.construct(jsonIdentityInfo.property()), jsonIdentityInfo.scope(), jsonIdentityInfo.generator(), jsonIdentityInfo.resolver());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        JsonIdentityReference jsonIdentityReference = (JsonIdentityReference) _findAnnotation(annotated, JsonIdentityReference.class);
        if (jsonIdentityReference == null) {
            return objectIdInfo;
        }
        if (objectIdInfo == null) {
            objectIdInfo = ObjectIdInfo.empty();
        }
        return objectIdInfo.withAlwaysAsId(jsonIdentityReference.alwaysAsId());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotatedClass, JsonDeserialize.class);
        if (jsonDeserialize == null) {
            return null;
        }
        return _classIfExplicit(jsonDeserialize.builder());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder jsonPOJOBuilder = (JsonPOJOBuilder) _findAnnotation(annotatedClass, JsonPOJOBuilder.class);
        if (jsonPOJOBuilder == null) {
            return null;
        }
        return new JsonPOJOBuilder.Value(jsonPOJOBuilder);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty != null) {
            return jsonProperty.access();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<PropertyName> findPropertyAliases(Annotated annotated) {
        JsonAlias jsonAlias = (JsonAlias) _findAnnotation(annotated, JsonAlias.class);
        if (jsonAlias == null) {
            return null;
        }
        String[] value = jsonAlias.value();
        int length = value.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(length);
        for (String str : value) {
            arrayList.add(PropertyName.construct(str));
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.getContentType() != null) {
            return _findTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        throw new IllegalArgumentException("Must call method with a container or reference type (got " + javaType + ")");
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDefaultValue(Annotated annotated) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null) {
            return null;
        }
        String defaultValue = jsonProperty.defaultValue();
        if (defaultValue.isEmpty()) {
            return null;
        }
        return defaultValue;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findPropertyDescription(Annotated annotated) {
        JsonPropertyDescription jsonPropertyDescription = (JsonPropertyDescription) _findAnnotation(annotated, JsonPropertyDescription.class);
        if (jsonPropertyDescription == null) {
            return null;
        }
        return jsonPropertyDescription.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIgnoreProperties jsonIgnoreProperties = (JsonIgnoreProperties) _findAnnotation(annotated, JsonIgnoreProperties.class);
        return jsonIgnoreProperties == null ? JsonIgnoreProperties.Value.empty() : JsonIgnoreProperties.Value.from(jsonIgnoreProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        return findPropertyIgnoralByName(null, annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        JsonInclude jsonInclude = (JsonInclude) _findAnnotation(annotated, JsonInclude.class);
        JsonInclude.Value empty = jsonInclude == null ? JsonInclude.Value.empty() : JsonInclude.Value.from(jsonInclude);
        return empty.getValueInclusion() == JsonInclude.Include.USE_DEFAULTS ? _refinePropertyInclusion(annotated, empty) : empty;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIncludeProperties jsonIncludeProperties = (JsonIncludeProperties) _findAnnotation(annotated, JsonIncludeProperties.class);
        return jsonIncludeProperties == null ? JsonIncludeProperties.Value.all() : JsonIncludeProperties.Value.from(jsonIncludeProperties);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Integer findPropertyIndex(Annotated annotated) {
        int index;
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotated, JsonProperty.class);
        if (jsonProperty == null || (index = jsonProperty.index()) == -1) {
            return null;
        }
        return Integer.valueOf(index);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        if (javaType.isContainerType() || javaType.isReferenceType()) {
            return null;
        }
        return _findTypeResolver(mapperConfig, annotatedMember, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        JsonManagedReference jsonManagedReference = (JsonManagedReference) _findAnnotation(annotatedMember, JsonManagedReference.class);
        if (jsonManagedReference != null) {
            return AnnotationIntrospector.ReferenceProperty.managed(jsonManagedReference.value());
        }
        JsonBackReference jsonBackReference = (JsonBackReference) _findAnnotation(annotatedMember, JsonBackReference.class);
        if (jsonBackReference != null) {
            return AnnotationIntrospector.ReferenceProperty.back(jsonBackReference.value());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        JsonRootName jsonRootName = (JsonRootName) _findAnnotation(annotatedClass, JsonRootName.class);
        if (jsonRootName == null) {
            return null;
        }
        String namespace = jsonRootName.namespace();
        return PropertyName.construct(jsonRootName.value(), (namespace == null || !namespace.isEmpty()) ? namespace : null);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotatedMember, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.contentConverter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializationConverter(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return _classIfExplicit(jsonSerialize.converter(), Converter.None.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        JsonPropertyOrder jsonPropertyOrder = (JsonPropertyOrder) _findAnnotation(annotatedClass, JsonPropertyOrder.class);
        if (jsonPropertyOrder == null) {
            return null;
        }
        return jsonPropertyOrder.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        return _findSortAlpha(annotated);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize == null) {
            return null;
        }
        return jsonSerialize.typing();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findSerializer(Annotated annotated) {
        Class<? extends JsonSerializer> using;
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        if (jsonSerialize != null && (using = jsonSerialize.using()) != JsonSerializer.None.class) {
            return using;
        }
        JsonRawValue jsonRawValue = (JsonRawValue) _findAnnotation(annotated, JsonRawValue.class);
        if (jsonRawValue == null || !jsonRawValue.value()) {
            return null;
        }
        return new RawSerializer(annotated.getRawType());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JsonSetter.Value findSetterInfo(Annotated annotated) {
        return JsonSetter.Value.from((JsonSetter) _findAnnotation(annotated, JsonSetter.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public List<NamedType> findSubtypes(Annotated annotated) {
        JsonSubTypes jsonSubTypes = (JsonSubTypes) _findAnnotation(annotated, JsonSubTypes.class);
        if (jsonSubTypes == null) {
            return null;
        }
        JsonSubTypes.Type[] value = jsonSubTypes.value();
        if (jsonSubTypes.failOnRepeatedNames()) {
            return findSubtypesCheckRepeatedNames(annotated.getName(), value);
        }
        ArrayList arrayList = new ArrayList(value.length);
        for (JsonSubTypes.Type type : value) {
            arrayList.add(new NamedType(type.value(), type.name()));
            for (String str : type.names()) {
                arrayList.add(new NamedType(type.value(), str));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public String findTypeName(AnnotatedClass annotatedClass) {
        JsonTypeName jsonTypeName = (JsonTypeName) _findAnnotation(annotatedClass, JsonTypeName.class);
        if (jsonTypeName == null) {
            return null;
        }
        return jsonTypeName.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        return _findTypeResolver(mapperConfig, annotatedClass, javaType);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        JsonUnwrapped jsonUnwrapped = (JsonUnwrapped) _findAnnotation(annotatedMember, JsonUnwrapped.class);
        if (jsonUnwrapped == null || !jsonUnwrapped.enabled()) {
            return null;
        }
        return NameTransformer.simpleTransformer(jsonUnwrapped.prefix(), jsonUnwrapped.suffix());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        JsonValueInstantiator jsonValueInstantiator = (JsonValueInstantiator) _findAnnotation(annotatedClass, JsonValueInstantiator.class);
        if (jsonValueInstantiator == null) {
            return null;
        }
        return jsonValueInstantiator.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Class<?>[] findViews(Annotated annotated) {
        JsonView jsonView = (JsonView) _findAnnotation(annotated, JsonView.class);
        if (jsonView == null) {
            return null;
        }
        return jsonView.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnyGetter(Annotated annotated) {
        JsonAnyGetter jsonAnyGetter = (JsonAnyGetter) _findAnnotation(annotated, JsonAnyGetter.class);
        if (jsonAnyGetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnyGetter.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return _hasAnnotation(annotatedMethod, JsonAnyGetter.class);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAnySetter(Annotated annotated) {
        JsonAnySetter jsonAnySetter = (JsonAnySetter) _findAnnotation(annotated, JsonAnySetter.class);
        if (jsonAnySetter == null) {
            return null;
        }
        return Boolean.valueOf(jsonAnySetter.enabled());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonKey jsonKey = (JsonKey) _findAnnotation(annotated, JsonKey.class);
        if (jsonKey == null) {
            return null;
        }
        return Boolean.valueOf(jsonKey.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasAsValue(Annotated annotated) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotated, JsonValue.class);
        if (jsonValue == null) {
            return null;
        }
        return Boolean.valueOf(jsonValue.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        JsonValue jsonValue = (JsonValue) _findAnnotation(annotatedMethod, JsonValue.class);
        return jsonValue != null && jsonValue.value();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        JsonCreator jsonCreator = (JsonCreator) _findAnnotation(annotated, JsonCreator.class);
        if (jsonCreator != null) {
            return jsonCreator.mode() != JsonCreator.Mode.DISABLED;
        }
        if (this._cfgConstructorPropertiesImpliesCreator) {
            boolean z2 = annotated instanceof AnnotatedConstructor;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return _isIgnorable(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        JsonProperty jsonProperty = (JsonProperty) _findAnnotation(annotatedMember, JsonProperty.class);
        if (jsonProperty != null) {
            return Boolean.valueOf(jsonProperty.required());
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public boolean isAnnotationBundle(Annotation annotation) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Boolean bool = this._annotationsInside.get(annotationType);
        if (bool == null) {
            bool = Boolean.valueOf(annotationType.getAnnotation(JacksonAnnotationsInside.class) != null);
            this._annotationsInside.putIfAbsent(annotationType, bool);
        }
        return bool.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        JsonIgnoreType jsonIgnoreType = (JsonIgnoreType) _findAnnotation(annotatedClass, JsonIgnoreType.class);
        if (jsonIgnoreType == null) {
            return null;
        }
        return Boolean.valueOf(jsonIgnoreType.value());
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        return Boolean.valueOf(_hasAnnotation(annotatedMember, JsonTypeId.class));
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonDeserialize jsonDeserialize = (JsonDeserialize) _findAnnotation(annotated, JsonDeserialize.class);
        Class<?> _classIfExplicit = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.as());
        if (_classIfExplicit != null && !javaType.hasRawClass(_classIfExplicit) && !_primitiveAndWrapper(javaType, _classIfExplicit)) {
            try {
                javaType = typeFactory.constructSpecializedType(javaType, _classIfExplicit);
            } catch (IllegalArgumentException e10) {
                throw _databindException(e10, String.format("Failed to narrow type %s with annotation (value %s), from '%s': %s", javaType, _classIfExplicit.getName(), annotated.getName(), e10.getMessage()));
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> _classIfExplicit2 = jsonDeserialize == null ? null : _classIfExplicit(jsonDeserialize.keyAs());
            if (_classIfExplicit2 != null && !_primitiveAndWrapper(keyType, _classIfExplicit2)) {
                try {
                    javaType = ((MapLikeType) javaType).withKeyType(typeFactory.constructSpecializedType(keyType, _classIfExplicit2));
                } catch (IllegalArgumentException e11) {
                    throw _databindException(e11, String.format("Failed to narrow key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, _classIfExplicit2.getName(), annotated.getName(), e11.getMessage()));
                }
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null) {
            Class<?> _classIfExplicit3 = jsonDeserialize != null ? _classIfExplicit(jsonDeserialize.contentAs()) : null;
            if (_classIfExplicit3 != null && !_primitiveAndWrapper(contentType, _classIfExplicit3)) {
                try {
                    return javaType.withContentType(typeFactory.constructSpecializedType(contentType, _classIfExplicit3));
                } catch (IllegalArgumentException e12) {
                    throw _databindException(e12, String.format("Failed to narrow value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, _classIfExplicit3.getName(), annotated.getName(), e12.getMessage()));
                }
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        JavaType withStaticTyping;
        JavaType withStaticTyping2;
        TypeFactory typeFactory = mapperConfig.getTypeFactory();
        JsonSerialize jsonSerialize = (JsonSerialize) _findAnnotation(annotated, JsonSerialize.class);
        Class<?> _classIfExplicit = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.as());
        if (_classIfExplicit != null) {
            if (javaType.hasRawClass(_classIfExplicit)) {
                javaType = javaType.withStaticTyping();
            } else {
                Class<?> rawClass = javaType.getRawClass();
                try {
                    if (_classIfExplicit.isAssignableFrom(rawClass)) {
                        javaType = typeFactory.constructGeneralizedType(javaType, _classIfExplicit);
                    } else if (rawClass.isAssignableFrom(_classIfExplicit)) {
                        javaType = typeFactory.constructSpecializedType(javaType, _classIfExplicit);
                    } else {
                        if (!_primitiveAndWrapper(rawClass, _classIfExplicit)) {
                            throw _databindException(String.format("Cannot refine serialization type %s into %s; types not related", javaType, _classIfExplicit.getName()));
                        }
                        javaType = javaType.withStaticTyping();
                    }
                } catch (IllegalArgumentException e10) {
                    throw _databindException(e10, String.format("Failed to widen type %s with annotation (value %s), from '%s': %s", javaType, _classIfExplicit.getName(), annotated.getName(), e10.getMessage()));
                }
            }
        }
        if (javaType.isMapLikeType()) {
            JavaType keyType = javaType.getKeyType();
            Class<?> _classIfExplicit2 = jsonSerialize == null ? null : _classIfExplicit(jsonSerialize.keyAs());
            if (_classIfExplicit2 != null) {
                if (keyType.hasRawClass(_classIfExplicit2)) {
                    withStaticTyping2 = keyType.withStaticTyping();
                } else {
                    Class<?> rawClass2 = keyType.getRawClass();
                    try {
                        if (_classIfExplicit2.isAssignableFrom(rawClass2)) {
                            withStaticTyping2 = typeFactory.constructGeneralizedType(keyType, _classIfExplicit2);
                        } else if (rawClass2.isAssignableFrom(_classIfExplicit2)) {
                            withStaticTyping2 = typeFactory.constructSpecializedType(keyType, _classIfExplicit2);
                        } else {
                            if (!_primitiveAndWrapper(rawClass2, _classIfExplicit2)) {
                                throw _databindException(String.format("Cannot refine serialization key type %s into %s; types not related", keyType, _classIfExplicit2.getName()));
                            }
                            withStaticTyping2 = keyType.withStaticTyping();
                        }
                    } catch (IllegalArgumentException e11) {
                        throw _databindException(e11, String.format("Failed to widen key type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, _classIfExplicit2.getName(), annotated.getName(), e11.getMessage()));
                    }
                }
                javaType = ((MapLikeType) javaType).withKeyType(withStaticTyping2);
            }
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null) {
            Class<?> _classIfExplicit3 = jsonSerialize != null ? _classIfExplicit(jsonSerialize.contentAs()) : null;
            if (_classIfExplicit3 != null) {
                if (contentType.hasRawClass(_classIfExplicit3)) {
                    withStaticTyping = contentType.withStaticTyping();
                } else {
                    Class<?> rawClass3 = contentType.getRawClass();
                    try {
                        if (_classIfExplicit3.isAssignableFrom(rawClass3)) {
                            withStaticTyping = typeFactory.constructGeneralizedType(contentType, _classIfExplicit3);
                        } else if (rawClass3.isAssignableFrom(_classIfExplicit3)) {
                            withStaticTyping = typeFactory.constructSpecializedType(contentType, _classIfExplicit3);
                        } else {
                            if (!_primitiveAndWrapper(rawClass3, _classIfExplicit3)) {
                                throw _databindException(String.format("Cannot refine serialization content type %s into %s; types not related", contentType, _classIfExplicit3.getName()));
                            }
                            withStaticTyping = contentType.withStaticTyping();
                        }
                    } catch (IllegalArgumentException e12) {
                        throw _databindException(e12, String.format("Internal error: failed to refine value type of %s with concrete-type annotation (value %s), from '%s': %s", javaType, _classIfExplicit3.getName(), annotated.getName(), e12.getMessage()));
                    }
                }
                return javaType.withContentType(withStaticTyping);
            }
        }
        return javaType;
    }

    @Override // com.fasterxml.jackson.databind.AnnotationIntrospector
    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        Class<?> rawParameterType = annotatedMethod.getRawParameterType(0);
        Class<?> rawParameterType2 = annotatedMethod2.getRawParameterType(0);
        if (!rawParameterType.isPrimitive()) {
            if (!rawParameterType2.isPrimitive()) {
                if (rawParameterType == String.class) {
                    if (rawParameterType2 != String.class) {
                    }
                } else if (rawParameterType2 == String.class) {
                }
                return null;
            }
            return annotatedMethod2;
        }
        if (rawParameterType2.isPrimitive()) {
            return null;
        }
        return annotatedMethod;
    }

    private JsonMappingException _databindException(Throwable th, String str) {
        return new JsonMappingException((Closeable) null, str, th);
    }

    public Class<?> _classIfExplicit(Class<?> cls, Class<?> cls2) {
        Class<?> _classIfExplicit = _classIfExplicit(cls);
        if (_classIfExplicit == null || _classIfExplicit == cls2) {
            return null;
        }
        return _classIfExplicit;
    }

    private boolean _primitiveAndWrapper(JavaType javaType, Class<?> cls) {
        if (javaType.isPrimitive()) {
            return javaType.hasRawClass(ClassUtil.primitiveType(cls));
        }
        return cls.isPrimitive() && cls == ClassUtil.primitiveType(javaType.getRawClass());
    }

    public BeanPropertyWriter _constructVirtualProperty(JsonAppend.Prop prop, MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass) {
        PropertyMetadata propertyMetadata = prop.required() ? PropertyMetadata.STD_REQUIRED : PropertyMetadata.STD_OPTIONAL;
        PropertyName _propertyName = _propertyName(prop.name(), prop.namespace());
        JavaType constructType = mapperConfig.constructType(prop.type());
        SimpleBeanPropertyDefinition construct = SimpleBeanPropertyDefinition.construct(mapperConfig, new VirtualAnnotatedMember(annotatedClass, annotatedClass.getRawType(), _propertyName.getSimpleName(), constructType), _propertyName, propertyMetadata, prop.include());
        Class<? extends VirtualBeanPropertyWriter> value = prop.value();
        mapperConfig.getHandlerInstantiator();
        return ((VirtualBeanPropertyWriter) ClassUtil.createInstance(value, mapperConfig.canOverrideAccessModifiers())).withConfig(mapperConfig, annotatedClass, construct, constructType);
    }
}
