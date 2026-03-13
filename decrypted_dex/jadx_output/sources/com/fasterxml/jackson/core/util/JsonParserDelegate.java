package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonParserDelegate extends JsonParser {
    protected JsonParser delegate;

    public JsonParserDelegate(JsonParser jsonParser) {
        this.delegate = jsonParser;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean canReadObjectId() {
        return this.delegate.canReadObjectId();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean canReadTypeId() {
        return this.delegate.canReadTypeId();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        this.delegate.clearCurrentToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String currentName() throws IOException {
        return this.delegate.currentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this.delegate.currentToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int currentTokenId() {
        return this.delegate.currentTokenId();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        return this.delegate.getBigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        return this.delegate.getBinaryValue(base64Variant);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean getBooleanValue() throws IOException {
        return this.delegate.getBooleanValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte getByteValue() throws IOException {
        return this.delegate.getByteValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this.delegate.getCodec();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return this.delegate.getCurrentLocation();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        return this.delegate.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this.delegate.getCurrentToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        return this.delegate.getDecimalValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        return this.delegate.getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() throws IOException {
        return this.delegate.getEmbeddedObject();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return this.delegate.getFloatValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
        return this.delegate.getIntValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        return this.delegate.getLongValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        return this.delegate.getNumberType();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        return this.delegate.getNumberValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValueExact() throws IOException {
        return this.delegate.getNumberValueExact();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getObjectId() throws IOException {
        return this.delegate.getObjectId();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonStreamContext getParsingContext() {
        return this.delegate.getParsingContext();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return this.delegate.getReadCapabilities();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public short getShortValue() throws IOException {
        return this.delegate.getShortValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        return this.delegate.getText();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        return this.delegate.getTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        return this.delegate.getTextLength();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        return this.delegate.getTextOffset();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return this.delegate.getTokenLocation();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getTypeId() throws IOException {
        return this.delegate.getTypeId();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        return this.delegate.getValueAsInt();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        return this.delegate.getValueAsLong();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        return this.delegate.getValueAsString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this.delegate.hasCurrentToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        return this.delegate.hasTextCharacters();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasToken(JsonToken jsonToken) {
        return this.delegate.hasToken(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i3) {
        return this.delegate.hasTokenId(i3);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedNumberIntToken() {
        return this.delegate.isExpectedNumberIntToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this.delegate.isExpectedStartArrayToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this.delegate.isExpectedStartObjectToken();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() throws IOException {
        return this.delegate.isNaN();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideFormatFeatures(int i3, int i10) {
        this.delegate.overrideFormatFeatures(i3, i10);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i3, int i10) {
        this.delegate.overrideStdFeatures(i3, i10);
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        return this.delegate.readBinaryValue(base64Variant, outputStream);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean requiresCustomCodec() {
        return this.delegate.requiresCustomCodec();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this.delegate.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i3) {
        this.delegate.setFeatureMask(i3);
        return this;
    }
}
