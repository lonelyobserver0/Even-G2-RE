package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ReferenceTypeSerializer<T> extends StdSerializer<T> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final BeanProperty _property;
    protected final JavaType _referredType;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected final NameTransformer _unwrapper;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final TypeSerializer _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ReferenceTypeSerializer(ReferenceType referenceType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super(referenceType);
        this._referredType = referenceType.getReferencedType();
        this._property = null;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = null;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    private final JsonSerializer<Object> _findCachedSerializer(SerializerProvider serializerProvider, Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
        if (serializerFor != null) {
            return serializerFor;
        }
        JsonSerializer<Object> findPrimaryPropertySerializer = this._referredType.hasGenericTypes() ? serializerProvider.findPrimaryPropertySerializer(serializerProvider.constructSpecializedType(this._referredType, cls), this._property) : serializerProvider.findPrimaryPropertySerializer(cls, this._property);
        NameTransformer nameTransformer = this._unwrapper;
        if (nameTransformer != null) {
            findPrimaryPropertySerializer = findPrimaryPropertySerializer.unwrappingSerializer(nameTransformer);
        }
        this._dynamicSerializers = this._dynamicSerializers.newWith(cls, findPrimaryPropertySerializer);
        return findPrimaryPropertySerializer;
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return serializerProvider.findPrimaryPropertySerializer(javaType, beanProperty);
    }

    public abstract Object _getReferenced(T t3);

    public abstract Object _getReferencedIfPresent(T t3);

    public abstract boolean _isValuePresent(T t3);

    public boolean _useStatic(SerializerProvider serializerProvider, BeanProperty beanProperty, JavaType javaType) {
        if (javaType.isJavaLangObject()) {
            return false;
        }
        if (javaType.isFinal() || javaType.useStaticType()) {
            return true;
        }
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector != null && beanProperty != null && beanProperty.getMember() != null) {
            JsonSerialize.Typing findSerializationTyping = annotationIntrospector.findSerializationTyping(beanProperty.getMember());
            if (findSerializationTyping == JsonSerialize.Typing.STATIC) {
                return true;
            }
            if (findSerializationTyping == JsonSerialize.Typing.DYNAMIC) {
                return false;
            }
        }
        return serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        Object defaultValue;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        JsonSerializer<?> findAnnotatedContentSerializer = findAnnotatedContentSerializer(serializerProvider, beanProperty);
        if (findAnnotatedContentSerializer == null) {
            findAnnotatedContentSerializer = this._valueSerializer;
            if (findAnnotatedContentSerializer != null) {
                findAnnotatedContentSerializer = serializerProvider.handlePrimaryContextualization(findAnnotatedContentSerializer, beanProperty);
            } else if (_useStatic(serializerProvider, beanProperty, this._referredType)) {
                findAnnotatedContentSerializer = _findSerializer(serializerProvider, this._referredType, beanProperty);
            }
        }
        ReferenceTypeSerializer<T> withResolved = (this._property == beanProperty && this._valueTypeSerializer == typeSerializer && this._valueSerializer == findAnnotatedContentSerializer) ? this : withResolved(beanProperty, typeSerializer, findAnnotatedContentSerializer, this._unwrapper);
        if (beanProperty != null && (findPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), handledType())) != null && (contentInclusion = findPropertyInclusion.getContentInclusion()) != JsonInclude.Include.USE_DEFAULTS) {
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            boolean z2 = true;
            if (i3 != 1) {
                defaultValue = null;
                if (i3 != 2) {
                    if (i3 == 3) {
                        defaultValue = MARKER_FOR_EMPTY;
                    } else if (i3 == 4) {
                        defaultValue = serializerProvider.includeFilterInstance(null, findPropertyInclusion.getContentFilter());
                        if (defaultValue != null) {
                            z2 = serializerProvider.includeFilterSuppressNulls(defaultValue);
                        }
                    } else if (i3 != 5) {
                        z2 = false;
                    }
                } else if (this._referredType.isReferenceType()) {
                    defaultValue = MARKER_FOR_EMPTY;
                }
            } else {
                defaultValue = BeanUtil.getDefaultValue(this._referredType);
                if (defaultValue != null && defaultValue.getClass().isArray()) {
                    defaultValue = ArrayBuilders.getArrayComparator(defaultValue);
                }
            }
            if (this._suppressableValue != defaultValue || this._suppressNulls != z2) {
                return withResolved.withContentInclusion(defaultValue, z2);
            }
        }
        return withResolved;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t3) {
        if (!_isValuePresent(t3)) {
            return true;
        }
        Object _getReferenced = _getReferenced(t3);
        if (_getReferenced == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferenced.getClass());
            } catch (JsonMappingException e10) {
                throw new RuntimeJsonMappingException(e10);
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? jsonSerializer.isEmpty(serializerProvider, _getReferenced) : obj.equals(_getReferenced);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isUnwrappingSerializer() {
        return this._unwrapper != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t3);
        if (_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
                return;
            }
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializer.serialize(_getReferencedIfPresent, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object _getReferencedIfPresent = _getReferencedIfPresent(t3);
        if (_getReferencedIfPresent == null) {
            if (this._unwrapper == null) {
                serializerProvider.defaultSerializeNull(jsonGenerator);
            }
        } else {
            JsonSerializer<Object> jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findCachedSerializer(serializerProvider, _getReferencedIfPresent.getClass());
            }
            jsonSerializer.serializeWithType(_getReferencedIfPresent, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public JsonSerializer<T> unwrappingSerializer(NameTransformer nameTransformer) {
        JsonSerializer<?> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null || (jsonSerializer = jsonSerializer.unwrappingSerializer(nameTransformer)) != this._valueSerializer) {
            NameTransformer nameTransformer2 = this._unwrapper;
            if (nameTransformer2 != null) {
                nameTransformer = NameTransformer.chainedTransformer(nameTransformer, nameTransformer2);
            }
            if (this._valueSerializer != jsonSerializer || this._unwrapper != nameTransformer) {
                return withResolved(this._property, this._valueTypeSerializer, jsonSerializer, nameTransformer);
            }
        }
        return this;
    }

    public abstract ReferenceTypeSerializer<T> withContentInclusion(Object obj, boolean z2);

    public abstract ReferenceTypeSerializer<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer);

    public ReferenceTypeSerializer(ReferenceTypeSerializer<?> referenceTypeSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, NameTransformer nameTransformer, Object obj, boolean z2) {
        super(referenceTypeSerializer);
        this._referredType = referenceTypeSerializer._referredType;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._unwrapper = nameTransformer;
        this._suppressableValue = obj;
        this._suppressNulls = z2;
    }
}
