package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9900a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f9900a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((S) it.next()).a();
        }
        linkedHashMap.clear();
    }
}
