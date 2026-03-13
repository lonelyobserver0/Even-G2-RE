package e5;

import android.util.Log;
import com.stub.StubApp;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class m implements InterfaceC0845d {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f13631c = Charset.forName(StubApp.getString2(640));

    /* renamed from: a, reason: collision with root package name */
    public final File f13632a;

    /* renamed from: b, reason: collision with root package name */
    public l f13633b;

    public m(File file) {
        this.f13632a = file;
    }

    public final void a() {
        File file = this.f13632a;
        if (this.f13633b == null) {
            try {
                this.f13633b = new l(file);
            } catch (IOException e10) {
                Log.e(StubApp.getString2(280), StubApp.getString2(17318) + file, e10);
            }
        }
    }

    @Override // e5.InterfaceC0845d
    public final void b() {
        c5.f.b(this.f13633b, StubApp.getString2(17319));
        this.f13633b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    @Override // e5.InterfaceC0845d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c() {
        /*
            r7 = this;
            java.io.File r0 = r7.f13632a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L42
        Lc:
            r7.a()
            e5.l r0 = r7.f13633b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.F()
            byte[] r0 = new byte[r0]
            e5.l r4 = r7.f13633b     // Catch: java.io.IOException -> L29
            e5.f r5 = new e5.f     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.e(r5)     // Catch: java.io.IOException -> L29
            goto L3b
        L29:
            r4 = move-exception
            r5 = 280(0x118, float:3.92E-43)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            r6 = 17320(0x43a8, float:2.427E-41)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            android.util.Log.e(r5, r6, r4)
        L3b:
            X5.a r4 = new X5.a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L42:
            if (r4 != 0) goto L46
            r3 = r1
            goto L4f
        L46:
            int r0 = r4.f8409b
            byte[] r3 = new byte[r0]
            byte[] r4 = r4.f8408a
            java.lang.System.arraycopy(r4, r2, r3, r2, r0)
        L4f:
            if (r3 == 0) goto L59
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = e5.m.f13631c
            r0.<init>(r3, r1)
            return r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.m.c():java.lang.String");
    }

    @Override // e5.InterfaceC0845d
    public final void d(long j, String str) {
        a();
        String string2 = StubApp.getString2(397);
        String string22 = StubApp.getString2(10450);
        if (this.f13633b == null) {
            return;
        }
        if (str == null) {
            str = StubApp.getString2(1116);
        }
        try {
            if (str.length() > 16384) {
                str = string22 + str.substring(str.length() - 16384);
            }
            this.f13633b.a(String.format(Locale.US, StubApp.getString2("17321"), Long.valueOf(j), str.replaceAll(StubApp.getString2("4949"), string2).replaceAll(StubApp.getString2("3692"), string2)).getBytes(f13631c));
            while (!this.f13633b.h() && this.f13633b.F() > 65536) {
                this.f13633b.v();
            }
        } catch (IOException e10) {
            Log.e(StubApp.getString2(280), StubApp.getString2(17322), e10);
        }
    }
}
