package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class ContainerDeserializerBase<T> extends StdDeserializer<T> {
    protected final JavaType _containerType;
    protected final NullValueProvider _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public ContainerDeserializerBase(JavaType javaType, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType);
        this._containerType = javaType;
        this._unwrapSingle = bool;
        this._nullProvider = nullValueProvider;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public SettableBeanProperty findBackReference(String str) {
        JsonDeserializer<Object> contentDeserializer = getContentDeserializer();
        if (contentDeserializer != null) {
            return contentDeserializer.findBackReference(str);
        }
        throw new IllegalArgumentException(AbstractC1482f.j(StubApp.getString2(10536), str, StubApp.getString2(10711), getClass().getName(), StubApp.getString2(10712)));
    }

    public abstract JsonDeserializer<Object> getContentDeserializer();

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = getValueInstantiator();
        if (valueInstantiator == null || !valueInstantiator.canCreateUsingDefault()) {
            JavaType valueType = getValueType();
            deserializationContext.reportBadDefinition(valueType, String.format(StubApp.getString2(10713), valueType));
        }
        try {
            return valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e10) {
            return ClassUtil.throwAsMappingException(deserializationContext, e10);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public <BOGUS> BOGUS wrapAndThrow(DeserializationContext deserializationContext, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
            ClassUtil.throwIfRTE(th);
        }
        if (!(th instanceof IOException) || (th instanceof JsonMappingException)) {
            throw JsonMappingException.wrapWithPath(th, obj, (String) ClassUtil.nonNull(str, StubApp.getString2(10289)));
        }
        throw ((IOException) th);
    }

    public ContainerDeserializerBase(JavaType javaType) {
        this(javaType, (NullValueProvider) null, (Boolean) null);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase) {
        this(containerDeserializerBase, containerDeserializerBase._nullProvider, containerDeserializerBase._unwrapSingle);
    }

    public ContainerDeserializerBase(ContainerDeserializerBase<?> containerDeserializerBase, NullValueProvider nullValueProvider, Boolean bool) {
        super(containerDeserializerBase._containerType);
        this._containerType = containerDeserializerBase._containerType;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }
}
