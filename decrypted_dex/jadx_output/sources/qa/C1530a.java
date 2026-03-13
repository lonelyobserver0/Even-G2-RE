package qa;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: qa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1530a extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1531b f20099a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1530a(C1531b c1531b) {
        super(1000, 0.75f, true);
        this.f20099a = c1531b;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        int size = size();
        C1531b c1531b = this.f20099a;
        boolean z2 = size > c1531b.f20102c;
        if (z2) {
            c1531b.f20103d = (byte[]) entry.getValue();
        }
        return z2;
    }
}
