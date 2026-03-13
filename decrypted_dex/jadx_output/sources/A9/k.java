package A9;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements Iterable, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f237a = new LinkedList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f237a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "list.iterator()");
        return it;
    }
}
