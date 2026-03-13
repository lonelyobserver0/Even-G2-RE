package A9;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j {
    public static final boolean a(List list, List list2, Function2 function2) {
        List<Pair> zip;
        if (list.size() != list2.size()) {
            return false;
        }
        zip = CollectionsKt___CollectionsKt.zip(list, list2);
        if (zip != null && zip.isEmpty()) {
            return true;
        }
        for (Pair pair : zip) {
            if (!((Boolean) function2.invoke(pair.component1(), pair.component2())).booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
