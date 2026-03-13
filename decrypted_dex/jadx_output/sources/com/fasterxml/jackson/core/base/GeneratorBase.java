package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.stub.StubApp;
import java.io.IOException;
import java.math.BigDecimal;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class GeneratorBase extends JsonGenerator {
    protected static final int DERIVED_FEATURES_MASK = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    public GeneratorBase(int i3, ObjectCodec objectCodec) {
        this._features = i3;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i3) ? DupDetector.rootDetector(this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i3);
    }

    public String _asString(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            _reportError(String.format(StubApp.getString2(10313), Integer.valueOf(scale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    public void _checkRangeBoundsForByteArray(byte[] bArr, int i3, int i10) throws IOException {
        if (bArr == null) {
            _reportError(StubApp.getString2(10314));
        }
        int length = bArr.length;
        int i11 = i3 + i10;
        if (((length - i11) | i3 | i10 | i11) < 0) {
            _reportError(String.format(StubApp.getString2(10315), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(length)));
        }
    }

    public void _checkRangeBoundsForCharArray(char[] cArr, int i3, int i10) throws IOException {
        if (cArr == null) {
            _reportError(StubApp.getString2(10316));
        }
        int length = cArr.length;
        int i11 = i3 + i10;
        if (((length - i11) | i3 | i10 | i11) < 0) {
            _reportError(String.format(StubApp.getString2(10317), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(length)));
        }
    }

    public void _checkRangeBoundsForString(String str, int i3, int i10) throws IOException {
        if (str == null) {
            _reportError(StubApp.getString2(10318));
        }
        int length = str.length();
        int i11 = i3 + i10;
        if (((length - i11) | i3 | i10 | i11) < 0) {
            _reportError(String.format(StubApp.getString2(10319), Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(length)));
        }
    }

    public void _checkStdFeatureChanges(int i3, int i10) {
        if ((DERIVED_FEATURES_MASK & i10) == 0) {
            return;
        }
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i3);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i10)) {
            if (feature.enabledIn(i3)) {
                setHighestNonEscapedChar(CertificateBody.profileType);
            } else {
                setHighestNonEscapedChar(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i10)) {
            if (!feature2.enabledIn(i3)) {
                this._writeContext = this._writeContext.withDupDetector(null);
            } else if (this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
            }
        }
    }

    public final int _decodeSurrogate(int i3, int i10) throws IOException {
        if (i10 < 56320 || i10 > 57343) {
            _reportError(String.format(StubApp.getString2(10320), Integer.valueOf(i3), Integer.valueOf(i10)));
        }
        return (i10 - 56320) + ((i3 - 55296) << 10) + PKIFailureInfo.notAuthorized;
    }

    public abstract void _verifyValueWrite(String str) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= ~mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
                return this;
            }
            if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
                return this;
            }
            if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i3, int i10) {
        int i11 = this._features;
        int i12 = (i3 & i10) | ((~i10) & i11);
        int i13 = i11 ^ i12;
        if (i13 != 0) {
            this._features = i12;
            _checkStdFeatureChanges(i12, i13);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void setCurrentValue(Object obj) {
        JsonWriteContext jsonWriteContext = this._writeContext;
        if (jsonWriteContext != null) {
            jsonWriteContext.setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _verifyValueWrite(StubApp.getString2(10321));
        writeRaw(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite(StubApp.getString2(10321));
        writeRaw(serializableString);
    }

    public GeneratorBase(int i3, ObjectCodec objectCodec, JsonWriteContext jsonWriteContext) {
        this._features = i3;
        this._objectCodec = objectCodec;
        this._writeContext = jsonWriteContext;
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i3);
    }
}
