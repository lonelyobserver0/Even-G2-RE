package Y4;

import R4.h;
import android.content.SharedPreferences;
import c5.r;
import c5.u;
import com.stub.StubApp;
import q4.k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final r f8743a;

    public b(r rVar) {
        this.f8743a = rVar;
    }

    public static b a() {
        b bVar = (b) h.e().c(b.class);
        if (bVar != null) {
            return bVar;
        }
        throw new NullPointerException(StubApp.getString2(7534));
    }

    public final void b(Boolean bool) {
        u uVar = this.f8743a.f10926b;
        synchronized (uVar) {
            uVar.f10957f = false;
            uVar.f10958g = bool;
            SharedPreferences.Editor edit = uVar.f10952a.edit();
            edit.putBoolean(StubApp.getString2("7535"), bool.booleanValue());
            edit.apply();
            synchronized (uVar.f10954c) {
                try {
                    if (uVar.a()) {
                        if (!uVar.f10956e) {
                            uVar.f10955d.d(null);
                            uVar.f10956e = true;
                        }
                    } else if (uVar.f10956e) {
                        uVar.f10955d = new k();
                        uVar.f10956e = false;
                    }
                } finally {
                }
            }
        }
    }
}
