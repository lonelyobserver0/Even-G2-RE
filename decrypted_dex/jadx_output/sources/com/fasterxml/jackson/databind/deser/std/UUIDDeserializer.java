package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import kotlin.UByte;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;

    static {
        int[] iArr = new int[CertificateBody.profileType];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < 10; i3++) {
            HEX_DIGITS[i3 + 48] = i3;
        }
        for (int i10 = 0; i10 < 6; i10++) {
            int[] iArr2 = HEX_DIGITS;
            int i11 = i10 + 10;
            iArr2[i10 + 97] = i11;
            iArr2[i10 + 65] = i11;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) throws IOException {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, StubApp.getString2(10766), new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        throw InvalidFormatException.from(deserializationContext.getParser(), AbstractC1482f.f(bArr.length, StubApp.getString2(693), new StringBuilder(StubApp.getString2(10767))), bArr, handledType());
    }

    private static int _int(byte[] bArr, int i3) {
        return (bArr[i3 + 3] & UByte.MAX_VALUE) | (bArr[i3] << 24) | ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8);
    }

    private static long _long(byte[] bArr, int i3) {
        return ((_int(bArr, i3 + 4) << 32) >>> 32) | (_int(bArr, i3) << 32);
    }

    public int _badChar(String str, int i3, DeserializationContext deserializationContext, char c10) throws JsonMappingException {
        throw deserializationContext.weirdStringException(str, handledType(), String.format(StubApp.getString2(10768), Character.valueOf(c10), Integer.toHexString(c10)));
    }

    public int byteFromChars(String str, int i3, DeserializationContext deserializationContext) throws JsonMappingException {
        char charAt = str.charAt(i3);
        int i10 = i3 + 1;
        char charAt2 = str.charAt(i10);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i11 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i11 >= 0) {
                return i11;
            }
        }
        return (charAt > 127 || HEX_DIGITS[charAt] < 0) ? _badChar(str, i3, deserializationContext, charAt) : _badChar(str, i10, deserializationContext, charAt2);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new UUID(0L, 0L);
    }

    public int intFromChars(String str, int i3, DeserializationContext deserializationContext) throws JsonMappingException {
        return byteFromChars(str, i3 + 6, deserializationContext) + (byteFromChars(str, i3, deserializationContext) << 24) + (byteFromChars(str, i3 + 2, deserializationContext) << 16) + (byteFromChars(str, i3 + 4, deserializationContext) << 8);
    }

    public int shortFromChars(String str, int i3, DeserializationContext deserializationContext) throws JsonMappingException {
        return byteFromChars(str, i3 + 2, deserializationContext) + (byteFromChars(str, i3, deserializationContext) << 8);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            return str.length() == 24 ? _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext) : _badFormat(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            _badFormat(str, deserializationContext);
        }
        return new UUID((intFromChars(str, 0, deserializationContext) << 32) + ((shortFromChars(str, 9, deserializationContext) << 16) | shortFromChars(str, 14, deserializationContext)), ((intFromChars(str, 28, deserializationContext) << 32) >>> 32) | ((shortFromChars(str, 24, deserializationContext) | (shortFromChars(str, 19, deserializationContext) << 16)) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        return obj instanceof byte[] ? _fromBytes((byte[]) obj, deserializationContext) : (UUID) super._deserializeEmbedded(obj, deserializationContext);
    }
}
