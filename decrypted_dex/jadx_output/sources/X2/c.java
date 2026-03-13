package X2;

import b3.C0503e;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f8261a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f8262b = LazyKt.lazy(new J2.b(3));

    public static void a(BinaryMessenger binaryMessenger, C0503e c0503e, String messageChannelSuffix) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(messageChannelSuffix, "messageChannelSuffix");
        String concat = messageChannelSuffix.length() > 0 ? StubApp.getString2(1).concat(messageChannelSuffix) : "";
        String j = E1.a.j(StubApp.getString2(7061), concat);
        Lazy lazy = f8262b;
        BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, j, (MessageCodec) lazy.getValue());
        if (c0503e != null) {
            basicMessageChannel.setMessageHandler(new C0360b(c0503e, 0));
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7062), concat), (MessageCodec) lazy.getValue());
        if (c0503e != null) {
            basicMessageChannel2.setMessageHandler(new C0360b(c0503e, 1));
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, E1.a.j(StubApp.getString2(7063), concat), (MessageCodec) lazy.getValue());
        if (c0503e != null) {
            basicMessageChannel3.setMessageHandler(new C0360b(c0503e, 2));
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
    }
}
