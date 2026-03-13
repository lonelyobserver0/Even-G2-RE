package t0;

import android.net.Uri;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o0.AbstractC1448w;
import p0.AbstractC1482f;
import r0.AbstractC1550k;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1711k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f21076i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f21077a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21078b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f21079c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f21080d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21081e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21082f;

    /* renamed from: g, reason: collision with root package name */
    public final String f21083g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21084h;

    static {
        AbstractC1448w.a(StubApp.getString2(23390));
    }

    public C1711k(Uri uri, int i3, byte[] bArr, Map map, long j, long j3, String str, int i10) {
        AbstractC1550k.c(j >= 0);
        AbstractC1550k.c(j >= 0);
        AbstractC1550k.c(j3 > 0 || j3 == -1);
        uri.getClass();
        this.f21077a = uri;
        this.f21078b = i3;
        this.f21079c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f21080d = Collections.unmodifiableMap(new HashMap(map));
        this.f21081e = j;
        this.f21082f = j3;
        this.f21083g = str;
        this.f21084h = i10;
    }

    public final C1711k a(long j) {
        long j3 = this.f21082f;
        long j10 = j3 != -1 ? j3 - j : -1L;
        if (j == 0 && j3 == j10) {
            return this;
        }
        return new C1711k(this.f21077a, this.f21078b, this.f21079c, this.f21080d, this.f21081e + j, j10, this.f21083g, this.f21084h);
    }

    public final String toString() {
        String string2;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(23391));
        int i3 = this.f21078b;
        if (i3 == 1) {
            string2 = StubApp.getString2(595);
        } else if (i3 == 2) {
            string2 = StubApp.getString2(13314);
        } else {
            if (i3 != 3) {
                throw new IllegalStateException();
            }
            string2 = StubApp.getString2(13312);
        }
        sb2.append(string2);
        sb2.append(StubApp.getString2(397));
        sb2.append(this.f21077a);
        String string22 = StubApp.getString2(81);
        sb2.append(string22);
        sb2.append(this.f21081e);
        sb2.append(string22);
        sb2.append(this.f21082f);
        sb2.append(string22);
        sb2.append(this.f21083g);
        sb2.append(string22);
        return AbstractC1482f.f(this.f21084h, StubApp.getString2(511), sb2);
    }
}
