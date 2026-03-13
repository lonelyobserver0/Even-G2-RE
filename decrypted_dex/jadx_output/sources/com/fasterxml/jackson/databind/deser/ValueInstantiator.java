package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.stub.StubApp;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ValueInstantiator {
    public boolean canCreateFromBigDecimal() {
        return false;
    }

    public boolean canCreateFromBigInteger() {
        return false;
    }

    public boolean canCreateFromBoolean() {
        return false;
    }

    public boolean canCreateFromDouble() {
        return false;
    }

    public boolean canCreateFromInt() {
        return false;
    }

    public boolean canCreateFromLong() {
        return false;
    }

    public boolean canCreateFromObjectWith() {
        return false;
    }

    public boolean canCreateFromString() {
        return false;
    }

    public boolean canCreateUsingArrayDelegate() {
        return false;
    }

    public boolean canCreateUsingDefault() {
        return getDefaultCreator() != null;
    }

    public boolean canCreateUsingDelegate() {
        return false;
    }

    public boolean canInstantiate() {
        return canCreateUsingDefault() || canCreateUsingDelegate() || canCreateUsingArrayDelegate() || canCreateFromObjectWith() || canCreateFromString() || canCreateFromInt() || canCreateFromLong() || canCreateFromDouble() || canCreateFromBoolean();
    }

    public ValueInstantiator createContextual(DeserializationContext deserializationContext, BeanDescription beanDescription) throws JsonMappingException {
        return this;
    }

    public Object createFromBigDecimal(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10643), bigDecimal);
    }

    public Object createFromBigInteger(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10644), bigInteger);
    }

    public Object createFromBoolean(DeserializationContext deserializationContext, boolean z2) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10645), Boolean.valueOf(z2));
    }

    public Object createFromDouble(DeserializationContext deserializationContext, double d8) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10646), Double.valueOf(d8));
    }

    public Object createFromInt(DeserializationContext deserializationContext, int i3) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10647), Integer.valueOf(i3));
    }

    public Object createFromLong(DeserializationContext deserializationContext, long j) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10648), Long.valueOf(j));
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10649), new Object[0]);
    }

    public Object createFromString(DeserializationContext deserializationContext, String str) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, deserializationContext.getParser(), StubApp.getString2(10650), str);
    }

    public Object createUsingArrayDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10651), new Object[0]);
    }

    public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10652), new Object[0]);
    }

    public Object createUsingDelegate(DeserializationContext deserializationContext, Object obj) throws IOException {
        return deserializationContext.handleMissingInstantiator(getValueClass(), this, null, StubApp.getString2(10653), new Object[0]);
    }

    public AnnotatedWithParams getArrayDelegateCreator() {
        return null;
    }

    public JavaType getArrayDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public AnnotatedWithParams getDefaultCreator() {
        return null;
    }

    public AnnotatedWithParams getDelegateCreator() {
        return null;
    }

    public JavaType getDelegateType(DeserializationConfig deserializationConfig) {
        return null;
    }

    public SettableBeanProperty[] getFromObjectArguments(DeserializationConfig deserializationConfig) {
        return null;
    }

    public abstract Class<?> getValueClass();

    public static class Base extends ValueInstantiator implements Serializable {
        protected final Class<?> _valueType;

        public Base(Class<?> cls) {
            this._valueType = cls;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Class<?> getValueClass() {
            return this._valueType;
        }

        public Base(JavaType javaType) {
            this._valueType = javaType.getRawClass();
        }
    }

    public Object createFromObjectWith(DeserializationContext deserializationContext, SettableBeanProperty[] settableBeanPropertyArr, PropertyValueBuffer propertyValueBuffer) throws IOException {
        return createFromObjectWith(deserializationContext, propertyValueBuffer.getParameters(settableBeanPropertyArr));
    }
}
