package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.net.InetAddress;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements ContextualSerializer {
    protected final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[RETURN] */
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
            if (r2 == 0) goto L1a
            com.fasterxml.jackson.annotation.JsonFormat$Shape r2 = r2.getShape()
            boolean r3 = r2.isNumeric()
            if (r3 != 0) goto L18
            com.fasterxml.jackson.annotation.JsonFormat$Shape r3 = com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY
            if (r2 != r3) goto L1a
        L18:
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            boolean r3 = r1._asNumeric
            if (r2 == r3) goto L25
            com.fasterxml.jackson.databind.ser.std.InetAddressSerializer r3 = new com.fasterxml.jackson.databind.ser.std.InetAddressSerializer
            r3.<init>(r2)
            return r3
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.InetAddressSerializer.createContextual(com.fasterxml.jackson.databind.SerializerProvider, com.fasterxml.jackson.databind.BeanProperty):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public InetAddressSerializer(boolean z2) {
        super(InetAddress.class);
        this._asNumeric = z2;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serialize(InetAddress inetAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String trim;
        if (this._asNumeric) {
            trim = inetAddress.getHostAddress();
        } else {
            trim = inetAddress.toString().trim();
            int indexOf = trim.indexOf(47);
            if (indexOf >= 0) {
                trim = indexOf == 0 ? trim.substring(1) : trim.substring(0, indexOf);
            }
        }
        jsonGenerator.writeString(trim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public void serializeWithType(InetAddress inetAddress, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(inetAddress, InetAddress.class, JsonToken.VALUE_STRING));
        serialize(inetAddress, jsonGenerator, serializerProvider);
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }
}
