package r0;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: r0.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1556q {

    /* renamed from: a, reason: collision with root package name */
    public Message f20183a;

    public final void a() {
        this.f20183a = null;
        ArrayList arrayList = C1557r.f20184b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f20183a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
