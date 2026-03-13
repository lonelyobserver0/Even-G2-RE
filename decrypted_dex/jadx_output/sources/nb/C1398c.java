package nb;

import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* renamed from: nb.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1398c extends StandardMessageCodec {

    /* renamed from: a, reason: collision with root package name */
    public static final C1398c f17888a = new C1398c();

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final Object readValueOfType(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.readValueOfType(b2, byteBuffer);
        }
        Object readValue = readValue(byteBuffer);
        if (readValue == null) {
            return null;
        }
        return EnumC1399d.values()[((Long) readValue).intValue()];
    }

    @Override // io.flutter.plugin.common.StandardMessageCodec
    public final void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof EnumC1399d)) {
            super.writeValue(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((EnumC1399d) obj).f17890a));
        }
    }
}
