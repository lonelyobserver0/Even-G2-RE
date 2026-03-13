package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class StdSerializer<T> extends JsonSerializer<T> implements Serializable {
    private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
    protected final Class<T> _handledType;

    public StdSerializer(Class<T> cls) {
        this._handledType = cls;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final boolean _nonEmpty(Collection<?> collection) {
        return (collection == null || collection.isEmpty()) ? false : true;
    }

    public JsonSerializer<?> findAnnotatedContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        Object findContentSerializer;
        if (beanProperty == null) {
            return null;
        }
        AnnotatedMember member = beanProperty.getMember();
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (member == null || (findContentSerializer = annotationIntrospector.findContentSerializer(member)) == null) {
            return null;
        }
        return serializerProvider.serializerInstance(member, findContentSerializer);
    }

    public JsonSerializer<?> findContextualConvertingSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        Object obj = KEY_CONTENT_CONVERTER_LOCK;
        Map map = (Map) serializerProvider.getAttribute(obj);
        if (map == null) {
            map = new IdentityHashMap();
            serializerProvider.setAttribute(obj, map);
        } else if (map.get(beanProperty) != null) {
            return jsonSerializer;
        }
        map.put(beanProperty, Boolean.TRUE);
        try {
            JsonSerializer<?> findConvertingContentSerializer = findConvertingContentSerializer(serializerProvider, beanProperty, jsonSerializer);
            return findConvertingContentSerializer != null ? serializerProvider.handleSecondaryContextualization(findConvertingContentSerializer, beanProperty) : jsonSerializer;
        } finally {
            map.remove(beanProperty);
        }
    }

    @Deprecated
    public JsonSerializer<?> findConvertingContentSerializer(SerializerProvider serializerProvider, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        AnnotatedMember member;
        Object findSerializationContentConverter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (findSerializationContentConverter = annotationIntrospector.findSerializationContentConverter(member)) == null) {
            return jsonSerializer;
        }
        Converter<Object, Object> converterInstance = serializerProvider.converterInstance(beanProperty.getMember(), findSerializationContentConverter);
        JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
        if (jsonSerializer == null && !outputType.isJavaLangObject()) {
            jsonSerializer = serializerProvider.findValueSerializer(outputType);
        }
        return new StdDelegatingSerializer(converterInstance, outputType, jsonSerializer);
    }

    public Boolean findFormatFeature(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, cls);
        if (findFormatOverrides != null) {
            return findFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(serializerProvider.getConfig(), cls) : serializerProvider.getDefaultPropertyFormat(cls);
    }

    public JsonInclude.Value findIncludeOverrides(SerializerProvider serializerProvider, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyInclusion(serializerProvider.getConfig(), cls) : serializerProvider.getDefaultPropertyInclusion(cls);
    }

    public PropertyFilter findPropertyFilter(SerializerProvider serializerProvider, Object obj, Object obj2) throws JsonMappingException {
        serializerProvider.getFilterProvider();
        if (serializerProvider.reportBadDefinition((Class<?>) handledType(), "Cannot resolve PropertyFilter with id '" + obj + "'; no FilterProvider configured") == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public Class<T> handledType() {
        return this._handledType;
    }

    public boolean isDefaultSerializer(JsonSerializer<?> jsonSerializer) {
        return ClassUtil.isJacksonStdImpl(jsonSerializer);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public abstract void serialize(T t3, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, String str) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z2 = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z2 || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z2) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, str);
    }

    public StdSerializer(JavaType javaType) {
        this._handledType = (Class<T>) javaType.getRawClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StdSerializer(Class<?> cls, boolean z2) {
        this._handledType = cls;
    }

    public StdSerializer(StdSerializer<?> stdSerializer) {
        this._handledType = (Class<T>) stdSerializer._handledType;
    }

    public void wrapAndThrow(SerializerProvider serializerProvider, Throwable th, Object obj, int i3) throws IOException {
        while ((th instanceof InvocationTargetException) && th.getCause() != null) {
            th = th.getCause();
        }
        ClassUtil.throwIfError(th);
        boolean z2 = serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS);
        if (th instanceof IOException) {
            if (!z2 || !(th instanceof JacksonException)) {
                throw ((IOException) th);
            }
        } else if (!z2) {
            ClassUtil.throwIfRTE(th);
        }
        throw JsonMappingException.wrapWithPath(th, obj, i3);
    }
}
