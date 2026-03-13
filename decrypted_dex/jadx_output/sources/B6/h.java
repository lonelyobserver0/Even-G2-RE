package B6;

import android.util.Pair;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends Pair {
    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (((Integer) ((Pair) this).first).equals(((Pair) hVar).first) && ((Integer) ((Pair) this).second).equals(((Pair) hVar).second)) {
            return true;
        }
        return ((Integer) ((Pair) this).first).equals(((Pair) hVar).second) && ((Integer) ((Pair) this).second).equals(((Pair) hVar).first);
    }
}
