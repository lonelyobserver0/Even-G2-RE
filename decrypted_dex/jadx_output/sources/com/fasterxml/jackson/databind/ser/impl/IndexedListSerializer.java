package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;
import java.io.IOException;
import java.util.List;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class IndexedListSerializer extends AsArraySerializerBase<List<?>> {
    public IndexedListSerializer(JavaType javaType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super((Class<?>) List.class, javaType, z2, typeSerializer, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new IndexedListSerializer(this, this._property, typeSerializer, this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj == null) {
                try {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } catch (Exception e10) {
                    wrapAndThrow(serializerProvider, e10, list, i3);
                }
            } else if (typeSerializer == null) {
                jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
            } else {
                jsonSerializer.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
            }
        }
    }

    public void serializeTypedContents(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i3 = 0;
        try {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                    if (serializerFor == null) {
                        serializerFor = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                        propertySerializerMap = this._dynamicSerializers;
                    }
                    serializerFor.serializeWithType(obj, jsonGenerator, serializerProvider, typeSerializer);
                }
                i3++;
            }
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, list, i3);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ AsArraySerializerBase<List<?>> withResolved2(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return withResolved(beanProperty, typeSerializer, (JsonSerializer<?>) jsonSerializer, bool);
    }

    public IndexedListSerializer(IndexedListSerializer indexedListSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(indexedListSerializer, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, List<?> list) {
        return list.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = list.size();
        if (size == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(list, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(list, size);
        serializeContents(list, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(List<?> list, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonSerializer<Object> jsonSerializer = this._elementSerializer;
        if (jsonSerializer != null) {
            serializeContentsUsing(list, jsonGenerator, serializerProvider, jsonSerializer);
            return;
        }
        if (this._valueTypeSerializer != null) {
            serializeTypedContents(list, jsonGenerator, serializerProvider);
            return;
        }
        int size = list.size();
        if (size == 0) {
            return;
        }
        int i3 = 0;
        try {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else {
                    Class<?> cls = obj.getClass();
                    JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                    if (serializerFor == null) {
                        serializerFor = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                        propertySerializerMap = this._dynamicSerializers;
                    }
                    serializerFor.serialize(obj, jsonGenerator, serializerProvider);
                }
                i3++;
            }
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, list, i3);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public AsArraySerializerBase<List<?>> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new IndexedListSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }
}
