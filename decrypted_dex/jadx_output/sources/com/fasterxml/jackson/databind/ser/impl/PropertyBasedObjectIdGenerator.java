package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    protected final BeanPropertyWriter _property;

    public PropertyBasedObjectIdGenerator(ObjectIdInfo objectIdInfo, BeanPropertyWriter beanPropertyWriter) {
        this(objectIdInfo.getScope(), beanPropertyWriter);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerators$Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass()) {
            PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
            if (propertyBasedObjectIdGenerator.getScope() == this._scope && propertyBasedObjectIdGenerator._property == this._property) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls, this._property);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object generateId(Object obj) {
        try {
            return this._property.get(obj);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IllegalStateException(StubApp.getString2(11008) + this._property.getName() + StubApp.getString2(11009) + e11.getMessage(), e11);
        }
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this._scope, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }

    public PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this._property = beanPropertyWriter;
    }
}
