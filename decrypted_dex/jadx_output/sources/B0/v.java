package B0;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class v extends IOException {
    public /* synthetic */ v(IndexOutOfBoundsException indexOutOfBoundsException) {
        super(StubApp.getString2(516), indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v(long r3, long r5, int r7, java.lang.IndexOutOfBoundsException r8) {
        /*
            r2 = this;
            java.util.Locale r0 = java.util.Locale.US
            r0 = 512(0x200, float:7.17E-43)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 513(0x201, float:7.19E-43)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.StringBuilder r3 = p0.AbstractC1482f.m(r3, r0, r1)
            r3.append(r5)
            r4 = 514(0x202, float:7.2E-43)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = 515(0x203, float:7.22E-43)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            java.lang.String r3 = r4.concat(r3)
            r2.<init>(r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.v.<init>(long, long, int, java.lang.IndexOutOfBoundsException):void");
    }

    public v(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super(StubApp.getString2(515).concat(str), indexOutOfBoundsException);
    }
}
