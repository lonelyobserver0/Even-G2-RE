package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

@JacksonStdImpl
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class NumberSerializer extends StdScalarSerializer<Number> implements ContextualSerializer {
    public static final NumberSerializer instance = new NumberSerializer(Number.class);
    protected final boolean _isInt;

    /* renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        static final BigDecimalAsStringSerializer BD_INSTANCE = new BigDecimalAsStringSerializer();

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class);
        }

        public boolean _verifyBigDecimalRange(JsonGenerator jsonGenerator, BigDecimal bigDecimal) throws IOException {
            int scale = bigDecimal.scale();
            return scale >= -9999 && scale <= 9999;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.JsonSerializer
        public boolean isEmpty(SerializerProvider serializerProvider, Object obj) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            String obj2;
            if (jsonGenerator.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!_verifyBigDecimalRange(jsonGenerator, bigDecimal)) {
                    serializerProvider.reportMappingProblem(String.format(StubApp.getString2(10313), Integer.valueOf(bigDecimal.scale()), 9999, 9999), new Object[0]);
                }
                obj2 = bigDecimal.toPlainString();
            } else {
                obj2 = obj.toString();
            }
            jsonGenerator.writeString(obj2);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public String valueToString(Object obj) {
            throw new IllegalStateException();
        }
    }

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        this._isInt = cls == BigInteger.class;
    }

    public static JsonSerializer<?> bigDecimalAsStringSerializer() {
        return BigDecimalAsStringSerializer.BD_INSTANCE;
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value findFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        return (findFormatOverrides == null || AnonymousClass1.$SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[findFormatOverrides.getShape().ordinal()] != 1) ? this : handledType() == BigDecimal.class ? bigDecimalAsStringSerializer() : ToStringSerializer.instance;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(Number number, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (number instanceof BigDecimal) {
            jsonGenerator.writeNumber((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.writeNumber((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.writeNumber(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.writeNumber(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.writeNumber(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.writeNumber(number.intValue());
        } else {
            jsonGenerator.writeNumber(number.toString());
        }
    }
}
