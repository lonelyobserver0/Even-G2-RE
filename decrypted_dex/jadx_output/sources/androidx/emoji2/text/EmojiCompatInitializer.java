package androidx.emoji2.text;

import F2.a;
import R1.b;
import Y.h;
import Y.i;
import Y.q;
import android.content.Context;
import androidx.lifecycle.C0446v;
import androidx.lifecycle.InterfaceC0444t;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class EmojiCompatInitializer implements b {
    @Override // R1.b
    public final Object create(Context context) {
        q qVar = new q(new a(context, 1));
        qVar.f8655a = 1;
        if (h.f8658k == null) {
            synchronized (h.j) {
                try {
                    if (h.f8658k == null) {
                        h.f8658k = new h(qVar);
                    }
                } finally {
                }
            }
        }
        C0446v i3 = ((InterfaceC0444t) R1.a.c(context).d(ProcessLifecycleInitializer.class)).i();
        i3.a(new i(this, i3));
        return Boolean.TRUE;
    }

    @Override // R1.b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
