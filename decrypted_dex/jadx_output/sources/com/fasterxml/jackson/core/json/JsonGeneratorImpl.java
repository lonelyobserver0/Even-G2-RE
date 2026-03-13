package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonGeneratorImpl extends GeneratorBase {
    protected boolean _cfgUnqNames;
    protected boolean _cfgWriteHexUppercase;
    protected final IOContext _ioContext;
    protected int _maximumNonEscapedChar;
    protected int[] _outputEscapes;
    protected SerializableString _rootValueSeparator;
    protected static final int[] sOutputEscapes = CharTypes.get7BitOutputEscapes();
    protected static final JacksonFeatureSet<StreamWriteCapability> JSON_WRITE_CAPABILITIES = JsonGenerator.DEFAULT_TEXTUAL_WRITE_CAPABILITIES;

    public JsonGeneratorImpl(IOContext iOContext, int i3, ObjectCodec objectCodec) {
        super(i3, objectCodec);
        this._outputEscapes = sOutputEscapes;
        this._rootValueSeparator = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this._ioContext = iOContext;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i3)) {
            this._maximumNonEscapedChar = CertificateBody.profileType;
        }
        this._cfgWriteHexUppercase = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.enabledIn(i3);
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i3);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _checkStdFeatureChanges(int i3, int i10) {
        super._checkStdFeatureChanges(i3, i10);
        this._cfgUnqNames = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i3);
        this._cfgWriteHexUppercase = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.enabledIn(i3);
    }

    public void _reportCantWriteValueExpectName(String str) throws IOException {
        _reportError(AbstractC1482f.j(StubApp.getString2(10411), str, StubApp.getString2(10412), this._writeContext.typeDesc(), StubApp.getString2(74)));
    }

    public void _verifyPrettyValueWrite(String str, int i3) throws IOException {
        if (i3 == 0) {
            if (this._writeContext.inArray()) {
                this._cfgPrettyPrinter.beforeArrayValues(this);
                return;
            } else {
                if (this._writeContext.inObject()) {
                    this._cfgPrettyPrinter.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i3 == 1) {
            this._cfgPrettyPrinter.writeArrayValueSeparator(this);
            return;
        }
        if (i3 == 2) {
            this._cfgPrettyPrinter.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i3 == 3) {
            this._cfgPrettyPrinter.writeRootValueSeparator(this);
        } else if (i3 != 5) {
            _throwInternal();
        } else {
            _reportCantWriteValueExpectName(str);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        super.disable(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this._cfgUnqNames = true;
            return this;
        }
        if (feature == JsonGenerator.Feature.WRITE_HEX_UPPER_CASE) {
            this._cfgWriteHexUppercase = false;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setHighestNonEscapedChar(int i3) {
        if (i3 < 0) {
            i3 = 0;
        }
        this._maximumNonEscapedChar = i3;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        this._rootValueSeparator = serializableString;
        return this;
    }
}
