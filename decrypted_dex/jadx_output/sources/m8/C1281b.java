package m8;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import u8.AbstractC1780d;

/* renamed from: m8.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1281b {

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f17154a;

    /* renamed from: b, reason: collision with root package name */
    public C1280a f17155b;

    public C1281b(String initialCopilotSessionId) {
        Intrinsics.checkNotNullParameter(initialCopilotSessionId, "initialCopilotSessionId");
        this.f17154a = new CopyOnWriteArraySet();
        this.f17155b = new C1280a(initialCopilotSessionId);
    }

    public final void a(AbstractC1780d session) {
        Intrinsics.checkNotNullParameter(session, "session");
        C1280a c1280a = this.f17155b;
        String copilotSessionId = session.a();
        c1280a.getClass();
        Intrinsics.checkNotNullParameter(copilotSessionId, "copilotSessionId");
        C1280a c1280a2 = new C1280a(copilotSessionId);
        if (Intrinsics.areEqual(this.f17155b, c1280a2)) {
            return;
        }
        this.f17155b = c1280a2;
        Iterator it = this.f17154a.iterator();
        if (it.hasNext()) {
            throw com.mapbox.common.b.e(it);
        }
    }
}
