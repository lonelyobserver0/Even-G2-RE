package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ObjectIdReferenceProperty extends SettableBeanProperty {
    private final SettableBeanProperty _forward;

    public static final class PropertyReferring extends ReadableObjectId.Referring {
        private final ObjectIdReferenceProperty _parent;
        public final Object _pojo;

        public PropertyReferring(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this._parent = objectIdReferenceProperty;
            this._pojo = obj;
        }
    }

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, ObjectIdInfo objectIdInfo) {
        super(settableBeanProperty);
        this._forward = settableBeanProperty;
        this._objectIdInfo = objectIdInfo;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e10) {
            if (this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, StubApp.getString2(10696), e10);
            }
            e10.getRoid().appendReferring(new PropertyReferring(this, e10, this._type.getRawClass(), obj));
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._forward;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this._forward.getCreatorIndex();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._forward.getMember();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        this._forward.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this._forward.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(NullValueProvider nullValueProvider) {
        return new ObjectIdReferenceProperty(this, this._valueDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(JsonDeserializer<?> jsonDeserializer) {
        JsonDeserializer<?> jsonDeserializer2 = this._valueDeserializer;
        if (jsonDeserializer2 == jsonDeserializer) {
            return this;
        }
        NullValueProvider nullValueProvider = this._nullProvider;
        if (jsonDeserializer2 == nullValueProvider) {
            nullValueProvider = jsonDeserializer;
        }
        return new ObjectIdReferenceProperty(this, jsonDeserializer, nullValueProvider);
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider) {
        super(objectIdReferenceProperty, jsonDeserializer, nullValueProvider);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }
}
