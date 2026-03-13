package Z8;

import com.mapbox.navigator.HistoryRecorderHandle;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final HistoryRecorderHandle f9063a;

    /* renamed from: b, reason: collision with root package name */
    public final HistoryRecorderHandle f9064b;

    /* renamed from: c, reason: collision with root package name */
    public final HistoryRecorderHandle f9065c;

    public h(HistoryRecorderHandle historyRecorderHandle, HistoryRecorderHandle historyRecorderHandle2, HistoryRecorderHandle historyRecorderHandle3) {
        this.f9063a = historyRecorderHandle;
        this.f9064b = historyRecorderHandle2;
        this.f9065c = historyRecorderHandle3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.areEqual(this.f9063a, hVar.f9063a) && Intrinsics.areEqual(this.f9064b, hVar.f9064b) && Intrinsics.areEqual(this.f9065c, hVar.f9065c);
    }

    public final int hashCode() {
        HistoryRecorderHandle historyRecorderHandle = this.f9063a;
        int hashCode = (historyRecorderHandle == null ? 0 : historyRecorderHandle.hashCode()) * 31;
        HistoryRecorderHandle historyRecorderHandle2 = this.f9064b;
        int hashCode2 = (hashCode + (historyRecorderHandle2 == null ? 0 : historyRecorderHandle2.hashCode())) * 31;
        HistoryRecorderHandle historyRecorderHandle3 = this.f9065c;
        return hashCode2 + (historyRecorderHandle3 != null ? historyRecorderHandle3.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(7664) + this.f9063a + StubApp.getString2(7665) + this.f9064b + StubApp.getString2(7666) + this.f9065c + ')';
    }
}
