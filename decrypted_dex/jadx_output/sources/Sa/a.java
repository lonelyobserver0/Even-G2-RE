package Sa;

import B3.s;
import com.stub.StubApp;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final s f6670a;

    /* renamed from: b, reason: collision with root package name */
    public final c f6671b;

    public a(s share, c manager) {
        Intrinsics.checkNotNullParameter(share, "share");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f6670a = share;
        this.f6671b = manager;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall call, MethodChannel.Result callback) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callback, "result");
        if (!(call.arguments instanceof Map)) {
            throw new IllegalArgumentException(StubApp.getString2(6079));
        }
        c cVar = this.f6671b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        AtomicBoolean atomicBoolean = cVar.f6676b;
        boolean compareAndSet = atomicBoolean.compareAndSet(true, false);
        String string2 = StubApp.getString2(6077);
        if (compareAndSet) {
            String str = SharePlusPendingIntent.f13559a;
            Intrinsics.checkNotNullParameter("", string2);
            SharePlusPendingIntent.f13559a = "";
            atomicBoolean.set(false);
            cVar.f6675a = callback;
        } else {
            MethodChannel.Result result = cVar.f6675a;
            if (result != null) {
                result.success(StubApp.getString2(630));
            }
            String str2 = SharePlusPendingIntent.f13559a;
            Intrinsics.checkNotNullParameter("", string2);
            SharePlusPendingIntent.f13559a = "";
            atomicBoolean.set(false);
            cVar.f6675a = callback;
        }
        try {
            if (!Intrinsics.areEqual(call.method, "share")) {
                callback.notImplemented();
                return;
            }
            s sVar = this.f6670a;
            Object arguments = call.arguments();
            Intrinsics.checkNotNull(arguments);
            sVar.t((Map) arguments);
        } catch (Throwable th) {
            cVar.f6676b.set(true);
            cVar.f6675a = null;
            callback.error(StubApp.getString2(6078), th.getMessage(), th);
        }
    }
}
