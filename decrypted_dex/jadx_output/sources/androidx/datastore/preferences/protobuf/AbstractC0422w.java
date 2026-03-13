package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0422w {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f9852a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f9853b;

    static {
        Charset.forName("US-ASCII");
        f9852a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9853b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0408h(bArr, 0, 0, false).f(0);
        } catch (C0424y e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
