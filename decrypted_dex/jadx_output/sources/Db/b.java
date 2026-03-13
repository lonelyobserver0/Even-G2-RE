package Db;

import com.stub.StubApp;
import vb.EnumC1846c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1846c f1531a;

    /* renamed from: b, reason: collision with root package name */
    public final Hb.a f1532b;

    public b(EnumC1846c enumC1846c) {
        super(StubApp.getString2(1564) + enumC1846c);
        this.f1531a = enumC1846c;
        this.f1532b = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(Hb.b r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 1564(0x61c, float:2.192E-42)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            r0.<init>(r1)
            Hb.a r1 = r3.groupReturnCode
            if (r1 == 0) goto L11
            goto L17
        L11:
            int r1 = r3.f3016rc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L17:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            int r0 = r3.f3016rc
            vb.c r0 = vb.EnumC1846c.a(r0)
            r2.f1531a = r0
            Hb.a r3 = r3.groupReturnCode
            r2.f1532b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Db.b.<init>(Hb.b):void");
    }
}
