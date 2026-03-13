package wc;

import com.stub.StubApp;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1886c {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f22357n = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22358a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22360c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22361d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22363f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22364g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22365h;

    /* renamed from: i, reason: collision with root package name */
    public final int f22366i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f22367k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f22368l;

    /* renamed from: m, reason: collision with root package name */
    public String f22369m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds(IntCompanionObject.MAX_VALUE);
    }

    public C1886c(boolean z2, boolean z10, int i3, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, boolean z14, boolean z15, boolean z16, String str) {
        this.f22358a = z2;
        this.f22359b = z10;
        this.f22360c = i3;
        this.f22361d = i10;
        this.f22362e = z11;
        this.f22363f = z12;
        this.f22364g = z13;
        this.f22365h = i11;
        this.f22366i = i12;
        this.j = z14;
        this.f22367k = z15;
        this.f22368l = z16;
        this.f22369m = str;
    }

    public final String toString() {
        String str = this.f22369m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f22358a) {
            sb2.append(StubApp.getString2(35418));
        }
        if (this.f22359b) {
            sb2.append(StubApp.getString2(35419));
        }
        int i3 = this.f22360c;
        String string2 = StubApp.getString2(81);
        if (i3 != -1) {
            sb2.append(StubApp.getString2(35420));
            sb2.append(i3);
            sb2.append(string2);
        }
        int i10 = this.f22361d;
        if (i10 != -1) {
            sb2.append(StubApp.getString2(35421));
            sb2.append(i10);
            sb2.append(string2);
        }
        if (this.f22362e) {
            sb2.append(StubApp.getString2(35422));
        }
        if (this.f22363f) {
            sb2.append(StubApp.getString2(35423));
        }
        if (this.f22364g) {
            sb2.append(StubApp.getString2(35424));
        }
        int i11 = this.f22365h;
        if (i11 != -1) {
            sb2.append(StubApp.getString2(35425));
            sb2.append(i11);
            sb2.append(string2);
        }
        int i12 = this.f22366i;
        if (i12 != -1) {
            sb2.append(StubApp.getString2(35426));
            sb2.append(i12);
            sb2.append(string2);
        }
        if (this.j) {
            sb2.append(StubApp.getString2(35427));
        }
        if (this.f22367k) {
            sb2.append(StubApp.getString2(35428));
        }
        if (this.f22368l) {
            sb2.append(StubApp.getString2(35429));
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        this.f22369m = sb3;
        return sb3;
    }
}
