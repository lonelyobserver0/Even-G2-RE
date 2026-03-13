package H0;

import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StringCodec;
import java.util.TreeSet;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2582a;

    /* renamed from: b, reason: collision with root package name */
    public int f2583b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2584c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2585d;

    public l(Za.d dVar) {
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(dVar, StubApp.getString2(2398), StringCodec.INSTANCE);
        this.f2582a = 0;
        this.f2583b = 0;
        this.f2584c = true;
        this.f2585d = basicMessageChannel;
    }

    public static int b(int i3, int i10) {
        int min;
        int i11 = i3 - i10;
        return (Math.abs(i11) <= 1000 || (min = (Math.min(i3, i10) - Math.max(i3, i10)) + Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) >= 1000) ? i11 : i3 < i10 ? min : -min;
    }

    public synchronized void a(k kVar) {
        this.f2582a = kVar.f2580a.f2575c;
        ((TreeSet) this.f2585d).add(kVar);
    }

    public synchronized C0066i c(long j) {
        if (((TreeSet) this.f2585d).isEmpty()) {
            return null;
        }
        k kVar = (k) ((TreeSet) this.f2585d).first();
        int i3 = kVar.f2580a.f2575c;
        if (i3 != C0066i.a(this.f2583b) && j < kVar.f2581b) {
            return null;
        }
        ((TreeSet) this.f2585d).pollFirst();
        this.f2583b = i3;
        return kVar.f2580a;
    }

    public synchronized void d() {
        ((TreeSet) this.f2585d).clear();
        this.f2584c = false;
        this.f2583b = -1;
        this.f2582a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r4.f2582a
            if (r0 != r5) goto L9
            boolean r1 = r4.f2584c
            if (r6 != r1) goto L9
            goto L32
        L9:
            if (r5 != 0) goto L10
            if (r0 != 0) goto L10
            r4.f2584c = r6
            return
        L10:
            int r0 = w.AbstractC1856e.c(r5)
            if (r0 == 0) goto L29
            r1 = 1
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L24
            if (r0 == r3) goto L29
            if (r0 == r2) goto L29
            r1 = 4
            if (r0 == r1) goto L29
            r0 = 0
            goto L2a
        L24:
            if (r6 == 0) goto L27
            r2 = r3
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r5
        L2a:
            r4.f2582a = r5
            r4.f2584c = r6
            int r5 = r4.f2583b
            if (r0 != r5) goto L33
        L32:
            return
        L33:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 2399(0x95f, float:3.362E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            r6 = 1
            if (r0 == r6) goto L70
            r6 = 2
            if (r0 == r6) goto L68
            r6 = 3
            if (r0 == r6) goto L60
            r6 = 4
            if (r0 == r6) goto L58
            r6 = 5
            if (r0 != r6) goto L56
            r6 = 2400(0x960, float:3.363E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            goto L77
        L56:
            r5 = 0
            throw r5
        L58:
            r6 = 2401(0x961, float:3.365E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            goto L77
        L60:
            r6 = 2402(0x962, float:3.366E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            goto L77
        L68:
            r6 = 2403(0x963, float:3.367E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            goto L77
        L70:
            r6 = 2404(0x964, float:3.369E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
        L77:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.f2585d
            io.flutter.plugin.common.BasicMessageChannel r6 = (io.flutter.plugin.common.BasicMessageChannel) r6
            r6.send(r5)
            r4.f2583b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.l.e(int, boolean):void");
    }

    public l() {
        this.f2585d = new TreeSet(new C0067j(0));
        d();
    }
}
