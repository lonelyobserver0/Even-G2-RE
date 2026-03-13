package com.fasterxml.jackson.databind;

import E1.a;
import Xa.h;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.stub.StubApp;
import java.lang.reflect.Type;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DatabindContext {
    private JavaType _resolveAndValidateGeneric(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator, int i3) throws JsonMappingException {
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str.substring(0, i3));
        if (validateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        JavaType constructFromCanonical = getTypeFactory().constructFromCanonical(str);
        if (!constructFromCanonical.isTypeOrSubTypeOf(javaType.getRawClass())) {
            return (JavaType) _throwNotASubtype(javaType, str);
        }
        PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
        return (validateSubClassName == validity || polymorphicTypeValidator.validateSubType(config, javaType, constructFromCanonical) == validity) ? constructFromCanonical : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
    }

    public String _colonConcat(String str, String str2) {
        return str2 == null ? str : AbstractC1482f.h(str, StubApp.getString2(994), str2);
    }

    public final String _format(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    public String _quotedString(String str) {
        if (str == null) {
            return StubApp.getString2(10500);
        }
        String _truncate = _truncate(str);
        String string2 = StubApp.getString2(2123);
        return a.k(string2, _truncate, string2);
    }

    public <T> T _throwNotASubtype(JavaType javaType, String str) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, StubApp.getString2(10501));
    }

    public <T> T _throwSubtypeClassNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, StubApp.getString2(10502) + ClassUtil.classNameOf(polymorphicTypeValidator) + StubApp.getString2(10503));
    }

    public <T> T _throwSubtypeNameNotAllowed(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        throw invalidTypeIdException(javaType, str, StubApp.getString2(10502) + ClassUtil.classNameOf(polymorphicTypeValidator) + StubApp.getString2(10503));
    }

    public final String _truncate(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, 500) + StubApp.getString2(10504) + str.substring(str.length() - 500);
    }

    public JavaType constructType(Type type) {
        if (type == null) {
            return null;
        }
        return getTypeFactory().constructType(type);
    }

    public Converter<Object, Object> converterInstance(Annotated annotated, Object obj) throws JsonMappingException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Converter) {
            return (Converter) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException(StubApp.getString2(10507) + obj.getClass().getName() + StubApp.getString2(10508));
        }
        Class cls = (Class) obj;
        if (cls == Converter.None.class || ClassUtil.isBogusClass(cls)) {
            return null;
        }
        if (!Converter.class.isAssignableFrom(cls)) {
            throw new IllegalStateException(h.k(cls, new StringBuilder(StubApp.getString2(10505)), StubApp.getString2(10506)));
        }
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return (Converter) ClassUtil.createInstance(cls, config.canOverrideAccessModifiers());
    }

    public abstract MapperConfig<?> getConfig();

    public abstract TypeFactory getTypeFactory();

    public abstract JsonMappingException invalidTypeIdException(JavaType javaType, String str, String str2);

    public ObjectIdGenerator<?> objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectIdInfo) throws JsonMappingException {
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        return ((ObjectIdGenerator) ClassUtil.createInstance(generatorType, config.canOverrideAccessModifiers())).forScope(objectIdInfo.getScope());
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectIdInfo) {
        Class<? extends ObjectIdResolver> resolverType = objectIdInfo.getResolverType();
        MapperConfig<?> config = getConfig();
        config.getHandlerInstantiator();
        if (ClassUtil.createInstance(resolverType, config.canOverrideAccessModifiers()) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    public abstract <T> T reportBadDefinition(JavaType javaType, String str) throws JsonMappingException;

    public <T> T reportBadDefinition(Class<?> cls, String str) throws JsonMappingException {
        return (T) reportBadDefinition(constructType(cls), str);
    }

    public JavaType resolveAndValidateSubType(JavaType javaType, String str, PolymorphicTypeValidator polymorphicTypeValidator) throws JsonMappingException {
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            return _resolveAndValidateGeneric(javaType, str, polymorphicTypeValidator, indexOf);
        }
        MapperConfig<?> config = getConfig();
        PolymorphicTypeValidator.Validity validateSubClassName = polymorphicTypeValidator.validateSubClassName(config, javaType, str);
        if (validateSubClassName == PolymorphicTypeValidator.Validity.DENIED) {
            return (JavaType) _throwSubtypeNameNotAllowed(javaType, str, polymorphicTypeValidator);
        }
        try {
            Class<?> findClass = getTypeFactory().findClass(str);
            if (!javaType.isTypeOrSuperTypeOf(findClass)) {
                return (JavaType) _throwNotASubtype(javaType, str);
            }
            JavaType constructSpecializedType = config.getTypeFactory().constructSpecializedType(javaType, findClass);
            return (validateSubClassName != PolymorphicTypeValidator.Validity.INDETERMINATE || polymorphicTypeValidator.validateSubType(config, javaType, constructSpecializedType) == PolymorphicTypeValidator.Validity.ALLOWED) ? constructSpecializedType : (JavaType) _throwSubtypeClassNotAllowed(javaType, str, polymorphicTypeValidator);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            throw invalidTypeIdException(javaType, str, AbstractC1482f.i(StubApp.getString2(10509), e10.getClass().getName(), StubApp.getString2(3046), ClassUtil.exceptionMessage(e10)));
        }
    }
}
