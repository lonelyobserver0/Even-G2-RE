package gb;

import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.Serializable;

/* renamed from: gb.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0973b {

    /* renamed from: a, reason: collision with root package name */
    public final BasicMessageChannel f14323a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f14324b;

    /* renamed from: c, reason: collision with root package name */
    public io.flutter.view.b f14325c;

    public C0973b(Za.d dVar, FlutterJNI flutterJNI) {
        C0972a c0972a = new C0972a(this);
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(dVar, StubApp.getString2(17881), StandardMessageCodec.INSTANCE);
        this.f14323a = basicMessageChannel;
        basicMessageChannel.setMessageHandler(c0972a);
        this.f14324b = flutterJNI;
    }

    public final void a(int i3, io.flutter.view.e eVar) {
        this.f14324b.dispatchSemanticsAction(i3, eVar);
    }

    public final void b(int i3, io.flutter.view.e eVar, Serializable serializable) {
        this.f14324b.dispatchSemanticsAction(i3, eVar, serializable);
    }
}
