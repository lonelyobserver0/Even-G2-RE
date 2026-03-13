package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.stub.StubApp;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class JsonValueSerializer extends StdSerializer<Object> implements ContextualSerializer {
    protected final AnnotatedMember _accessor;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected final boolean _forceTypeInformation;
    protected final BeanProperty _property;
    protected final JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final TypeSerializer _valueTypeSerializer;

    public static class TypeSerializerRerouter extends TypeSerializer {
        protected final Object _forObject;
        protected final TypeSerializer _typeSerializer;

        public TypeSerializerRerouter(TypeSerializer typeSerializer, Object obj) {
            this._typeSerializer = typeSerializer;
            this._forObject = obj;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public TypeSerializer forProperty(BeanProperty beanProperty) {
            throw new UnsupportedOperationException();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public String getPropertyName() {
            return this._typeSerializer.getPropertyName();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public JsonTypeInfo.As getTypeInclusion() {
            return this._typeSerializer.getTypeInclusion();
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            writableTypeId.forValue = this._forObject;
            return this._typeSerializer.writeTypePrefix(jsonGenerator, writableTypeId);
        }

        @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
        public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
            return this._typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeId);
        }
    }

    public JsonValueSerializer(AnnotatedMember annotatedMember, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer) {
        super(annotatedMember.getType());
        this._accessor = annotatedMember;
        this._valueType = annotatedMember.getType();
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._property = null;
        this._forceTypeInformation = true;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    private static final Class<Object> _notNullClass(Class<?> cls) {
        return cls == null ? Object.class : cls;
    }

    public JsonSerializer<Object> _findDynamicSerializer(SerializerProvider serializerProvider, Class<?> cls) throws JsonMappingException {
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
        if (serializerFor != null) {
            return serializerFor;
        }
        if (!this._valueType.hasGenericTypes()) {
            JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(cls, this._property);
            this._dynamicSerializers = this._dynamicSerializers.addSerializer(cls, findPrimaryPropertySerializer).map;
            return findPrimaryPropertySerializer;
        }
        JavaType constructSpecializedType = serializerProvider.constructSpecializedType(this._valueType, cls);
        JsonSerializer<Object> findPrimaryPropertySerializer2 = serializerProvider.findPrimaryPropertySerializer(constructSpecializedType, this._property);
        this._dynamicSerializers = this._dynamicSerializers.addSerializer(constructSpecializedType, findPrimaryPropertySerializer2).map;
        return findPrimaryPropertySerializer2;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            typeSerializer = typeSerializer.forProperty(beanProperty);
        }
        JsonSerializer<?> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            return withResolved(beanProperty, typeSerializer, serializerProvider.handlePrimaryContextualization(jsonSerializer, beanProperty), this._forceTypeInformation);
        }
        if (!serializerProvider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !this._valueType.isFinal()) {
            return beanProperty != this._property ? withResolved(beanProperty, typeSerializer, jsonSerializer, this._forceTypeInformation) : this;
        }
        JsonSerializer<Object> findPrimaryPropertySerializer = serializerProvider.findPrimaryPropertySerializer(this._valueType, beanProperty);
        return withResolved(beanProperty, typeSerializer, findPrimaryPropertySerializer, isNaturalTypeWithStdHandling(this._valueType.getRawClass(), findPrimaryPropertySerializer));
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
        Object value = this._accessor.getValue(obj);
        if (value == null) {
            return true;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = _findDynamicSerializer(serializerProvider, value.getClass());
            } catch (JsonMappingException e10) {
                throw new RuntimeJsonMappingException(e10);
            }
        }
        return jsonSerializer.isEmpty(serializerProvider, value);
    }

    public boolean isNaturalTypeWithStdHandling(Class<?> cls, JsonSerializer<?> jsonSerializer) {
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE && cls != Boolean.TYPE && cls != Double.TYPE) {
                return false;
            }
        } else if (cls != String.class && cls != Integer.class && cls != Boolean.class && cls != Double.class) {
            return false;
        }
        return isDefaultSerializer(jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj2;
        try {
            obj2 = this._accessor.getValue(obj);
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, obj, this._accessor.getName() + StubApp.getString2(11026));
            obj2 = null;
        }
        if (obj2 == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findDynamicSerializer(serializerProvider, obj2.getClass());
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        if (typeSerializer != null) {
            jsonSerializer.serializeWithType(obj2, jsonGenerator, serializerProvider, typeSerializer);
        } else {
            jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        Object obj2;
        try {
            obj2 = this._accessor.getValue(obj);
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, obj, this._accessor.getName() + StubApp.getString2(11026));
            obj2 = null;
        }
        if (obj2 == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer == null) {
            jsonSerializer = _findDynamicSerializer(serializerProvider, obj2.getClass());
        } else if (this._forceTypeInformation) {
            WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(obj, JsonToken.VALUE_STRING));
            jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
            typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
            return;
        }
        jsonSerializer.serializeWithType(obj2, jsonGenerator, serializerProvider, new TypeSerializerRerouter(typeSerializer, obj));
    }

    public String toString() {
        return StubApp.getString2(11027) + this._accessor.getDeclaringClass() + StubApp.getString2(919) + this._accessor.getName() + StubApp.getString2(74);
    }

    public JsonValueSerializer withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, boolean z2) {
        return (this._property == beanProperty && this._valueTypeSerializer == typeSerializer && this._valueSerializer == jsonSerializer && z2 == this._forceTypeInformation) ? this : new JsonValueSerializer(this, beanProperty, typeSerializer, jsonSerializer, z2);
    }

    public JsonValueSerializer(JsonValueSerializer jsonValueSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, boolean z2) {
        super(_notNullClass(jsonValueSerializer.handledType()));
        this._accessor = jsonValueSerializer._accessor;
        this._valueType = jsonValueSerializer._valueType;
        this._valueTypeSerializer = typeSerializer;
        this._valueSerializer = jsonSerializer;
        this._property = beanProperty;
        this._forceTypeInformation = z2;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }
}
