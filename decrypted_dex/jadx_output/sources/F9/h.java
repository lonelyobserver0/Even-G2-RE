package F9;

import com.stub.StubApp;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final File f2343a;

    public h(File instructionFile) {
        Intrinsics.checkNotNullParameter(instructionFile, "instructionFile");
        this.f2343a = instructionFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.areEqual(this.f2343a, ((h) obj).f2343a);
    }

    public final int hashCode() {
        return this.f2343a.hashCode();
    }

    public final String toString() {
        return StubApp.getString2(2193) + this.f2343a + ')';
    }
}
