package x5;

import android.util.Base64;
import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f22886a = Byte.parseByte(StubApp.getString2(24177), 2);

    /* renamed from: b, reason: collision with root package name */
    public static final byte f22887b = Byte.parseByte(StubApp.getString2(24178), 2);

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b2 = array[0];
        array[16] = b2;
        array[0] = (byte) ((b2 & f22887b) | f22886a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
