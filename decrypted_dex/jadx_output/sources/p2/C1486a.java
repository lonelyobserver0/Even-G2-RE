package p2;

import android.content.Intent;
import android.content.IntentFilter;
import com.stub.StubApp;
import i2.o;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1486a extends c {

    /* renamed from: i, reason: collision with root package name */
    public static final String f19655i = o.g(StubApp.getString2(22080));

    @Override // p2.d
    public final Object a() {
        Intent registerReceiver = this.f19661b.registerReceiver(null, new IntentFilter(StubApp.getString2(5738)));
        if (registerReceiver == null) {
            o.e().d(f19655i, StubApp.getString2(22081), new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(StubApp.getString2(8430), -1);
        return Boolean.valueOf(intExtra == 2 || intExtra == 5);
    }

    @Override // p2.c
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(StubApp.getString2(22082));
        intentFilter.addAction(StubApp.getString2(22083));
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r6.equals(com.stub.StubApp.getString2(22086)) == false) goto L7;
     */
    @Override // p2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L8
            goto L69
        L8:
            i2.o r1 = i2.o.e()
            r2 = 22084(0x5644, float:3.0946E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String r2 = r2.concat(r6)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r0]
            java.lang.String r4 = p2.C1486a.f19655i
            r1.b(r4, r2, r3)
            r1 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case -1886648615: goto L58;
                case -54942926: goto L48;
                case 948344062: goto L38;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r0 = r1
            goto L66
        L28:
            r0 = 22085(0x5645, float:3.0948E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L36
            goto L26
        L36:
            r0 = 3
            goto L66
        L38:
            r0 = 22082(0x5642, float:3.0943E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L46
            goto L26
        L46:
            r0 = 2
            goto L66
        L48:
            r0 = 22083(0x5643, float:3.0945E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L56
            goto L26
        L56:
            r0 = 1
            goto L66
        L58:
            r2 = 22086(0x5646, float:3.0949E-41)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L66
            goto L26
        L66:
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L76;
                case 2: goto L70;
                case 3: goto L6a;
                default: goto L69;
            }
        L69:
            return
        L6a:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            return
        L70:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            return
        L76:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            return
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C1486a.g(android.content.Intent):void");
    }
}
