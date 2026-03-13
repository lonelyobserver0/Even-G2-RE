package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.util.Collection;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class StdTypeResolverBuilder implements TypeResolverBuilder<StdTypeResolverBuilder> {
    protected TypeIdResolver _customIdResolver;
    protected Class<?> _defaultImpl;
    protected JsonTypeInfo.Id _idType;
    protected JsonTypeInfo.As _includeAs;
    protected boolean _typeIdVisible;
    protected String _typeProperty;

    /* renamed from: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id = iArr;
            try {
                iArr[JsonTypeInfo.Id.DEDUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.Id.CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.Id.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.Id.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[JsonTypeInfo.Id.CUSTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As = iArr2;
            try {
                iArr2[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public StdTypeResolverBuilder() {
        this._typeIdVisible = false;
    }

    public static StdTypeResolverBuilder noTypeInfoBuilder() {
        return new StdTypeResolverBuilder().init(JsonTypeInfo.Id.NONE, (TypeIdResolver) null);
    }

    public boolean allowPrimitiveTypes(MapperConfig<?> mapperConfig, JavaType javaType) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(deserializationConfig, javaType)) {
            return null;
        }
        TypeIdResolver idResolver = idResolver(deserializationConfig, javaType, verifyBaseTypeValidity(deserializationConfig, javaType), collection, false, true);
        JavaType defineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        if (this._idType == JsonTypeInfo.Id.DEDUCTION) {
            return new AsDeductionTypeDeserializer(javaType, idResolver, defineDefaultImpl, deserializationConfig, collection);
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i3 == 1) {
            return new AsArrayTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
        }
        if (i3 != 2) {
            if (i3 == 3) {
                return new AsWrapperTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
            }
            if (i3 == 4) {
                return new AsExternalTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl);
            }
            if (i3 != 5) {
                throw new IllegalStateException(StubApp.getString2(10866) + this._includeAs);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, idResolver, this._typeProperty, this._typeIdVisible, defineDefaultImpl, this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(serializationConfig, javaType)) {
            return null;
        }
        if (this._idType == JsonTypeInfo.Id.DEDUCTION) {
            return AsDeductionTypeSerializer.instance();
        }
        TypeIdResolver idResolver = idResolver(serializationConfig, javaType, subTypeValidator(serializationConfig), collection, true, false);
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$As[this._includeAs.ordinal()];
        if (i3 == 1) {
            return new AsArrayTypeSerializer(idResolver, null);
        }
        if (i3 == 2) {
            return new AsPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (i3 == 3) {
            return new AsWrapperTypeSerializer(idResolver, null);
        }
        if (i3 == 4) {
            return new AsExternalTypeSerializer(idResolver, null, this._typeProperty);
        }
        if (i3 == 5) {
            return new AsExistingPropertyTypeSerializer(idResolver, null, this._typeProperty);
        }
        throw new IllegalStateException(StubApp.getString2(10866) + this._includeAs);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public /* bridge */ /* synthetic */ StdTypeResolverBuilder defaultImpl(Class cls) {
        return defaultImpl2((Class<?>) cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4.hasRawClass(r2._defaultImpl) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JavaType defineDefaultImpl(com.fasterxml.jackson.databind.DeserializationConfig r3, com.fasterxml.jackson.databind.JavaType r4) {
        /*
            r2 = this;
            java.lang.Class<?> r0 = r2._defaultImpl
            if (r0 == 0) goto L3b
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            if (r0 == r1) goto L30
            java.lang.Class<com.fasterxml.jackson.databind.annotation.NoClass> r1 = com.fasterxml.jackson.databind.annotation.NoClass.class
            if (r0 != r1) goto Ld
            goto L30
        Ld:
            boolean r0 = r4.hasRawClass(r0)
            if (r0 == 0) goto L14
            goto L2f
        L14:
            java.lang.Class<?> r0 = r2._defaultImpl
            boolean r0 = r4.isTypeOrSuperTypeOf(r0)
            if (r0 == 0) goto L27
            com.fasterxml.jackson.databind.type.TypeFactory r3 = r3.getTypeFactory()
            java.lang.Class<?> r0 = r2._defaultImpl
            com.fasterxml.jackson.databind.JavaType r3 = r3.constructSpecializedType(r4, r0)
            return r3
        L27:
            java.lang.Class<?> r0 = r2._defaultImpl
            boolean r0 = r4.hasRawClass(r0)
            if (r0 == 0) goto L3b
        L2f:
            return r4
        L30:
            com.fasterxml.jackson.databind.type.TypeFactory r3 = r3.getTypeFactory()
            java.lang.Class<?> r4 = r2._defaultImpl
            com.fasterxml.jackson.databind.JavaType r3 = r3.constructType(r4)
            return r3
        L3b:
            com.fasterxml.jackson.databind.MapperFeature r0 = com.fasterxml.jackson.databind.MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL
            boolean r3 = r3.isEnabled(r0)
            if (r3 == 0) goto L4a
            boolean r3 = r4.isAbstract()
            if (r3 != 0) goto L4a
            return r4
        L4a:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.defineDefaultImpl(com.fasterxml.jackson.databind.DeserializationConfig, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JavaType");
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    public TypeIdResolver idResolver(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, Collection<NamedType> collection, boolean z2, boolean z10) {
        TypeIdResolver typeIdResolver = this._customIdResolver;
        if (typeIdResolver != null) {
            return typeIdResolver;
        }
        JsonTypeInfo.Id id = this._idType;
        if (id == null) {
            throw new IllegalStateException(StubApp.getString2(10868));
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonTypeInfo$Id[id.ordinal()];
        if (i3 == 1 || i3 == 2) {
            return ClassNameIdResolver.construct(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i3 == 3) {
            return MinimalClassNameIdResolver.construct(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i3 == 4) {
            return TypeNameIdResolver.construct(mapperConfig, javaType, collection, z2, z10);
        }
        if (i3 == 5) {
            return null;
        }
        throw new IllegalStateException(StubApp.getString2(10867) + this._idType);
    }

    public PolymorphicTypeValidator reportInvalidBaseType(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new IllegalArgumentException(AbstractC1482f.i(StubApp.getString2(10502), ClassUtil.classNameOf(polymorphicTypeValidator), StubApp.getString2(10871), ClassUtil.classNameOf(javaType.getRawClass())));
    }

    public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    public PolymorphicTypeValidator verifyBaseTypeValidity(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator subTypeValidator = subTypeValidator(mapperConfig);
        JsonTypeInfo.Id id = this._idType;
        if (id == JsonTypeInfo.Id.CLASS || id == JsonTypeInfo.Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validateBaseType = subTypeValidator.validateBaseType(mapperConfig, javaType);
            if (validateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return reportInvalidBaseType(mapperConfig, javaType, subTypeValidator);
            }
            if (validateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.instance;
            }
        }
        return subTypeValidator;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public /* bridge */ /* synthetic */ StdTypeResolverBuilder withDefaultImpl(Class cls) {
        return withDefaultImpl2((Class<?>) cls);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* renamed from: defaultImpl, reason: avoid collision after fix types in other method */
    public StdTypeResolverBuilder defaultImpl2(Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder inclusion(JsonTypeInfo.As as) {
        if (as == null) {
            throw new IllegalArgumentException(StubApp.getString2(10869));
        }
        this._includeAs = as;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver) {
        if (id == null) {
            throw new IllegalArgumentException(StubApp.getString2(10870));
        }
        this._idType = id;
        this._customIdResolver = typeIdResolver;
        this._typeProperty = id.getDefaultPropertyName();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeIdVisibility(boolean z2) {
        this._typeIdVisible = z2;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    public StdTypeResolverBuilder typeProperty(String str) {
        if (str == null || str.isEmpty()) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder
    /* renamed from: withDefaultImpl, reason: avoid collision after fix types in other method */
    public StdTypeResolverBuilder withDefaultImpl2(Class<?> cls) {
        if (this._defaultImpl == cls) {
            return this;
        }
        ClassUtil.verifyMustOverride(StdTypeResolverBuilder.class, this, StubApp.getString2(10872));
        return new StdTypeResolverBuilder(this, cls);
    }

    public StdTypeResolverBuilder(StdTypeResolverBuilder stdTypeResolverBuilder, Class<?> cls) {
        this._typeIdVisible = false;
        this._idType = stdTypeResolverBuilder._idType;
        this._includeAs = stdTypeResolverBuilder._includeAs;
        this._typeProperty = stdTypeResolverBuilder._typeProperty;
        this._typeIdVisible = stdTypeResolverBuilder._typeIdVisible;
        this._customIdResolver = stdTypeResolverBuilder._customIdResolver;
        this._defaultImpl = cls;
    }
}
