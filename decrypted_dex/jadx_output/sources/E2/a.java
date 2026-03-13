package E2;

import A2.g;
import C.AbstractC0025b;
import C2.i;
import Xa.AbstractActivityC0364d;
import Xa.h;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.bouncycastle.math.Primes;
import u5.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final c f1868b;

    public a(Context context, d dVar, c cVar, i iVar) {
        this.f1867a = context;
        this.f1868b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        String str = methodCall.method;
        str.getClass();
        String string2 = StubApp.getString2(1792);
        String string22 = StubApp.getString2(1793);
        Context context = this.f1867a;
        String string23 = StubApp.getString2(1794);
        String string24 = StubApp.getString2(1795);
        String string25 = StubApp.getString2(1796);
        c cVar = this.f1868b;
        String string26 = StubApp.getString2(1797);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals(StubApp.getString2(1800))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals(StubApp.getString2(786))) {
                    c10 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals(StubApp.getString2(1799))) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals(StubApp.getString2(136))) {
                    c10 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals(StubApp.getString2(1798))) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                int parseInt = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                if (context == null) {
                    Log.d(string26, string22);
                    result.error(StubApp.getString2(1814), string2, null);
                    break;
                } else if (parseInt != 3 && parseInt != 4 && parseInt != 5) {
                    if (parseInt == 21) {
                        result.success(Integer.valueOf(((BluetoothManager) context.getSystemService(StubApp.getString2(1815))).getAdapter().isEnabled() ? 1 : 0));
                        break;
                    } else if (parseInt == 8) {
                        PackageManager packageManager = context.getPackageManager();
                        if (packageManager.hasSystemFeature(StubApp.getString2(1816))) {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(StubApp.getString2(1817));
                            if (telephonyManager != null && telephonyManager.getPhoneType() != 0) {
                                Intent intent = new Intent(StubApp.getString2(1818));
                                intent.setData(Uri.parse(StubApp.getString2(1819)));
                                if (Build.VERSION.SDK_INT >= 33) {
                                    of = PackageManager.ResolveInfoFlags.of(0L);
                                    queryIntentActivities = packageManager.queryIntentActivities(intent, of);
                                } else {
                                    queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                                }
                                if (queryIntentActivities.isEmpty()) {
                                    result.success(2);
                                    break;
                                } else if (telephonyManager.getSimState() != 5) {
                                    result.success(0);
                                    break;
                                } else {
                                    result.success(1);
                                    break;
                                }
                            } else {
                                result.success(2);
                                break;
                            }
                        } else {
                            result.success(2);
                            break;
                        }
                    } else if (parseInt == 16) {
                        result.success(1);
                        break;
                    } else {
                        result.success(2);
                        break;
                    }
                } else {
                    LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
                    result.success(Integer.valueOf((int) (locationManager == null ? 0 : locationManager.isLocationEnabled())));
                    break;
                }
                break;
            case 1:
                int parseInt2 = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                AbstractActivityC0364d abstractActivityC0364d = cVar.f1874c;
                if (abstractActivityC0364d == null) {
                    Log.d(string26, string24);
                    result.error(string25, string23, null);
                    break;
                } else {
                    ArrayList m4 = W.a.m(abstractActivityC0364d, parseInt2);
                    if (m4 == null) {
                        h.v(parseInt2, StubApp.getString2(1811), string26);
                        result.success(Boolean.FALSE);
                        break;
                    } else if (m4.isEmpty()) {
                        Log.d(string26, StubApp.getString2(1812) + parseInt2 + StubApp.getString2(1813));
                        result.success(Boolean.FALSE);
                        break;
                    } else {
                        result.success(Boolean.valueOf(AbstractC0025b.e(cVar.f1874c, (String) m4.get(0))));
                        break;
                    }
                }
            case 2:
                int parseInt3 = Integer.parseInt(methodCall.arguments.toString());
                Objects.requireNonNull(result);
                result.success(Integer.valueOf(cVar.a(parseInt3)));
                break;
            case 3:
                Objects.requireNonNull(result);
                String string27 = StubApp.getString2(142);
                if (context == null) {
                    Log.d(string26, string22);
                    result.error(StubApp.getString2(1810), string2, null);
                    break;
                } else {
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction(StubApp.getString2("143"));
                        intent2.addCategory(StubApp.getString2("129"));
                        intent2.setData(Uri.parse(string27 + context.getPackageName()));
                        intent2.addFlags(268435456);
                        intent2.addFlags(1073741824);
                        intent2.addFlags(8388608);
                        context.startActivity(intent2);
                        result.success(Boolean.TRUE);
                        break;
                    } catch (Exception unused) {
                        result.success(Boolean.FALSE);
                        return;
                    }
                }
            case 4:
                List<Integer> list = (List) methodCall.arguments();
                Objects.requireNonNull(result);
                g gVar = new g(result, 4);
                if (cVar.f1875d > 0) {
                    result.error(string25, StubApp.getString2(1801), null);
                    break;
                } else if (cVar.f1874c == null) {
                    Log.d(string26, string24);
                    result.error(string25, string23, null);
                    break;
                } else {
                    cVar.f1873b = gVar;
                    cVar.f1876e = new HashMap();
                    cVar.f1875d = 0;
                    ArrayList arrayList = new ArrayList();
                    for (Integer num : list) {
                        if (cVar.a(num.intValue()) != 1) {
                            ArrayList m10 = W.a.m(cVar.f1874c, num.intValue());
                            if (m10 != null && !m10.isEmpty()) {
                                int i3 = Build.VERSION.SDK_INT;
                                if (num.intValue() == 16) {
                                    cVar.c(209, StubApp.getString2(1802));
                                } else if (i3 >= 30 && num.intValue() == 22) {
                                    cVar.c(210, StubApp.getString2(1803));
                                } else if (num.intValue() == 23) {
                                    cVar.c(Primes.SMALL_FACTOR_LIMIT, StubApp.getString2(1804));
                                } else if (num.intValue() == 24) {
                                    cVar.c(212, StubApp.getString2(1805));
                                } else if (num.intValue() == 27) {
                                    cVar.c(213, StubApp.getString2(1806));
                                } else if (i3 >= 31 && num.intValue() == 34) {
                                    cVar.c(214, StubApp.getString2(1807));
                                } else if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(m10);
                                    cVar.f1875d = m10.size() + cVar.f1875d;
                                } else if (cVar.b()) {
                                    arrayList.add(StubApp.getString2(1808));
                                    arrayList.add(StubApp.getString2(1809));
                                    cVar.f1875d += 2;
                                } else {
                                    cVar.f1876e.put(num, 0);
                                }
                            } else if (!cVar.f1876e.containsKey(num)) {
                                cVar.f1876e.put(num, 0);
                                if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                                    cVar.f1876e.put(num, 0);
                                } else {
                                    cVar.f1876e.put(num, 2);
                                }
                            }
                        } else if (!cVar.f1876e.containsKey(num)) {
                            cVar.f1876e.put(num, 1);
                        }
                    }
                    if (arrayList.size() > 0) {
                        AbstractC0025b.d(cVar.f1874c, (String[]) arrayList.toArray(new String[0]), 24);
                    }
                    g gVar2 = cVar.f1873b;
                    if (gVar2 != null && cVar.f1875d == 0) {
                        gVar2.f101b.success(cVar.f1876e);
                        break;
                    }
                }
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
