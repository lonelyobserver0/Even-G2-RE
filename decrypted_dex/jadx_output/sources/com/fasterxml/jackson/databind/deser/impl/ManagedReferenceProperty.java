package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class ManagedReferenceProperty extends SettableBeanProperty.Delegating {
    protected final SettableBeanProperty _backProperty;
    protected final boolean _isContainer;
    protected final String _referenceName;

    public ManagedReferenceProperty(SettableBeanProperty settableBeanProperty, String str, SettableBeanProperty settableBeanProperty2, boolean z2) {
        super(settableBeanProperty);
        this._referenceName = str;
        this._backProperty = settableBeanProperty2;
        this._isContainer = z2;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, this.delegate.deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        this.delegate.fixAccess(deserializationConfig);
        this._backProperty.fixAccess(deserializationConfig);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating, com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        if (obj2 != null) {
            if (!this._isContainer) {
                this._backProperty.set(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        this._backProperty.set(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null) {
                        this._backProperty.set(obj4, obj);
                    }
                }
            } else {
                if (!(obj2 instanceof Map)) {
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(10693));
                    sb2.append(obj2.getClass().getName());
                    sb2.append(StubApp.getString2(10694));
                    throw new IllegalStateException(AbstractC1482f.k(sb2, this._referenceName, StubApp.getString2(620)));
                }
                for (Object obj5 : ((Map) obj2).values()) {
                    if (obj5 != null) {
                        this._backProperty.set(obj5, obj);
                    }
                }
            }
        }
        return this.delegate.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating
    public SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty) {
        throw new IllegalStateException(StubApp.getString2(10695));
    }
}
