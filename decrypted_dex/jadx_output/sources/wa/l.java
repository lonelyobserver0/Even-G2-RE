package wa;

import aa.C0395b;
import android.util.Log;
import com.stub.StubApp;
import da.InterfaceC0813c;
import da.J;
import fa.C0935a;
import java.util.HashMap;
import java.util.HashSet;
import ta.C1747g;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l extends j {

    /* renamed from: k, reason: collision with root package name */
    public final J f22222k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f22223l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f22224m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f22225n;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0813c f22226p;

    /* renamed from: q, reason: collision with root package name */
    public Ia.b f22227q;

    /* renamed from: r, reason: collision with root package name */
    public C0935a f22228r;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f22229s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(oa.C1471d r7, wa.s r8) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.l.<init>(oa.d, wa.s):void");
    }

    @Override // wa.o
    public final Ia.b a() {
        if (this.f22227q == null) {
            this.f22227q = new Ia.b(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
        }
        return this.f22227q;
    }

    @Override // wa.o
    public final C0935a b() {
        C1747g a3;
        if (this.f22228r == null) {
            this.f22228r = (k() == null || (a3 = k().a()) == null || (Float.compare(a3.a(), 0.0f) == 0 && Float.compare(a3.b(), 0.0f) == 0 && Float.compare(a3.c(), 0.0f) == 0 && Float.compare(a3.d(), 0.0f) == 0)) ? this.f22222k.d() : new C0935a(a3.a(), a3.b(), a3.c(), a3.d());
        }
        return this.f22228r;
    }

    @Override // wa.o
    public final float c(int i3) {
        int f10 = f(i3);
        J j = this.f22222k;
        float k3 = j.k(f10);
        int H2 = j.H();
        return H2 != 1000 ? (1000.0f / H2) * k3 : k3;
    }

    @Override // wa.o
    public final boolean d() {
        return this.f22224m;
    }

    @Override // wa.j
    public final int e(int i3) {
        String str;
        C0395b c0395b = this.f22207a.f22254l;
        if (c0395b.j.isEmpty() && c0395b.f9339k.isEmpty()) {
            HashMap hashMap = c0395b.f9337h;
            if (!hashMap.isEmpty() && (str = (String) hashMap.get(Integer.valueOf(i3))) != null) {
                return str.codePointAt(0);
            }
        }
        return c0395b.b(i3);
    }

    @Override // wa.j
    public final int f(int i3) {
        boolean z2 = this.f22224m;
        int[] iArr = this.f22223l;
        if (z2) {
            int e10 = e(i3);
            if (iArr != null) {
                if (e10 < iArr.length) {
                    return iArr[e10];
                }
            } else if (e10 < this.f22222k.A()) {
                return e10;
            }
        } else {
            String string2 = StubApp.getString2(948);
            if (iArr == null || this.f22225n) {
                String r8 = this.f22207a.r(i3);
                if (r8 != null) {
                    if (r8.length() > 1) {
                        Log.w(string2, StubApp.getString2(23987));
                    }
                    return this.f22226p.e(r8.codePointAt(0));
                }
                HashSet hashSet = this.f22229s;
                if (!hashSet.contains(Integer.valueOf(i3))) {
                    hashSet.add(Integer.valueOf(i3));
                    Log.w(string2, StubApp.getString2(23986) + i3 + StubApp.getString2(943) + h());
                }
                return e(i3);
            }
            Log.w(string2, StubApp.getString2(23985) + h());
            int e11 = e(i3);
            if (e11 < iArr.length) {
                return iArr[e11];
            }
        }
        return 0;
    }
}
