package E2;

import A2.g;
import Xa.AbstractActivityC0364d;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.stub.StubApp;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1872a;

    /* renamed from: b, reason: collision with root package name */
    public g f1873b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0364d f1874c;

    /* renamed from: d, reason: collision with root package name */
    public int f1875d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f1876e;

    public c(Context context) {
        this.f1872a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (new C.J(r6).f810b.areNotificationsEnabled() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r18) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.c.a(int):int");
    }

    public final boolean b() {
        ArrayList m4 = W.a.m(this.f1872a, 37);
        boolean z2 = m4 != null && m4.contains(StubApp.getString2(1808));
        boolean z10 = m4 != null && m4.contains(StubApp.getString2(1809));
        if (z2 && z10) {
            return true;
        }
        String string2 = StubApp.getString2(1797);
        if (!z2) {
            Log.d(string2, StubApp.getString2(NewHope.SENDA_BYTES));
        }
        if (!z10) {
            Log.d(string2, StubApp.getString2(1825));
        }
        return false;
    }

    public final void c(int i3, String str) {
        if (this.f1874c == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals(StubApp.getString2(1806))) {
            intent.setData(Uri.parse(StubApp.getString2(142) + this.f1874c.getPackageName()));
        }
        this.f1874c.startActivityForResult(intent, i3);
        this.f1875d++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i3, int i10, Intent intent) {
        boolean z2;
        int i11;
        boolean canScheduleExactAlarms;
        boolean isExternalStorageManager;
        int i12;
        AbstractActivityC0364d abstractActivityC0364d = this.f1874c;
        boolean z10 = false;
        z10 = false;
        if (abstractActivityC0364d != null) {
            if (this.f1876e == null) {
                this.f1875d = 0;
                return false;
            }
            if (i3 == 209) {
                Context context = this.f1872a;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService(StubApp.getString2(1358));
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    z10 = true;
                }
                i11 = 16;
                i12 = z10;
            } else if (i3 == 210) {
                if (Build.VERSION.SDK_INT >= 30) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    i11 = 22;
                    i12 = isExternalStorageManager;
                }
            } else if (i3 == 211) {
                i11 = 23;
                i12 = Settings.canDrawOverlays(abstractActivityC0364d);
            } else if (i3 == 212) {
                i11 = 24;
                i12 = abstractActivityC0364d.getPackageManager().canRequestPackageInstalls();
            } else if (i3 == 213) {
                i11 = 27;
                i12 = ((NotificationManager) abstractActivityC0364d.getSystemService(StubApp.getString2(490))).isNotificationPolicyAccessGranted();
            } else if (i3 == 214) {
                AlarmManager alarmManager = (AlarmManager) abstractActivityC0364d.getSystemService(StubApp.getString2(1822));
                if (Build.VERSION.SDK_INT >= 31) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    z2 = canScheduleExactAlarms;
                } else {
                    z2 = true;
                }
                i11 = 34;
                i12 = z2;
            }
            this.f1876e.put(Integer.valueOf(i11), Integer.valueOf(i12));
            int i13 = this.f1875d - 1;
            this.f1875d = i13;
            g gVar = this.f1873b;
            if (gVar != null && i13 == 0) {
                gVar.f101b.success(this.f1876e);
            }
            return true;
        }
        return false;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        int i10;
        int i11 = 4;
        int i12 = 7;
        int i13 = 3;
        String string2 = StubApp.getString2(1809);
        String string22 = StubApp.getString2(1808);
        if (i3 != 24) {
            this.f1875d = 0;
            return false;
        }
        if (this.f1876e == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            this.f1875d = 0;
            Log.w(StubApp.getString2(1797), StubApp.getString2(1826));
            return false;
        }
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf(string22);
        if (indexOf >= 0) {
            int z2 = W.a.z(this.f1874c, string22, iArr[indexOf]);
            this.f1876e.put(36, Integer.valueOf(z2));
            int indexOf2 = asList.indexOf(string2);
            if (indexOf2 >= 0) {
                int z10 = W.a.z(this.f1874c, string2, iArr[indexOf2]);
                Integer valueOf = Integer.valueOf(z2);
                Integer valueOf2 = Integer.valueOf(z10);
                HashSet hashSet = new HashSet();
                hashSet.add(valueOf);
                hashSet.add(valueOf2);
                Integer x7 = W.a.x(hashSet);
                this.f1876e.put(37, x7);
                this.f1876e.put(0, x7);
            }
        }
        int i14 = 0;
        while (i14 < strArr.length) {
            String str = strArr[i14];
            if (!str.equals(string22) && !str.equals(string2)) {
                int i15 = -1;
                switch (str.hashCode()) {
                    case -2062386608:
                        if (str.equals(StubApp.getString2(1861))) {
                            i15 = 0;
                            break;
                        }
                        break;
                    case -1928411001:
                        if (str.equals(string2)) {
                            i15 = 1;
                            break;
                        }
                        break;
                    case -1925850455:
                        if (str.equals(StubApp.getString2(783))) {
                            i15 = 2;
                            break;
                        }
                        break;
                    case -1921431796:
                        if (str.equals(StubApp.getString2(1860))) {
                            i15 = i13;
                            break;
                        }
                        break;
                    case -1888586689:
                        if (str.equals(StubApp.getString2(140))) {
                            i15 = i11;
                            break;
                        }
                        break;
                    case -1813079487:
                        if (str.equals(StubApp.getString2(1859))) {
                            i15 = 5;
                            break;
                        }
                        break;
                    case -1783097621:
                        if (str.equals(StubApp.getString2(1858))) {
                            i15 = 6;
                            break;
                        }
                        break;
                    case -1561629405:
                        if (str.equals(StubApp.getString2(1857))) {
                            i15 = i12;
                            break;
                        }
                        break;
                    case -1479758289:
                        if (str.equals(StubApp.getString2(1856))) {
                            i15 = 8;
                            break;
                        }
                        break;
                    case -1238066820:
                        if (str.equals(StubApp.getString2(1855))) {
                            i15 = 9;
                            break;
                        }
                        break;
                    case -1164582768:
                        if (str.equals(StubApp.getString2(1854))) {
                            i15 = 10;
                            break;
                        }
                        break;
                    case -909527021:
                        if (str.equals(StubApp.getString2(1853))) {
                            i15 = 11;
                            break;
                        }
                        break;
                    case -895679497:
                        if (str.equals(StubApp.getString2(1852))) {
                            i15 = 12;
                            break;
                        }
                        break;
                    case -895673731:
                        if (str.equals(StubApp.getString2(1851))) {
                            i15 = 13;
                            break;
                        }
                        break;
                    case -798669607:
                        if (str.equals(StubApp.getString2(1850))) {
                            i15 = 14;
                            break;
                        }
                        break;
                    case -406040016:
                        if (str.equals(StubApp.getString2(1849))) {
                            i15 = 15;
                            break;
                        }
                        break;
                    case -63024214:
                        if (str.equals(StubApp.getString2(141))) {
                            i15 = 16;
                            break;
                        }
                        break;
                    case -5573545:
                        if (str.equals(StubApp.getString2(1848))) {
                            i15 = 17;
                            break;
                        }
                        break;
                    case 52602690:
                        if (str.equals(StubApp.getString2(1847))) {
                            i15 = 18;
                            break;
                        }
                        break;
                    case 112197485:
                        if (str.equals(StubApp.getString2(1846))) {
                            i15 = 19;
                            break;
                        }
                        break;
                    case 175802396:
                        if (str.equals(StubApp.getString2(1845))) {
                            i15 = 20;
                            break;
                        }
                        break;
                    case 214526995:
                        if (str.equals(StubApp.getString2(1844))) {
                            i15 = 21;
                            break;
                        }
                        break;
                    case 361658321:
                        if (str.equals(StubApp.getString2(1843))) {
                            i15 = 22;
                            break;
                        }
                        break;
                    case 463403621:
                        if (str.equals(StubApp.getString2(1842))) {
                            i15 = 23;
                            break;
                        }
                        break;
                    case 603653886:
                        if (str.equals(string22)) {
                            i15 = 24;
                            break;
                        }
                        break;
                    case 610633091:
                        if (str.equals(StubApp.getString2(1841))) {
                            i15 = 25;
                            break;
                        }
                        break;
                    case 691260818:
                        if (str.equals(StubApp.getString2(1840))) {
                            i15 = 26;
                            break;
                        }
                        break;
                    case 710297143:
                        if (str.equals(StubApp.getString2(1839))) {
                            i15 = 27;
                            break;
                        }
                        break;
                    case 784519842:
                        if (str.equals(StubApp.getString2(1838))) {
                            i15 = 28;
                            break;
                        }
                        break;
                    case 970694249:
                        if (str.equals(StubApp.getString2(1837))) {
                            i15 = 29;
                            break;
                        }
                        break;
                    case 1166454870:
                        if (str.equals(StubApp.getString2(1836))) {
                            i15 = 30;
                            break;
                        }
                        break;
                    case 1271781903:
                        if (str.equals(StubApp.getString2(1835))) {
                            i15 = 31;
                            break;
                        }
                        break;
                    case 1365911975:
                        if (str.equals(StubApp.getString2(1834))) {
                            i15 = 32;
                            break;
                        }
                        break;
                    case 1777263169:
                        if (str.equals(StubApp.getString2(1833))) {
                            i15 = 33;
                            break;
                        }
                        break;
                    case 1780337063:
                        if (str.equals(StubApp.getString2(1832))) {
                            i15 = 34;
                            break;
                        }
                        break;
                    case 1831139720:
                        if (str.equals(StubApp.getString2(1831))) {
                            i15 = 35;
                            break;
                        }
                        break;
                    case 1977429404:
                        if (str.equals(StubApp.getString2(1830))) {
                            i15 = 36;
                            break;
                        }
                        break;
                    case 2024715147:
                        if (str.equals(StubApp.getString2(1283))) {
                            i15 = 37;
                            break;
                        }
                        break;
                    case 2062356686:
                        if (str.equals(StubApp.getString2(1829))) {
                            i15 = 38;
                            break;
                        }
                        break;
                    case 2114579147:
                        if (str.equals(StubApp.getString2(1828))) {
                            i15 = 39;
                            break;
                        }
                        break;
                    case 2133799037:
                        if (str.equals(StubApp.getString2(1827))) {
                            i15 = 40;
                            break;
                        }
                        break;
                }
                switch (i15) {
                    case 0:
                    case 8:
                    case 12:
                    case 13:
                    case 18:
                        i10 = 13;
                        break;
                    case 1:
                    case 24:
                        i10 = 0;
                        break;
                    case 2:
                        i10 = 17;
                        break;
                    case 3:
                    case 10:
                    case 17:
                    case 19:
                    case 25:
                    case 28:
                    case 40:
                        i10 = 8;
                        break;
                    case 4:
                    case 16:
                        i10 = i13;
                        break;
                    case 5:
                        i10 = 22;
                        break;
                    case 6:
                        i10 = 27;
                        break;
                    case 7:
                        i10 = 23;
                        break;
                    case 9:
                        i10 = 12;
                        break;
                    case 11:
                        i10 = 31;
                        break;
                    case 14:
                        i10 = 30;
                        break;
                    case 15:
                    case 32:
                        i10 = 15;
                        break;
                    case 20:
                        i10 = 9;
                        break;
                    case 21:
                    case 31:
                    case EACTags.APPLICATION_EXPIRATION_DATE /* 36 */:
                        i10 = 2;
                        break;
                    case 22:
                        i10 = 35;
                        break;
                    case 23:
                        i10 = 1;
                        break;
                    case 26:
                        i10 = 33;
                        break;
                    case 27:
                        i10 = 32;
                        break;
                    case 29:
                        i10 = 34;
                        break;
                    case 30:
                        i10 = 29;
                        break;
                    case 33:
                        i10 = 24;
                        break;
                    case 34:
                        i10 = 19;
                        break;
                    case 35:
                        i10 = i12;
                        break;
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                        i10 = i11;
                        break;
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                        i10 = 28;
                        break;
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        i10 = 18;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                if (i10 != 20) {
                    int i16 = iArr[i14];
                    if (i10 == 8) {
                        Integer num = (Integer) this.f1876e.get(8);
                        Integer valueOf3 = Integer.valueOf(W.a.z(this.f1874c, str, i16));
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(num);
                        hashSet2.add(valueOf3);
                        this.f1876e.put(8, W.a.x(hashSet2));
                    } else if (i10 == i12) {
                        if (!this.f1876e.containsKey(Integer.valueOf(i12))) {
                            this.f1876e.put(Integer.valueOf(i12), Integer.valueOf(W.a.z(this.f1874c, str, i16)));
                        }
                        if (!this.f1876e.containsKey(14)) {
                            this.f1876e.put(14, Integer.valueOf(W.a.z(this.f1874c, str, i16)));
                        }
                    } else if (i10 == i11) {
                        int z11 = W.a.z(this.f1874c, str, i16);
                        if (!this.f1876e.containsKey(Integer.valueOf(i11))) {
                            this.f1876e.put(Integer.valueOf(i11), Integer.valueOf(z11));
                        }
                    } else if (i10 == i13) {
                        int z12 = W.a.z(this.f1874c, str, i16);
                        if (Build.VERSION.SDK_INT < 29 && !this.f1876e.containsKey(Integer.valueOf(i11))) {
                            this.f1876e.put(Integer.valueOf(i11), Integer.valueOf(z12));
                        }
                        if (!this.f1876e.containsKey(5)) {
                            this.f1876e.put(5, Integer.valueOf(z12));
                        }
                        this.f1876e.put(Integer.valueOf(i10), Integer.valueOf(z12));
                    } else {
                        if (i10 == 9 || i10 == 32) {
                            this.f1876e.put(Integer.valueOf(i10), Integer.valueOf(a(i10)));
                        } else if (!this.f1876e.containsKey(Integer.valueOf(i10))) {
                            this.f1876e.put(Integer.valueOf(i10), Integer.valueOf(W.a.z(this.f1874c, str, i16)));
                        }
                        i14++;
                        i13 = 3;
                        i11 = 4;
                        i12 = 7;
                    }
                }
            }
            i14++;
            i13 = 3;
            i11 = 4;
            i12 = 7;
        }
        int length = this.f1875d - iArr.length;
        this.f1875d = length;
        g gVar = this.f1873b;
        if (gVar != null && length == 0) {
            gVar.f101b.success(this.f1876e);
        }
        return true;
    }
}
