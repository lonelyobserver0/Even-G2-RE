package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    @Deprecated
    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    public static ThrowableDeserializer construct(DeserializationContext deserializationContext, BeanDeserializer beanDeserializer) {
        return new ThrowableDeserializer(beanDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, StubApp.getString2(10762), new Object[0]);
        }
        boolean canCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean canCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!canCreateFromString && !canCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, StubApp.getString2(10763), new Object[0]);
        }
        int i3 = 0;
        Throwable th = null;
        Object[] objArr = null;
        Throwable[] thArr = null;
        while (!jsonParser.hasToken(JsonToken.END_OBJECT)) {
            String currentName = jsonParser.currentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find != null) {
                if (th != null) {
                    find.deserializeAndSet(jsonParser, deserializationContext, th);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[size + size];
                    }
                    int i10 = i3 + 1;
                    objArr[i3] = find;
                    i3 += 2;
                    objArr[i10] = find.deserialize(jsonParser, deserializationContext);
                }
            } else if (StubApp.getString2(1905).equalsIgnoreCase(currentName) && canCreateFromString) {
                th = (Throwable) this._valueInstantiator.createFromString(deserializationContext, jsonParser.getValueAsString());
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    jsonParser.skipChildren();
                } else if (StubApp.getString2(10764).equalsIgnoreCase(currentName)) {
                    thArr = (Throwable[]) deserializationContext.readValue(jsonParser, Throwable[].class);
                } else if (StubApp.getString2(10765).equalsIgnoreCase(currentName)) {
                    jsonParser.skipChildren();
                } else {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, th, currentName);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, th, currentName);
                    }
                }
            }
            jsonParser.nextToken();
        }
        if (th == null) {
            th = canCreateFromString ? (Throwable) this._valueInstantiator.createFromString(deserializationContext, null) : (Throwable) this._valueInstantiator.createUsingDefault(deserializationContext);
        }
        if (objArr != null) {
            for (int i11 = 0; i11 < i3; i11 += 2) {
                ((SettableBeanProperty) objArr[i11]).set(th, objArr[i11 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th2 : thArr) {
                th.addSuppressed(th2);
            }
        }
        return th;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return getClass() != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }
}
