package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CollectionSerializer extends AsArraySerializerBase<Collection<?>> {
    public CollectionSerializer(JavaType javaType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        super((Class<?>) Collection.class, javaType, z2, typeSerializer, jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public ContainerSerializer<?> _withValueTypeSerializer(TypeSerializer typeSerializer) {
        return new CollectionSerializer(this, this._property, typeSerializer, this._elementSerializer, this._unwrapSingle);
    }

    public void serializeContentsUsing(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i3 = 0;
            do {
                Object next = it.next();
                if (next == null) {
                    try {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } catch (Exception e10) {
                        wrapAndThrow(serializerProvider, e10, collection, i3);
                    }
                } else if (typeSerializer == null) {
                    jsonSerializer.serialize(next, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                }
                i3++;
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public /* bridge */ /* synthetic */ AsArraySerializerBase<Collection<?>> withResolved(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer jsonSerializer, Boolean bool) {
        return withResolved2(beanProperty, typeSerializer, (JsonSerializer<?>) jsonSerializer, bool);
    }

    public CollectionSerializer(CollectionSerializer collectionSerializer, BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        super(collectionSerializer, beanProperty, typeSerializer, jsonSerializer, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Collection<?> collection) {
        return collection.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        int size = collection.size();
        if (size == 1 && ((this._unwrapSingle == null && serializerProvider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)) || this._unwrapSingle == Boolean.TRUE)) {
            serializeContents(collection, jsonGenerator, serializerProvider);
            return;
        }
        jsonGenerator.writeStartArray(collection, size);
        serializeContents(collection, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    public void serializeContents(Collection<?> collection, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.setCurrentValue(collection);
        JsonSerializer<Object> jsonSerializer = this._elementSerializer;
        if (jsonSerializer != null) {
            serializeContentsUsing(collection, jsonGenerator, serializerProvider, jsonSerializer);
            return;
        }
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            TypeSerializer typeSerializer = this._valueTypeSerializer;
            int i3 = 0;
            do {
                try {
                    Object next = it.next();
                    if (next == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        Class<?> cls = next.getClass();
                        JsonSerializer<Object> serializerFor = propertySerializerMap.serializerFor(cls);
                        if (serializerFor == null) {
                            serializerFor = this._elementType.hasGenericTypes() ? _findAndAddDynamic(propertySerializerMap, serializerProvider.constructSpecializedType(this._elementType, cls), serializerProvider) : _findAndAddDynamic(propertySerializerMap, cls, serializerProvider);
                            propertySerializerMap = this._dynamicSerializers;
                        }
                        if (typeSerializer == null) {
                            serializerFor.serialize(next, jsonGenerator, serializerProvider);
                        } else {
                            serializerFor.serializeWithType(next, jsonGenerator, serializerProvider, typeSerializer);
                        }
                    }
                    i3++;
                } catch (Exception e10) {
                    wrapAndThrow(serializerProvider, e10, collection, i3);
                    return;
                }
            } while (it.hasNext());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase
    /* renamed from: withResolved, reason: avoid collision after fix types in other method */
    public AsArraySerializerBase<Collection<?>> withResolved2(BeanProperty beanProperty, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, Boolean bool) {
        return new CollectionSerializer(this, beanProperty, typeSerializer, jsonSerializer, bool);
    }
}
