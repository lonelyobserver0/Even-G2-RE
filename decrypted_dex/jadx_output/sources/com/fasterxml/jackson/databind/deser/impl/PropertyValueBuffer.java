package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyValue;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.stub.StubApp;
import java.io.IOException;
import java.util.BitSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PropertyValueBuffer {
    protected PropertyValue _buffered;
    protected final DeserializationContext _context;
    protected final Object[] _creatorParameters;
    protected Object _idValue;
    protected final ObjectIdReader _objectIdReader;
    protected int _paramsNeeded;
    protected int _paramsSeen;
    protected final BitSet _paramsSeenBig;
    protected final JsonParser _parser;

    public PropertyValueBuffer(JsonParser jsonParser, DeserializationContext deserializationContext, int i3, ObjectIdReader objectIdReader) {
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._paramsNeeded = i3;
        this._objectIdReader = objectIdReader;
        this._creatorParameters = new Object[i3];
        if (i3 < 32) {
            this._paramsSeenBig = null;
        } else {
            this._paramsSeenBig = new BitSet();
        }
    }

    public Object _findMissing(SettableBeanProperty settableBeanProperty) throws JsonMappingException {
        if (settableBeanProperty.getInjectableValueId() != null) {
            return this._context.findInjectableValue(settableBeanProperty.getInjectableValueId(), settableBeanProperty, null);
        }
        if (settableBeanProperty.isRequired()) {
            this._context.reportInputMismatch(settableBeanProperty, StubApp.getString2(10698), settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        if (this._context.isEnabled(DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES)) {
            this._context.reportInputMismatch(settableBeanProperty, StubApp.getString2(10699), settableBeanProperty.getName(), Integer.valueOf(settableBeanProperty.getCreatorIndex()));
        }
        try {
            Object absentValue = settableBeanProperty.getNullValueProvider().getAbsentValue(this._context);
            return absentValue != null ? absentValue : settableBeanProperty.getValueDeserializer().getAbsentValue(this._context);
        } catch (DatabindException e10) {
            AnnotatedMember member = settableBeanProperty.getMember();
            if (member != null) {
                e10.prependPath(member.getDeclaringClass(), settableBeanProperty.getName());
            }
            throw e10;
        }
    }

    public boolean assignParameter(SettableBeanProperty settableBeanProperty, Object obj) {
        int creatorIndex = settableBeanProperty.getCreatorIndex();
        this._creatorParameters[creatorIndex] = obj;
        BitSet bitSet = this._paramsSeenBig;
        if (bitSet == null) {
            int i3 = this._paramsSeen;
            int i10 = (1 << creatorIndex) | i3;
            if (i3 != i10) {
                this._paramsSeen = i10;
                int i11 = this._paramsNeeded - 1;
                this._paramsNeeded = i11;
                if (i11 <= 0) {
                    return this._objectIdReader == null || this._idValue != null;
                }
            }
        } else if (!bitSet.get(creatorIndex)) {
            this._paramsSeenBig.set(creatorIndex);
            this._paramsNeeded--;
        }
        return false;
    }

    public void bufferAnyProperty(SettableAnyProperty settableAnyProperty, String str, Object obj) {
        this._buffered = new PropertyValue.Any(this._buffered, obj, settableAnyProperty, str);
    }

    public void bufferMapProperty(Object obj, Object obj2) {
        this._buffered = new PropertyValue.Map(this._buffered, obj2, obj);
    }

    public void bufferProperty(SettableBeanProperty settableBeanProperty, Object obj) {
        this._buffered = new PropertyValue.Regular(this._buffered, obj, settableBeanProperty);
    }

    public PropertyValue buffered() {
        return this._buffered;
    }

    public Object[] getParameters(SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (this._paramsNeeded > 0) {
            if (this._paramsSeenBig != null) {
                int length = this._creatorParameters.length;
                int i3 = 0;
                while (true) {
                    int nextClearBit = this._paramsSeenBig.nextClearBit(i3);
                    if (nextClearBit >= length) {
                        break;
                    }
                    this._creatorParameters[nextClearBit] = _findMissing(settableBeanPropertyArr[nextClearBit]);
                    i3 = nextClearBit + 1;
                }
            } else {
                int i10 = this._paramsSeen;
                int length2 = this._creatorParameters.length;
                int i11 = 0;
                while (i11 < length2) {
                    if ((i10 & 1) == 0) {
                        this._creatorParameters[i11] = _findMissing(settableBeanPropertyArr[i11]);
                    }
                    i11++;
                    i10 >>= 1;
                }
            }
        }
        if (this._context.isEnabled(DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES)) {
            for (int i12 = 0; i12 < settableBeanPropertyArr.length; i12++) {
                if (this._creatorParameters[i12] == null) {
                    SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i12];
                    this._context.reportInputMismatch(settableBeanProperty, StubApp.getString2(10700), settableBeanProperty.getName(), Integer.valueOf(settableBeanPropertyArr[i12].getCreatorIndex()));
                }
            }
        }
        return this._creatorParameters;
    }

    public Object handleIdValue(DeserializationContext deserializationContext, Object obj) throws IOException {
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null) {
            Object obj2 = this._idValue;
            if (obj2 != null) {
                ObjectIdGenerator<?> objectIdGenerator = objectIdReader.generator;
                objectIdReader.getClass();
                deserializationContext.findObjectId(obj2, objectIdGenerator, null).bindItem(obj);
                SettableBeanProperty settableBeanProperty = this._objectIdReader.idProperty;
                if (settableBeanProperty != null) {
                    return settableBeanProperty.setAndReturn(obj, this._idValue);
                }
            } else {
                deserializationContext.reportUnresolvedObjectId(objectIdReader, obj);
            }
        }
        return obj;
    }

    public boolean readIdProperty(String str) throws IOException {
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader == null || !str.equals(objectIdReader.propertyName.getSimpleName())) {
            return false;
        }
        this._idValue = this._objectIdReader.readObjectReference(this._parser, this._context);
        return true;
    }
}
