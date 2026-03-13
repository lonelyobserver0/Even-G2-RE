package R2;

import android.os.Message;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static EventChannel.EventSink f6075a;

    /* renamed from: b, reason: collision with root package name */
    public static b f6076b;

    public static Message a(int i3, String str, String str2) {
        String string2;
        String format = LocalTime.now().format(DateTimeFormatter.ofPattern(StubApp.getString2(5604)));
        switch (i3) {
            case 2:
                string2 = StubApp.getString2(5610);
                break;
            case 3:
                string2 = StubApp.getString2(5609);
                break;
            case 4:
                string2 = StubApp.getString2(5608);
                break;
            case 5:
                string2 = StubApp.getString2(5607);
                break;
            case 6:
                string2 = StubApp.getString2(5606);
                break;
            case 7:
                string2 = StubApp.getString2(5605);
                break;
            default:
                string2 = "";
                break;
        }
        String k3 = E1.a.k(StubApp.getString2(1557), str, StubApp.getString2(1558));
        Message obtain = Message.obtain();
        obtain.obj = format + ' ' + string2 + k3 + str2;
        Intrinsics.checkNotNull(obtain);
        return obtain;
    }

    public static void b(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = f6076b;
        if (bVar != null) {
            bVar.sendMessage(a(3, tag, message));
        }
    }

    public static void c(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = f6076b;
        if (bVar != null) {
            bVar.sendMessage(a(6, tag, message));
        }
    }

    public static void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = f6076b;
        if (bVar != null) {
            bVar.sendMessage(a(4, tag, message));
        }
    }

    public static void e(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = f6076b;
        if (bVar != null) {
            bVar.sendMessage(a(2, tag, message));
        }
    }

    public static void f(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        b bVar = f6076b;
        if (bVar != null) {
            bVar.sendMessage(a(5, tag, message));
        }
    }
}
