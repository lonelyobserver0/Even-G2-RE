package Lc;

import Kc.C0101h;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f4397a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", StubApp.getString2(4416));
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f4397a = bytes;
    }

    public static final String a(long j, C0101h c0101h) {
        Intrinsics.checkNotNullParameter(c0101h, "<this>");
        if (j > 0) {
            long j3 = j - 1;
            if (c0101h.h(j3) == 13) {
                String J10 = c0101h.J(j3, Charsets.UTF_8);
                c0101h.skip(2L);
                return J10;
            }
        }
        c0101h.getClass();
        String J11 = c0101h.J(j, Charsets.UTF_8);
        c0101h.skip(1L);
        return J11;
    }
}
