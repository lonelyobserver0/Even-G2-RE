package Tb;

import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class Y {
    public final boolean equals(Object obj) {
        if (!(obj instanceof Y)) {
            return false;
        }
        ((Y) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        String joinToString$default;
        List createListBuilder = CollectionsKt.createListBuilder(2);
        createListBuilder.add(StubApp.getString2(25674));
        List build = CollectionsKt.build(createListBuilder);
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(25675));
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(build, null, null, null, 0, null, null, 63, null);
        return Xa.h.s(sb2, joinToString$default, ')');
    }
}
