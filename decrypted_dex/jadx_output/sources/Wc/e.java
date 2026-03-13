package Wc;

import Vc.j;
import Vc.n;
import Vc.p;
import android.os.Handler;
import android.os.SystemClock;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.HashMap;
import q8.AbstractC1526a;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends a implements MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static e f8216c;

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c10;
        String string2 = StubApp.getString2(25878);
        String string22 = StubApp.getString2(25879);
        String string23 = StubApp.getString2(25880);
        String str = methodCall.method;
        str.getClass();
        if (str.equals(StubApp.getString2(25842))) {
            b(methodCall, result);
            return;
        }
        d dVar = (d) a(methodCall);
        String str2 = methodCall.method;
        str2.getClass();
        String string24 = StubApp.getString2(25839);
        String string25 = StubApp.getString2(10048);
        String string26 = StubApp.getString2(1251);
        char c11 = 65535;
        switch (str2.hashCode()) {
            case -2042341365:
                if (str2.equals(StubApp.getString2(25885))) {
                    c11 = 0;
                    break;
                }
                break;
            case -1972505888:
                if (str2.equals(StubApp.getString2(25884))) {
                    c11 = 1;
                    break;
                }
                break;
            case -1444181677:
                if (str2.equals(StubApp.getString2(25863))) {
                    c11 = 2;
                    break;
                }
                break;
            case -802967076:
                if (str2.equals(StubApp.getString2(25883))) {
                    c11 = 3;
                    break;
                }
                break;
            case -672116928:
                if (str2.equals(string23)) {
                    c10 = 4;
                    c11 = c10;
                    break;
                }
                break;
            case -309915358:
                if (str2.equals(StubApp.getString2(25860))) {
                    c11 = 5;
                    break;
                }
                break;
            case 115944508:
                if (str2.equals(StubApp.getString2(22723))) {
                    c10 = 6;
                    c11 = c10;
                    break;
                }
                break;
            case 452686550:
                if (str2.equals(string22)) {
                    c10 = 7;
                    c11 = c10;
                    break;
                }
                break;
            case 983933096:
                if (str2.equals(StubApp.getString2(25882))) {
                    c10 = '\b';
                    c11 = c10;
                    break;
                }
                break;
            case 1616698580:
                if (str2.equals(StubApp.getString2(25881))) {
                    c10 = '\t';
                    c11 = c10;
                    break;
                }
                break;
            case 1689078056:
                if (str2.equals(string2)) {
                    c11 = '\n';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                j jVar = dVar.f8215b;
                jVar.a(jVar.j);
                jVar.f8018b.d();
                if (jVar.f8023g >= 0) {
                    jVar.f8022f = (SystemClock.elapsedRealtime() - jVar.f8023g) + jVar.f8022f;
                }
                jVar.f8023g = -1L;
                jVar.f8027l = 3;
                jVar.f8020d.c(StubApp.getString2(25900), true, true);
                result.success(StubApp.getString2(25901));
                break;
            case 1:
                j jVar2 = dVar.f8215b;
                jVar2.b();
                String str3 = jVar2.f8025i;
                d dVar2 = jVar2.f8020d;
                dVar2.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(string24, Integer.valueOf(dVar2.f8217a));
                hashMap.put(StubApp.getString2(291), Integer.valueOf(dVar2.b()));
                hashMap.put(StubApp.getString2(25897), str3);
                hashMap.put(StubApp.getString2(11284), Boolean.TRUE);
                f8216c.f8211a.invokeMethod(StubApp.getString2(25898), hashMap);
                result.success(StubApp.getString2(25899));
                break;
            case 2:
                dVar.getClass();
                String string27 = StubApp.getString2(2091);
                if (methodCall.argument(string27) != null) {
                    int intValue = ((Integer) methodCall.argument(string27)).intValue();
                    long j = intValue;
                    j jVar3 = dVar.f8215b;
                    jVar3.j = j;
                    if (jVar3.f8018b != null) {
                        jVar3.a(j);
                    }
                    result.success(StubApp.getString2(25896) + intValue);
                    break;
                }
                break;
            case 3:
                dVar.getClass();
                String str4 = (String) methodCall.argument(string26);
                dVar.f8215b.getClass();
                File file = new File(AbstractC1526a.K(str4));
                result.success(Boolean.valueOf(file.exists() && file.delete()));
                break;
            case 4:
                dVar.getClass();
                Integer num = (Integer) methodCall.argument(StubApp.getString2(6305));
                Integer num2 = (Integer) methodCall.argument(StubApp.getString2(6306));
                Integer num3 = (Integer) methodCall.argument(StubApp.getString2(8299));
                Integer num4 = (Integer) methodCall.argument(StubApp.getString2(25844));
                int i3 = AbstractC1856e.d(20)[((Integer) methodCall.argument(string25)).intValue()];
                String str5 = (String) methodCall.argument(string26);
                int i10 = AbstractC1856e.d(14)[((Integer) methodCall.argument(StubApp.getString2(8294))).intValue()];
                ((Boolean) methodCall.argument(StubApp.getString2(25889))).getClass();
                Boolean bool = (Boolean) methodCall.argument(StubApp.getString2(25875));
                bool.getClass();
                boolean booleanValue = ((Boolean) methodCall.argument(StubApp.getString2(25890))).booleanValue();
                boolean booleanValue2 = ((Boolean) methodCall.argument(StubApp.getString2(25891))).booleanValue();
                j jVar4 = dVar.f8215b;
                int i11 = jVar4.f8017a[AbstractC1856e.c(i10)];
                jVar4.f8022f = 0L;
                jVar4.f8023g = -1L;
                jVar4.b();
                String K10 = str5 != null ? !str5.contains(StubApp.getString2(601)) ? AbstractC1526a.K(str5) : str5 : null;
                jVar4.f8025i = K10;
                boolean z2 = j.f8016n[AbstractC1856e.c(i3)];
                d dVar3 = jVar4.f8020d;
                if (z2) {
                    jVar4.f8018b = new n();
                } else {
                    p pVar = new p();
                    pVar.f8054a = dVar3;
                    jVar4.f8018b = pVar;
                }
                try {
                    jVar4.f8018b.b(num2, bool, num, num3, num4, i3, K10, i11, booleanValue, booleanValue2, jVar4);
                    long j3 = jVar4.j;
                    if (j3 > 0) {
                        jVar4.a(j3);
                    }
                    jVar4.f8027l = 3;
                    dVar3.c(StubApp.getString2(25892), true, true);
                    result.success(StubApp.getString2(25893));
                    break;
                } catch (Exception e10) {
                    dVar3.f(5, StubApp.getString2(25894) + e10.getMessage());
                    result.error(string23, string23, StubApp.getString2(25895));
                    return;
                }
            case 5:
                dVar.getClass();
                break;
            case 6:
                dVar.getClass();
                int i12 = AbstractC1856e.d(20)[((Integer) methodCall.argument(string25)).intValue()];
                dVar.f8215b.getClass();
                result.success(Boolean.valueOf(j.f8015m[AbstractC1856e.c(i12)]));
                break;
            case 7:
                j jVar5 = dVar.f8215b;
                jVar5.b();
                jVar5.f8027l = 1;
                result.success(string22);
                break;
            case '\b':
                dVar.getClass();
                String str6 = (String) methodCall.argument(string26);
                dVar.f8215b.getClass();
                result.success(AbstractC1526a.K(str6));
                break;
            case '\t':
                j jVar6 = dVar.f8215b;
                Handler handler = jVar6.f8019c;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                jVar6.f8019c = null;
                jVar6.f8018b.e();
                jVar6.f8023g = SystemClock.elapsedRealtime();
                jVar6.f8027l = 2;
                jVar6.f8020d.c(StubApp.getString2(25887), true, true);
                result.success(StubApp.getString2(25888));
                break;
            case '\n':
                d dVar4 = new d();
                j jVar7 = new j(dVar4);
                dVar4.f8215b = jVar7;
                int intValue2 = ((Integer) methodCall.argument(string24)).intValue();
                this.f8212b.set(intValue2, dVar4);
                dVar4.f8217a = intValue2;
                jVar7.f8020d.c(StubApp.getString2(25886), true, true);
                result.success(string2);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
