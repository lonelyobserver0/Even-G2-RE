package c5;

import i5.C1059c;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u f10881a;

    /* renamed from: b, reason: collision with root package name */
    public final h f10882b;

    public i(u uVar, C1059c c1059c) {
        this.f10881a = uVar;
        this.f10882b = new h(c1059c);
    }

    public final void a(String str) {
        h hVar = this.f10882b;
        synchronized (hVar) {
            if (!Objects.equals(hVar.f10879b, str)) {
                h.a(hVar.f10878a, str, hVar.f10880c);
                hVar.f10879b = str;
            }
        }
    }
}
