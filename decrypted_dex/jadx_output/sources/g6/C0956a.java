package g6;

import f6.AbstractC0927a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0956a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14218a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i3 = -1;
        for (Map.Entry entry : this.f14218a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i3) {
                i3 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add((Integer) entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i3) {
                arrayList.add((Integer) entry.getKey());
            }
        }
        return AbstractC0927a.a(arrayList);
    }

    public final void b(int i3) {
        HashMap hashMap = this.f14218a;
        Integer num = (Integer) hashMap.get(Integer.valueOf(i3));
        if (num == null) {
            num = 0;
        }
        hashMap.put(Integer.valueOf(i3), Integer.valueOf(num.intValue() + 1));
    }
}
