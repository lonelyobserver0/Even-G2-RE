package Wc;

import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends a implements MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static c f8214c;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x06d3 -> B:185:0x06dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x02ad -> B:31:0x02bf). Please report as a decompilation issue!!! */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        char c10;
        long j;
        long j3;
        Vc.e eVar;
        String str2 = methodCall.method;
        str2.getClass();
        if (str2.equals(StubApp.getString2(25842))) {
            b(methodCall, result);
            return;
        }
        b bVar = (b) a(methodCall);
        String str3 = methodCall.method;
        str3.getClass();
        String string2 = StubApp.getString2(25839);
        String string22 = StubApp.getString2(10048);
        String string23 = StubApp.getString2(1968);
        Object string24 = StubApp.getString2(25843);
        String string25 = StubApp.getString2(25790);
        String string26 = StubApp.getString2(6306);
        String string27 = StubApp.getString2(6305);
        String string28 = StubApp.getString2(25844);
        String string29 = StubApp.getString2(25845);
        String string210 = StubApp.getString2(1485);
        String string211 = StubApp.getString2(25846);
        String string212 = StubApp.getString2(2091);
        String string213 = StubApp.getString2(25847);
        char c11 = 65535;
        switch (str3.hashCode()) {
            case -1959921181:
                str = string29;
                if (str3.equals(StubApp.getString2(25866))) {
                    c11 = 0;
                    break;
                }
                break;
            case -1899438985:
                str = string29;
                if (str3.equals(StubApp.getString2(25865))) {
                    c11 = 1;
                    break;
                }
                break;
            case -1664263338:
                str = string29;
                if (str3.equals(StubApp.getString2(25864))) {
                    c10 = 2;
                    c11 = c10;
                    break;
                }
                break;
            case -1444181677:
                str = string29;
                if (str3.equals(StubApp.getString2(25863))) {
                    c10 = 3;
                    c11 = c10;
                    break;
                }
                break;
            case -1442839165:
                str = string29;
                if (str3.equals(StubApp.getString2(25862))) {
                    c10 = 4;
                    c11 = c10;
                    break;
                }
                break;
            case -588909343:
                str = string29;
                if (str3.equals(StubApp.getString2(25861))) {
                    c11 = 5;
                    break;
                }
                break;
            case -309915358:
                str = string29;
                if (str3.equals(StubApp.getString2(25860))) {
                    c10 = 6;
                    c11 = c10;
                    break;
                }
                break;
            case -94231302:
                str = string29;
                if (str3.equals(StubApp.getString2(25859))) {
                    c10 = 7;
                    c11 = c10;
                    break;
                }
                break;
            case -57162179:
                str = string29;
                if (str3.equals(StubApp.getString2(25858))) {
                    c10 = '\b';
                    c11 = c10;
                    break;
                }
                break;
            case -56585708:
                str = string29;
                if (str3.equals(StubApp.getString2(25857))) {
                    c10 = '\t';
                    c11 = c10;
                    break;
                }
                break;
            case 3138974:
                str = string29;
                if (str3.equals(StubApp.getString2(25856))) {
                    c10 = '\n';
                    c11 = c10;
                    break;
                }
                break;
            case 79235833:
                str = string29;
                if (str3.equals(StubApp.getString2(25855))) {
                    c10 = 11;
                    c11 = c10;
                    break;
                }
                break;
            case 254823883:
                str = string29;
                if (str3.equals(StubApp.getString2(25854))) {
                    c10 = '\f';
                    c11 = c10;
                    break;
                }
                break;
            case 552978388:
                str = string29;
                if (str3.equals(StubApp.getString2(25853))) {
                    c10 = '\r';
                    c11 = c10;
                    break;
                }
                break;
            case 670514716:
                str = string29;
                if (str3.equals(StubApp.getString2(25852))) {
                    c10 = 14;
                    c11 = c10;
                    break;
                }
                break;
            case 1076821923:
                str = string29;
                if (str3.equals(StubApp.getString2(25851))) {
                    c10 = 15;
                    c11 = c10;
                    break;
                }
                break;
            case 1242003401:
                str = string29;
                if (str3.equals(StubApp.getString2(25850))) {
                    c10 = 16;
                    c11 = c10;
                    break;
                }
                break;
            case 1404354821:
                str = string29;
                if (str3.equals(StubApp.getString2(25849))) {
                    c10 = 17;
                    c11 = c10;
                    break;
                }
                break;
            case 1408481646:
                str = string29;
                if (str3.equals(StubApp.getString2(25803))) {
                    c10 = 18;
                    c11 = c10;
                    break;
                }
                break;
            case 1498302170:
                str = string29;
                if (str3.equals(StubApp.getString2(25848))) {
                    c10 = 19;
                    c11 = c10;
                    break;
                }
                break;
            default:
                str = string29;
                break;
        }
        switch (c11) {
            case 0:
                bVar.getClass();
                Integer num = (Integer) methodCall.argument(string22);
                int i3 = AbstractC1856e.d(20)[num != null ? num.intValue() : 0];
                byte[] bArr = (byte[]) methodCall.argument(StubApp.getString2(25873));
                Integer num2 = methodCall.argument(string28) != null ? (Integer) methodCall.argument(string28) : 8192;
                String str4 = (String) methodCall.argument(StubApp.getString2(25874));
                Integer num3 = methodCall.argument(string27) != null ? (Integer) methodCall.argument(string27) : 16000;
                Boolean bool = Boolean.TRUE;
                String string214 = StubApp.getString2(25875);
                if (methodCall.argument(string214) != null) {
                    bool = (Boolean) methodCall.argument(string214);
                }
                Integer num4 = methodCall.argument(string26) != null ? (Integer) methodCall.argument(string26) : 1;
                String string215 = StubApp.getString2(25876);
                if (methodCall.argument(string215) != null) {
                    ((Boolean) methodCall.argument(string215)).getClass();
                }
                String string216 = StubApp.getString2(25877);
                if (methodCall.argument(string216) != null) {
                    ((Boolean) methodCall.argument(string216)).getClass();
                }
                try {
                    if (bVar.f8213b.n(i3, str4, bArr, num4.intValue(), bool.booleanValue(), num3.intValue(), num2.intValue())) {
                        result.success(Integer.valueOf(bVar.h()));
                    } else {
                        result.error(string213, string213, string24);
                    }
                } catch (Exception e10) {
                    bVar.f(5, string25);
                    result.error(string213, string213, e10.getMessage());
                }
                return;
            case 1:
                bVar.getClass();
                try {
                    if (bVar.f8213b.f()) {
                        result.success(Integer.valueOf(bVar.h()));
                    } else {
                        result.error(string213, string213, StubApp.getString2("25872"));
                    }
                    return;
                } catch (Exception e11) {
                    bVar.f(5, StubApp.getString2(25785) + e11.getMessage());
                    result.error(string213, string213, e11.getMessage());
                    return;
                }
            case 2:
                String str5 = str;
                bVar.getClass();
                try {
                    ArrayList arrayList = (ArrayList) methodCall.argument(string210);
                    Vc.b bVar2 = bVar.f8213b;
                    Ec.d dVar = bVar2.f7982b;
                    if (dVar == null) {
                        throw new Exception(str5);
                    }
                    try {
                        result.success(Integer.valueOf(dVar.w(arrayList)));
                        return;
                    } catch (Exception e12) {
                        bVar2.d(string211);
                        throw e12;
                    }
                } catch (Exception e13) {
                    bVar.f(5, string211);
                    result.error(string213, string213, e13.getMessage());
                    return;
                }
            case 3:
                bVar.getClass();
                if (methodCall.argument(string212) != null) {
                    long intValue = ((Integer) methodCall.argument(string212)).intValue();
                    Vc.b bVar3 = bVar.f8213b;
                    bVar3.f7981a = intValue;
                    if (bVar3.f7982b != null) {
                        bVar3.k(intValue);
                    }
                }
                result.success(Integer.valueOf(bVar.h()));
                return;
            case 4:
                Vc.b bVar4 = bVar.f8213b;
                bVar4.o();
                bVar4.f7986f.c(StubApp.getString2(3466), true, true);
                result.success(Integer.valueOf(bVar.h()));
                return;
            case 5:
                bVar.getClass();
                try {
                    bVar.f8213b.m(((Double) methodCall.argument(string23)).doubleValue(), ((Double) methodCall.argument(StubApp.getString2("25871"))).doubleValue());
                    result.success(Integer.valueOf(bVar.h()));
                    return;
                } catch (Exception e14) {
                    result.error(string213, string213, e14.getMessage());
                    return;
                }
            case 6:
                bVar.getClass();
                return;
            case 7:
                result.success(Integer.valueOf(bVar.h()));
                return;
            case '\b':
                String str6 = str;
                bVar.getClass();
                try {
                    ArrayList arrayList2 = (ArrayList) methodCall.argument(string210);
                    Vc.b bVar5 = bVar.f8213b;
                    Ec.d dVar2 = bVar5.f7982b;
                    if (dVar2 == null) {
                        throw new Exception(str6);
                    }
                    try {
                        result.success(Integer.valueOf(dVar2.v(arrayList2)));
                        return;
                    } catch (Exception e15) {
                        bVar5.d(string211);
                        throw e15;
                    }
                } catch (Exception e16) {
                    bVar.f(5, string211);
                    result.error(string213, string213, e16.getMessage());
                    return;
                }
            case '\t':
                bVar.getClass();
                int i10 = AbstractC1856e.d(20)[((Integer) methodCall.argument(string22)).intValue()];
                bVar.f8213b.getClass();
                result.success(Boolean.valueOf(Vc.b.f7979l[AbstractC1856e.c(i10)]));
                return;
            case '\n':
                bVar.getClass();
                try {
                    byte[] bArr2 = (byte[]) methodCall.argument(string210);
                    Vc.b bVar6 = bVar.f8213b;
                    Ec.d dVar3 = bVar6.f7982b;
                    if (dVar3 == null) {
                        throw new Exception(str);
                    }
                    try {
                        result.success(Integer.valueOf(dVar3.u(bArr2)));
                        return;
                    } catch (Exception e17) {
                        bVar6.d(string211);
                        throw e17;
                    }
                } catch (Exception e18) {
                    bVar.f(5, string211);
                    result.error(string213, string213, e18.getMessage());
                    return;
                }
            case 11:
                bVar.f8213b.o();
                result.success(Integer.valueOf(bVar.h()));
                return;
            case '\f':
                b bVar7 = new b();
                Vc.b bVar8 = new Vc.b(bVar7);
                bVar7.f8213b = bVar8;
                int intValue2 = ((Integer) methodCall.argument(string2)).intValue();
                this.f8212b.set(intValue2, bVar7);
                bVar7.f8217a = intValue2;
                int i11 = Vc.b.f7980m + 1;
                Vc.b.f7980m = i11;
                bVar8.f7990k = i11;
                bVar8.f7987g = -1.0d;
                bVar8.f7989i = -1.0d;
                bVar8.j = -1L;
                bVar8.f7986f.c(StubApp.getString2(25870), true, true);
                result.success(Integer.valueOf(bVar7.h()));
                return;
            case '\r':
                bVar.getClass();
                bVar.f8213b.i(((Integer) methodCall.argument(string212)).intValue());
                result.success(Integer.valueOf(bVar.h()));
                return;
            case 14:
                bVar.getClass();
                try {
                    bVar.f8213b.l(((Double) methodCall.argument(string23)).doubleValue());
                    result.success(Integer.valueOf(bVar.h()));
                    break;
                } catch (Exception e19) {
                    result.error(string213, string213, e19.getMessage());
                    break;
                }
            case 15:
                Vc.b bVar9 = bVar.f8213b;
                Ec.d dVar4 = bVar9.f7982b;
                if (dVar4 != null) {
                    j = dVar4.b();
                    j3 = bVar9.f7982b.c();
                } else {
                    j = 0;
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(StubApp.getString2(665), Long.valueOf(j));
                hashMap.put(string212, Long.valueOf(j3));
                hashMap.put(StubApp.getString2(25840), Integer.valueOf(AbstractC1856e.c(bVar9.b())));
                hashMap.put(string2, Integer.valueOf(bVar.f8217a));
                result.success(hashMap);
                return;
            case 16:
                bVar.getClass();
                result.success("");
                return;
            case 17:
                bVar.getClass();
                try {
                    bVar.f8213b.j(((Double) methodCall.argument(StubApp.getString2("2029"))).doubleValue());
                    result.success(Integer.valueOf(bVar.h()));
                    break;
                } catch (Exception e20) {
                    result.error(string213, string213, e20.getMessage());
                    break;
                }
            case 18:
                bVar.getClass();
                try {
                    if (bVar.f8213b.h()) {
                        result.success(Integer.valueOf(bVar.h()));
                    } else {
                        result.error(string213, string213, StubApp.getString2("25869"));
                    }
                    break;
                } catch (Exception e21) {
                    bVar.f(5, StubApp.getString2(25786) + e21.getMessage());
                    result.error(string213, string213, e21.getMessage());
                    break;
                }
            case 19:
                bVar.getClass();
                Integer num5 = methodCall.argument(string28) != null ? (Integer) methodCall.argument(string28) : 8192;
                Integer num6 = methodCall.argument(string27) != null ? (Integer) methodCall.argument(string27) : 48000;
                Integer num7 = methodCall.argument(string26) != null ? (Integer) methodCall.argument(string26) : 1;
                String string217 = StubApp.getString2(25867);
                if (methodCall.argument(string217) != null) {
                    ((Integer) methodCall.argument(string217)).getClass();
                }
                try {
                    Vc.b bVar10 = bVar.f8213b;
                    int intValue3 = num7.intValue();
                    int intValue4 = num6.intValue();
                    int intValue5 = num5.intValue();
                    bVar10.o();
                    try {
                        eVar = new Vc.e(bVar10);
                        bVar10.f7982b = eVar;
                    } catch (Exception unused) {
                    }
                    try {
                        eVar.l(7, null, intValue4, intValue3, intValue5, bVar10);
                        bVar10.g();
                        result.success(Integer.valueOf(bVar.h()));
                    } catch (Exception unused2) {
                        bVar10 = bVar10;
                        bVar10.d(string25);
                        result.error(string213, string213, string24);
                    }
                } catch (Exception e22) {
                    bVar.f(5, StubApp.getString2(25868));
                    result.error(string213, string213, e22.getMessage());
                }
            default:
                result.notImplemented();
                return;
        }
    }
}
