package W2;

import B0.o;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import kotlin.jvm.internal.Intrinsics;
import transcribe.TranscribeEventOuterClass;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f8075a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8076b;

    /* renamed from: c, reason: collision with root package name */
    public final EventChannel f8077c;

    /* renamed from: d, reason: collision with root package name */
    public EventChannel.EventSink f8078d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8079e;

    /* renamed from: f, reason: collision with root package name */
    public long f8080f;

    /* renamed from: g, reason: collision with root package name */
    public final b f8081g;

    public c(BinaryMessenger messenger, String sessionID) {
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.f8075a = messenger;
        this.f8076b = sessionID;
        EventChannel eventChannel = new EventChannel(messenger, StubApp.getString2(6823));
        this.f8077c = eventChannel;
        String string2 = StubApp.getString2(381);
        R2.c.d(string2, StubApp.getString2(6824));
        R2.c.b(string2, StubApp.getString2(6825) + sessionID);
        eventChannel.setStreamHandler(this);
        R2.c.d(string2, StubApp.getString2(6826));
        this.f8081g = new b(this);
    }

    public final void a() {
        R2.c.d(StubApp.getString2(381), StubApp.getString2(6827));
        new Handler(Looper.getMainLooper()).post(new o(this, 12));
    }

    public final void b(TranscribeEventOuterClass.TranscribeEvent event) {
        boolean z2 = this.f8079e;
        String string2 = StubApp.getString2(381);
        if (z2) {
            R2.c.f(string2, StubApp.getString2(6828));
            return;
        }
        R2.c.b(string2, StubApp.getString2(6829) + event.getType());
        b bVar = this.f8081g;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        bVar.post(new Ab.b(18, bVar, event));
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        String string2 = StubApp.getString2(381);
        R2.c.d(string2, StubApp.getString2(6830));
        this.f8078d = null;
        R2.c.b(string2, StubApp.getString2(6831));
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        String string2 = StubApp.getString2(381);
        R2.c.d(string2, StubApp.getString2(6832));
        this.f8078d = eventSink;
        R2.c.b(string2, StubApp.getString2(6833));
    }
}
