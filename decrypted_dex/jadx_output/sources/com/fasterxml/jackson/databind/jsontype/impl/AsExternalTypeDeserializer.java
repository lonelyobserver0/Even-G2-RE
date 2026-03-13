package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer {
    public AsExternalTypeDeserializer(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z2, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z2, javaType2);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer
    public boolean _usesExternalId() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsExternalTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    public AsExternalTypeDeserializer(AsExternalTypeDeserializer asExternalTypeDeserializer, BeanProperty beanProperty) {
        super(asExternalTypeDeserializer, beanProperty);
    }
}
