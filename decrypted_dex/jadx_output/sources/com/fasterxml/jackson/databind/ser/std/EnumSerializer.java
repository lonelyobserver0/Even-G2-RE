package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Objects;
import p0.AbstractC1482f;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements ContextualSerializer {
    protected final Boolean _serializeAsIndex;
    protected final EnumValues _values;

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
    }

    public static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z2, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.getShape();
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String string2 = z2 ? StubApp.getString2(11020) : StubApp.getString2(11021);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11022));
        sb2.append(shape);
        sb2.append(StubApp.getString2(11023));
        sb2.append(name);
        sb2.append(StubApp.getString2(11024));
        throw new IllegalArgumentException(AbstractC1482f.k(sb2, string2, StubApp.getString2(11025)));
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, BeanDescription beanDescription, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, cls), _isShapeWrittenUsingIndex(cls, value, true, null));
    }

    public final boolean _serializeAsIndex(SerializerProvider serializerProvider) {
        Boolean bool = this._serializeAsIndex;
        return bool != null ? bool.booleanValue() : serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (findFormatOverrides != null) {
            Boolean _isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), findFormatOverrides, false, this._serializeAsIndex);
            if (!Objects.equals(_isShapeWrittenUsingIndex, this._serializeAsIndex)) {
                return new EnumSerializer(this._values, _isShapeWrittenUsingIndex);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public final void serialize(Enum<?> r22, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (_serializeAsIndex(serializerProvider)) {
            jsonGenerator.writeNumber(r22.ordinal());
        } else if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.writeString(r22.toString());
        } else {
            jsonGenerator.writeString(this._values.serializedValueFor(r22));
        }
    }
}
