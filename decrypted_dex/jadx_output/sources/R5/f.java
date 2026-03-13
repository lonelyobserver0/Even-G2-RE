package R5;

import Xa.h;
import Z9.C0366a;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import ba.AbstractC0534b;
import com.google.android.gms.internal.measurement.P3;
import com.stub.StubApp;
import i.RunnableC1018B;
import io.flutter.plugins.urllauncher.WebViewActivity;
import l4.AbstractC1148D;
import l4.C1191k0;
import l4.C1200n0;
import l4.T;
import m6.l;
import o0.C1428c;
import pc.AbstractC1499a;
import r0.AbstractC1560u;
import r0.C1551l;
import r0.C1552m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6218a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6219b;

    public /* synthetic */ f(Object obj, int i3) {
        this.f6218a = i3;
        this.f6219b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string2;
        C1552m c1552m;
        int i3 = 3;
        char c10 = 65535;
        int i10 = 1;
        Object obj = this.f6219b;
        switch (this.f6218a) {
            case 0:
                if (StubApp.getString2(5738).equals(intent.getAction())) {
                    ((Handler) ((Mb.a) obj).f4726e).post(new a(i10, this, intent.getIntExtra(StubApp.getString2(5739), -1) <= 0));
                    break;
                }
                break;
            case 1:
                ((AbstractC0534b) obj).i();
                break;
            case 2:
                C1200n0 c1200n0 = (C1200n0) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int hashCode = action.hashCode();
                        if (hashCode != -1928239649) {
                            if (hashCode == 1279883384 && action.equals(StubApp.getString2(5202))) {
                                c10 = 1;
                            }
                        } else if (action.equals(StubApp.getString2(5201))) {
                            c10 = 0;
                        }
                        if (c10 == 0) {
                            P3.a();
                            if (c1200n0.f16539d.u(null, AbstractC1148D.f15955Q0)) {
                                T t3 = c1200n0.f16541f;
                                C1200n0.l(t3);
                                t3.f16249p.b(StubApp.getString2(5737));
                                C1191k0 c1191k0 = c1200n0.f16542g;
                                C1200n0.l(c1191k0);
                                c1191k0.t(new RunnableC1018B(c1200n0, 11));
                                break;
                            }
                        } else if (c10 == 1) {
                            T t10 = c1200n0.f16541f;
                            C1200n0.l(t10);
                            t10.f16249p.b(StubApp.getString2(5736));
                            C1191k0 c1191k02 = c1200n0.f16542g;
                            C1200n0.l(c1191k02);
                            c1191k02.t(new RunnableC1018B(this, 10));
                            break;
                        } else {
                            T t11 = c1200n0.f16541f;
                            C1200n0.l(t11);
                            t11.j.b(StubApp.getString2(5735));
                            break;
                        }
                    } else {
                        T t12 = c1200n0.f16541f;
                        C1200n0.l(t12);
                        t12.j.b(StubApp.getString2(5734));
                        break;
                    }
                } else {
                    T t13 = c1200n0.f16541f;
                    C1200n0.l(t13);
                    t13.j.b(StubApp.getString2(5733));
                    break;
                }
                break;
            case 3:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra(StubApp.getString2(1287));
                no.nordicsemi.android.ble.c cVar = (no.nordicsemi.android.ble.c) obj;
                BluetoothDevice bluetoothDevice2 = cVar.f17932b.f17909f;
                if (bluetoothDevice2 != null && bluetoothDevice != null && bluetoothDevice.getAddress().equals(bluetoothDevice2.getAddress())) {
                    int intExtra = intent.getIntExtra(StubApp.getString2(5722), 0);
                    int intExtra2 = intent.getIntExtra(StubApp.getString2(5723), -1);
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(5724));
                    char[] cArr = AbstractC1499a.f19808a;
                    switch (intExtra) {
                        case 0:
                            string2 = StubApp.getString2(5731);
                            break;
                        case 1:
                            string2 = StubApp.getString2(5730);
                            break;
                        case 2:
                            string2 = StubApp.getString2(5729);
                            break;
                        case 3:
                            string2 = StubApp.getString2(5728);
                            break;
                        case 4:
                            string2 = StubApp.getString2(5727);
                            break;
                        case 5:
                            string2 = StubApp.getString2(5726);
                            break;
                        case 6:
                            string2 = StubApp.getString2(5725);
                            break;
                        default:
                            string2 = h.g(intExtra, StubApp.getString2(3049), StubApp.getString2(74));
                            break;
                    }
                    sb2.append(string2);
                    sb2.append(StubApp.getString2(1561));
                    sb2.append(intExtra);
                    sb2.append(StubApp.getString2(5732));
                    sb2.append(intExtra2);
                    cVar.b(3, sb2.toString());
                    break;
                }
                break;
            case 4:
                if (StubApp.getString2(5721).equals(intent.getAction())) {
                    ((WebViewActivity) obj).finish();
                    break;
                }
                break;
            case 5:
                if (intent != null) {
                    ((p2.c) obj).g(intent);
                    break;
                }
                break;
            case 6:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(StubApp.getString2(1008));
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i3 = type != 9 ? 8 : 7;
                                        }
                                        i3 = 5;
                                    }
                                }
                                i3 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i3 = 4;
                                    break;
                                case 13:
                                    i3 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i3 = 6;
                                    break;
                                case 18:
                                    i3 = 2;
                                    break;
                                case 20:
                                    if (AbstractC1560u.f20190a >= 29) {
                                        i3 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i3 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    c1552m = (C1552m) obj;
                    if (AbstractC1560u.f20190a >= 31 || i3 != 5) {
                        C1552m.a(i3, c1552m);
                        break;
                    } else {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(StubApp.getString2("1817"));
                            telephonyManager.getClass();
                            C1551l c1551l = new C1551l(c1552m);
                            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c1551l);
                            telephonyManager.unregisterTelephonyCallback(c1551l);
                            break;
                        } catch (RuntimeException unused2) {
                            C1552m.a(5, c1552m);
                            return;
                        }
                    }
                }
                i3 = 0;
                c1552m = (C1552m) obj;
                if (AbstractC1560u.f20190a >= 31) {
                }
                C1552m.a(i3, c1552m);
                break;
            default:
                if (!isInitialStickyBroadcast()) {
                    l lVar = (l) obj;
                    lVar.a(x0.b.b(context, intent, (C1428c) lVar.j, (C0366a) lVar.f17117i));
                    break;
                }
                break;
        }
    }

    public f(C1200n0 c1200n0) {
        this.f6218a = 2;
        this.f6219b = c1200n0;
    }
}
