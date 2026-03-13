package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Set;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty[] _orderedProperties;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
    }

    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.currentToken(), jsonParser, StubApp.getString2(10654), ClassUtil.getTypeDescription(this._beanType), jsonParser.currentToken());
    }

    public Object _deserializeNonVanilla(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i3 = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                break;
            }
            if (i3 == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, StubApp.getString2(10658), Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i3];
                i3++;
                if (settableBeanProperty == null || !(activeView == null || settableBeanProperty.visibleInView(activeView))) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                }
            }
        }
        return createUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        int i3 = 0;
        Object obj = null;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i3 < length ? settableBeanPropertyArr[i3] : null;
            if (settableBeanProperty == null) {
                jsonParser.skipChildren();
            } else if (activeView != null && !settableBeanProperty.visibleInView(activeView)) {
                jsonParser.skipChildren();
            } else if (obj != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e10) {
                    wrapAndThrow(e10, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(name);
                if (!startBuilding.readIdProperty(name) || findCreatorProperty != null) {
                    if (findCreatorProperty == null) {
                        startBuilding.bufferProperty(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                    } else if (startBuilding.assignParameter(findCreatorProperty, findCreatorProperty.deserialize(jsonParser, deserializationContext))) {
                        try {
                            obj = propertyBasedCreator.build(deserializationContext, startBuilding);
                            jsonParser.setCurrentValue(obj);
                            if (obj.getClass() != this._beanType.getRawClass()) {
                                JavaType javaType = this._beanType;
                                deserializationContext.reportBadDefinition(javaType, AbstractC1482f.i(StubApp.getString2(10656), ClassUtil.getTypeDescription(javaType), StubApp.getString2(10657), ClassUtil.getClassDescription(obj)));
                            }
                        } catch (Exception e11) {
                            wrapAndThrow(e11, this._beanType.getRawClass(), name, deserializationContext);
                        }
                    }
                }
            }
            i3++;
        }
        if (obj != null) {
            return obj;
        }
        try {
            return propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Exception e12) {
            return wrapInstantiationProblem(e12, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return _deserializeNonVanilla(jsonParser, deserializationContext);
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i3 = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                break;
            }
            if (i3 == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, StubApp.getString2(10658), Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i3];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, createUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i3++;
            }
        }
        return createUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromNonArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanAsArrayDeserializer(this._delegate.withByNameInclusion(set, set2), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z2) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnoreAllUnknown(z2), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        jsonParser.setCurrentValue(obj);
        if (!jsonParser.isExpectedStartArrayToken()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i3 = 0;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (nextToken == jsonToken) {
                break;
            }
            if (i3 == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, StubApp.getString2(10658), Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i3];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e10) {
                        wrapAndThrow(e10, obj, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i3++;
            }
        }
        return obj;
    }
}
