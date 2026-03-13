package w0;

import L0.B;
import L4.m;
import java.util.HashMap;
import java.util.Random;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1415L;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e {

    /* renamed from: h, reason: collision with root package name */
    public static final m f22005h = new m(3);

    /* renamed from: i, reason: collision with root package name */
    public static final Random f22006i = new Random();

    /* renamed from: d, reason: collision with root package name */
    public h f22010d;

    /* renamed from: f, reason: collision with root package name */
    public String f22012f;

    /* renamed from: a, reason: collision with root package name */
    public final C1415L f22007a = new C1415L();

    /* renamed from: b, reason: collision with root package name */
    public final C1414K f22008b = new C1414K();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f22009c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1416M f22011e = AbstractC1416M.f18066a;

    /* renamed from: g, reason: collision with root package name */
    public long f22013g = -1;

    public final void a(d dVar) {
        long j = dVar.f22000c;
        if (j != -1) {
            this.f22013g = j;
        }
        this.f22012f = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        if (r13 != (-1)) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.d b(int r18, L0.B r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.util.HashMap r3 = r0.f22009c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9d
            java.lang.Object r8 = r4.next()
            w0.d r8 = (w0.d) r8
            long r9 = r8.f22000c
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L52
            int r9 = r8.f21999b
            if (r1 != r9) goto L52
            if (r2 == 0) goto L52
            w0.e r9 = r8.f22004g
            java.util.HashMap r10 = r9.f22009c
            java.lang.String r13 = r9.f22012f
            java.lang.Object r10 = r10.get(r13)
            w0.d r10 = (w0.d) r10
            if (r10 == 0) goto L45
            long r13 = r10.f22000c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 == 0) goto L45
            goto L4a
        L45:
            long r9 = r9.f22013g
            r13 = 1
            long r13 = r13 + r9
        L4a:
            long r9 = r2.f3884d
            int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r13 < 0) goto L52
            r8.f22000c = r9
        L52:
            L0.B r9 = r8.f22001d
            if (r2 != 0) goto L5c
            int r10 = r8.f21999b
            if (r1 != r10) goto L16
            r15 = r11
            goto L81
        L5c:
            long r13 = r2.f3884d
            if (r9 != 0) goto L6e
            boolean r10 = r2.b()
            if (r10 != 0) goto L16
            r15 = r11
            long r11 = r8.f22000c
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L16
            goto L81
        L6e:
            r15 = r11
            long r10 = r9.f3884d
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 != 0) goto L16
            int r10 = r2.f3882b
            int r11 = r9.f3882b
            if (r10 != r11) goto L16
            int r10 = r2.f3883c
            int r11 = r9.f3883c
            if (r10 != r11) goto L16
        L81:
            long r10 = r8.f22000c
            int r12 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8c
            goto L99
        L8c:
            if (r12 != 0) goto L16
            int r10 = r0.AbstractC1560u.f20190a
            L0.B r10 = r5.f22001d
            if (r10 == 0) goto L16
            if (r9 == 0) goto L16
            r5 = r8
            goto L16
        L99:
            r5 = r8
            r6 = r10
            goto L16
        L9d:
            if (r5 != 0) goto Laf
            L4.m r4 = w0.e.f22005h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            w0.d r5 = new w0.d
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.e.b(int, L0.B):w0.d");
    }

    public final synchronized String c(AbstractC1416M abstractC1416M, B b2) {
        return b(abstractC1416M.g(b2.f3881a, this.f22008b).f18044c, b2).f21998a;
    }

    public final void d(a aVar) {
        B b2;
        boolean p8 = aVar.f21980b.p();
        HashMap hashMap = this.f22009c;
        if (p8) {
            String str = this.f22012f;
            if (str != null) {
                d dVar = (d) hashMap.get(str);
                dVar.getClass();
                a(dVar);
                return;
            }
            return;
        }
        d dVar2 = (d) hashMap.get(this.f22012f);
        int i3 = aVar.f21981c;
        B b10 = aVar.f21982d;
        this.f22012f = b(i3, b10).f21998a;
        e(aVar);
        if (b10 == null || !b10.b()) {
            return;
        }
        long j = b10.f3884d;
        if (dVar2 != null && dVar2.f22000c == j && (b2 = dVar2.f22001d) != null && b2.f3882b == b10.f3882b && b2.f3883c == b10.f3883c) {
            return;
        }
        b(i3, new B(b10.f3881a, j));
        this.f22010d.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: all -> 0x0050, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0010, B:10:0x0014, B:12:0x0024, B:19:0x0036, B:21:0x0042, B:23:0x0048, B:27:0x002b, B:29:0x0053, B:31:0x005f, B:32:0x0063, B:34:0x0068, B:36:0x006e, B:38:0x0085, B:39:0x00b2, B:41:0x00b6, B:42:0x00bd, B:44:0x00c7, B:46:0x00cb, B:48:0x00d8, B:51:0x00df), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(w0.a r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.e.e(w0.a):void");
    }
}
