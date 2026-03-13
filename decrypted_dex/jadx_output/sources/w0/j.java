package w0;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f22042a;

    /* renamed from: b, reason: collision with root package name */
    public final i f22043b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22044c;

    static {
        if (AbstractC1560u.f20190a < 31) {
            new j("");
        } else {
            new j(i.f22040b, "");
        }
    }

    public j(String str) {
        AbstractC1550k.g(AbstractC1560u.f20190a < 31);
        this.f22042a = str;
        this.f22043b = null;
        this.f22044c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Objects.equals(this.f22042a, jVar.f22042a) && Objects.equals(this.f22043b, jVar.f22043b) && Objects.equals(this.f22044c, jVar.f22044c);
    }

    public final int hashCode() {
        return Objects.hash(this.f22042a, this.f22043b, this.f22044c);
    }

    public j(LogSessionId logSessionId, String str) {
        this(new i(logSessionId), str);
    }

    public j(i iVar, String str) {
        this.f22043b = iVar;
        this.f22042a = str;
        this.f22044c = new Object();
    }
}
