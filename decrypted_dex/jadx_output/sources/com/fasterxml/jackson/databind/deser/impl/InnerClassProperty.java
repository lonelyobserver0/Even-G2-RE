package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class InnerClassProperty extends SettableBeanProperty.Delegating {
    protected final transient Constructor<?> _creator;

    public InnerClassProperty(SettableBeanProperty settableBeanProperty, Constructor<?> constructor) {
        super(settableBeanProperty);
        this._creator = constructor;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object obj2;
        Object obj3;
        if (jsonParser.currentToken() == JsonToken.VALUE_NULL) {
            obj3 = this._valueDeserializer.getNullValue(deserializationContext);
        } else {
            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
            if (typeDeserializer != null) {
                obj3 = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            } else {
                try {
                    obj2 = this._creator.newInstance(obj);
                } catch (Exception e10) {
                    ClassUtil.unwrapAndThrowAsIAE(e10, StubApp.getString2(10679) + this._creator.getDeclaringClass().getName() + StubApp.getString2(10680) + e10.getMessage());
                    obj2 = null;
                }
                this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj2);
                obj3 = obj2;
            }
        }
        set(obj, obj3);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        return settableBeanProperty == this.delegate ? this : new InnerClassProperty(settableBeanProperty, this._creator);
    }
}
