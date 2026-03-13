package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AsArraySerializerBase<T> extends ContainerSerializer<T> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicSerializers;
    protected final JsonSerializer<Object> _elementSerializer;
    protected final JavaType _elementType;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final Boolean _unwrapSingle;
    protected final TypeSerializer _valueTypeSerializer;

    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        this(cls, javaType, z2, typeSerializer, null, jsonSerializer, null);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r6, com.fasterxml.jackson.databind.BeanProperty r7) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r5._valueTypeSerializer
            if (r0 == 0) goto L8
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r0.forProperty(r7)
        L8:
            r1 = 0
            if (r7 == 0) goto L20
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r6.getAnnotationIntrospector()
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r7.getMember()
            if (r3 == 0) goto L20
            java.lang.Object r2 = r2.findContentSerializer(r3)
            if (r2 == 0) goto L20
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.serializerInstance(r3, r2)
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r3 = r5.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r3 = r5.findFormatOverrides(r6, r7, r3)
            if (r3 == 0) goto L31
            com.fasterxml.jackson.annotation.JsonFormat$Feature r1 = com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED
            java.lang.Boolean r1 = r3.getFeature(r1)
        L31:
            if (r2 != 0) goto L35
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r2 = r5._elementSerializer
        L35:
            com.fasterxml.jackson.databind.JsonSerializer r2 = r5.findContextualConvertingSerializer(r6, r7, r2)
            if (r2 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r3 = r5._elementType
            if (r3 == 0) goto L4f
            boolean r4 = r5._staticTyping
            if (r4 == 0) goto L4f
            boolean r3 = r3.isJavaLangObject()
            if (r3 != 0) goto L4f
            com.fasterxml.jackson.databind.JavaType r2 = r5._elementType
            com.fasterxml.jackson.databind.JsonSerializer r2 = r6.findContentValueSerializer(r2, r7)
        L4f:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r6 = r5._elementSerializer
            if (r2 != r6) goto L65
            com.fasterxml.jackson.databind.BeanProperty r6 = r5._property
            if (r7 != r6) goto L65
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r6 = r5._valueTypeSerializer
            if (r6 != r0) goto L65
            java.lang.Boolean r6 = r5._unwrapSingle
            boolean r6 = java.util.Objects.equals(r6, r1)
            if (r6 != 0) goto L64
            goto L65
        L64:
            return r5
        L65:
            com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase r6 = r5.withResolved(r7, r0, r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public abstract void serializeContents(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(t3, JsonToken.START_ARRAY));
        jsonGenerator.setCurrentValue(t3);
        serializeContents(t3, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public abstract AsArraySerializerBase<T> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsArraySerializerBase(Class<?> cls, JavaType javaType, boolean z2, TypeSerializer typeSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(cls, false);
        boolean z10 = false;
        this._elementType = javaType;
        if (z2 || (javaType != null && javaType.isFinal())) {
            z10 = true;
        }
        this._staticTyping = z10;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._unwrapSingle = bool;
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public AsArraySerializerBase(AsArraySerializerBase<?> asArraySerializerBase, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(asArraySerializerBase);
        this._elementType = asArraySerializerBase._elementType;
        this._staticTyping = asArraySerializerBase._staticTyping;
        this._valueTypeSerializer = typeSerializer;
        this._property = beanProperty;
        this._elementSerializer = jsonSerializer;
        this._dynamicSerializers = PropertySerializerMap.emptyForProperties();
        this._unwrapSingle = bool;
    }
}
