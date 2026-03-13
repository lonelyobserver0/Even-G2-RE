package gb;

import android.os.Build;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.HashMap;

/* renamed from: gb.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0972a implements BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0973b f14321a;

    public C0972a(C0973b c0973b) {
        this.f14321a = c0973b;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        C0973b c0973b = this.f14321a;
        if (c0973b.f14325c == null) {
            reply.reply(null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get(StubApp.getString2(660));
        HashMap hashMap2 = (HashMap) hashMap.get(StubApp.getString2(1485));
        str.getClass();
        String string2 = StubApp.getString2(1905);
        String string22 = StubApp.getString2(17873);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals(StubApp.getString2(17878))) {
                    c10 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals(StubApp.getString2(17877))) {
                    c10 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals(StubApp.getString2(17876))) {
                    c10 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals(StubApp.getString2(17875))) {
                    c10 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals(StubApp.getString2(17874))) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                if (((String) hashMap2.get(string2)) != null) {
                    c0973b.f14325c.getClass();
                    break;
                }
                break;
            case 1:
                String str2 = (String) hashMap2.get(string2);
                if (str2 != null) {
                    io.flutter.view.b bVar = c0973b.f14325c;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar.getClass();
                        Log.w(StubApp.getString2(17879), StubApp.getString2(17880));
                    }
                    ((io.flutter.view.l) bVar.f15099a).f15188a.announceForAccessibility(str2);
                    break;
                }
                break;
            case 2:
                Integer num = (Integer) hashMap.get(string22);
                if (num != null) {
                    ((io.flutter.view.l) c0973b.f14325c.f15099a).g(num.intValue(), 1);
                    break;
                }
                break;
            case 3:
                Integer num2 = (Integer) hashMap.get(string22);
                if (num2 != null) {
                    ((io.flutter.view.l) c0973b.f14325c.f15099a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case 4:
                Integer num3 = (Integer) hashMap.get(string22);
                if (num3 != null) {
                    ((io.flutter.view.l) c0973b.f14325c.f15099a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        reply.reply(null);
    }
}
