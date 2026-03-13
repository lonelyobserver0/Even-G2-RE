package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.std.AtomicReferenceSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToEmptyObjectSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.mapbox.common.b;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BasicSerializerFactory extends SerializerFactory implements Serializable {
    protected static final HashMap<String, JsonSerializer<?>> _concrete;
    protected static final HashMap<String, Class<? extends JsonSerializer<?>>> _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    /* renamed from: com.fasterxml.jackson.databind.ser.BasicSerializerFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;
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
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[JsonInclude.Include.USE_DEFAULTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonFormat.Shape.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = iArr2;
            try {
                iArr2[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        HashMap<String, Class<? extends JsonSerializer<?>>> hashMap = new HashMap<>();
        HashMap<String, JsonSerializer<?>> hashMap2 = new HashMap<>();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.instance;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        NumberSerializers.addAll(hashMap2);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new NumberSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new NumberSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.instance);
        hashMap2.put(Date.class.getName(), DateSerializer.instance);
        for (Map.Entry<Class<?>, Object> entry : StdJdkSerializers.all()) {
            Object value = entry.getValue();
            if (value instanceof JsonSerializer) {
                hashMap2.put(entry.getKey().getName(), (JsonSerializer) value);
            } else {
                hashMap.put(entry.getKey().getName(), (Class) value);
            }
        }
        hashMap.put(TokenBuffer.class.getName(), TokenBufferSerializer.class);
        _concrete = hashMap2;
        _concreteLazy = hashMap;
    }

    public BasicSerializerFactory(SerializerFactoryConfig serializerFactoryConfig) {
        this._factoryConfig = serializerFactoryConfig == null ? new SerializerFactoryConfig() : serializerFactoryConfig;
    }

    public MapSerializer _checkMapContentInclusion(SerializerProvider serializerProvider, BeanDescription beanDescription, MapSerializer mapSerializer) throws JsonMappingException {
        JavaType contentType = mapSerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        Object obj = null;
        boolean z2 = true;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return !serializerProvider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES) ? mapSerializer.withContentInclusion(null, true) : mapSerializer;
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        if (i3 == 1) {
            obj = BeanUtil.getDefaultValue(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i3 != 2) {
            if (i3 == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i3 == 4 && (obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter())) != null) {
                z2 = serializerProvider.includeFilterSuppressNulls(obj);
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapSerializer.withContentInclusion(obj, z2);
    }

    public JsonSerializer<Object> _findContentSerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findContentSerializer = serializerProvider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (findContentSerializer != null) {
            return serializerProvider.serializerInstance(annotated, findContentSerializer);
        }
        return null;
    }

    public JsonInclude.Value _findInclusionWithContent(SerializerProvider serializerProvider, BeanDescription beanDescription, JavaType javaType, Class<?> cls) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        JsonInclude.Value defaultPropertyInclusion = config.getDefaultPropertyInclusion(cls, beanDescription.findPropertyInclusion(config.getDefaultPropertyInclusion()));
        JsonInclude.Value defaultPropertyInclusion2 = config.getDefaultPropertyInclusion(javaType.getRawClass(), null);
        if (defaultPropertyInclusion2 != null) {
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[defaultPropertyInclusion2.getValueInclusion().ordinal()];
            if (i3 == 4) {
                return defaultPropertyInclusion.withContentFilter(defaultPropertyInclusion2.getContentFilter());
            }
            if (i3 != 6) {
                return defaultPropertyInclusion.withContentInclusion(defaultPropertyInclusion2.getValueInclusion());
            }
        }
        return defaultPropertyInclusion;
    }

    public JsonSerializer<Object> _findKeySerializer(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findKeySerializer = serializerProvider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (findKeySerializer != null) {
            return serializerProvider.serializerInstance(annotated, findKeySerializer);
        }
        return null;
    }

    public JsonSerializer<?> buildArraySerializer(SerializerProvider serializerProvider, ArrayType arrayType, BeanDescription beanDescription, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        ArrayType arrayType2;
        TypeSerializer typeSerializer2;
        JsonSerializer<Object> jsonSerializer2;
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializer3 = null;
        while (true) {
            if (!it.hasNext()) {
                arrayType2 = arrayType;
                typeSerializer2 = typeSerializer;
                jsonSerializer2 = jsonSerializer;
                break;
            }
            arrayType2 = arrayType;
            BeanDescription beanDescription2 = beanDescription;
            typeSerializer2 = typeSerializer;
            jsonSerializer2 = jsonSerializer;
            jsonSerializer3 = it.next().findArraySerializer(config, arrayType2, beanDescription2, typeSerializer2, jsonSerializer2);
            if (jsonSerializer3 != null) {
                break;
            }
            arrayType = arrayType2;
            beanDescription = beanDescription2;
            typeSerializer = typeSerializer2;
            jsonSerializer = jsonSerializer2;
        }
        if (jsonSerializer3 == null) {
            Class<?> rawClass = arrayType2.getRawClass();
            if (jsonSerializer2 == null || ClassUtil.isJacksonStdImpl(jsonSerializer2)) {
                jsonSerializer3 = String[].class == rawClass ? StringArraySerializer.instance : StdArraySerializers.findStandardImpl(rawClass);
            }
            if (jsonSerializer3 == null) {
                jsonSerializer3 = new ObjectArraySerializer(arrayType2.getContentType(), z2, typeSerializer2, jsonSerializer2);
            }
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
        }
        return jsonSerializer3;
    }

    public JsonSerializer<?> buildAtomicReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        boolean z10;
        JavaType referencedType = referenceType.getReferencedType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, referencedType, AtomicReference.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        Object obj = null;
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            z10 = false;
        } else {
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
            z10 = true;
            if (i3 == 1) {
                obj = BeanUtil.getDefaultValue(referencedType);
                if (obj != null && obj.getClass().isArray()) {
                    obj = ArrayBuilders.getArrayComparator(obj);
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    obj = MapSerializer.MARKER_FOR_EMPTY;
                } else if (i3 == 4 && (obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter())) != null) {
                    z10 = serializerProvider.includeFilterSuppressNulls(obj);
                }
            } else if (referencedType.isReferenceType()) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            }
        }
        return new AtomicReferenceSerializer(referenceType, z2, typeSerializer, jsonSerializer).withContentInclusion(obj, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> buildCollectionSerializer(com.fasterxml.jackson.databind.SerializerProvider r9, com.fasterxml.jackson.databind.type.CollectionType r10, com.fasterxml.jackson.databind.BeanDescription r11, boolean r12, com.fasterxml.jackson.databind.jsontype.TypeSerializer r13, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r14) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.SerializationConfig r1 = r9.getConfig()
            java.lang.Iterable r0 = r8.customSerializers()
            java.util.Iterator r6 = r0.iterator()
            r7 = 0
            r0 = r7
        Le:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r0 = r6.next()
            com.fasterxml.jackson.databind.ser.Serializers r0 = (com.fasterxml.jackson.databind.ser.Serializers) r0
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            com.fasterxml.jackson.databind.JsonSerializer r0 = r0.findCollectionSerializer(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L25
            goto L2e
        L25:
            r10 = r2
            r11 = r3
            r13 = r4
            r14 = r5
            goto Le
        L2a:
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
        L2e:
            if (r0 != 0) goto L9a
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.findSerializerByAnnotations(r9, r2, r3)
            if (r0 != 0) goto L9a
            com.fasterxml.jackson.annotation.JsonFormat$Value r9 = r3.findExpectedFormat(r7)
            com.fasterxml.jackson.annotation.JsonFormat$Shape r9 = r9.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r10 = com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT
            if (r9 != r10) goto L43
            return r7
        L43:
            java.lang.Class r9 = r2.getRawClass()
            java.lang.Class<java.util.EnumSet> r10 = java.util.EnumSet.class
            boolean r10 = r10.isAssignableFrom(r9)
            if (r10 == 0) goto L60
            com.fasterxml.jackson.databind.JavaType r9 = r2.getContentType()
            boolean r10 = r9.isEnumImplType()
            if (r10 != 0) goto L5a
            goto L5b
        L5a:
            r7 = r9
        L5b:
            com.fasterxml.jackson.databind.JsonSerializer r0 = r8.buildEnumSetSerializer(r7)
            goto L9a
        L60:
            com.fasterxml.jackson.databind.JavaType r10 = r2.getContentType()
            java.lang.Class r10 = r10.getRawClass()
            boolean r9 = r8.isIndexedList(r9)
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            if (r9 == 0) goto L85
            if (r10 != r11) goto L7c
            boolean r9 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(r5)
            if (r9 == 0) goto L90
            com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer r9 = com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer.instance
        L7a:
            r0 = r9
            goto L90
        L7c:
            com.fasterxml.jackson.databind.JavaType r9 = r2.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r9 = r8.buildIndexedListSerializer(r9, r12, r4, r5)
            goto L7a
        L85:
            if (r10 != r11) goto L90
            boolean r9 = com.fasterxml.jackson.databind.util.ClassUtil.isJacksonStdImpl(r5)
            if (r9 == 0) goto L90
            com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer r9 = com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer.instance
            goto L7a
        L90:
            if (r0 != 0) goto L9a
            com.fasterxml.jackson.databind.JavaType r9 = r2.getContentType()
            com.fasterxml.jackson.databind.ser.ContainerSerializer r0 = r8.buildCollectionSerializer(r9, r12, r4, r5)
        L9a:
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r9 = r8._factoryConfig
            boolean r9 = r9.hasSerializerModifiers()
            if (r9 == 0) goto Lb8
            com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig r9 = r8._factoryConfig
            java.lang.Iterable r9 = r9.serializerModifiers()
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r9.hasNext()
            if (r10 != 0) goto Lb3
            goto Lb8
        Lb3:
            java.lang.ClassCastException r9 = com.mapbox.common.b.e(r9)
            throw r9
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.BasicSerializerFactory.buildCollectionSerializer(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.type.CollectionType, com.fasterxml.jackson.databind.BeanDescription, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public JsonSerializer<?> buildContainerSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        SerializationConfig config = serializerProvider.getConfig();
        if (!z2 && javaType.useStaticType() && (!javaType.isContainerType() || !javaType.getContentType().isJavaLangObject())) {
            z2 = true;
        }
        TypeSerializer createTypeSerializer = createTypeSerializer(config, javaType.getContentType());
        if (createTypeSerializer != null) {
            z2 = false;
        }
        boolean z10 = z2;
        JsonSerializer<Object> _findContentSerializer = _findContentSerializer(serializerProvider, beanDescription.getClassInfo());
        JsonSerializer<?> jsonSerializer = null;
        if (javaType.isMapLikeType()) {
            MapLikeType mapLikeType = (MapLikeType) javaType;
            JsonSerializer<Object> _findKeySerializer = _findKeySerializer(serializerProvider, beanDescription.getClassInfo());
            if (mapLikeType instanceof MapType) {
                return buildMapSerializer(serializerProvider, (MapType) mapLikeType, beanDescription, z10, _findKeySerializer, createTypeSerializer, _findContentSerializer);
            }
            BeanDescription beanDescription2 = beanDescription;
            Iterator<Serializers> it = customSerializers().iterator();
            while (it.hasNext()) {
                BeanDescription beanDescription3 = beanDescription2;
                jsonSerializer = it.next().findMapLikeSerializer(config, mapLikeType, beanDescription3, _findKeySerializer, createTypeSerializer, _findContentSerializer);
                beanDescription2 = beanDescription3;
                if (jsonSerializer != null) {
                    break;
                }
            }
            if (jsonSerializer == null) {
                jsonSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription2);
            }
            if (jsonSerializer == null || !this._factoryConfig.hasSerializerModifiers()) {
                return jsonSerializer;
            }
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
            return jsonSerializer;
        }
        BeanDescription beanDescription4 = beanDescription;
        if (!javaType.isCollectionLikeType()) {
            if (javaType.isArrayType()) {
                return buildArraySerializer(serializerProvider, (ArrayType) javaType, beanDescription4, z10, createTypeSerializer, _findContentSerializer);
            }
            return null;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
        if (collectionLikeType instanceof CollectionType) {
            return buildCollectionSerializer(serializerProvider, (CollectionType) collectionLikeType, beanDescription4, z10, createTypeSerializer, _findContentSerializer);
        }
        Iterator<Serializers> it3 = customSerializers().iterator();
        while (it3.hasNext()) {
            BeanDescription beanDescription5 = beanDescription4;
            jsonSerializer = it3.next().findCollectionLikeSerializer(config, collectionLikeType, beanDescription5, createTypeSerializer, _findContentSerializer);
            beanDescription4 = beanDescription5;
            if (jsonSerializer != null) {
                break;
            }
        }
        if (jsonSerializer == null) {
            jsonSerializer = findSerializerByAnnotations(serializerProvider, javaType, beanDescription4);
        }
        if (jsonSerializer == null || !this._factoryConfig.hasSerializerModifiers()) {
            return jsonSerializer;
        }
        Iterator<BeanSerializerModifier> it4 = this._factoryConfig.serializerModifiers().iterator();
        if (it4.hasNext()) {
            throw b.e(it4);
        }
        return jsonSerializer;
    }

    public JsonSerializer<?> buildEnumSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonFormat.Value findExpectedFormat = beanDescription.findExpectedFormat(null);
        if (findExpectedFormat.getShape() == JsonFormat.Shape.OBJECT) {
            ((BasicBeanDescription) beanDescription).removeProperty("declaringClass");
            return null;
        }
        EnumSerializer construct = EnumSerializer.construct(javaType.getRawClass(), serializationConfig, beanDescription, findExpectedFormat);
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it = this._factoryConfig.serializerModifiers().iterator();
            if (it.hasNext()) {
                throw b.e(it);
            }
        }
        return construct;
    }

    public JsonSerializer<?> buildEnumSetSerializer(JavaType javaType) {
        return new EnumSetSerializer(javaType);
    }

    public ContainerSerializer<?> buildIndexedListSerializer(JavaType javaType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new IndexedListSerializer(javaType, z2, typeSerializer, jsonSerializer);
    }

    public JsonSerializer<?> buildIterableSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z2, JavaType javaType2) throws JsonMappingException {
        return new IterableSerializer(javaType2, z2, createTypeSerializer(serializationConfig, javaType2));
    }

    public JsonSerializer<?> buildIteratorSerializer(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z2, JavaType javaType2) throws JsonMappingException {
        return new IteratorSerializer(javaType2, z2, createTypeSerializer(serializationConfig, javaType2));
    }

    public JsonSerializer<?> buildMapEntrySerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2, JavaType javaType2, JavaType javaType3) throws JsonMappingException {
        Object obj = null;
        if (JsonFormat.Value.merge(beanDescription.findExpectedFormat(null), serializerProvider.getDefaultPropertyFormat(Map.Entry.class)).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        MapEntrySerializer mapEntrySerializer = new MapEntrySerializer(javaType3, javaType2, javaType3, z2, createTypeSerializer(serializerProvider.getConfig(), javaType3), null);
        JavaType contentType = mapEntrySerializer.getContentType();
        JsonInclude.Value _findInclusionWithContent = _findInclusionWithContent(serializerProvider, beanDescription, contentType, Map.Entry.class);
        JsonInclude.Include contentInclusion = _findInclusionWithContent == null ? JsonInclude.Include.USE_DEFAULTS : _findInclusionWithContent.getContentInclusion();
        if (contentInclusion == JsonInclude.Include.USE_DEFAULTS || contentInclusion == JsonInclude.Include.ALWAYS) {
            return mapEntrySerializer;
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[contentInclusion.ordinal()];
        boolean z10 = true;
        if (i3 == 1) {
            obj = BeanUtil.getDefaultValue(contentType);
            if (obj != null && obj.getClass().isArray()) {
                obj = ArrayBuilders.getArrayComparator(obj);
            }
        } else if (i3 != 2) {
            if (i3 == 3) {
                obj = MapSerializer.MARKER_FOR_EMPTY;
            } else if (i3 == 4 && (obj = serializerProvider.includeFilterInstance(null, _findInclusionWithContent.getContentFilter())) != null) {
                z10 = serializerProvider.includeFilterSuppressNulls(obj);
            }
        } else if (contentType.isReferenceType()) {
            obj = MapSerializer.MARKER_FOR_EMPTY;
        }
        return mapEntrySerializer.withContentInclusion(obj, z10);
    }

    public JsonSerializer<?> buildMapSerializer(SerializerProvider serializerProvider, MapType mapType, BeanDescription beanDescription, boolean z2, JsonSerializer<Object> jsonSerializer, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer2) throws JsonMappingException {
        if (beanDescription.findExpectedFormat(null).getShape() == JsonFormat.Shape.OBJECT) {
            return null;
        }
        SerializationConfig config = serializerProvider.getConfig();
        Iterator<Serializers> it = customSerializers().iterator();
        JsonSerializer<?> jsonSerializer3 = null;
        while (it.hasNext() && (jsonSerializer3 = it.next().findMapSerializer(config, mapType, beanDescription, jsonSerializer, typeSerializer, jsonSerializer2)) == null) {
        }
        if (jsonSerializer3 == null && (jsonSerializer3 = findSerializerByAnnotations(serializerProvider, mapType, beanDescription)) == null) {
            Object findFilterId = findFilterId(config, beanDescription);
            JsonIgnoreProperties.Value defaultPropertyIgnorals = config.getDefaultPropertyIgnorals(Map.class, beanDescription.getClassInfo());
            Set<String> findIgnoredForSerialization = defaultPropertyIgnorals == null ? null : defaultPropertyIgnorals.findIgnoredForSerialization();
            JsonIncludeProperties.Value defaultPropertyInclusions = config.getDefaultPropertyInclusions(Map.class, beanDescription.getClassInfo());
            jsonSerializer3 = _checkMapContentInclusion(serializerProvider, beanDescription, MapSerializer.construct(findIgnoredForSerialization, defaultPropertyInclusions != null ? defaultPropertyInclusions.getIncluded() : null, mapType, z2, typeSerializer, jsonSerializer, jsonSerializer2, findFilterId));
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
        }
        return jsonSerializer3;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public JsonSerializer<Object> createKeySerializer(SerializerProvider serializerProvider, JavaType javaType, JsonSerializer<Object> jsonSerializer) throws JsonMappingException {
        JsonSerializer<?> jsonSerializer2;
        SerializationConfig config = serializerProvider.getConfig();
        BeanDescription introspect = config.introspect(javaType);
        if (this._factoryConfig.hasKeySerializers()) {
            Iterator<Serializers> it = this._factoryConfig.keySerializers().iterator();
            jsonSerializer2 = null;
            while (it.hasNext() && (jsonSerializer2 = it.next().findSerializer(config, javaType, introspect)) == null) {
            }
        } else {
            jsonSerializer2 = null;
        }
        if (jsonSerializer2 == null) {
            JsonSerializer<Object> _findKeySerializer = _findKeySerializer(serializerProvider, introspect.getClassInfo());
            if (_findKeySerializer == null) {
                if (jsonSerializer == null) {
                    _findKeySerializer = StdKeySerializers.getStdKeySerializer(config, javaType.getRawClass(), false);
                    if (_findKeySerializer == null) {
                        AnnotatedMember findJsonKeyAccessor = introspect.findJsonKeyAccessor();
                        if (findJsonKeyAccessor == null) {
                            findJsonKeyAccessor = introspect.findJsonValueAccessor();
                        }
                        if (findJsonKeyAccessor != null) {
                            JsonSerializer<Object> createKeySerializer = createKeySerializer(serializerProvider, findJsonKeyAccessor.getType(), jsonSerializer);
                            if (config.canOverrideAccessModifiers()) {
                                ClassUtil.checkAndFixAccess(findJsonKeyAccessor.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                            }
                            jsonSerializer = new JsonValueSerializer(findJsonKeyAccessor, null, createKeySerializer);
                        } else {
                            jsonSerializer = StdKeySerializers.getFallbackKeySerializer(config, javaType.getRawClass());
                        }
                    }
                }
            }
            jsonSerializer = _findKeySerializer;
        } else {
            jsonSerializer = jsonSerializer2;
        }
        if (this._factoryConfig.hasSerializerModifiers()) {
            Iterator<BeanSerializerModifier> it2 = this._factoryConfig.serializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
        }
        return jsonSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.SerializerFactory
    public TypeSerializer createTypeSerializer(SerializationConfig serializationConfig, JavaType javaType) {
        Collection<NamedType> collectAndResolveSubtypesByClass;
        AnnotatedClass classInfo = serializationConfig.introspectClassAnnotations(javaType.getRawClass()).getClassInfo();
        TypeResolverBuilder<?> findTypeResolver = serializationConfig.getAnnotationIntrospector().findTypeResolver(serializationConfig, classInfo, javaType);
        if (findTypeResolver == null) {
            findTypeResolver = serializationConfig.getDefaultTyper(javaType);
            collectAndResolveSubtypesByClass = null;
        } else {
            collectAndResolveSubtypesByClass = serializationConfig.getSubtypeResolver().collectAndResolveSubtypesByClass(serializationConfig, classInfo);
        }
        if (findTypeResolver == null) {
            return null;
        }
        return findTypeResolver.buildTypeSerializer(serializationConfig, javaType, collectAndResolveSubtypesByClass);
    }

    public abstract Iterable<Serializers> customSerializers();

    public Converter<Object, Object> findConverter(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializationConverter = serializerProvider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (findSerializationConverter == null) {
            return null;
        }
        return serializerProvider.converterInstance(annotated, findSerializationConverter);
    }

    public JsonSerializer<?> findConvertingSerializer(SerializerProvider serializerProvider, Annotated annotated, JsonSerializer<?> jsonSerializer) throws JsonMappingException {
        Converter<Object, Object> findConverter = findConverter(serializerProvider, annotated);
        return findConverter == null ? jsonSerializer : new StdDelegatingSerializer(findConverter, findConverter.getOutputType(serializerProvider.getTypeFactory()), jsonSerializer);
    }

    public Object findFilterId(SerializationConfig serializationConfig, BeanDescription beanDescription) {
        return serializationConfig.getAnnotationIntrospector().findFilterId(beanDescription.getClassInfo());
    }

    public JsonSerializer<?> findOptionalStdSerializer(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        return OptionalHandlerFactory.instance.findSerializer(serializerProvider.getConfig(), javaType, beanDescription);
    }

    public JsonSerializer<?> findReferenceSerializer(SerializerProvider serializerProvider, ReferenceType referenceType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        JavaType contentType = referenceType.getContentType();
        TypeSerializer typeSerializer = (TypeSerializer) contentType.getTypeHandler();
        SerializationConfig config = serializerProvider.getConfig();
        if (typeSerializer == null) {
            typeSerializer = createTypeSerializer(config, contentType);
        }
        TypeSerializer typeSerializer2 = typeSerializer;
        JsonSerializer<Object> jsonSerializer = (JsonSerializer) contentType.getValueHandler();
        Iterator<Serializers> it = customSerializers().iterator();
        while (it.hasNext()) {
            ReferenceType referenceType2 = referenceType;
            BeanDescription beanDescription2 = beanDescription;
            JsonSerializer<?> findReferenceSerializer = it.next().findReferenceSerializer(config, referenceType2, beanDescription2, typeSerializer2, jsonSerializer);
            if (findReferenceSerializer != null) {
                return findReferenceSerializer;
            }
            referenceType = referenceType2;
            beanDescription = beanDescription2;
        }
        ReferenceType referenceType3 = referenceType;
        BeanDescription beanDescription3 = beanDescription;
        if (referenceType3.isTypeOrSubTypeOf(AtomicReference.class)) {
            return buildAtomicReferenceSerializer(serializerProvider, referenceType3, beanDescription3, z2, typeSerializer2, jsonSerializer);
        }
        return null;
    }

    public final JsonSerializer<?> findSerializerByAddonType(SerializationConfig serializationConfig, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        Class<?> rawClass = javaType.getRawClass();
        if (Iterator.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterator.class);
            return buildIteratorSerializer(serializationConfig, javaType, beanDescription, z2, (findTypeParameters == null || findTypeParameters.length != 1) ? TypeFactory.unknownType() : findTypeParameters[0]);
        }
        if (Iterable.class.isAssignableFrom(rawClass)) {
            JavaType[] findTypeParameters2 = serializationConfig.getTypeFactory().findTypeParameters(javaType, Iterable.class);
            return buildIterableSerializer(serializationConfig, javaType, beanDescription, z2, (findTypeParameters2 == null || findTypeParameters2.length != 1) ? TypeFactory.unknownType() : findTypeParameters2[0]);
        }
        if (CharSequence.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        return null;
    }

    public final JsonSerializer<?> findSerializerByAnnotations(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        if (JsonSerializable.class.isAssignableFrom(javaType.getRawClass())) {
            return SerializableSerializer.instance;
        }
        AnnotatedMember findJsonValueAccessor = beanDescription.findJsonValueAccessor();
        if (findJsonValueAccessor == null) {
            return null;
        }
        if (serializerProvider.canOverrideAccessModifiers()) {
            ClassUtil.checkAndFixAccess(findJsonValueAccessor.getMember(), serializerProvider.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        JavaType type = findJsonValueAccessor.getType();
        JsonSerializer<Object> findSerializerFromAnnotation = findSerializerFromAnnotation(serializerProvider, findJsonValueAccessor);
        if (findSerializerFromAnnotation == null) {
            findSerializerFromAnnotation = (JsonSerializer) type.getValueHandler();
        }
        TypeSerializer typeSerializer = (TypeSerializer) type.getTypeHandler();
        if (typeSerializer == null) {
            typeSerializer = createTypeSerializer(serializerProvider.getConfig(), type);
        }
        return new JsonValueSerializer(findJsonValueAccessor, typeSerializer, findSerializerFromAnnotation);
    }

    public final JsonSerializer<?> findSerializerByLookup(JavaType javaType, SerializationConfig serializationConfig, BeanDescription beanDescription, boolean z2) {
        Class<? extends JsonSerializer<?>> cls;
        String name = javaType.getRawClass().getName();
        JsonSerializer<?> jsonSerializer = _concrete.get(name);
        return (jsonSerializer != null || (cls = _concreteLazy.get(name)) == null) ? jsonSerializer : (JsonSerializer) ClassUtil.createInstance(cls, false);
    }

    public final JsonSerializer<?> findSerializerByPrimaryType(SerializerProvider serializerProvider, JavaType javaType, BeanDescription beanDescription, boolean z2) throws JsonMappingException {
        if (javaType.isEnumType()) {
            return buildEnumSerializer(serializerProvider.getConfig(), javaType, beanDescription);
        }
        Class<?> rawClass = javaType.getRawClass();
        JsonSerializer<?> findOptionalStdSerializer = findOptionalStdSerializer(serializerProvider, javaType, beanDescription, z2);
        if (findOptionalStdSerializer != null) {
            return findOptionalStdSerializer;
        }
        if (Calendar.class.isAssignableFrom(rawClass)) {
            return CalendarSerializer.instance;
        }
        if (Date.class.isAssignableFrom(rawClass)) {
            return DateSerializer.instance;
        }
        if (Map.Entry.class.isAssignableFrom(rawClass)) {
            JavaType findSuperType = javaType.findSuperType(Map.Entry.class);
            return buildMapEntrySerializer(serializerProvider, javaType, beanDescription, z2, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1));
        }
        if (ByteBuffer.class.isAssignableFrom(rawClass)) {
            return new ByteBufferSerializer();
        }
        if (InetAddress.class.isAssignableFrom(rawClass)) {
            return new InetAddressSerializer();
        }
        if (InetSocketAddress.class.isAssignableFrom(rawClass)) {
            return new InetSocketAddressSerializer();
        }
        if (TimeZone.class.isAssignableFrom(rawClass)) {
            return new TimeZoneSerializer();
        }
        if (Charset.class.isAssignableFrom(rawClass)) {
            return ToStringSerializer.instance;
        }
        if (!Number.class.isAssignableFrom(rawClass)) {
            if (ClassLoader.class.isAssignableFrom(rawClass)) {
                return new ToEmptyObjectSerializer(javaType);
            }
            return null;
        }
        int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[beanDescription.findExpectedFormat(null).getShape().ordinal()];
        if (i3 == 1) {
            return ToStringSerializer.instance;
        }
        if (i3 == 2 || i3 == 3) {
            return null;
        }
        return NumberSerializer.instance;
    }

    public JsonSerializer<Object> findSerializerFromAnnotation(SerializerProvider serializerProvider, Annotated annotated) throws JsonMappingException {
        Object findSerializer = serializerProvider.getAnnotationIntrospector().findSerializer(annotated);
        if (findSerializer == null) {
            return null;
        }
        return findConvertingSerializer(serializerProvider, annotated, serializerProvider.serializerInstance(annotated, findSerializer));
    }

    public boolean isIndexedList(Class<?> cls) {
        return RandomAccess.class.isAssignableFrom(cls);
    }

    public boolean usesStaticTyping(SerializationConfig serializationConfig, BeanDescription beanDescription, TypeSerializer typeSerializer) {
        if (typeSerializer != null) {
            return false;
        }
        JsonSerialize.Typing findSerializationTyping = serializationConfig.getAnnotationIntrospector().findSerializationTyping(beanDescription.getClassInfo());
        return (findSerializationTyping == null || findSerializationTyping == JsonSerialize.Typing.DEFAULT_TYPING) ? serializationConfig.isEnabled(MapperFeature.USE_STATIC_TYPING) : findSerializationTyping == JsonSerialize.Typing.STATIC;
    }

    public ContainerSerializer<?> buildCollectionSerializer(JavaType javaType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer) {
        return new CollectionSerializer(javaType, z2, typeSerializer, jsonSerializer);
    }
}
