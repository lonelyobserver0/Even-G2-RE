package t0;

import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: t0.s, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1719s extends C1709i {

    /* renamed from: c, reason: collision with root package name */
    public final int f21113c;

    public C1719s() {
        super(2008);
        this.f21113c = 1;
    }

    public static C1719s a(IOException iOException, int i3) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC0624h2.y(message).matches(StubApp.getString2(23415))) ? 2001 : 2007;
        return i10 == 2007 ? new C1718r(StubApp.getString2(23416), iOException, 2007) : new C1719s(iOException, i10, i3);
    }

    public C1719s(String str, int i3) {
        super(str, i3 == 2000 ? 2001 : i3);
        this.f21113c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1719s(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r3, r2)
            r1.f21113c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1719s.<init>(java.io.IOException, int, int):void");
    }

    public C1719s(String str, IOException iOException, int i3) {
        super(str, iOException, i3 == 2000 ? 2001 : i3);
        this.f21113c = 1;
    }
}
