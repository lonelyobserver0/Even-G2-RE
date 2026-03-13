package M4;

import H0.C0067j;
import java.io.Serializable;

/* renamed from: M4.w, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0151w extends Y implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final C0067j f4665a;

    public C0151w(C0067j c0067j) {
        this.f4665a = c0067j;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f4665a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0151w) {
            return this.f4665a.equals(((C0151w) obj).f4665a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4665a.hashCode();
    }

    public final String toString() {
        return this.f4665a.toString();
    }
}
