package D2;

import A2.g;
import C.AbstractC0025b;
import Xa.AbstractActivityC0364d;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: d, reason: collision with root package name */
    public static a f1268d;

    /* renamed from: a, reason: collision with root package name */
    public AbstractActivityC0364d f1269a;

    /* renamed from: b, reason: collision with root package name */
    public g f1270b;

    /* renamed from: c, reason: collision with root package name */
    public g f1271c;

    public static int a(Context context) {
        Iterator it = b(context).iterator();
        while (it.hasNext()) {
            if (D.a.a(context, (String) it.next()) == 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    return 4;
                }
                String string2 = StubApp.getString2(1283);
                return (AbstractC0624h2.n(context, string2) && D.a.a(context, string2) == 0) ? 4 : 3;
            }
        }
        return 1;
    }

    public static ArrayList b(Context context) {
        String string2 = StubApp.getString2(140);
        boolean n10 = AbstractC0624h2.n(context, string2);
        String string22 = StubApp.getString2(141);
        boolean n11 = AbstractC0624h2.n(context, string22);
        if (!n10 && !n11) {
            throw new B2.b();
        }
        ArrayList arrayList = new ArrayList();
        if (n10) {
            arrayList.add(string2);
        }
        if (n11) {
            arrayList.add(string22);
        }
        return arrayList;
    }

    public final void c(AbstractActivityC0364d abstractActivityC0364d, g gVar, g gVar2) {
        if (abstractActivityC0364d == null) {
            gVar2.b(1);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        ArrayList b2 = b(abstractActivityC0364d);
        if (i3 >= 29) {
            String string2 = StubApp.getString2(1283);
            if (AbstractC0624h2.n(abstractActivityC0364d, string2) && a(abstractActivityC0364d) == 3) {
                b2.add(string2);
            }
        }
        this.f1270b = gVar2;
        this.f1271c = gVar;
        this.f1269a = abstractActivityC0364d;
        AbstractC0025b.d(abstractActivityC0364d, (String[]) b2.toArray(new String[0]), 109);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public final boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        int indexOf;
        int i10 = 0;
        if (i3 == 109) {
            AbstractActivityC0364d abstractActivityC0364d = this.f1269a;
            String string2 = StubApp.getString2(959);
            if (abstractActivityC0364d == null) {
                Log.e(string2, StubApp.getString2(1284));
                g gVar = this.f1270b;
                if (gVar != null) {
                    gVar.b(1);
                    return false;
                }
            } else {
                int i11 = 4;
                try {
                    ArrayList b2 = b(abstractActivityC0364d);
                    if (iArr.length == 0) {
                        Log.i(string2, StubApp.getString2(1285));
                        return false;
                    }
                    Iterator it = b2.iterator();
                    char c10 = 65535;
                    boolean z2 = false;
                    boolean z10 = false;
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        int indexOf2 = Arrays.asList(strArr).indexOf(str);
                        if (indexOf2 >= 0) {
                            z2 = true;
                        }
                        if (iArr[indexOf2] == 0) {
                            c10 = 0;
                        }
                        if (AbstractC0025b.e(this.f1269a, str)) {
                            z10 = true;
                        }
                    }
                    if (!z2) {
                        Log.w(string2, StubApp.getString2(1286));
                        return false;
                    }
                    if (c10 != 0) {
                        i11 = !z10 ? 2 : 1;
                    } else if (Build.VERSION.SDK_INT >= 29 && ((indexOf = Arrays.asList(strArr).indexOf(StubApp.getString2(1283))) < 0 || iArr[indexOf] != 0)) {
                        i11 = 3;
                    }
                    g gVar2 = this.f1271c;
                    if (gVar2 != null) {
                        int c11 = AbstractC1856e.c(i11);
                        if (c11 != 0) {
                            if (c11 == 1) {
                                i10 = 1;
                            } else if (c11 == 2) {
                                i10 = 2;
                            } else {
                                if (c11 != 3) {
                                    throw new IndexOutOfBoundsException();
                                }
                                i10 = 3;
                            }
                        }
                        gVar2.f101b.success(Integer.valueOf(i10));
                    }
                    return true;
                } catch (B2.b unused) {
                    g gVar3 = this.f1270b;
                    if (gVar3 != null) {
                        gVar3.b(4);
                    }
                }
            }
        }
        return false;
    }
}
