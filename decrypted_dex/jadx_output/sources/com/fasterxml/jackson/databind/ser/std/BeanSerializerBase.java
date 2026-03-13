package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.AnyGetterWriter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> implements ContextualSerializer, ResolvableSerializer {
    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName(StubApp.getString2(11013));
    protected static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
    protected final AnyGetterWriter _anyGetterWriter;
    protected final JavaType _beanType;
    protected final BeanPropertyWriter[] _filteredProps;
    protected final ObjectIdWriter _objectIdWriter;
    protected final Object _propertyFilterId;
    protected final BeanPropertyWriter[] _props;
    protected final JsonFormat.Shape _serializationShape;
    protected final AnnotatedMember _typeId;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.BeanSerializerBase$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[JsonFormat.Shape.NUMBER_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BeanSerializerBase(JavaType javaType, BeanSerializerBuilder beanSerializerBuilder, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(javaType);
        this._beanType = javaType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        if (beanSerializerBuilder == null) {
            this._typeId = null;
            this._anyGetterWriter = null;
            this._propertyFilterId = null;
            this._objectIdWriter = null;
            this._serializationShape = null;
            return;
        }
        this._typeId = beanSerializerBuilder.getTypeId();
        this._anyGetterWriter = beanSerializerBuilder.getAnyGetter();
        this._propertyFilterId = beanSerializerBuilder.getFilterId();
        this._objectIdWriter = beanSerializerBuilder.getObjectIdWriter();
        this._serializationShape = beanSerializerBuilder.getBeanDescription().findExpectedFormat(null).getShape();
    }

    private static final BeanPropertyWriter[] rename(BeanPropertyWriter[] beanPropertyWriterArr, NameTransformer nameTransformer) {
        if (beanPropertyWriterArr == null || beanPropertyWriterArr.length == 0 || nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return beanPropertyWriterArr;
        }
        int length = beanPropertyWriterArr.length;
        BeanPropertyWriter[] beanPropertyWriterArr2 = new BeanPropertyWriter[length];
        for (int i3 = 0; i3 < length; i3++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i3];
            if (beanPropertyWriter != null) {
                beanPropertyWriterArr2[i3] = beanPropertyWriter.rename(nameTransformer);
            }
        }
        return beanPropertyWriterArr2;
    }

    public void _serializeObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer, WritableObjectId writableObjectId) throws IOException {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableTypeId _typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.writeTypePrefix(jsonGenerator, _typeIdDef);
        jsonGenerator.setCurrentValue(obj);
        writableObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, _typeIdDef);
    }

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z2) throws IOException {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableObjectId findObjectId = serializerProvider.findObjectId(obj, objectIdWriter.generator);
        if (findObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter)) {
            return;
        }
        Object generateId = findObjectId.generateId(obj);
        if (objectIdWriter.alwaysAsId) {
            objectIdWriter.serializer.serialize(generateId, jsonGenerator, serializerProvider);
            return;
        }
        if (z2) {
            jsonGenerator.writeStartObject(obj);
        }
        findObjectId.writeAsField(jsonGenerator, serializerProvider, objectIdWriter);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        if (z2) {
            jsonGenerator.writeEndObject();
        }
    }

    public final WritableTypeId _typeIdDef(TypeSerializer typeSerializer, Object obj, JsonToken jsonToken) {
        AnnotatedMember annotatedMember = this._typeId;
        if (annotatedMember == null) {
            return typeSerializer.typeId(obj, jsonToken);
        }
        Object value = annotatedMember.getValue(obj);
        if (value == null) {
            value = "";
        }
        return typeSerializer.typeId(obj, jsonToken, value);
    }

    public abstract BeanSerializerBase asArraySerializer();

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Shape shape;
        BeanPropertyWriter[] beanPropertyWriterArr;
        Object obj;
        Set<String> set;
        Set<String> set2;
        int i3;
        BeanSerializerBase beanSerializerBase;
        ObjectIdWriter withSerializer;
        BeanPropertyWriter[] beanPropertyWriterArr2;
        Set<String> set3;
        BeanPropertyWriter beanPropertyWriter;
        Object obj2;
        ObjectIdInfo findObjectReferenceInfo;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        AnnotatedMember member = (beanProperty == null || annotationIntrospector == null) ? null : beanProperty.getMember();
        SerializationConfig config = serializerProvider.getConfig();
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, this._handledType);
        if (findFormatOverrides == null || !findFormatOverrides.hasShape()) {
            shape = null;
        } else {
            shape = findFormatOverrides.getShape();
            if (shape != JsonFormat.Shape.ANY && shape != this._serializationShape) {
                if (this._beanType.isEnumType()) {
                    int i10 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[shape.ordinal()];
                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                        return serializerProvider.handlePrimaryContextualization(EnumSerializer.construct(this._beanType.getRawClass(), serializerProvider.getConfig(), config.introspectClassAnnotations(this._beanType), findFormatOverrides), beanProperty);
                    }
                } else if (shape == JsonFormat.Shape.NATURAL && ((!this._beanType.isMapLikeType() || !Map.class.isAssignableFrom(this._handledType)) && Map.Entry.class.isAssignableFrom(this._handledType))) {
                    JavaType findSuperType = this._beanType.findSuperType(Map.Entry.class);
                    return serializerProvider.handlePrimaryContextualization(new MapEntrySerializer(this._beanType, findSuperType.containedTypeOrUnknown(0), findSuperType.containedTypeOrUnknown(1), false, null, beanProperty), beanProperty);
                }
            }
        }
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        if (member != null) {
            set2 = annotationIntrospector.findPropertyIgnoralByName(config, member).findIgnoredForSerialization();
            Set<String> included = annotationIntrospector.findPropertyInclusionByName(config, member).getIncluded();
            ObjectIdInfo findObjectIdInfo = annotationIntrospector.findObjectIdInfo(member);
            if (findObjectIdInfo == null) {
                if (objectIdWriter != null && (findObjectReferenceInfo = annotationIntrospector.findObjectReferenceInfo(member, null)) != null) {
                    objectIdWriter = this._objectIdWriter.withAlwaysAsId(findObjectReferenceInfo.getAlwaysAsId());
                }
                set3 = included;
                i3 = 0;
                beanPropertyWriterArr = null;
            } else {
                ObjectIdInfo findObjectReferenceInfo2 = annotationIntrospector.findObjectReferenceInfo(member, findObjectIdInfo);
                Class<? extends ObjectIdGenerator<?>> generatorType = findObjectReferenceInfo2.getGeneratorType();
                JavaType javaType = serializerProvider.getTypeFactory().findTypeParameters(serializerProvider.constructType(generatorType), ObjectIdGenerator.class)[0];
                if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
                    String simpleName = findObjectReferenceInfo2.getPropertyName().getSimpleName();
                    int length = this._props.length;
                    i3 = 0;
                    while (true) {
                        if (i3 == length) {
                            set3 = included;
                            serializerProvider.reportBadDefinition(this._beanType, AbstractC1482f.i(StubApp.getString2(11014), ClassUtil.nameOf((Class<?>) handledType()), StubApp.getString2(11015), ClassUtil.name(simpleName)));
                        } else {
                            set3 = included;
                        }
                        beanPropertyWriter = this._props[i3];
                        if (simpleName.equals(beanPropertyWriter.getName())) {
                            break;
                        }
                        i3++;
                        included = set3;
                    }
                    beanPropertyWriterArr = null;
                    objectIdWriter = ObjectIdWriter.construct(beanPropertyWriter.getType(), null, new PropertyBasedObjectIdGenerator(findObjectReferenceInfo2, beanPropertyWriter), findObjectReferenceInfo2.getAlwaysAsId());
                } else {
                    beanPropertyWriterArr = null;
                    set3 = included;
                    objectIdWriter = ObjectIdWriter.construct(javaType, findObjectReferenceInfo2.getPropertyName(), serializerProvider.objectIdGeneratorInstance(member, findObjectReferenceInfo2), findObjectReferenceInfo2.getAlwaysAsId());
                    i3 = 0;
                }
            }
            obj = annotationIntrospector.findFilterId(member);
            if (obj == null || ((obj2 = this._propertyFilterId) != null && obj.equals(obj2))) {
                obj = beanPropertyWriterArr;
            }
            set = set3;
        } else {
            beanPropertyWriterArr = null;
            obj = null;
            set = null;
            set2 = null;
            i3 = 0;
        }
        if (i3 > 0) {
            BeanPropertyWriter[] beanPropertyWriterArr3 = this._props;
            BeanPropertyWriter[] beanPropertyWriterArr4 = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr3, beanPropertyWriterArr3.length);
            BeanPropertyWriter beanPropertyWriter2 = beanPropertyWriterArr4[i3];
            System.arraycopy(beanPropertyWriterArr4, 0, beanPropertyWriterArr4, 1, i3);
            beanPropertyWriterArr4[0] = beanPropertyWriter2;
            BeanPropertyWriter[] beanPropertyWriterArr5 = this._filteredProps;
            if (beanPropertyWriterArr5 == null) {
                beanPropertyWriterArr2 = beanPropertyWriterArr;
            } else {
                beanPropertyWriterArr2 = (BeanPropertyWriter[]) Arrays.copyOf(beanPropertyWriterArr5, beanPropertyWriterArr5.length);
                BeanPropertyWriter beanPropertyWriter3 = beanPropertyWriterArr2[i3];
                System.arraycopy(beanPropertyWriterArr2, 0, beanPropertyWriterArr2, 1, i3);
                beanPropertyWriterArr2[0] = beanPropertyWriter3;
            }
            beanSerializerBase = withProperties(beanPropertyWriterArr4, beanPropertyWriterArr2);
        } else {
            beanSerializerBase = this;
        }
        if (objectIdWriter != null && (withSerializer = objectIdWriter.withSerializer(serializerProvider.findValueSerializer(objectIdWriter.idType, beanProperty))) != this._objectIdWriter) {
            beanSerializerBase = beanSerializerBase.withObjectIdWriter(withSerializer);
        }
        if ((set2 != null && !set2.isEmpty()) || set != null) {
            beanSerializerBase = beanSerializerBase.withByNameInclusion(set2, set);
        }
        if (obj != null) {
            beanSerializerBase = beanSerializerBase.withFilterId(obj);
        }
        if (shape == null) {
            shape = this._serializationShape;
        }
        return shape == JsonFormat.Shape.ARRAY ? beanSerializerBase.asArraySerializer() : beanSerializerBase;
    }

    public JsonSerializer<Object> findConvertingSerializer(SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) throws JsonMappingException {
        AnnotatedMember member;
        Object findSerializationConverter;
        AnnotationIntrospector annotationIntrospector = serializerProvider.getAnnotationIntrospector();
        if (annotationIntrospector == null || (member = beanPropertyWriter.getMember()) == null || (findSerializationConverter = annotationIntrospector.findSerializationConverter(member)) == null) {
            return null;
        }
        Converter<Object, Object> converterInstance = serializerProvider.converterInstance(beanPropertyWriter.getMember(), findSerializationConverter);
        JavaType outputType = converterInstance.getOutputType(serializerProvider.getTypeFactory());
        return new StdDelegatingSerializer(converterInstance, outputType, outputType.isJavaLangObject() ? null : serializerProvider.findValueSerializer(outputType, beanPropertyWriter));
    }

    @Override // com.fasterxml.jackson.databind.ser.ResolvableSerializer
    public void resolve(SerializerProvider serializerProvider) throws JsonMappingException {
        BeanPropertyWriter beanPropertyWriter;
        TypeSerializer typeSerializer;
        JsonSerializer<Object> findNullValueSerializer;
        BeanPropertyWriter beanPropertyWriter2;
        BeanPropertyWriter[] beanPropertyWriterArr = this._filteredProps;
        int length = beanPropertyWriterArr == null ? 0 : beanPropertyWriterArr.length;
        int length2 = this._props.length;
        for (int i3 = 0; i3 < length2; i3++) {
            BeanPropertyWriter beanPropertyWriter3 = this._props[i3];
            if (!beanPropertyWriter3.willSuppressNulls() && !beanPropertyWriter3.hasNullSerializer() && (findNullValueSerializer = serializerProvider.findNullValueSerializer(beanPropertyWriter3)) != null) {
                beanPropertyWriter3.assignNullSerializer(findNullValueSerializer);
                if (i3 < length && (beanPropertyWriter2 = this._filteredProps[i3]) != null) {
                    beanPropertyWriter2.assignNullSerializer(findNullValueSerializer);
                }
            }
            if (!beanPropertyWriter3.hasSerializer()) {
                JsonSerializer<Object> findConvertingSerializer = findConvertingSerializer(serializerProvider, beanPropertyWriter3);
                if (findConvertingSerializer == null) {
                    JavaType serializationType = beanPropertyWriter3.getSerializationType();
                    if (serializationType == null) {
                        serializationType = beanPropertyWriter3.getType();
                        if (!serializationType.isFinal()) {
                            if (serializationType.isContainerType() || serializationType.containedTypeCount() > 0) {
                                beanPropertyWriter3.setNonTrivialBaseType(serializationType);
                            }
                        }
                    }
                    JsonSerializer<Object> findValueSerializer = serializerProvider.findValueSerializer(serializationType, beanPropertyWriter3);
                    findConvertingSerializer = (serializationType.isContainerType() && (typeSerializer = (TypeSerializer) serializationType.getContentType().getTypeHandler()) != null && (findValueSerializer instanceof ContainerSerializer)) ? ((ContainerSerializer) findValueSerializer).withValueTypeSerializer(typeSerializer) : findValueSerializer;
                }
                if (i3 >= length || (beanPropertyWriter = this._filteredProps[i3]) == null) {
                    beanPropertyWriter3.assignSerializer(findConvertingSerializer);
                } else {
                    beanPropertyWriter.assignSerializer(findConvertingSerializer);
                }
            }
        }
        AnyGetterWriter anyGetterWriter = this._anyGetterWriter;
        if (anyGetterWriter != null) {
            anyGetterWriter.resolve(serializerProvider);
        }
    }

    public void serializeFields(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String string2 = StubApp.getString2(11016);
        BeanPropertyWriter[] beanPropertyWriterArr = (this._filteredProps == null || serializerProvider.getActiveView() == null) ? this._props : this._filteredProps;
        int i3 = 0;
        try {
            int length = beanPropertyWriterArr.length;
            while (i3 < length) {
                BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i3];
                if (beanPropertyWriter != null) {
                    beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
                }
                i3++;
            }
            AnyGetterWriter anyGetterWriter = this._anyGetterWriter;
            if (anyGetterWriter != null) {
                anyGetterWriter.getAndSerialize(obj, jsonGenerator, serializerProvider);
            }
        } catch (Exception e10) {
            if (i3 != beanPropertyWriterArr.length) {
                string2 = beanPropertyWriterArr[i3].getName();
            }
            wrapAndThrow(serializerProvider, e10, obj, string2);
        } catch (StackOverflowError e11) {
            JsonMappingException jsonMappingException = new JsonMappingException(jsonGenerator, StubApp.getString2(11006), e11);
            if (i3 != beanPropertyWriterArr.length) {
                string2 = beanPropertyWriterArr[i3].getName();
            }
            jsonMappingException.prependPath(obj, string2);
            throw jsonMappingException;
        }
    }

    public void serializeFieldsFiltered(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._filteredProps != null) {
            serializerProvider.getActiveView();
        }
        findPropertyFilter(serializerProvider, this._propertyFilterId, obj);
        serializeFields(obj, jsonGenerator, serializerProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        if (this._objectIdWriter != null) {
            _serializeWithObjectId(obj, jsonGenerator, serializerProvider, typeSerializer);
            return;
        }
        WritableTypeId _typeIdDef = _typeIdDef(typeSerializer, obj, JsonToken.START_OBJECT);
        typeSerializer.writeTypePrefix(jsonGenerator, _typeIdDef);
        jsonGenerator.setCurrentValue(obj);
        if (this._propertyFilterId != null) {
            serializeFieldsFiltered(obj, jsonGenerator, serializerProvider);
        } else {
            serializeFields(obj, jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, _typeIdDef);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean usesObjectId() {
        return this._objectIdWriter != null;
    }

    public abstract BeanSerializerBase withByNameInclusion(Set<String> set, Set<String> set2);

    public abstract BeanSerializerBase withFilterId(Object obj);

    public abstract BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectIdWriter);

    public abstract BeanSerializerBase withProperties(BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2);

    public final void _serializeWithObjectId(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        ObjectIdWriter objectIdWriter = this._objectIdWriter;
        WritableObjectId findObjectId = serializerProvider.findObjectId(obj, objectIdWriter.generator);
        if (findObjectId.writeAsId(jsonGenerator, serializerProvider, objectIdWriter)) {
            return;
        }
        Object generateId = findObjectId.generateId(obj);
        if (objectIdWriter.alwaysAsId) {
            objectIdWriter.serializer.serialize(generateId, jsonGenerator, serializerProvider);
        } else {
            _serializeObjectId(obj, jsonGenerator, serializerProvider, typeSerializer, findObjectId);
        }
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, BeanPropertyWriter[] beanPropertyWriterArr, BeanPropertyWriter[] beanPropertyWriterArr2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanPropertyWriterArr;
        this._filteredProps = beanPropertyWriterArr2;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter) {
        this(beanSerializerBase, objectIdWriter, beanSerializerBase._propertyFilterId);
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, ObjectIdWriter objectIdWriter, Object obj) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        this._props = beanSerializerBase._props;
        this._filteredProps = beanSerializerBase._filteredProps;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = objectIdWriter;
        this._propertyFilterId = obj;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, Set<String> set, Set<String> set2) {
        super(beanSerializerBase._handledType);
        this._beanType = beanSerializerBase._beanType;
        BeanPropertyWriter[] beanPropertyWriterArr = beanSerializerBase._props;
        BeanPropertyWriter[] beanPropertyWriterArr2 = beanSerializerBase._filteredProps;
        int length = beanPropertyWriterArr.length;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = beanPropertyWriterArr2 == null ? null : new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            BeanPropertyWriter beanPropertyWriter = beanPropertyWriterArr[i3];
            if (!IgnorePropertiesUtil.shouldIgnore(beanPropertyWriter.getName(), set, set2)) {
                arrayList.add(beanPropertyWriter);
                if (beanPropertyWriterArr2 != null) {
                    arrayList2.add(beanPropertyWriterArr2[i3]);
                }
            }
        }
        this._props = (BeanPropertyWriter[]) arrayList.toArray(new BeanPropertyWriter[arrayList.size()]);
        this._filteredProps = arrayList2 != null ? (BeanPropertyWriter[]) arrayList2.toArray(new BeanPropertyWriter[arrayList2.size()]) : null;
        this._typeId = beanSerializerBase._typeId;
        this._anyGetterWriter = beanSerializerBase._anyGetterWriter;
        this._objectIdWriter = beanSerializerBase._objectIdWriter;
        this._propertyFilterId = beanSerializerBase._propertyFilterId;
        this._serializationShape = beanSerializerBase._serializationShape;
    }

    public BeanSerializerBase(BeanSerializerBase beanSerializerBase, NameTransformer nameTransformer) {
        this(beanSerializerBase, rename(beanSerializerBase._props, nameTransformer), rename(beanSerializerBase._filteredProps, nameTransformer));
    }
}
