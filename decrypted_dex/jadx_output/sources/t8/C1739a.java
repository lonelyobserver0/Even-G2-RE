package t8;

import D9.l;
import L7.e;
import L7.i;
import com.mapbox.navigator.HistoryRecorderHandle;
import com.stub.StubApp;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t8.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1739a {

    /* renamed from: a, reason: collision with root package name */
    public HistoryRecorderHandle f21218a;

    /* renamed from: b, reason: collision with root package name */
    public final e f21219b;

    /* renamed from: c, reason: collision with root package name */
    public final B8.a f21220c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f21221d;

    public C1739a(i navigationOptions) {
        Intrinsics.checkNotNullParameter(navigationOptions, "navigationOptions");
        this.f21218a = null;
        this.f21219b = navigationOptions.j;
        this.f21220c = new B8.a(navigationOptions.f4277a, 0);
        this.f21221d = new CopyOnWriteArrayList();
    }

    public final String a() {
        B8.a aVar = this.f21220c;
        aVar.getClass();
        e options = this.f21219b;
        Intrinsics.checkNotNullParameter(options, "options");
        String absolutePath = new File(aVar.f743a.getFilesDir(), StubApp.getString2(23489)).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(applicationContext.…ATH_SUB_DIR).absolutePath");
        return B8.a.a(absolutePath);
    }

    public final void b(String eventType, String eventJson) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventJson, "eventJson");
        if (this.f21218a == null) {
            l.h(StubApp.getString2(23490), StubApp.getString2(23491));
        }
        HistoryRecorderHandle historyRecorderHandle = this.f21218a;
        if (historyRecorderHandle != null) {
            historyRecorderHandle.pushHistory(eventType, eventJson);
        }
    }
}
