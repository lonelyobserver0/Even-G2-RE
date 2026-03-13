package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AsExistingPropertyTypeSerializer extends AsPropertyTypeSerializer {
    public AsExistingPropertyTypeSerializer(TypeIdResolver typeIdResolver, BeanProperty beanProperty, String str) {
        super(typeIdResolver, beanProperty, str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXISTING_PROPERTY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeSerializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeSerializer, com.fasterxml.jackson.databind.jsontype.TypeSerializer
    public AsExistingPropertyTypeSerializer forProperty(BeanProperty beanProperty) {
        return this._property == beanProperty ? this : new AsExistingPropertyTypeSerializer(this._idResolver, beanProperty, this._typePropertyName);
    }
}
