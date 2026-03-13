package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class TypeSerializerBase extends TypeSerializer {
    protected final TypeIdResolver _idResolver;
    protected final BeanProperty _property;

    public TypeSerializerBase(TypeIdResolver typeIdResolver, BeanProperty beanProperty) {
        this._idResolver = typeIdResolver;
        this._property = beanProperty;
    }

    public void _generateTypeId(WritableTypeId writableTypeId) {
        if (writableTypeId.id == null) {
            Object obj = writableTypeId.forValue;
            Class<?> cls = writableTypeId.forValueType;
            writableTypeId.id = cls == null ? idFromValue(obj) : idFromValueAndType(obj, cls);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public String getPropertyName() {
        return null;
    }

    public void handleMissingId(Object obj) {
    }

    public String idFromValue(Object obj) {
        String idFromValue = this._idResolver.idFromValue(obj);
        if (idFromValue == null) {
            handleMissingId(obj);
        }
        return idFromValue;
    }

    public String idFromValueAndType(Object obj, Class<?> cls) {
        String idFromValueAndType = this._idResolver.idFromValueAndType(obj, cls);
        if (idFromValueAndType == null) {
            handleMissingId(obj);
        }
        return idFromValueAndType;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId writeTypePrefix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        _generateTypeId(writableTypeId);
        if (writableTypeId.id == null) {
            return null;
        }
        return jsonGenerator.writeTypePrefix(writableTypeId);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public WritableTypeId writeTypeSuffix(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException {
        if (writableTypeId == null) {
            return null;
        }
        return jsonGenerator.writeTypeSuffix(writableTypeId);
    }
}
