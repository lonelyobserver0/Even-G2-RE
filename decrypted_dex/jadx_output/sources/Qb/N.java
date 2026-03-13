package Qb;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f5825a;

    static {
        String str;
        Q q10;
        String string2 = StubApp.getString2(25485);
        int i3 = Vb.x.f7974a;
        try {
            str = System.getProperty(string2);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            Xb.d dVar = W.f5838a;
            Rb.d dVar2 = Vb.q.f7968a;
            Rb.d dVar3 = dVar2.f6359c;
            q10 = dVar2;
            if (dVar2 == null) {
                q10 = M.f5824h;
            }
        } else {
            q10 = M.f5824h;
        }
        f5825a = q10;
    }
}
