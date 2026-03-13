package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.mapbox.common.b;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PropertyBuilder {
    private static final Object NO_DEFAULT_MARKER = Boolean.FALSE;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final JsonInclude.Value _defaultInclusion;
    protected final boolean _useRealPropertyDefaults;

    /* renamed from: com.fasterxml.jackson.databind.ser.PropertyBuilder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public PropertyBuilder(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        this._config = serializationConfig;
        this._beanDesc = beanDescription;
        JsonInclude.Value merge = JsonInclude.Value.merge(beanDescription.findPropertyInclusion(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(beanDescription.getBeanClass(), JsonInclude.Value.empty()));
        this._defaultInclusion = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), merge);
        this._useRealPropertyDefaults = merge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT;
        this._annotationIntrospector = serializationConfig.getAnnotationIntrospector();
    }

    public BeanPropertyWriter _constructPropertyWriter(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z2, Object obj, Class<?>[] clsArr) throws JsonMappingException {
        return new BeanPropertyWriter(beanPropertyDefinition, annotatedMember, annotations, javaType, jsonSerializer, typeSerializer, javaType2, z2, obj, clsArr);
    }

    public Object _throwWrapped(Exception exc, String str, Object obj) {
        Exception exc2 = exc;
        while (exc2.getCause() != null) {
            exc2 = exc2.getCause();
        }
        ClassUtil.throwIfError(exc2);
        ClassUtil.throwIfRTE(exc2);
        StringBuilder l9 = b.l(StubApp.getString2(10996), str, StubApp.getString2(10997));
        l9.append(obj.getClass().getName());
        l9.append(StubApp.getString2(10998));
        throw new IllegalArgumentException(l9.toString());
    }

    public BeanPropertyWriter buildWriter(SerializerProvider serializerProvider, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, TypeSerializer typeSerializer2, AnnotatedMember annotatedMember, boolean z2) throws JsonMappingException {
        Object defaultBean;
        boolean z10;
        try {
            JavaType findSerializationType = findSerializationType(annotatedMember, z2, javaType);
            if (typeSerializer2 != null) {
                if (findSerializationType == null) {
                    findSerializationType = javaType;
                }
                if (findSerializationType.getContentType() == null) {
                    serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, StubApp.getString2(10999) + findSerializationType + StubApp.getString2(11000), new Object[0]);
                }
                findSerializationType = findSerializationType.withContentTypeHandler(typeSerializer2);
                findSerializationType.getContentType();
            }
            JavaType javaType2 = findSerializationType;
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember accessor = beanPropertyDefinition.getAccessor();
            if (accessor == null) {
                return (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, StubApp.getString2(11001), new Object[0]);
            }
            JsonInclude.Value withOverrides = this._config.getDefaultInclusion(javaType3.getRawClass(), accessor.getRawType(), this._defaultInclusion).withOverrides(beanPropertyDefinition.findInclusion());
            JsonInclude.Include valueInclusion = withOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[valueInclusion.ordinal()];
            Object obj = null;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            r1 = i3 == 5;
                            SerializationFeature serializationFeature = SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
                            if (javaType3.isContainerType() && !this._config.isEnabled(serializationFeature)) {
                                obj = BeanPropertyWriter.MARKER_FOR_EMPTY;
                            }
                        } else {
                            obj = serializerProvider.includeFilterInstance(beanPropertyDefinition, withOverrides.getValueFilter());
                        }
                        z10 = r1;
                    } else {
                        obj = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    }
                } else if (javaType3.isReferenceType()) {
                    obj = BeanPropertyWriter.MARKER_FOR_EMPTY;
                }
                z10 = true;
            } else {
                if (!this._useRealPropertyDefaults || (defaultBean = getDefaultBean()) == null) {
                    obj = BeanUtil.getDefaultValue(javaType3);
                    r1 = true;
                } else {
                    if (serializerProvider.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this._config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        obj = annotatedMember.getValue(defaultBean);
                    } catch (Exception e10) {
                        _throwWrapped(e10, beanPropertyDefinition.getName(), defaultBean);
                    }
                }
                if (obj != null) {
                    if (obj.getClass().isArray()) {
                        obj = ArrayBuilders.getArrayComparator(obj);
                    }
                    z10 = r1;
                }
                z10 = true;
            }
            Object obj2 = obj;
            Class<?>[] findViews = beanPropertyDefinition.findViews();
            if (findViews == null) {
                findViews = this._beanDesc.findDefaultViews();
            }
            BeanPropertyWriter _constructPropertyWriter = _constructPropertyWriter(beanPropertyDefinition, annotatedMember, this._beanDesc.getClassAnnotations(), javaType, jsonSerializer, typeSerializer, javaType2, z10, obj2, findViews);
            Object findNullSerializer = this._annotationIntrospector.findNullSerializer(annotatedMember);
            if (findNullSerializer != null) {
                _constructPropertyWriter.assignNullSerializer(serializerProvider.serializerInstance(annotatedMember, findNullSerializer));
            }
            NameTransformer findUnwrappingNameTransformer = this._annotationIntrospector.findUnwrappingNameTransformer(annotatedMember);
            return findUnwrappingNameTransformer != null ? _constructPropertyWriter.unwrappingWriter(findUnwrappingNameTransformer) : _constructPropertyWriter;
        } catch (JsonMappingException e11) {
            return beanPropertyDefinition == null ? (BeanPropertyWriter) serializerProvider.reportBadDefinition(javaType, ClassUtil.exceptionMessage(e11)) : (BeanPropertyWriter) serializerProvider.reportBadPropertyDefinition(this._beanDesc, beanPropertyDefinition, ClassUtil.exceptionMessage(e11), new Object[0]);
        }
    }

    public JavaType findSerializationType(Annotated annotated, boolean z2, JavaType javaType) throws JsonMappingException {
        JavaType refineSerializationType = this._annotationIntrospector.refineSerializationType(this._config, annotated, javaType);
        if (refineSerializationType != javaType) {
            Class<?> rawClass = refineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException(StubApp.getString2(11002) + annotated.getName() + StubApp.getString2(11003) + rawClass.getName() + StubApp.getString2(11004) + rawClass2.getName());
            }
            javaType = refineSerializationType;
            z2 = true;
        }
        JsonSerialize.Typing findSerializationTyping = this._annotationIntrospector.findSerializationTyping(annotated);
        if (findSerializationTyping != null && findSerializationTyping != JsonSerialize.Typing.DEFAULT_TYPING) {
            z2 = findSerializationTyping == JsonSerialize.Typing.STATIC;
        }
        if (z2) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    public Object getDefaultBean() {
        Object obj = this._defaultBean;
        if (obj == null) {
            obj = this._beanDesc.instantiateBean(this._config.canOverrideAccessModifiers());
            if (obj == null) {
                obj = NO_DEFAULT_MARKER;
            }
            this._defaultBean = obj;
        }
        if (obj == NO_DEFAULT_MARKER) {
            return null;
        }
        return this._defaultBean;
    }
}
