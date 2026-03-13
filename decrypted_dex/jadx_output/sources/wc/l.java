package wc;

import com.stub.StubApp;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class l {
    public static final Pattern j = Pattern.compile(StubApp.getString2(35557));

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f22399k = Pattern.compile(StubApp.getString2(35558));

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f22400l = Pattern.compile(StubApp.getString2(35559));

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f22401m = Pattern.compile(StubApp.getString2(35560));

    /* renamed from: a, reason: collision with root package name */
    public final String f22402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22403b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22404c;

    /* renamed from: d, reason: collision with root package name */
    public final String f22405d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22406e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22407f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22408g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22409h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22410i;

    public l(String str, String str2, long j3, String str3, String str4, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.f22402a = str;
        this.f22403b = str2;
        this.f22404c = j3;
        this.f22405d = str3;
        this.f22406e = str4;
        this.f22407f = z2;
        this.f22408g = z10;
        this.f22409h = z11;
        this.f22410i = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(lVar.f22402a, this.f22402a) && Intrinsics.areEqual(lVar.f22403b, this.f22403b) && lVar.f22404c == this.f22404c && Intrinsics.areEqual(lVar.f22405d, this.f22405d) && Intrinsics.areEqual(lVar.f22406e, this.f22406e) && lVar.f22407f == this.f22407f && lVar.f22408g == this.f22408g && lVar.f22409h == this.f22409h && lVar.f22410i == this.f22410i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22410i) + i2.u.e(i2.u.e(i2.u.e(i2.u.d(i2.u.d(com.mapbox.common.b.b(i2.u.d(i2.u.d(527, 31, this.f22402a), 31, this.f22403b), 31, this.f22404c), 31, this.f22405d), 31, this.f22406e), 31, this.f22407f), 31, this.f22408g), 31, this.f22409h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22402a);
        sb2.append('=');
        sb2.append(this.f22403b);
        if (this.f22409h) {
            long j3 = this.f22404c;
            if (j3 == Long.MIN_VALUE) {
                sb2.append(StubApp.getString2(35561));
            } else {
                sb2.append(StubApp.getString2(35562));
                Date date = new Date(j3);
                Bc.c cVar = Bc.d.f752a;
                Intrinsics.checkNotNullParameter(date, "<this>");
                String format = ((DateFormat) Bc.d.f752a.get()).format(date);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f22410i) {
            sb2.append(StubApp.getString2(35563));
            sb2.append(this.f22405d);
        }
        sb2.append(StubApp.getString2(35564));
        sb2.append(this.f22406e);
        if (this.f22407f) {
            sb2.append(StubApp.getString2(35565));
        }
        if (this.f22408g) {
            sb2.append(StubApp.getString2(35566));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString()");
        return sb3;
    }
}
