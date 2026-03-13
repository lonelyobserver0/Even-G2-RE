package androidx.work;

import i2.g;
import i2.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class OverwritingInputMerger extends i {
    @Override // i2.i
    public final g a(ArrayList arrayList) {
        Ya.g gVar = new Ya.g(1);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((g) it.next()).f14737a));
        }
        gVar.a(hashMap);
        g gVar2 = new g(gVar.f8893a);
        g.c(gVar2);
        return gVar2;
    }
}
