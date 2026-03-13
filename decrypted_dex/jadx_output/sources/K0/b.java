package K0;

import java.util.ArrayList;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f3577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3579c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3580d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3581e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3582f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3583g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3584h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3585i;
    public final C1438m[] j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3586k;

    /* renamed from: l, reason: collision with root package name */
    public final String f3587l;

    /* renamed from: m, reason: collision with root package name */
    public final String f3588m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3589n;

    /* renamed from: o, reason: collision with root package name */
    public final long[] f3590o;

    /* renamed from: p, reason: collision with root package name */
    public final long f3591p;

    public b(String str, String str2, int i3, String str3, long j, String str4, int i10, int i11, int i12, int i13, String str5, C1438m[] c1438mArr, ArrayList arrayList, long[] jArr, long j3) {
        this.f3587l = str;
        this.f3588m = str2;
        this.f3577a = i3;
        this.f3578b = str3;
        this.f3579c = j;
        this.f3580d = str4;
        this.f3581e = i10;
        this.f3582f = i11;
        this.f3583g = i12;
        this.f3584h = i13;
        this.f3585i = str5;
        this.j = c1438mArr;
        this.f3589n = arrayList;
        this.f3590o = jArr;
        this.f3591p = j3;
        this.f3586k = arrayList.size();
    }

    public final b a(C1438m[] c1438mArr) {
        long[] jArr = this.f3590o;
        return new b(this.f3587l, this.f3588m, this.f3577a, this.f3578b, this.f3579c, this.f3580d, this.f3581e, this.f3582f, this.f3583g, this.f3584h, this.f3585i, c1438mArr, this.f3589n, jArr, this.f3591p);
    }

    public final long b(int i3) {
        if (i3 == this.f3586k - 1) {
            return this.f3591p;
        }
        long[] jArr = this.f3590o;
        return jArr[i3 + 1] - jArr[i3];
    }
}
