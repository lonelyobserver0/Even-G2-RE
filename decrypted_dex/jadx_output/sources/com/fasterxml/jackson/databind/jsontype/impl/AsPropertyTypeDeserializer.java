package com.fasterxml.jackson.databind.jsontype.impl;

import E1.a;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.JsonParserSequence;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.stub.StubApp;
import java.io.IOException;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    protected final JsonTypeInfo.As _inclusion;
    protected final String _msgForMissingId;

    public AsPropertyTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z2, JavaType javaType2, JsonTypeInfo.As as) {
        super(javaType, typeIdResolver, str, z2, javaType2);
        String j;
        BeanProperty beanProperty = this._property;
        String string2 = StubApp.getString2(10862);
        if (beanProperty == null) {
            j = a.k(string2, this._typePropertyName, StubApp.getString2(620));
        } else {
            j = AbstractC1482f.j(string2, this._typePropertyName, StubApp.getString2(10863), beanProperty.getName(), StubApp.getString2(2142));
        }
        this._msgForMissingId = j;
        this._inclusion = as;
    }

    public Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer, String str) throws IOException {
        JsonDeserializer<Object> _findDeserializer = _findDeserializer(deserializationContext, str);
        if (this._typeIdVisible) {
            if (tokenBuffer == null) {
                tokenBuffer = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            tokenBuffer.writeFieldName(jsonParser.currentName());
            tokenBuffer.writeString(str);
        }
        if (tokenBuffer != null) {
            jsonParser.clearCurrentToken();
            jsonParser = JsonParserSequence.createFlattened(false, tokenBuffer.asParser(jsonParser), jsonParser);
        }
        if (jsonParser.currentToken() != JsonToken.END_OBJECT) {
            jsonParser.nextToken();
        }
        return _findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, TokenBuffer tokenBuffer, String str) throws IOException {
        if (!hasDefaultImpl()) {
            Object deserializeIfNatural = TypeDeserializer.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (deserializeIfNatural != null) {
                return deserializeIfNatural;
            }
            if (jsonParser.isExpectedStartArrayToken()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().trim().isEmpty()) {
                return null;
            }
        }
        JsonDeserializer<Object> _findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (_findDefaultImplDeserializer == null) {
            JavaType _handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (_handleMissingTypeId == null) {
                return null;
            }
            _findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(_handleMissingTypeId, this._property);
        }
        if (tokenBuffer != null) {
            tokenBuffer.writeEndObject();
            jsonParser = tokenBuffer.asParser(jsonParser);
            jsonParser.nextToken();
        }
        return _findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.hasToken(JsonToken.START_ARRAY) ? super.deserializeTypedFromArray(jsonParser, deserializationContext) : deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String valueAsString;
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        JsonToken currentToken = jsonParser.currentToken();
        TokenBuffer tokenBuffer = null;
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        } else if (currentToken != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, this._msgForMissingId);
        }
        boolean isEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.currentName();
            jsonParser.nextToken();
            if ((currentName.equals(this._typePropertyName) || (isEnabled && currentName.equalsIgnoreCase(this._typePropertyName))) && (valueAsString = jsonParser.getValueAsString()) != null) {
                return _deserializeTypedForId(jsonParser, deserializationContext, tokenBuffer, valueAsString);
            }
            if (tokenBuffer == null) {
                tokenBuffer = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            tokenBuffer.writeFieldName(currentName);
            tokenBuffer.copyCurrentStructure(jsonParser);
            currentToken = jsonParser.nextToken();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, tokenBuffer, this._msgForMissingId);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return this._inclusion;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        super(asPropertyTypeDeserializer, beanProperty);
        String j;
        BeanProperty beanProperty2 = this._property;
        String string2 = StubApp.getString2(10862);
        if (beanProperty2 == null) {
            j = a.k(string2, this._typePropertyName, StubApp.getString2(620));
        } else {
            j = AbstractC1482f.j(string2, this._typePropertyName, StubApp.getString2(10863), beanProperty2.getName(), StubApp.getString2(2142));
        }
        this._msgForMissingId = j;
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }
}
