package Za;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import tb.AbstractC1748a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d implements BinaryMessenger {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f9163a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f9164b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9165c;

    /* renamed from: d, reason: collision with root package name */
    public final o f9166d;

    /* renamed from: e, reason: collision with root package name */
    public final c f9167e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9168f;

    public d(FlutterJNI flutterJNI, AssetManager assetManager, long j) {
        this.f9168f = false;
        a aVar = new a(this);
        this.f9163a = flutterJNI;
        this.f9164b = assetManager;
        this.f9165c = j;
        o oVar = new o(flutterJNI);
        this.f9166d = oVar;
        oVar.setMessageHandler(StubApp.getString2(8256), aVar, null);
        this.f9167e = new c(oVar);
        if (flutterJNI.isAttached()) {
            this.f9168f = true;
        }
    }

    public final void a(Q2.g gVar) {
        if (this.f9168f) {
            Log.w(StubApp.getString2(8257), StubApp.getString2(8258));
            return;
        }
        AbstractC1748a.d(StubApp.getString2(8259));
        try {
            Objects.toString(gVar);
            FlutterJNI flutterJNI = this.f9163a;
            String str = (String) gVar.f5712c;
            FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) gVar.f5713d;
            flutterJNI.runBundleAndSnapshotFromLibrary(str, flutterCallbackInformation.callbackName, flutterCallbackInformation.callbackLibraryPath, (AssetManager) gVar.f5711b, null, this.f9165c);
            this.f9168f = true;
            Trace.endSection();
        } finally {
        }
    }

    public final void b(b bVar, List list) {
        if (this.f9168f) {
            Log.w(StubApp.getString2(8257), StubApp.getString2(8258));
            return;
        }
        AbstractC1748a.d(StubApp.getString2(8260));
        try {
            Objects.toString(bVar);
            this.f9163a.runBundleAndSnapshotFromLibrary(bVar.f9159a, bVar.f9161c, bVar.f9160b, this.f9164b, list, this.f9165c);
            this.f9168f = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void disableBufferingIncomingMessages() {
        this.f9166d.disableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void enableBufferingIncomingMessages() {
        this.f9166d.enableBufferingIncomingMessages();
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final BinaryMessenger.TaskQueue makeBackgroundTaskQueue(BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        return this.f9167e.f9162a.makeBackgroundTaskQueue(taskQueueOptions);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void send(String str, ByteBuffer byteBuffer) {
        this.f9167e.send(str, byteBuffer);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.f9167e.setMessageHandler(str, binaryMessageHandler);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void send(String str, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        this.f9167e.send(str, byteBuffer, binaryReply);
    }

    @Override // io.flutter.plugin.common.BinaryMessenger
    public final void setMessageHandler(String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        this.f9167e.setMessageHandler(str, binaryMessageHandler, taskQueue);
    }
}
