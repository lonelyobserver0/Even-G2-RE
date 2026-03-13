package kotlin.collections;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/collections/CollectionsKt__CollectionsJVMKt", "kotlin/collections/CollectionsKt__CollectionsKt", "kotlin/collections/CollectionsKt__IterablesKt", "kotlin/collections/CollectionsKt__IteratorsJVMKt", "kotlin/collections/CollectionsKt__IteratorsKt", "kotlin/collections/CollectionsKt__MutableCollectionsJVMKt", "kotlin/collections/CollectionsKt__MutableCollectionsKt", "kotlin/collections/CollectionsKt__ReversedViewsKt", "kotlin/collections/CollectionsKt___CollectionsJvmKt", "kotlin/collections/CollectionsKt___CollectionsKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static /* bridge */ /* synthetic */ int f(Iterable iterable) {
        return CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
    }

    public static /* bridge */ /* synthetic */ Appendable l(String str, StringBuilder sb2, List list) {
        Appendable joinTo;
        joinTo = CollectionsKt___CollectionsKt.joinTo(list, sb2, (r14 & 2) != 0 ? ", " : str, (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return joinTo;
    }
}
