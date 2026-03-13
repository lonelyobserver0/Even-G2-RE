package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class ClassNameIdResolver extends TypeIdResolverBase {
    protected final PolymorphicTypeValidator _subTypeValidator;

    public ClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this._subTypeValidator = polymorphicTypeValidator;
    }

    public static ClassNameIdResolver construct(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new ClassNameIdResolver(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    public String _idFrom(Object obj, Class<?> cls, TypeFactory typeFactory) {
        if (ClassUtil.isEnumType(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith(StubApp.getString2(10688))) {
            if (obj instanceof EnumSet) {
                return typeFactory.constructCollectionType(EnumSet.class, ClassUtil.findEnumType((EnumSet<?>) obj)).toCanonical();
            }
            if (obj instanceof EnumMap) {
                return typeFactory.constructMapType(EnumMap.class, ClassUtil.findEnumType((EnumMap<?, ?>) obj), Object.class).toCanonical();
            }
        } else if (name.indexOf(36) >= 0 && ClassUtil.getOuterClass(cls) != null && ClassUtil.getOuterClass(this._baseType.getRawClass()) == null) {
            return this._baseType.getRawClass().getName();
        }
        return name;
    }

    public JavaType _typeFromId(String str, DatabindContext databindContext) throws IOException {
        JavaType resolveAndValidateSubType = databindContext.resolveAndValidateSubType(this._baseType, str, this._subTypeValidator);
        return (resolveAndValidateSubType == null && (databindContext instanceof DeserializationContext)) ? ((DeserializationContext) databindContext).handleUnknownTypeId(this._baseType, str, this, StubApp.getString2(10864)) : resolveAndValidateSubType;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String getDescForKnownTypeIds() {
        return StubApp.getString2(10865);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        return _idFrom(obj, obj.getClass(), this._typeFactory);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValueAndType(Object obj, Class<?> cls) {
        return _idFrom(obj, cls, this._typeFactory);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public JavaType typeFromId(DatabindContext databindContext, String str) throws IOException {
        return _typeFromId(str, databindContext);
    }
}
