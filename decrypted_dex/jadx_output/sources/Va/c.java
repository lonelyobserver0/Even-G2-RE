package Va;

import android.content.Context;
import com.stub.StubApp;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;
import java.util.Map;
import kc.C1128e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends PlatformViewFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7920a;

    /* renamed from: b, reason: collision with root package name */
    public final BinaryMessenger f7921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BinaryMessenger messenger, int i3) {
        super(StandardMessageCodec.INSTANCE);
        this.f7920a = i3;
        switch (i3) {
            case 1:
                Intrinsics.checkNotNullParameter(messenger, "messenger");
                super(StandardMessageCodec.INSTANCE);
                this.f7921b = messenger;
                break;
            default:
                this.f7921b = messenger;
                break;
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public final PlatformView create(Context context, int i3, Object obj) {
        switch (this.f7920a) {
            case 0:
                return new a(context, this.f7921b, i3, (Map) obj);
            default:
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                HashMap hashMap = (HashMap) obj;
                if (context != null) {
                    return new C1128e(context, this.f7921b, i3, hashMap);
                }
                throw new IllegalArgumentException(StubApp.getString2(2906));
        }
    }
}
