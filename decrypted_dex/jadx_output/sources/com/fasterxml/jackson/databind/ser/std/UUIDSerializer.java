package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import com.stub.StubApp;
import java.io.IOException;
import java.util.UUID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> implements ContextualSerializer {
    static final char[] HEX_CHARS = StubApp.getString2(10372).toCharArray();
    protected final Boolean _asBinary;

    public UUIDSerializer() {
        this(null);
    }

    private static void _appendInt(int i3, char[] cArr, int i10) {
        _appendShort(i3 >> 16, cArr, i10);
        _appendShort(i3, cArr, i10 + 4);
    }

    private static void _appendShort(int i3, char[] cArr, int i10) {
        char[] cArr2 = HEX_CHARS;
        cArr[i10] = cArr2[(i3 >> 12) & 15];
        cArr[i10 + 1] = cArr2[(i3 >> 8) & 15];
        cArr[i10 + 2] = cArr2[(i3 >> 4) & 15];
        cArr[i10 + 3] = cArr2[i3 & 15];
    }

    private static final byte[] _asBytes(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        _appendInt((int) (mostSignificantBits >> 32), bArr, 0);
        _appendInt((int) mostSignificantBits, bArr, 4);
        _appendInt((int) (leastSignificantBits >> 32), bArr, 8);
        _appendInt((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    public boolean _writeAsBinary(JsonGenerator jsonGenerator) {
        Boolean bool = this._asBinary;
        return bool != null ? bool.booleanValue() : !(jsonGenerator instanceof TokenBuffer) && jsonGenerator.canWriteBinaryNatively();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.databind.JsonSerializer<?> createContextual(com.fasterxml.jackson.databind.SerializerProvider r2, com.fasterxml.jackson.databind.BeanProperty r3) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r1 = this;
            java.lang.Class r0 = r1.handledType()
            com.fasterxml.jackson.annotation.JsonFormat$Value r2 = r1.findFormatOverrides(r2, r3, r0)
            if (r2 == 0) goto L1c
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.getShape()
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.BINARY
            if (r2 != r3) goto L15
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L1d
        L15:
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING
            if (r2 != r3) goto L1c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L1d
        L1c:
            r2 = 0
        L1d:
            java.lang.Boolean r3 = r1._asBinary
            boolean r3 = java.util.Objects.equals(r2, r3)
            if (r3 != 0) goto L2b
            com.fasterxml.jackson.databind.ser.std.UUIDSerializer r3 = new com.fasterxml.jackson.databind.ser.std.UUIDSerializer
            r3.<init>(r2)
            return r3
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.UUIDSerializer.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(UUID uuid, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (_writeAsBinary(jsonGenerator)) {
            jsonGenerator.writeBinary(_asBytes(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        _appendInt((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i3 = (int) mostSignificantBits;
        _appendShort(i3 >>> 16, cArr, 9);
        cArr[13] = '-';
        _appendShort(i3, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        _appendShort((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        _appendShort((int) (leastSignificantBits >>> 32), cArr, 24);
        _appendInt((int) leastSignificantBits, cArr, 28);
        jsonGenerator.writeString(cArr, 0, 36);
    }

    private static final void _appendInt(int i3, byte[] bArr, int i10) {
        bArr[i10] = (byte) (i3 >> 24);
        bArr[i10 + 1] = (byte) (i3 >> 16);
        bArr[i10 + 2] = (byte) (i3 >> 8);
        bArr[i10 + 3] = (byte) i3;
    }
}
