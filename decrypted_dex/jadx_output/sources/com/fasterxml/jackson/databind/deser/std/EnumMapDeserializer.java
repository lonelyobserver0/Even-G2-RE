package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.util.EnumMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EnumMapDeserializer extends ContainerDeserializerBase<EnumMap<?, ?>> implements ContextualDeserializer, ResolvableDeserializer {
    protected JsonDeserializer<Object> _delegateDeserializer;
    protected final Class<?> _enumClass;
    protected KeyDeserializer _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    public EnumMapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(javaType, nullValueProvider, (Boolean) null);
        this._enumClass = javaType.getKeyType().getRawClass();
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
    }

    public EnumMap<?, ?> _deserializeUsingProperties(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object deserialize;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, null);
        String nextFieldName = jsonParser.isExpectedStartObjectToken() ? jsonParser.nextFieldName() : jsonParser.hasToken(JsonToken.FIELD_NAME) ? jsonParser.currentName() : null;
        while (nextFieldName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(nextFieldName);
            if (findCreatorProperty == null) {
                Enum r52 = (Enum) this._keyDeserializer.deserializeKey(nextFieldName, deserializationContext);
                if (r52 != null) {
                    try {
                        if (nextToken != JsonToken.VALUE_NULL) {
                            TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
                            deserialize = typeDeserializer == null ? this._valueDeserializer.deserialize(jsonParser, deserializationContext) : this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                        } else if (!this._skipNullValues) {
                            deserialize = this._nullProvider.getNullValue(deserializationContext);
                        }
                        startBuilding.bufferMapProperty(r52, deserialize);
                    } catch (Exception e10) {
                        wrapAndThrow(deserializationContext, e10, this._containerType.getRawClass(), nextFieldName);
                        return null;
                    }
                } else {
                    if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                        return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, nextFieldName, StubApp.getString2(10724), this._containerType.getKeyType());
                    }
                    jsonParser.nextToken();
                    jsonParser.skipChildren();
                }
            } else if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                jsonParser.nextToken();
                try {
                    return deserialize(jsonParser, deserializationContext, (EnumMap) propertyBasedCreator.build(deserializationContext, startBuilding));
                } catch (Exception e11) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e11, this._containerType.getRawClass(), nextFieldName);
                }
            }
            nextFieldName = jsonParser.nextFieldName();
        }
        try {
            return (EnumMap) propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Exception e12) {
            wrapAndThrow(deserializationContext, e12, this._containerType.getRawClass(), nextFieldName);
            return null;
        }
    }

    public EnumMap<?, ?> constructMap(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            return new EnumMap<>(this._enumClass);
        }
        try {
        } catch (IOException e10) {
            e = e10;
        }
        try {
            return !valueInstantiator.canCreateUsingDefault() ? (EnumMap) deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), null, StubApp.getString2("10725"), new Object[0]) : (EnumMap) this._valueInstantiator.createUsingDefault(deserializationContext);
        } catch (IOException e11) {
            e = e11;
            return (EnumMap) ClassUtil.throwAsMappingException(deserializationContext, e);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        KeyDeserializer keyDeserializer = this._keyDeserializer;
        if (keyDeserializer == null) {
            keyDeserializer = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        }
        JsonDeserializer<?> jsonDeserializer = this._valueDeserializer;
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> findContextualValueDeserializer = jsonDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (typeDeserializer != null) {
            typeDeserializer = typeDeserializer.forProperty(beanProperty);
        }
        return withResolved(keyDeserializer, findContextualValueDeserializer, typeDeserializer, findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructMap(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.ResolvableDeserializer
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator != null) {
            if (valueInstantiator.canCreateUsingDelegate()) {
                JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    JavaType javaType = this._containerType;
                    deserializationContext.reportBadDefinition(javaType, String.format(StubApp.getString2(10709), javaType, this._valueInstantiator.getClass().getName()));
                }
                this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
                return;
            }
            if (!this._valueInstantiator.canCreateUsingArrayDelegate()) {
                if (this._valueInstantiator.canCreateFromObjectWith()) {
                    this._propertyBasedCreator = PropertyBasedCreator.construct(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
                    return;
                }
                return;
            }
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format(StubApp.getString2(10710), javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
    }

    public EnumMapDeserializer withResolved(KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        return (keyDeserializer == this._keyDeserializer && nullValueProvider == this._nullProvider && jsonDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) ? this : new EnumMapDeserializer(this, keyDeserializer, jsonDeserializer, typeDeserializer, nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingProperties(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return (EnumMap) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId != 1 && currentTokenId != 2) {
            if (currentTokenId == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (currentTokenId != 5) {
                if (currentTokenId != 6) {
                    return (EnumMap) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                return _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        return deserialize(jsonParser, deserializationContext, (EnumMap) constructMap(deserializationContext));
    }

    public EnumMapDeserializer(EnumMapDeserializer enumMapDeserializer, KeyDeserializer keyDeserializer, JsonDeserializer<?> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider) {
        super(enumMapDeserializer, nullValueProvider, enumMapDeserializer._unwrapSingle);
        this._enumClass = enumMapDeserializer._enumClass;
        this._keyDeserializer = keyDeserializer;
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = enumMapDeserializer._valueInstantiator;
        this._delegateDeserializer = enumMapDeserializer._delegateDeserializer;
        this._propertyBasedCreator = enumMapDeserializer._propertyBasedCreator;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public EnumMap<?, ?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumMap enumMap) throws IOException {
        String currentName;
        Object deserializeWithType;
        jsonParser.setCurrentValue(enumMap);
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            JsonToken currentToken = jsonParser.currentToken();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (currentToken != jsonToken) {
                if (currentToken != JsonToken.END_OBJECT) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
                return enumMap;
            }
            currentName = jsonParser.currentName();
        }
        while (currentName != null) {
            Enum r32 = (Enum) this._keyDeserializer.deserializeKey(currentName, deserializationContext);
            JsonToken nextToken = jsonParser.nextToken();
            if (r32 == null) {
                if (!deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return (EnumMap) deserializationContext.handleWeirdStringValue(this._enumClass, currentName, StubApp.getString2(10724), this._containerType.getKeyType());
                }
                jsonParser.skipChildren();
            } else {
                try {
                    if (nextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            deserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        deserializeWithType = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        deserializeWithType = jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    enumMap.put((EnumMap) r32, (Enum) deserializeWithType);
                } catch (Exception e10) {
                    return (EnumMap) wrapAndThrow(deserializationContext, e10, enumMap, currentName);
                }
            }
            currentName = jsonParser.nextFieldName();
        }
        return enumMap;
    }
}
