package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.stub.StubApp;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements ContextualDeserializer {
    private transient Object _emptyValue;
    protected final NullValueProvider _nuller;
    protected final Boolean _unwrapSingle;

    @JacksonStdImpl
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        public BooleanDeser() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new BooleanDeser(this, nullValueProvider, bool);
        }

        public BooleanDeser(BooleanDeser booleanDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(booleanDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z2;
            int i3;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.BooleanBuilder booleanBuilder = deserializationContext.getArrayBuilders().getBooleanBuilder();
            boolean[] resetAndStart = booleanBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return booleanBuilder.completeAndClearBuffer(resetAndStart, i10);
                    }
                    try {
                        if (nextToken == JsonToken.VALUE_TRUE) {
                            z2 = true;
                        } else {
                            if (nextToken != JsonToken.VALUE_FALSE) {
                                if (nextToken == JsonToken.VALUE_NULL) {
                                    NullValueProvider nullValueProvider = this._nuller;
                                    if (nullValueProvider != null) {
                                        nullValueProvider.getNullValue(deserializationContext);
                                    } else {
                                        _verifyNullForPrimitive(deserializationContext);
                                    }
                                } else {
                                    z2 = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                }
                            }
                            z2 = false;
                        }
                        resetAndStart[i10] = z2;
                        i10 = i3;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i3;
                        throw JsonMappingException.wrapWithPath(e, resetAndStart, booleanBuilder.bufferedSize() + i10);
                    }
                    if (i10 >= resetAndStart.length) {
                        boolean[] appendCompletedChunk = booleanBuilder.appendCompletedChunk(resetAndStart, i10);
                        i10 = 0;
                        resetAndStart = appendCompletedChunk;
                    }
                    i3 = i10 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        public ByteDeser() {
            super(byte[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers, com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.Binary;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new ByteDeser(this, nullValueProvider, bool);
        }

        public ByteDeser(ByteDeser byteDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(byteDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _constructEmpty() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte byteValue;
            int i3;
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
                } catch (StreamReadException e10) {
                    String originalMessage = e10.getOriginalMessage();
                    if (originalMessage.contains(StubApp.getString2(10758))) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.getText(), originalMessage, new Object[0]);
                    }
                }
            }
            if (currentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embeddedObject = jsonParser.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof byte[]) {
                    return (byte[]) embeddedObject;
                }
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.ByteBuilder byteBuilder = deserializationContext.getArrayBuilders().getByteBuilder();
            byte[] resetAndStart = byteBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return byteBuilder.completeAndClearBuffer(resetAndStart, i10);
                    }
                    try {
                        if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                            byteValue = jsonParser.getByteValue();
                        } else if (nextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                byteValue = 0;
                            }
                        } else {
                            byteValue = _parseBytePrimitive(jsonParser, deserializationContext);
                        }
                        resetAndStart[i10] = byteValue;
                        i10 = i3;
                    } catch (Exception e11) {
                        e = e11;
                        i10 = i3;
                        throw JsonMappingException.wrapWithPath(e, resetAndStart, byteBuilder.bufferedSize() + i10);
                    }
                    if (i10 >= resetAndStart.length) {
                        byte[] appendCompletedChunk = byteBuilder.appendCompletedChunk(resetAndStart, i10);
                        i10 = 0;
                        resetAndStart = appendCompletedChunk;
                    }
                    i3 = i10 + 1;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte byteValue;
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken == JsonToken.VALUE_NUMBER_INT) {
                byteValue = jsonParser.getByteValue();
            } else {
                if (currentToken == JsonToken.VALUE_NULL) {
                    NullValueProvider nullValueProvider = this._nuller;
                    if (nullValueProvider != null) {
                        nullValueProvider.getNullValue(deserializationContext);
                        return (byte[]) getEmptyValue(deserializationContext);
                    }
                    _verifyNullForPrimitive(deserializationContext);
                    return null;
                }
                byteValue = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{byteValue};
        }
    }

    @JacksonStdImpl
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        public CharDeser() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _constructEmpty() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String text;
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                char[] textCharacters = jsonParser.getTextCharacters();
                int textOffset = jsonParser.getTextOffset();
                int textLength = jsonParser.getTextLength();
                char[] cArr = new char[textLength];
                System.arraycopy(textCharacters, textOffset, cArr, 0, textLength);
                return cArr;
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object embeddedObject = jsonParser.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        return ((String) embeddedObject).toCharArray();
                    }
                    if (embeddedObject instanceof byte[]) {
                        return Base64Variants.getDefaultVariant().encode((byte[]) embeddedObject, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            StringBuilder sb2 = new StringBuilder(64);
            while (true) {
                JsonToken nextToken = jsonParser.nextToken();
                if (nextToken == JsonToken.END_ARRAY) {
                    return sb2.toString().toCharArray();
                }
                if (nextToken == JsonToken.VALUE_STRING) {
                    text = jsonParser.getText();
                } else if (nextToken == JsonToken.VALUE_NULL) {
                    NullValueProvider nullValueProvider = this._nuller;
                    if (nullValueProvider != null) {
                        nullValueProvider.getNullValue(deserializationContext);
                    } else {
                        _verifyNullForPrimitive(deserializationContext);
                        text = StubApp.getString2(8618);
                    }
                } else {
                    text = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                }
                if (text.length() != 1) {
                    deserializationContext.reportInputMismatch(this, StubApp.getString2(10759), Integer.valueOf(text.length()));
                }
                sb2.append(text.charAt(0));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @JacksonStdImpl
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        public DoubleDeser() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new DoubleDeser(this, nullValueProvider, bool);
        }

        public DoubleDeser(DoubleDeser doubleDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(doubleDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _constructEmpty() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            NullValueProvider nullValueProvider;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.DoubleBuilder doubleBuilder = deserializationContext.getArrayBuilders().getDoubleBuilder();
            double[] dArr = (double[]) doubleBuilder.resetAndStart();
            int i3 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return (double[]) doubleBuilder.completeAndClearBuffer(dArr, i3);
                    }
                    if (nextToken != JsonToken.VALUE_NULL || (nullValueProvider = this._nuller) == null) {
                        double _parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                        if (i3 >= dArr.length) {
                            double[] dArr2 = (double[]) doubleBuilder.appendCompletedChunk(dArr, i3);
                            i3 = 0;
                            dArr = dArr2;
                        }
                        int i10 = i3 + 1;
                        try {
                            dArr[i3] = _parseDoublePrimitive;
                            i3 = i10;
                        } catch (Exception e10) {
                            e = e10;
                            i3 = i10;
                            throw JsonMappingException.wrapWithPath(e, dArr, doubleBuilder.bufferedSize() + i3);
                        }
                    } else {
                        nullValueProvider.getNullValue(deserializationContext);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        public FloatDeser() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new FloatDeser(this, nullValueProvider, bool);
        }

        public FloatDeser(FloatDeser floatDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(floatDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _constructEmpty() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            NullValueProvider nullValueProvider;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.FloatBuilder floatBuilder = deserializationContext.getArrayBuilders().getFloatBuilder();
            float[] fArr = (float[]) floatBuilder.resetAndStart();
            int i3 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return (float[]) floatBuilder.completeAndClearBuffer(fArr, i3);
                    }
                    if (nextToken != JsonToken.VALUE_NULL || (nullValueProvider = this._nuller) == null) {
                        float _parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                        if (i3 >= fArr.length) {
                            float[] fArr2 = (float[]) floatBuilder.appendCompletedChunk(fArr, i3);
                            i3 = 0;
                            fArr = fArr2;
                        }
                        int i10 = i3 + 1;
                        try {
                            fArr[i3] = _parseFloatPrimitive;
                            i3 = i10;
                        } catch (Exception e10) {
                            e = e10;
                            i3 = i10;
                            throw JsonMappingException.wrapWithPath(e, fArr, floatBuilder.bufferedSize() + i3);
                        }
                    } else {
                        nullValueProvider.getNullValue(deserializationContext);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();

        public IntDeser() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new IntDeser(this, nullValueProvider, bool);
        }

        public IntDeser(IntDeser intDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(intDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _constructEmpty() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int intValue;
            int i3;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.IntBuilder intBuilder = deserializationContext.getArrayBuilders().getIntBuilder();
            int[] iArr = (int[]) intBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return (int[]) intBuilder.completeAndClearBuffer(iArr, i10);
                    }
                    try {
                        if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                            intValue = jsonParser.getIntValue();
                        } else if (nextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                intValue = 0;
                            }
                        } else {
                            intValue = _parseIntPrimitive(jsonParser, deserializationContext);
                        }
                        iArr[i10] = intValue;
                        i10 = i3;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i3;
                        throw JsonMappingException.wrapWithPath(e, iArr, intBuilder.bufferedSize() + i10);
                    }
                    if (i10 >= iArr.length) {
                        int[] iArr2 = (int[]) intBuilder.appendCompletedChunk(iArr, i10);
                        i10 = 0;
                        iArr = iArr2;
                    }
                    i3 = i10 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();

        public LongDeser() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new LongDeser(this, nullValueProvider, bool);
        }

        public LongDeser(LongDeser longDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(longDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _constructEmpty() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long longValue;
            int i3;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.LongBuilder longBuilder = deserializationContext.getArrayBuilders().getLongBuilder();
            long[] jArr = (long[]) longBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return (long[]) longBuilder.completeAndClearBuffer(jArr, i10);
                    }
                    try {
                        if (nextToken == JsonToken.VALUE_NUMBER_INT) {
                            longValue = jsonParser.getLongValue();
                        } else if (nextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                longValue = 0;
                            }
                        } else {
                            longValue = _parseLongPrimitive(jsonParser, deserializationContext);
                        }
                        jArr[i10] = longValue;
                        i10 = i3;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i3;
                        throw JsonMappingException.wrapWithPath(e, jArr, longBuilder.bufferedSize() + i10);
                    }
                    if (i10 >= jArr.length) {
                        long[] jArr2 = (long[]) longBuilder.appendCompletedChunk(jArr, i10);
                        i10 = 0;
                        jArr = jArr2;
                    }
                    i3 = i10 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }
    }

    @JacksonStdImpl
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        public ShortDeser() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new ShortDeser(this, nullValueProvider, bool);
        }

        public ShortDeser(ShortDeser shortDeser, NullValueProvider nullValueProvider, Boolean bool) {
            super(shortDeser, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _constructEmpty() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short _parseShortPrimitive;
            int i3;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            ArrayBuilders.ShortBuilder shortBuilder = deserializationContext.getArrayBuilders().getShortBuilder();
            short[] resetAndStart = shortBuilder.resetAndStart();
            int i10 = 0;
            while (true) {
                try {
                    JsonToken nextToken = jsonParser.nextToken();
                    if (nextToken == JsonToken.END_ARRAY) {
                        return shortBuilder.completeAndClearBuffer(resetAndStart, i10);
                    }
                    try {
                        if (nextToken == JsonToken.VALUE_NULL) {
                            NullValueProvider nullValueProvider = this._nuller;
                            if (nullValueProvider != null) {
                                nullValueProvider.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                _parseShortPrimitive = 0;
                            }
                        } else {
                            _parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                        }
                        resetAndStart[i10] = _parseShortPrimitive;
                        i10 = i3;
                    } catch (Exception e10) {
                        e = e10;
                        i10 = i3;
                        throw JsonMappingException.wrapWithPath(e, resetAndStart, shortBuilder.bufferedSize() + i10);
                    }
                    if (i10 >= resetAndStart.length) {
                        short[] appendCompletedChunk = shortBuilder.appendCompletedChunk(resetAndStart, i10);
                        i10 = 0;
                        resetAndStart = appendCompletedChunk;
                    }
                    i3 = i10 + 1;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public static JsonDeserializer<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }

    public abstract T _concat(T t3, T t10);

    public abstract T _constructEmpty();

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls findContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        NullValueProvider skipper = findContentNullStyle == Nulls.SKIP ? NullsConstantProvider.skipper() : findContentNullStyle == Nulls.FAIL ? beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass.getComponentType())) : NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType()) : null;
        return (Objects.equals(findFormatFeature, this._unwrapSingle) && skipper == this._nuller) ? this : withResolved(skipper, findFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t3) throws IOException {
        T deserialize = deserialize(jsonParser, deserializationContext);
        return (t3 == null || Array.getLength(t3) == 0) ? deserialize : _concat(t3, deserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this._emptyValue;
        if (obj != null) {
            return obj;
        }
        T _constructEmpty = _constructEmpty();
        this._emptyValue = _constructEmpty;
        return _constructEmpty;
    }

    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Boolean bool = this._unwrapSingle;
        return (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) ? handleSingleElementUnwrapped(jsonParser, deserializationContext) : (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool);

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, NullValueProvider nullValueProvider, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = nullValueProvider;
    }
}
