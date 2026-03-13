package com.google.protobuf;

import com.stub.StubApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12119a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12120b;

    static {
        Charset.forName(StubApp.getString2(2879));
        f12119a = Charset.forName(StubApp.getString2(640));
        Charset.forName(StubApp.getString2(2882));
        byte[] bArr = new byte[0];
        f12120b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC0741n.f(bArr, 0, 0, false);
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
