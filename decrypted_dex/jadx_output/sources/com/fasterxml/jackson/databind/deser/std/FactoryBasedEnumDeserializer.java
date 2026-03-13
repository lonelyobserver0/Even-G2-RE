package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class FactoryBasedEnumDeserializer extends StdDeserializer<Object> implements ContextualDeserializer {
    protected final SettableBeanProperty[] _creatorProps;
    protected final JsonDeserializer<?> _deser;
    protected final AnnotatedMethod _factory;
    protected final boolean _hasArgs;
    protected final JavaType _inputType;
    private transient PropertyBasedCreator _propCreator;
    protected final ValueInstantiator _valueInstantiator;

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod, JavaType javaType, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = true;
        this._inputType = (javaType.hasRawClass(String.class) || javaType.hasRawClass(CharSequence.class)) ? null : javaType;
        this._deser = null;
        this._valueInstantiator = valueInstantiator;
        this._creatorProps = settableBeanPropertyArr;
    }

    private Throwable throwOrReturnThrowable(Throwable th, DeserializationContext deserializationContext) throws IOException {
        Throwable rootCause = ClassUtil.getRootCause(th);
        ClassUtil.throwIfError(rootCause);
        boolean z2 = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (rootCause instanceof IOException) {
            if (!z2 || !(rootCause instanceof JacksonException)) {
                throw ((IOException) rootCause);
            }
        } else if (!z2) {
            ClassUtil.throwIfRTE(rootCause);
        }
        return rootCause;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e10) {
            return wrapAndThrow(e10, handledType(), settableBeanProperty.getName(), deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JavaType javaType;
        return (this._deser == null && (javaType = this._inputType) != null && this._creatorProps == null) ? new FactoryBasedEnumDeserializer(this, (JsonDeserializer<?>) deserializationContext.findContextualValueDeserializer(javaType, beanProperty)) : this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        Object obj;
        JsonDeserializer<?> jsonDeserializer = this._deser;
        if (jsonDeserializer != null) {
            obj = jsonDeserializer.deserialize(jsonParser, deserializationContext);
        } else {
            if (!this._hasArgs) {
                jsonParser.skipChildren();
                try {
                    return this._factory.call();
                } catch (Exception e10) {
                    return deserializationContext.handleInstantiationProblem(this._valueClass, null, ClassUtil.throwRootCauseIfIOE(e10));
                }
            }
            if (this._creatorProps != null) {
                if (!jsonParser.isExpectedStartObjectToken()) {
                    JavaType valueType = getValueType(deserializationContext);
                    deserializationContext.reportInputMismatch(valueType, StubApp.getString2(10728), ClassUtil.getTypeDescription(valueType), this._factory, jsonParser.currentToken());
                }
                if (this._propCreator == null) {
                    this._propCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._creatorProps, deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                }
                jsonParser.nextToken();
                return deserializeEnumUsingPropertyBased(jsonParser, deserializationContext, this._propCreator);
            }
            JsonToken currentToken = jsonParser.currentToken();
            boolean z2 = currentToken == JsonToken.START_ARRAY && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
            if (z2) {
                currentToken = jsonParser.nextToken();
            }
            if (currentToken == null || !currentToken.isScalarValue()) {
                jsonParser.skipChildren();
                str = "";
            } else {
                str = jsonParser.getValueAsString();
            }
            if (z2 && jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            obj = str;
        }
        try {
            return this._factory.callOnWith(this._valueClass, obj);
        } catch (Exception e11) {
            Throwable throwRootCauseIfIOE = ClassUtil.throwRootCauseIfIOE(e11);
            if ((throwRootCauseIfIOE instanceof IllegalArgumentException) && deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleInstantiationProblem(this._valueClass, obj, throwRootCauseIfIOE);
        }
    }

    public Object deserializeEnumUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext, PropertyBasedCreator propertyBasedCreator) throws IOException {
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        JsonToken currentToken = jsonParser.currentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.currentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (!startBuilding.readIdProperty(currentName) || findCreatorProperty != null) {
                if (findCreatorProperty != null) {
                    startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty));
                } else {
                    jsonParser.skipChildren();
                }
            }
            currentToken = jsonParser.nextToken();
        }
        return propertyBasedCreator.build(deserializationContext, startBuilding);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return this._deser == null ? deserialize(jsonParser, deserializationContext) : typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Enum;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public Object wrapAndThrow(Throwable th, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(th, deserializationContext), obj, str);
    }

    public FactoryBasedEnumDeserializer(Class<?> cls, AnnotatedMethod annotatedMethod) {
        super(cls);
        this._factory = annotatedMethod;
        this._hasArgs = false;
        this._inputType = null;
        this._deser = null;
        this._valueInstantiator = null;
        this._creatorProps = null;
    }

    public FactoryBasedEnumDeserializer(FactoryBasedEnumDeserializer factoryBasedEnumDeserializer, JsonDeserializer<?> jsonDeserializer) {
        super(factoryBasedEnumDeserializer._valueClass);
        this._inputType = factoryBasedEnumDeserializer._inputType;
        this._factory = factoryBasedEnumDeserializer._factory;
        this._hasArgs = factoryBasedEnumDeserializer._hasArgs;
        this._valueInstantiator = factoryBasedEnumDeserializer._valueInstantiator;
        this._creatorProps = factoryBasedEnumDeserializer._creatorProps;
        this._deser = jsonDeserializer;
    }
}
