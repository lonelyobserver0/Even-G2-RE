package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ObjectIdWriter {
    public final boolean alwaysAsId;
    public final ObjectIdGenerator<?> generator;
    public final JavaType idType;
    public final SerializableString propertyName;
    public final JsonSerializer<Object> serializer;

    public ObjectIdWriter(JavaType javaType, SerializableString serializableString, ObjectIdGenerator<?> objectIdGenerator, JsonSerializer<?> jsonSerializer, boolean z2) {
        this.idType = javaType;
        this.propertyName = serializableString;
        this.generator = objectIdGenerator;
        this.serializer = jsonSerializer;
        this.alwaysAsId = z2;
    }

    public static ObjectIdWriter construct(JavaType javaType, PropertyName propertyName, ObjectIdGenerator<?> objectIdGenerator, boolean z2) {
        String simpleName = propertyName == null ? null : propertyName.getSimpleName();
        return new ObjectIdWriter(javaType, simpleName != null ? new SerializedString(simpleName) : null, objectIdGenerator, null, z2);
    }

    public ObjectIdWriter withAlwaysAsId(boolean z2) {
        return z2 == this.alwaysAsId ? this : new ObjectIdWriter(this.idType, this.propertyName, this.generator, this.serializer, z2);
    }

    public ObjectIdWriter withSerializer(JsonSerializer<?> jsonSerializer) {
        return new ObjectIdWriter(this.idType, this.propertyName, this.generator, jsonSerializer, this.alwaysAsId);
    }
}
