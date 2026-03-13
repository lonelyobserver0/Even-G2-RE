package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import p0.AbstractC1482f;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BeanPropertyWriter extends PropertyWriter implements Serializable {
    public static final Object MARKER_FOR_EMPTY = JsonInclude.Include.NON_EMPTY;
    protected transient Method _accessorMethod;
    protected final JavaType _cfgSerializationType;
    protected final transient Annotations _contextAnnotations;
    protected final JavaType _declaredType;
    protected transient PropertySerializerMap _dynamicSerializers;
    protected transient Field _field;
    protected final Class<?>[] _includeInViews;
    protected transient HashMap<Object, Object> _internalSettings;
    protected final AnnotatedMember _member;
    protected final SerializedString _name;
    protected JavaType _nonTrivialBaseType;
    protected JsonSerializer<Object> _nullSerializer;
    protected JsonSerializer<Object> _serializer;
    protected final boolean _suppressNulls;
    protected final Object _suppressableValue;
    protected TypeSerializer _typeSerializer;
    protected final PropertyName _wrapperName;

    public BeanPropertyWriter(BeanPropertyDefinition beanPropertyDefinition, AnnotatedMember annotatedMember, Annotations annotations, JavaType javaType, JsonSerializer<?> jsonSerializer, TypeSerializer typeSerializer, JavaType javaType2, boolean z2, Object obj, Class<?>[] clsArr) {
        super(beanPropertyDefinition);
        this._member = annotatedMember;
        this._contextAnnotations = annotations;
        this._name = new SerializedString(beanPropertyDefinition.getName());
        this._wrapperName = beanPropertyDefinition.getWrapperName();
        this._declaredType = javaType;
        this._serializer = jsonSerializer;
        this._dynamicSerializers = jsonSerializer == null ? PropertySerializerMap.emptyForProperties() : null;
        this._typeSerializer = typeSerializer;
        this._cfgSerializationType = javaType2;
        if (annotatedMember instanceof AnnotatedField) {
            this._accessorMethod = null;
            this._field = (Field) annotatedMember.getMember();
        } else if (annotatedMember instanceof AnnotatedMethod) {
            this._accessorMethod = (Method) annotatedMember.getMember();
            this._field = null;
        } else {
            this._accessorMethod = null;
            this._field = null;
        }
        this._suppressNulls = z2;
        this._suppressableValue = obj;
        this._nullSerializer = null;
        this._includeInViews = clsArr;
    }

    public JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws JsonMappingException {
        JavaType javaType = this._nonTrivialBaseType;
        PropertySerializerMap.SerializerAndMapResult findAndAddPrimarySerializer = javaType != null ? propertySerializerMap.findAndAddPrimarySerializer(serializerProvider.constructSpecializedType(javaType, cls), serializerProvider, this) : propertySerializerMap.findAndAddPrimarySerializer(cls, serializerProvider, this);
        PropertySerializerMap propertySerializerMap2 = findAndAddPrimarySerializer.map;
        if (propertySerializerMap != propertySerializerMap2) {
            this._dynamicSerializers = propertySerializerMap2;
        }
        return findAndAddPrimarySerializer.serializer;
    }

    public boolean _handleSelfReference(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, JsonSerializer<?> jsonSerializer) throws IOException {
        if (jsonSerializer.usesObjectId()) {
            return false;
        }
        if (serializerProvider.isEnabled(SerializationFeature.FAIL_ON_SELF_REFERENCES)) {
            if (!(jsonSerializer instanceof BeanSerializerBase)) {
                return false;
            }
            serializerProvider.reportBadDefinition(getType(), "Direct self-reference leading to cycle");
            return false;
        }
        if (!serializerProvider.isEnabled(SerializationFeature.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this._nullSerializer == null) {
            return true;
        }
        if (!jsonGenerator.getOutputContext().inArray()) {
            jsonGenerator.writeFieldName(this._name);
        }
        this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
        return true;
    }

    public BeanPropertyWriter _new(PropertyName propertyName) {
        return new BeanPropertyWriter(this, propertyName);
    }

    public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
        JsonSerializer<Object> jsonSerializer2 = this._nullSerializer;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw new IllegalStateException(AbstractC1482f.i("Cannot override _nullSerializer: had a ", ClassUtil.classNameOf(this._nullSerializer), ", trying to set to ", ClassUtil.classNameOf(jsonSerializer)));
        }
        this._nullSerializer = jsonSerializer;
    }

    public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
        JsonSerializer<Object> jsonSerializer2 = this._serializer;
        if (jsonSerializer2 != null && jsonSerializer2 != jsonSerializer) {
            throw new IllegalStateException(AbstractC1482f.i("Cannot override _serializer: had a ", ClassUtil.classNameOf(this._serializer), ", trying to set to ", ClassUtil.classNameOf(jsonSerializer)));
        }
        this._serializer = jsonSerializer;
    }

    public void assignTypeSerializer(TypeSerializer typeSerializer) {
        this._typeSerializer = typeSerializer;
    }

    public void fixAccess(SerializationConfig serializationConfig) {
        this._member.fixAccess(serializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public final Object get(Object obj) throws Exception {
        Method method = this._accessorMethod;
        return method == null ? this._field.get(obj) : method.invoke(obj, null);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(this._name.getValue());
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._member;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        return this._name.getValue();
    }

    public JavaType getSerializationType() {
        return this._cfgSerializationType;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._declaredType;
    }

    public TypeSerializer getTypeSerializer() {
        return this._typeSerializer;
    }

    public Class<?>[] getViews() {
        return this._includeInViews;
    }

    public boolean hasNullSerializer() {
        return this._nullSerializer != null;
    }

    public boolean hasSerializer() {
        return this._serializer != null;
    }

    public BeanPropertyWriter rename(NameTransformer nameTransformer) {
        String transform = nameTransformer.transform(this._name.getValue());
        return transform.equals(this._name.toString()) ? this : _new(PropertyName.construct(transform));
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Method method = this._accessorMethod;
        Object invoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (invoke == null) {
            JsonSerializer<Object> jsonSerializer = this._nullSerializer;
            if (jsonSerializer != null) {
                jsonSerializer.serialize(null, jsonGenerator, serializerProvider);
                return;
            } else {
                jsonGenerator.writeNull();
                return;
            }
        }
        JsonSerializer<?> jsonSerializer2 = this._serializer;
        if (jsonSerializer2 == null) {
            Class<?> cls = invoke.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<?> serializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer2 = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
        }
        Object obj2 = this._suppressableValue;
        if (obj2 != null) {
            if (MARKER_FOR_EMPTY == obj2) {
                if (jsonSerializer2.isEmpty(serializerProvider, invoke)) {
                    serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                    return;
                }
            } else if (obj2.equals(invoke)) {
                serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                return;
            }
        }
        if (invoke == obj && _handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer2)) {
            return;
        }
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            jsonSerializer2.serialize(invoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializer2.serializeWithType(invoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        Method method = this._accessorMethod;
        Object invoke = method == null ? this._field.get(obj) : method.invoke(obj, null);
        if (invoke == null) {
            Object obj2 = this._suppressableValue;
            if ((obj2 == null || !serializerProvider.includeFilterSuppressNulls(obj2)) && this._nullSerializer != null) {
                jsonGenerator.writeFieldName(this._name);
                this._nullSerializer.serialize(null, jsonGenerator, serializerProvider);
                return;
            }
            return;
        }
        JsonSerializer<?> jsonSerializer = this._serializer;
        if (jsonSerializer == null) {
            Class<?> cls = invoke.getClass();
            PropertySerializerMap propertySerializerMap = this._dynamicSerializers;
            JsonSerializer<?> serializerFor = propertySerializerMap.serializerFor(cls);
            jsonSerializer = serializerFor == null ? _findAndAddDynamic(propertySerializerMap, cls, serializerProvider) : serializerFor;
        }
        Object obj3 = this._suppressableValue;
        if (obj3 != null) {
            if (MARKER_FOR_EMPTY == obj3) {
                if (jsonSerializer.isEmpty(serializerProvider, invoke)) {
                    return;
                }
            } else if (obj3.equals(invoke)) {
                return;
            }
        }
        if (invoke == obj && _handleSelfReference(obj, jsonGenerator, serializerProvider, jsonSerializer)) {
            return;
        }
        jsonGenerator.writeFieldName(this._name);
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            jsonSerializer.serialize(invoke, jsonGenerator, serializerProvider);
        } else {
            jsonSerializer.serializeWithType(invoke, jsonGenerator, serializerProvider, typeSerializer);
        }
    }

    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        if (jsonGenerator.canOmitFields()) {
            return;
        }
        jsonGenerator.writeOmittedField(this._name.getValue());
    }

    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
        JsonSerializer<Object> jsonSerializer = this._nullSerializer;
        if (jsonSerializer != null) {
            jsonSerializer.serialize(null, jsonGenerator, serializerProvider);
        } else {
            jsonGenerator.writeNull();
        }
    }

    public void setNonTrivialBaseType(JavaType javaType) {
        this._nonTrivialBaseType = javaType;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("property '");
        sb2.append(getName());
        sb2.append("' (");
        if (this._accessorMethod != null) {
            sb2.append("via method ");
            sb2.append(this._accessorMethod.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(this._accessorMethod.getName());
        } else if (this._field != null) {
            sb2.append("field \"");
            sb2.append(this._field.getDeclaringClass().getName());
            sb2.append("#");
            sb2.append(this._field.getName());
        } else {
            sb2.append("virtual");
        }
        JsonSerializer<Object> jsonSerializer = this._serializer;
        if (jsonSerializer == null) {
            sb2.append(", no static serializer");
        } else {
            sb2.append(", static serializer of type ".concat(jsonSerializer.getClass().getName()));
        }
        sb2.append(')');
        return sb2.toString();
    }

    public BeanPropertyWriter unwrappingWriter(NameTransformer nameTransformer) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer);
    }

    public boolean willSuppressNulls() {
        return this._suppressNulls;
    }

    public boolean wouldConflictWithName(PropertyName propertyName) {
        PropertyName propertyName2 = this._wrapperName;
        return propertyName2 != null ? propertyName2.equals(propertyName) : propertyName.hasSimpleName(this._name.getValue()) && !propertyName.hasNamespace();
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter) {
        this(beanPropertyWriter, beanPropertyWriter._name);
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, PropertyName propertyName) {
        super(beanPropertyWriter);
        this._name = new SerializedString(propertyName.getSimpleName());
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._member = beanPropertyWriter._member;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }

    public BeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, SerializedString serializedString) {
        super(beanPropertyWriter);
        this._name = serializedString;
        this._wrapperName = beanPropertyWriter._wrapperName;
        this._member = beanPropertyWriter._member;
        this._contextAnnotations = beanPropertyWriter._contextAnnotations;
        this._declaredType = beanPropertyWriter._declaredType;
        this._accessorMethod = beanPropertyWriter._accessorMethod;
        this._field = beanPropertyWriter._field;
        this._serializer = beanPropertyWriter._serializer;
        this._nullSerializer = beanPropertyWriter._nullSerializer;
        if (beanPropertyWriter._internalSettings != null) {
            this._internalSettings = new HashMap<>(beanPropertyWriter._internalSettings);
        }
        this._cfgSerializationType = beanPropertyWriter._cfgSerializationType;
        this._dynamicSerializers = beanPropertyWriter._dynamicSerializers;
        this._suppressNulls = beanPropertyWriter._suppressNulls;
        this._suppressableValue = beanPropertyWriter._suppressableValue;
        this._includeInViews = beanPropertyWriter._includeInViews;
        this._typeSerializer = beanPropertyWriter._typeSerializer;
        this._nonTrivialBaseType = beanPropertyWriter._nonTrivialBaseType;
    }
}
