package c5;

import com.stub.StubApp;
import f5.C0884B;
import java.io.File;

/* renamed from: c5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0568a {

    /* renamed from: a, reason: collision with root package name */
    public final C0884B f10859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10860b;

    /* renamed from: c, reason: collision with root package name */
    public final File f10861c;

    public C0568a(C0884B c0884b, String str, File file) {
        this.f10859a = c0884b;
        if (str == null) {
            throw new NullPointerException(StubApp.getString2(9440));
        }
        this.f10860b = str;
        this.f10861c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0568a)) {
            return false;
        }
        C0568a c0568a = (C0568a) obj;
        return this.f10859a.equals(c0568a.f10859a) && this.f10860b.equals(c0568a.f10860b) && this.f10861c.equals(c0568a.f10861c);
    }

    public final int hashCode() {
        return ((((this.f10859a.hashCode() ^ 1000003) * 1000003) ^ this.f10860b.hashCode()) * 1000003) ^ this.f10861c.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(9441) + this.f10859a + StubApp.getString2(9442) + this.f10860b + StubApp.getString2(9443) + this.f10861c + StubApp.getString2(265);
    }
}
