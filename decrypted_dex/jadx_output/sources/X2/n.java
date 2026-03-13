package X2;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.InterfaceC0444t;
import b3.C0498N;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class n extends PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final BinaryMessenger f8308a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0444t f8309b;

    /* renamed from: c, reason: collision with root package name */
    public final F5.c f8310c;

    /* renamed from: d, reason: collision with root package name */
    public C0498N f8311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(BinaryMessenger messenger, InterfaceC0444t lifecycleOwner, F5.c mapEventCallback) {
        super(StandardMessageCodec.INSTANCE);
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(mapEventCallback, "mapEventCallback");
        this.f8308a = messenger;
        this.f8309b = lifecycleOwner;
        this.f8310c = mapEventCallback;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public final PlatformView create(Context context, int i3, Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        C0498N c0498n = this.f8311d;
        String string2 = StubApp.getString2(7090);
        if (c0498n != null) {
            if (c0498n.getView() != null) {
                Log.d(string2, StubApp.getString2(7091));
                return c0498n;
            }
            Log.w(string2, StubApp.getString2(7092));
            this.f8311d = null;
        }
        Log.d(string2, StubApp.getString2(7093));
        C0498N c0498n2 = new C0498N(context, map, this.f8308a, this.f8309b, this.f8310c);
        this.f8311d = c0498n2;
        Intrinsics.checkNotNull(c0498n2);
        return c0498n2;
    }
}
