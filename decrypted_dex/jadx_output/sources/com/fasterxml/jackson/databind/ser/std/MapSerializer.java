package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.stub.StubApp;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class MapSerializer extends ContainerSerializer<Map<?, ?>> implements ContextualSerializer {
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final Object _filterId;
    protected final Set<String> _ignoredEntries;
    protected final Set<String> _includedEntries;
    protected final IgnorePropertiesUtil.Checker _inclusionChecker;
    protected JsonSerializer<Object> _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected JsonSerializer<Object> _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;
    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.MapSerializer$1, reason: invalid class name */
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

    public MapSerializer(Set<String> set, Set<String> set2, JavaType javaType, JavaType javaType2, boolean z2, TypeSerializer typeSerializer, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = javaType;
        this._valueType = javaType2;
        this._valueTypeIsStatic = z2;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = null;
        this._filterId = null;
        this._sortKeys = false;
        this._suppressableValue = null;
        this._suppressNulls = false;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(set, set2);
    }

    private final JsonSerializer<Object> _findSerializer(SerializerProvider serializerProvider, Object obj) throws JsonMappingException {
        Class<?> cls = obj.getClass();
        JsonSerializer<Object> serializerFor = this._dynamicValueSerializers.serializerFor(cls);
        return serializerFor != null ? serializerFor : this._valueType.hasGenericTypes() ? _findAndAddDynamic(this._dynamicValueSerializers, serializerProvider.constructSpecializedType(this._valueType, cls), serializerProvider) : _findAndAddDynamic(this._dynamicValueSerializers, cls, serializerProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.ser.std.MapSerializer construct(java.util.Set<java.lang.String> r11, java.util.Set<java.lang.String> r12, com.fasterxml.jackson.databind.JavaType r13, boolean r14, com.fasterxml.jackson.databind.jsontype.TypeSerializer r15, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r16, com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r17, java.lang.Object r18) {
        /*
            r0 = r18
            if (r13 != 0) goto L9
            com.fasterxml.jackson.databind.JavaType r13 = com.fasterxml.jackson.databind.ser.std.MapSerializer.UNSPECIFIED_TYPE
            r5 = r13
            r6 = r5
            goto L21
        L9:
            com.fasterxml.jackson.databind.JavaType r1 = r13.getKeyType()
            java.lang.Class<java.util.Properties> r2 = java.util.Properties.class
            boolean r2 = r13.hasRawClass(r2)
            if (r2 == 0) goto L1c
            com.fasterxml.jackson.databind.JavaType r13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType()
        L19:
            r6 = r13
            r5 = r1
            goto L21
        L1c:
            com.fasterxml.jackson.databind.JavaType r13 = r13.getContentType()
            goto L19
        L21:
            r13 = 0
            if (r14 != 0) goto L30
            if (r6 == 0) goto L2d
            boolean r14 = r6.isFinal()
            if (r14 == 0) goto L2d
            r13 = 1
        L2d:
            r14 = r13
        L2e:
            r7 = r14
            goto L39
        L30:
            java.lang.Class r1 = r6.getRawClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto L2e
            r7 = r13
        L39:
            com.fasterxml.jackson.databind.ser.std.MapSerializer r2 = new com.fasterxml.jackson.databind.ser.std.MapSerializer
            r3 = r11
            r4 = r12
            r8 = r15
            r9 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L4c
            com.fasterxml.jackson.databind.ser.std.MapSerializer r11 = r2.withFilterId(r0)
            return r11
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.construct(java.util.Set, java.util.Set, com.fasterxml.jackson.databind.JavaType, boolean, com.fasterxml.jackson.databind.jsontype.TypeSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object):com.fasterxml.jackson.databind.ser.std.MapSerializer");
    }

    public void _ensureOverride(String str) {
        ClassUtil.verifyMustOverride(MapSerializer.class, this, str);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(cls, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public boolean _hasNullKey(Map<?, ?> map) {
        return (map instanceof HashMap) && map.containsKey(null);
    }

    public Map<?, ?> _orderEntries(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (map instanceof SortedMap) {
            return map;
        }
        if (!_hasNullKey(map)) {
            return new TreeMap(map);
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key == null) {
                _writeNullKeyedEntry(jsonGenerator, serializerProvider, entry.getValue());
            } else {
                treeMap.put(key, entry.getValue());
            }
        }
        return treeMap;
    }

    public void _writeNullKeyedEntry(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, Object obj) throws IOException {
        JsonSerializer<Object> jsonSerializer;
        JsonSerializer<Object> findNullKeySerializer = serializerProvider.findNullKeySerializer(this._keyType, this._property);
        if (obj != null) {
            jsonSerializer = this._valueSerializer;
            if (jsonSerializer == null) {
                jsonSerializer = _findSerializer(serializerProvider, obj);
            }
            Object obj2 = this._suppressableValue;
            if (obj2 == MARKER_FOR_EMPTY) {
                if (jsonSerializer.isEmpty(serializerProvider, obj)) {
                    return;
                }
            } else if (obj2 != null && obj2.equals(obj)) {
                return;
            }
        } else if (this._suppressNulls) {
            return;
        } else {
            jsonSerializer = serializerProvider.getDefaultNullValueSerializer();
        }
        try {
            findNullKeySerializer.serialize(null, jsonGenerator, serializerProvider);
            jsonSerializer.serialize(obj, jsonGenerator, serializerProvider);
        } catch (Exception e10) {
            wrapAndThrow(serializerProvider, e10, obj, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0122, code lost:
    
        if (r2 != 5) goto L95;
     */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r14, com.fasterxml.jackson.databind.BeanProperty r15) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public JavaType getContentType() {
        return this._valueType;
    }

    public void serializeFields(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = null;
        if (this._valueTypeSerializer != null) {
            serializeTypedFields(map, jsonGenerator, serializerProvider, null);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._keySerializer;
        try {
            Object obj2 = null;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                try {
                    Object value = entry.getValue();
                    obj2 = entry.getKey();
                    if (obj2 == null) {
                        serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                    } else {
                        IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
                        if (checker == null || !checker.shouldIgnore(obj2)) {
                            jsonSerializer.serialize(obj2, jsonGenerator, serializerProvider);
                        }
                    }
                    if (value == null) {
                        serializerProvider.defaultSerializeNull(jsonGenerator);
                    } else {
                        JsonSerializer<Object> jsonSerializer2 = this._valueSerializer;
                        if (jsonSerializer2 == null) {
                            jsonSerializer2 = _findSerializer(serializerProvider, value);
                        }
                        jsonSerializer2.serialize(value, jsonGenerator, serializerProvider);
                    }
                } catch (Exception e10) {
                    e = e10;
                    obj = obj2;
                    wrapAndThrow(serializerProvider, e, map, String.valueOf(obj));
                    return;
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public void serializeFieldsUsing(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<Object> jsonSerializer) throws IOException {
        JsonSerializer<Object> jsonSerializer2 = this._keySerializer;
        TypeSerializer typeSerializer = this._valueTypeSerializer;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(key)) {
                if (key == null) {
                    serializerProvider.findNullKeySerializer(this._keyType, this._property).serialize(null, jsonGenerator, serializerProvider);
                } else {
                    jsonSerializer2.serialize(key, jsonGenerator, serializerProvider);
                }
                Object value = entry.getValue();
                if (value == null) {
                    serializerProvider.defaultSerializeNull(jsonGenerator);
                } else if (typeSerializer == null) {
                    try {
                        jsonSerializer.serialize(value, jsonGenerator, serializerProvider);
                    } catch (Exception e10) {
                        wrapAndThrow(serializerProvider, e10, map, String.valueOf(key));
                    }
                } else {
                    jsonSerializer.serializeWithType(value, jsonGenerator, serializerProvider, typeSerializer);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:12|(2:52|53)(2:14|(1:19)(2:50|32))|20|(3:44|45|(2:49|32)(2:47|48))(4:22|23|(1:25)|(3:40|41|(2:43|32))(2:27|(2:31|32)))|33|34|36|32|10) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0071, code lost:
    
        wrapAndThrow(r10, r2, r8, java.lang.String.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeOptionalFields(java.util.Map<?, ?> r8, com.fasterxml.jackson.core.JsonGenerator r9, com.fasterxml.jackson.databind.SerializerProvider r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r7 = this;
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r0 = r7._valueTypeSerializer
            if (r0 == 0) goto L8
            r7.serializeTypedFields(r8, r9, r10, r11)
            return
        L8:
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.std.MapSerializer.MARKER_FOR_EMPTY
            if (r0 != r11) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L79
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 != 0) goto L32
            com.fasterxml.jackson.databind.JavaType r4 = r7._keyType
            com.fasterxml.jackson.databind.BeanProperty r5 = r7._property
            com.fasterxml.jackson.databind.JsonSerializer r4 = r10.findNullKeySerializer(r4, r5)
            goto L3f
        L32:
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r4 = r7._inclusionChecker
            if (r4 == 0) goto L3d
            boolean r4 = r4.shouldIgnore(r3)
            if (r4 == 0) goto L3d
            goto L17
        L3d:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r7._keySerializer
        L3f:
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L4f
            boolean r5 = r7._suppressNulls
            if (r5 == 0) goto L4a
            goto L17
        L4a:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r10.getDefaultNullValueSerializer()
            goto L69
        L4f:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r7._valueSerializer
            if (r5 != 0) goto L57
            com.fasterxml.jackson.databind.JsonSerializer r5 = r7._findSerializer(r10, r2)
        L57:
            if (r0 == 0) goto L60
            boolean r6 = r5.isEmpty(r10, r2)
            if (r6 == 0) goto L69
            goto L17
        L60:
            if (r11 == 0) goto L69
            boolean r6 = r11.equals(r2)
            if (r6 == 0) goto L69
            goto L17
        L69:
            r4.serialize(r3, r9, r10)     // Catch: java.lang.Exception -> L70
            r5.serialize(r2, r9, r10)     // Catch: java.lang.Exception -> L70
            goto L17
        L70:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.wrapAndThrow(r10, r2, r8, r3)
            goto L17
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeOptionalFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:7|(2:51|52)(2:9|(1:14)(2:49|32))|15|(3:43|44|(2:48|32)(2:46|47))(4:17|18|(1:20)|(3:38|39|(2:42|32)(1:41))(2:22|(2:36|32)))|27|28|29|31|32|5) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        wrapAndThrow(r10, r2, r8, java.lang.String.valueOf(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void serializeTypedFields(java.util.Map<?, ?> r8, com.fasterxml.jackson.core.JsonGenerator r9, com.fasterxml.jackson.databind.SerializerProvider r10, java.lang.Object r11) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.Object r0 = com.fasterxml.jackson.databind.ser.std.MapSerializer.MARKER_FOR_EMPTY
            if (r0 != r11) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.util.Set r1 = r8.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            if (r3 != 0) goto L2a
            com.fasterxml.jackson.databind.JavaType r4 = r7._keyType
            com.fasterxml.jackson.databind.BeanProperty r5 = r7._property
            com.fasterxml.jackson.databind.JsonSerializer r4 = r10.findNullKeySerializer(r4, r5)
            goto L37
        L2a:
            com.fasterxml.jackson.databind.util.IgnorePropertiesUtil$Checker r4 = r7._inclusionChecker
            if (r4 == 0) goto L35
            boolean r4 = r4.shouldIgnore(r3)
            if (r4 == 0) goto L35
            goto Lf
        L35:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r4 = r7._keySerializer
        L37:
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L47
            boolean r5 = r7._suppressNulls
            if (r5 == 0) goto L42
            goto Lf
        L42:
            com.fasterxml.jackson.databind.JsonSerializer r5 = r10.getDefaultNullValueSerializer()
            goto L61
        L47:
            com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object> r5 = r7._valueSerializer
            if (r5 != 0) goto L4f
            com.fasterxml.jackson.databind.JsonSerializer r5 = r7._findSerializer(r10, r2)
        L4f:
            if (r0 == 0) goto L58
            boolean r6 = r5.isEmpty(r10, r2)
            if (r6 == 0) goto L61
            goto Lf
        L58:
            if (r11 == 0) goto L61
            boolean r6 = r11.equals(r2)
            if (r6 == 0) goto L61
            goto Lf
        L61:
            r4.serialize(r3, r9, r10)
            com.fasterxml.jackson.databind.jsontype.TypeSerializer r4 = r7._valueTypeSerializer     // Catch: java.lang.Exception -> L6a
            r5.serializeWithType(r2, r9, r10, r4)     // Catch: java.lang.Exception -> L6a
            goto Lf
        L6a:
            r2 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r7.wrapAndThrow(r10, r2, r8, r3)
            goto Lf
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.MapSerializer.serializeTypedFields(java.util.Map, com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.databind.SerializerProvider, java.lang.Object):void");
    }

    public void serializeWithoutTypeInfo(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (map.isEmpty()) {
            return;
        }
        if (this._sortKeys || serializerProvider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)) {
            map = _orderEntries(map, jsonGenerator, serializerProvider);
        }
        Object obj = this._filterId;
        if (obj != null) {
            findPropertyFilter(serializerProvider, obj, map);
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null || this._suppressNulls) {
            serializeOptionalFields(map, jsonGenerator, serializerProvider, obj2);
            return;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        if (jsonSerializer != null) {
            serializeFieldsUsing(map, jsonGenerator, serializerProvider, jsonSerializer);
        } else {
            serializeFields(map, jsonGenerator, serializerProvider);
        }
    }

    public MapSerializer withContentInclusion(Object obj, boolean z2) {
        if (obj == this._suppressableValue && z2 == this._suppressNulls) {
            return this;
        }
        _ensureOverride(StubApp.getString2(11029));
        return new MapSerializer(this, this._valueTypeSerializer, obj, z2);
    }

    public MapSerializer withFilterId(Object obj) {
        if (this._filterId == obj) {
            return this;
        }
        _ensureOverride(StubApp.getString2(11030));
        return new MapSerializer(this, obj, this._sortKeys);
    }

    public MapSerializer withResolved(BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Set<String> set2, boolean z2) {
        _ensureOverride(StubApp.getString2(11031));
        MapSerializer mapSerializer = new MapSerializer(this, beanProperty, jsonSerializer, jsonSerializer2, set, set2);
        return z2 != mapSerializer._sortKeys ? new MapSerializer(mapSerializer, this._filterId, z2) : mapSerializer;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
    public MapSerializer _withValueTypeSerializer(TypeSerializer typeSerializer) {
        if (this._valueTypeSerializer == typeSerializer) {
            return this;
        }
        _ensureOverride(StubApp.getString2(11028));
        return new MapSerializer(this, typeSerializer, this._suppressableValue, this._suppressNulls);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, Map<?, ?> map) {
        JsonSerializer<Object> _findSerializer;
        if (map.isEmpty()) {
            return true;
        }
        Object obj = this._suppressableValue;
        if (obj == null && !this._suppressNulls) {
            return false;
        }
        JsonSerializer<Object> jsonSerializer = this._valueSerializer;
        boolean z2 = MARKER_FOR_EMPTY == obj;
        if (jsonSerializer != null) {
            for (Object obj2 : map.values()) {
                if (obj2 == null) {
                    if (!this._suppressNulls) {
                        return false;
                    }
                } else if (z2) {
                    if (!jsonSerializer.isEmpty(serializerProvider, obj2)) {
                        return false;
                    }
                } else if (obj == null || !obj.equals(map)) {
                    return false;
                }
            }
            return true;
        }
        for (Object obj3 : map.values()) {
            if (obj3 != null) {
                try {
                    _findSerializer = _findSerializer(serializerProvider, obj3);
                } catch (DatabindException unused) {
                }
                if (!z2) {
                    if (obj != null && obj.equals(map)) {
                    }
                    return false;
                }
                if (!_findSerializer.isEmpty(serializerProvider, obj3)) {
                    return false;
                }
            } else if (!this._suppressNulls) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject(map);
        serializeWithoutTypeInfo(map, jsonGenerator, serializerProvider);
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Map<?, ?> map, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.setCurrentValue(map);
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(map, JsonToken.START_OBJECT));
        serializeWithoutTypeInfo(map, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public final JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, JavaType javaType, SerializerProvider serializerProvider) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult findAndAddSecondarySerializer = propertySerializerMap.findAndAddSecondarySerializer(javaType, serializerProvider, this._property);
        PropertySerializerMap propertySerializerMap2 = findAndAddSecondarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicValueSerializers = propertySerializerMap2;
        }
        return findAndAddSecondarySerializer.serializer;
    }

    public static MapSerializer construct(Set<String> set, JavaType javaType, boolean z2, TypeSerializer typeSerializer, JsonSerializer<Object> jsonSerializer, JsonSerializer<Object> jsonSerializer2, Object obj) {
        return construct(set, null, javaType, z2, typeSerializer, jsonSerializer, jsonSerializer2, obj);
    }

    public MapSerializer(MapSerializer mapSerializer, BeanProperty beanProperty, JsonSerializer<?> jsonSerializer, JsonSerializer<?> jsonSerializer2, Set<String> set, Set<String> set2) {
        super(Map.class, false);
        set = (set == null || set.isEmpty()) ? null : set;
        this._ignoredEntries = set;
        this._includedEntries = set2;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = jsonSerializer;
        this._valueSerializer = jsonSerializer2;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = beanProperty;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = IgnorePropertiesUtil.buildCheckerIfNeeded(set, set2);
    }

    public MapSerializer(MapSerializer mapSerializer, TypeSerializer typeSerializer, Object obj, boolean z2) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = typeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = mapSerializer._dynamicValueSerializers;
        this._property = mapSerializer._property;
        this._filterId = mapSerializer._filterId;
        this._sortKeys = mapSerializer._sortKeys;
        this._suppressableValue = obj;
        this._suppressNulls = z2;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }

    public MapSerializer(MapSerializer mapSerializer, Object obj, boolean z2) {
        super(Map.class, false);
        this._ignoredEntries = mapSerializer._ignoredEntries;
        this._includedEntries = mapSerializer._includedEntries;
        this._keyType = mapSerializer._keyType;
        this._valueType = mapSerializer._valueType;
        this._valueTypeIsStatic = mapSerializer._valueTypeIsStatic;
        this._valueTypeSerializer = mapSerializer._valueTypeSerializer;
        this._keySerializer = mapSerializer._keySerializer;
        this._valueSerializer = mapSerializer._valueSerializer;
        this._dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        this._property = mapSerializer._property;
        this._filterId = obj;
        this._sortKeys = z2;
        this._suppressableValue = mapSerializer._suppressableValue;
        this._suppressNulls = mapSerializer._suppressNulls;
        this._inclusionChecker = mapSerializer._inclusionChecker;
    }
}
