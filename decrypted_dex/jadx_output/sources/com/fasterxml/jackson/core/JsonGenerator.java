package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_BINARY_WRITE_CAPABILITIES;
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_TEXTUAL_WRITE_CAPABILITIES;
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_WRITE_CAPABILITIES;
    protected PrettyPrinter _cfgPrettyPrinter;

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z2) {
            this._defaultState = z2;
        }

        public static int collectDefaults() {
            int i3 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i3 |= feature.getMask();
                }
            }
            return i3;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i3) {
            return (i3 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    static {
        JacksonFeatureSet<StreamWriteCapability> fromDefaults = JacksonFeatureSet.fromDefaults(StreamWriteCapability.values());
        DEFAULT_WRITE_CAPABILITIES = fromDefaults;
        DEFAULT_TEXTUAL_WRITE_CAPABILITIES = fromDefaults.with(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        DEFAULT_BINARY_WRITE_CAPABILITIES = fromDefaults.with(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    public void _reportError(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public final void _verifyOffsets(int i3, int i10, int i11) {
        if (i10 < 0 || i10 + i11 > i3) {
            throw new IllegalArgumentException(String.format(StubApp.getString2(10259), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i3)));
        }
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract JsonGenerator disable(Feature feature);

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public abstract JsonStreamContext getOutputContext();

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public abstract boolean isEnabled(Feature feature);

    public JsonGenerator overrideFormatFeatures(int i3, int i10) {
        return this;
    }

    public abstract JsonGenerator overrideStdFeatures(int i3, int i10);

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    public JsonGenerator setHighestNonEscapedChar(int i3) {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void writeArray(int[] iArr, int i3, int i10) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException(StubApp.getString2(10260));
        }
        _verifyOffsets(iArr.length, i3, i10);
        writeStartArray(iArr, i10);
        int i11 = i10 + i3;
        while (i3 < i11) {
            writeNumber(iArr[i3]);
            i3++;
        }
        writeEndArray();
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i3) throws IOException;

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i3, int i10) throws IOException;

    public void writeBinary(byte[] bArr, int i3, int i10) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i3, i10);
    }

    public abstract void writeBoolean(boolean z2) throws IOException;

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public void writeFieldId(long j) throws IOException {
        writeFieldName(Long.toString(j));
    }

    public abstract void writeFieldName(SerializableString serializableString) throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeNull() throws IOException;

    public abstract void writeNumber(double d8) throws IOException;

    public abstract void writeNumber(float f10) throws IOException;

    public abstract void writeNumber(int i3) throws IOException;

    public abstract void writeNumber(long j) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public void writeNumber(short s10) throws IOException {
        writeNumber((int) s10);
    }

    public void writeObjectId(Object obj) throws IOException {
        throw new JsonGenerationException(StubApp.getString2(10261), this);
    }

    public void writeObjectRef(Object obj) throws IOException {
        throw new JsonGenerationException(StubApp.getString2(10261), this);
    }

    public void writeOmittedField(String str) throws IOException {
    }

    public abstract void writeRaw(char c10) throws IOException;

    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str) throws IOException;

    public abstract void writeRaw(char[] cArr, int i3, int i10) throws IOException;

    public void writeRawValue(SerializableString serializableString) throws IOException {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str) throws IOException;

    public abstract void writeStartArray() throws IOException;

    public abstract void writeStartArray(Object obj) throws IOException;

    public abstract void writeStartArray(Object obj, int i3) throws IOException;

    public abstract void writeStartObject() throws IOException;

    public abstract void writeStartObject(Object obj) throws IOException;

    public abstract void writeStartObject(Object obj, int i3) throws IOException;

    public abstract void writeString(SerializableString serializableString) throws IOException;

    public abstract void writeString(String str) throws IOException;

    public abstract void writeString(char[] cArr, int i3, int i10) throws IOException;

    public void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }

    public void writeTypeId(Object obj) throws IOException {
        throw new JsonGenerationException(StubApp.getString2(10262), this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.include = inclusion;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[inclusion.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, valueOf);
                    return writableTypeId;
                }
                if (i3 != 4) {
                    writeStartArray();
                    writeString(valueOf);
                } else {
                    writeStartObject();
                    writeFieldName(valueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
            return writableTypeId;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int i3 = AnonymousClass1.$SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion[writableTypeId.include.ordinal()];
            if (i3 == 1) {
                Object obj = writableTypeId.id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i3 != 2 && i3 != 3) {
                if (i3 != 5) {
                    writeEndObject();
                    return writableTypeId;
                }
                writeEndArray();
                return writableTypeId;
            }
        }
        return writableTypeId;
    }

    public void writeBinary(byte[] bArr) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public int writeBinary(InputStream inputStream, int i3) throws IOException {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i3);
    }

    public void writeArray(long[] jArr, int i3, int i10) throws IOException {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i3, i10);
            writeStartArray(jArr, i10);
            int i11 = i10 + i3;
            while (i3 < i11) {
                writeNumber(jArr[i3]);
                i3++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(10260));
    }

    public void writeArray(double[] dArr, int i3, int i10) throws IOException {
        if (dArr != null) {
            _verifyOffsets(dArr.length, i3, i10);
            writeStartArray(dArr, i10);
            int i11 = i10 + i3;
            while (i3 < i11) {
                writeNumber(dArr[i3]);
                i3++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(10260));
    }
}
