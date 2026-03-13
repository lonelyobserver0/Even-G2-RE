package H5;

import android.os.Message;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class Z implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }
}
