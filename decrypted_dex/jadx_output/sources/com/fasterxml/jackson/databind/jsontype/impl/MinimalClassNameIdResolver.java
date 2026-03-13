package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MinimalClassNameIdResolver extends ClassNameIdResolver {
    protected final String _basePackageName;
    protected final String _basePackagePrefix;

    public MinimalClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.getRawClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this._basePackageName = "";
            this._basePackagePrefix = StubApp.getString2(1);
        } else {
            this._basePackagePrefix = name.substring(0, lastIndexOf + 1);
            this._basePackageName = name.substring(0, lastIndexOf);
        }
    }

    public static MinimalClassNameIdResolver construct(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver
    public JavaType _typeFromId(String str, DatabindContext databindContext) throws IOException {
        if (str.startsWith(StubApp.getString2(1))) {
            StringBuilder sb2 = new StringBuilder(this._basePackageName.length() + str.length());
            if (this._basePackageName.isEmpty()) {
                sb2.append(str.substring(1));
            } else {
                sb2.append(this._basePackageName);
                sb2.append(str);
            }
            str = sb2.toString();
        }
        return super._typeFromId(str, databindContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this._basePackagePrefix) ? name.substring(this._basePackagePrefix.length() - 1) : name;
    }
}
