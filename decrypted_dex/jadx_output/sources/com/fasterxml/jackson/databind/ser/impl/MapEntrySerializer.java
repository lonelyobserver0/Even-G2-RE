package com.fasterxml.jackson.databind.ser.impl;

import Xa.h;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import java.io.IOException;
import java.util.Map;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapEntrySerializer extends ContainerSerializer<Map.Entry<?, ?>> implements ContextualSerializer {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    /* renamed from: com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer$1, reason: invalid class name */
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

    public MapEntrySerializer(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z2, TypeSerializer typeSerializer, BeanProperty beanProperty) {
        super(javaType);
        this._entryType = javaType;
        this._keyType = javaType2;
        this._valueType = javaType3;
        this._valueTypeIsStatic = z2;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._suppressableValue = null;
        this._suppressNulls = false;
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new MapEntrySerializer(this, this._property, typeSerializer, this._keySerializer, this._valueSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<?> jsonSerializer2;
        MapEntrySerializer mapEntrySerializer;
        BeanProperty beanProperty2;
        Object obj;
        JsonInclude.Value findPropertyInclusion;
        JsonInclude.Include contentInclusion;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        Object obj2 = null;
        AnnotatedMember member = beanProperty == null ? null : beanProperty.getMember();
        if (member == null || annotationIntrospector == null) {
            jsonSerializer = null;
            jsonSerializer2 = null;
        } else {
            Object findKeySerializer = annotationIntrospector.findKeySerializer(member);
            jsonSerializer2 = findKeySerializer != null ? serializerProvider.serializerInstance(member, findKeySerializer) : null;
            Object findContentSerializer = annotationIntrospector.findContentSerializer(member);
            jsonSerializer = findContentSerializer != null ? serializerProvider.serializerInstance(member, findContentSerializer) : null;
        }
        if (jsonSerializer == null) {
            jsonSerializer = this._valueSerializer;
        }
        JsonSerializer<?> findContextualConvertingSerializer = findContextualConvertingSerializer(serializerProvider, beanProperty, jsonSerializer);
        if (findContextualConvertingSerializer == null && this._valueTypeIsStatic && !this._valueType.isJavaLangObject()) {
            findContextualConvertingSerializer = serializerProvider.findContentValueSerializer(this._valueType, beanProperty);
        }
        JsonSerializer<?> jsonSerializer3 = findContextualConvertingSerializer;
        if (jsonSerializer2 == null) {
            jsonSerializer2 = this._keySerializer;
        }
        JsonSerializer<?> findKeySerializer2 = jsonSerializer2 == null ? serializerProvider.findKeySerializer(this._keyType, beanProperty) : serializerProvider.handleSecondaryContextualization(jsonSerializer2, beanProperty);
        Object obj3 = this._suppressableValue;
        boolean z2 = this._suppressNulls;
        if (beanProperty == null || (findPropertyInclusion = beanProperty.findPropertyInclusion(serializerProvider.getConfig(), null)) == null || (contentInclusion = findPropertyInclusion.getContentInclusion()) == JsonInclude.Include.USE_DEFAULTS) {
            mapEntrySerializer = this;
            beanProperty2 = beanProperty;
            obj = obj3;
        } else {
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            z2 = true;
            if (i3 == 1) {
                obj2 = BeanUtil.getDefaultValue(this._valueType);
                if (obj2 != null && obj2.getClass().isArray()) {
                    obj2 = ArrayBuilders.getArrayComparator(obj2);
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    obj2 = MARKER_FOR_EMPTY;
                } else if (i3 == 4) {
                    obj2 = serializerProvider.includeFilterInstance(null, findPropertyInclusion.getContentFilter());
                    if (obj2 != null) {
                        z2 = serializerProvider.includeFilterSuppressNulls(obj2);
                    }
                } else if (i3 != 5) {
                    z2 = false;
                }
            } else if (this._valueType.isReferenceType()) {
                obj2 = MARKER_FOR_EMPTY;
            }
            mapEntrySerializer = this;
            beanProperty2 = beanProperty;
            obj = obj2;
        }
        return mapEntrySerializer.withResolved(beanProperty2, findKeySerializer2, jsonSerializer3, obj, z2);
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public void serializeDynamic(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializer;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        Object key = entry.getKey();
        JsonSerializer<Object> findNullKeySerializer = key == null ? serializerProvider.findNullKeySerializer(this._keyType, this._property) : this._keySerializer;
        Object value = entry.getValue();
        if (value != null) {
            jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                Class<?> cls = value.getClass();
                JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
                jsonSerializer = serializerFor == null ? this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider) : serializerFor;
            }
            Object obj = this._suppressableValue;
            if (obj != null && ((obj == MARKER_FOR_EMPTY && jsonSerializer.isEmpty(serializerProvider, value)) || this._suppressableValue.equals(value))) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            jsonSerializer = serializerProvider.getDefaultNullValueSerializer();
        }
        findNullKeySerializer.serialize(key, jsonGenerator, serializerProvider);
        try {
            if (typeSerializer == null) {
                jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
            }
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, entry, h.m(key, ""));
        }
    }

    public MapEntrySerializer withContentInclusion(Object obj, boolean z2) {
        return (this._suppressableValue == obj && this._suppressNulls == z2) ? this : new MapEntrySerializer(this, this._property, this._valueTypeSerializer, this._keySerializer, this._valueSerializer, obj, z2);
    }

    public MapEntrySerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z2) {
        return new MapEntrySerializer(this, beanProperty, this._valueTypeSerializer, jsonSerializer, jsonSerializer2, obj, z2);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Map.Entry<?, ?> entry) {
        Object value = entry.getValue();
        if (value == null) {
            return this._suppressNulls;
        }
        if (this._suppressableValue == null) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            Class<?> cls = value.getClass();
            JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
            if (serializerFor == null) {
                try {
                    jsonSerializer = _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                jsonSerializer = serializerFor;
            }
        }
        Object obj = this._suppressableValue;
        return obj == MARKER_FOR_EMPTY ? jsonSerializer.isEmpty(serializerProvider, value) : obj.equals(value);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject(entry);
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Map.Entry<?, ?> entry, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.setCurrentValue(entry);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(entry, JsonToken.START_OBJECT));
        serializeDynamic(entry, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public MapEntrySerializer(MapEntrySerializer mapEntrySerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Object obj, boolean z2) {
        super(Map.class, false);
        this._entryType = mapEntrySerializer._entryType;
        this._keyType = mapEntrySerializer._keyType;
        this._valueType = mapEntrySerializer._valueType;
        this._valueTypeIsStatic = mapEntrySerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapEntrySerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = mapEntrySerializer._property;
        this._suppressableValue = obj;
        this._suppressNulls = z2;
    }
}
