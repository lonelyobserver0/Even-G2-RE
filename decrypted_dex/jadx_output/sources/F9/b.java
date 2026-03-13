package F9;

import com.stub.StubApp;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2334a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2335b;

    /* renamed from: c, reason: collision with root package name */
    public final File f2336c;

    public b(String str, String str2, File file) {
        this.f2334a = str;
        this.f2335b = str2;
        this.f2336c = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.voice.model.SpeechAnnouncement");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f2334a, bVar.f2334a) && Intrinsics.areEqual(this.f2335b, bVar.f2335b) && Intrinsics.areEqual(this.f2336c, bVar.f2336c);
    }

    public final int hashCode() {
        int hashCode = this.f2334a.hashCode() * 31;
        String str = this.f2335b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        File file = this.f2336c;
        return hashCode2 + (file != null ? file.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(2185) + this.f2334a + StubApp.getString2(2186) + this.f2335b + StubApp.getString2(2187) + this.f2336c + ')';
    }
}
