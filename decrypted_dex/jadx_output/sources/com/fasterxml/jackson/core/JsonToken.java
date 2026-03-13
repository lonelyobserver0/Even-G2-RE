package com.fasterxml.jackson.core;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public enum JsonToken {
    NOT_AVAILABLE(null, -1),
    START_OBJECT(StubApp.getString2(1352), 1),
    END_OBJECT(StubApp.getString2(265), 2),
    START_ARRAY(StubApp.getString2(1557), 3),
    END_ARRAY(StubApp.getString2(511), 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE(StubApp.getString2(6547), 9),
    VALUE_FALSE(StubApp.getString2(9372), 10),
    VALUE_NULL(StubApp.getString2(1116), 11);

    final int _id;
    final boolean _isBoolean;
    final boolean _isNumber;
    final boolean _isScalar;
    final boolean _isStructEnd;
    final boolean _isStructStart;
    final String _serialized;
    final byte[] _serializedBytes;
    final char[] _serializedChars;

    JsonToken(String str, int i3) {
        boolean z2 = false;
        if (str == null) {
            this._serialized = null;
            this._serializedChars = null;
            this._serializedBytes = null;
        } else {
            this._serialized = str;
            char[] charArray = str.toCharArray();
            this._serializedChars = charArray;
            int length = charArray.length;
            this._serializedBytes = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                this._serializedBytes[i10] = (byte) this._serializedChars[i10];
            }
        }
        this._id = i3;
        this._isBoolean = i3 == 10 || i3 == 9;
        this._isNumber = i3 == 7 || i3 == 8;
        boolean z10 = i3 == 1 || i3 == 3;
        this._isStructStart = z10;
        boolean z11 = i3 == 2 || i3 == 4;
        this._isStructEnd = z11;
        if (!z10 && !z11 && i3 != 5 && i3 != -1) {
            z2 = true;
        }
        this._isScalar = z2;
    }

    public final char[] asCharArray() {
        return this._serializedChars;
    }

    public final String asString() {
        return this._serialized;
    }

    public final int id() {
        return this._id;
    }

    public final boolean isNumeric() {
        return this._isNumber;
    }

    public final boolean isScalarValue() {
        return this._isScalar;
    }

    public final boolean isStructEnd() {
        return this._isStructEnd;
    }

    public final boolean isStructStart() {
        return this._isStructStart;
    }
}
