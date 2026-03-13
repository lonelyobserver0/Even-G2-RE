package H0;

import android.net.Uri;
import com.stub.StubApp;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final long f2486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2487b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f2488c;

    public E(int i3, long j, Uri uri) {
        this.f2486a = j;
        this.f2487b = i3;
        this.f2488c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8 A[Catch: Exception -> 0x007a, TRY_LEAVE, TryCatch #0 {Exception -> 0x007a, blocks: (B:7:0x0043, B:20:0x00a4, B:25:0x00ad, B:26:0x00b2, B:29:0x00b3, B:30:0x00b8, B:31:0x006c, B:34:0x007c, B:37:0x008b), top: B:6:0x0043 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static M4.Z a(android.net.Uri r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.E.a(android.net.Uri, java.lang.String):M4.Z");
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        AbstractC1550k.c(scheme.equals(StubApp.getString2(2362)));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse(StubApp.getString2(2363) + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return parse2;
        }
        String string2 = StubApp.getString2(601);
        return uri2.endsWith(string2) ? AbstractC1550k.u(uri2, str) : AbstractC1550k.u(uri2.concat(string2), str);
    }
}
