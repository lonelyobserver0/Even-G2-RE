package a0;

import R3.InterfaceC0242k;
import R3.n;
import S3.D;
import S3.InterfaceC0278l;
import S3.S;
import T.C0304u;
import Tb.InterfaceC0327h;
import Tb.InterfaceC0328i;
import Z9.m;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.location.LocationResult;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.stub.StubApp;
import d0.C0767E;
import d0.C0791v;
import f4.C0874B;
import f4.C0879c;
import f4.C0882f;
import f4.F;
import f4.l;
import f4.p;
import i.C1019C;
import i.r;
import i4.AbstractC1047k;
import i5.C1059c;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.JSONMessageCodec;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k5.C1107b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.C1200n0;
import l4.F1;
import l4.J1;
import l4.T;
import n.InterfaceC1336f0;
import n.InterfaceC1351n;
import n.W0;
import o0.C1428c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import sa.C1608a;
import v0.C1803F;
import vb.InterfaceC1845b;
import w3.InterfaceC1861b;
import x0.v;
import y7.InterfaceC1975a;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0379a implements q4.i, m, n, InterfaceC0242k, q4.g, InterfaceC1336f0, m.j, J1, InterfaceC0327h, q1.d, InterfaceC1975a, InterfaceC1861b, InterfaceC1845b {

    /* renamed from: c, reason: collision with root package name */
    public static C0379a f9231c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9232a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9233b;

    public /* synthetic */ C0379a(int i3, boolean z2) {
        this.f9232a = i3;
    }

    public static C0379a n() {
        if (f9231c == null) {
            f9231c = new C0379a(13, false);
        }
        return f9231c;
    }

    public static ArrayList r(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            Object obj = jSONArray.get(i3);
            if (obj instanceof JSONArray) {
                obj = r((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = t((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap t(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = r((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = t((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    @Override // l4.J1
    public void a(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        F1 f12 = (F1) this.f9233b;
        if (!isEmpty) {
            f12.b().t(new N9.c(this, str, str2, bundle));
            return;
        }
        C1200n0 c1200n0 = f12.f16069m;
        if (c1200n0 != null) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.c(str2, StubApp.getString2(8315));
        }
    }

    @Override // R3.n
    public void accept(Object obj, Object obj2) {
        com.google.android.gms.common.d dVar;
        q4.k kVar = (q4.k) obj2;
        switch (this.f9232a) {
            case 4:
                C0874B c0874b = (C0874B) obj;
                c0874b.getClass();
                PendingIntent pendingIntent = (PendingIntent) this.f9233b;
                D.h(pendingIntent);
                F f10 = (F) c0874b.t();
                Parcel g10 = f10.g();
                f4.g.b(g10, pendingIntent);
                f10.L(g10, 6);
                kVar.b(null);
                break;
            default:
                p pVar = (p) obj;
                com.google.android.gms.common.d[] k3 = pVar.k();
                Location location = (Location) this.f9233b;
                if (k3 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < k3.length) {
                            dVar = k3[i3];
                            if (!StubApp.getString2(8316).equals(dVar.f11182a)) {
                                i3++;
                            }
                        } else {
                            dVar = null;
                        }
                    }
                    if (dVar != null && dVar.d() >= 1) {
                        F f11 = (F) pVar.t();
                        l lVar = new l(null, kVar);
                        Parcel g11 = f11.g();
                        f4.g.b(g11, location);
                        g11.writeStrongBinder(lVar);
                        f11.L(g11, 85);
                        break;
                    }
                }
                F f12 = (F) pVar.t();
                Parcel g12 = f12.g();
                f4.g.b(g12, location);
                f12.L(g12, 13);
                kVar.b(null);
                break;
        }
    }

    @Override // w3.InterfaceC1861b
    public PdfDocument b(Context context, PdfiumCore pdfiumCore, String str) {
        return pdfiumCore.h(context.getContentResolver().openFileDescriptor((Uri) this.f9233b, StubApp.getString2(1269)), str);
    }

    @Override // q4.g
    public void c() {
        try {
            S s10 = (S) ((InterfaceC0278l) this.f9233b);
            Parcel g10 = s10.g();
            try {
                s10.f10820f.transact(2, g10, null, 1);
            } finally {
                g10.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    @Override // q1.d
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // q1.d
    public long e(int i3) {
        AbstractC1550k.c(i3 == 0);
        return 0L;
    }

    @Override // q1.d
    public List f(long j) {
        return j >= 0 ? (List) this.f9233b : Collections.EMPTY_LIST;
    }

    @Override // q1.d
    public int g() {
        return 1;
    }

    @Override // m.j
    public void h(m.l lVar) {
        switch (this.f9232a) {
            case 10:
                C1019C c1019c = (C1019C) this.f9233b;
                boolean o5 = c1019c.f14504b.f17488a.o();
                r rVar = c1019c.f14505c;
                if (!o5) {
                    if (rVar.onPreparePanel(0, null, lVar)) {
                        rVar.onMenuOpened(108, lVar);
                        break;
                    }
                } else {
                    rVar.onPanelClosed(108, lVar);
                    break;
                }
                break;
            default:
                m.j jVar = ((ActionMenuView) this.f9233b).f9484y;
                if (jVar != null) {
                    jVar.h(lVar);
                    break;
                }
                break;
        }
    }

    @Override // vb.InterfaceC1845b
    public void i(Db.c exception) {
        C1608a c1608a = (C1608a) this.f9233b;
        c1608a.getClass();
        Intrinsics.checkNotNullParameter(exception, "exception");
        c1608a.f20821b = exception;
        ((ConditionVariable) c1608a.f20822c).open();
    }

    public HashMap j(String str) {
        String string = o().getString(str, null);
        if (string != null) {
            try {
                HashMap hashMap = new HashMap(1);
                HashMap t3 = t(new JSONObject(string));
                t3.put(StubApp.getString2("8317"), str);
                hashMap.put(StubApp.getString2("1905"), t3);
                return hashMap;
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    @Override // q4.i
    public q4.j k(Object obj) {
        if (((C1107b) obj) == null) {
            Log.w(StubApp.getString2(280), StubApp.getString2(8318), null);
            return a4.f.m(null);
        }
        V6.b bVar = (V6.b) this.f9233b;
        c5.l.a((c5.l) bVar.f7762c);
        c5.l lVar = (c5.l) bVar.f7762c;
        lVar.f10904m.q(lVar.f10897e.f13422a, null);
        lVar.f10909r.d(null);
        return a4.f.m(null);
    }

    @Override // R3.InterfaceC0242k
    public /* synthetic */ void l(Object obj) {
        ((AbstractC1047k) obj).onLocationResult((LocationResult) this.f9233b);
    }

    @Override // vb.InterfaceC1845b
    public void m(Hb.b bVar) {
        C1608a c1608a = (C1608a) this.f9233b;
        c1608a.f20820a = bVar;
        ((ConditionVariable) c1608a.f20822c).open();
    }

    public SharedPreferences o() {
        if (((SharedPreferences) this.f9233b) == null) {
            this.f9233b = hc.b.f14499b.getSharedPreferences(StubApp.getString2(8319), 0);
        }
        return (SharedPreferences) this.f9233b;
    }

    @Override // Tb.InterfaceC0327h
    public Object p(InterfaceC0328i interfaceC0328i, Continuation continuation) {
        Object p8 = ((InterfaceC0327h) this.f9233b).p(new C0304u(interfaceC0328i, 2), continuation);
        return p8 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? p8 : Unit.INSTANCE;
    }

    @Override // m.j
    public boolean q(m.l lVar, MenuItem menuItem) {
        boolean z2;
        boolean onMenuItemSelected;
        switch (this.f9232a) {
            case 10:
                return false;
            default:
                InterfaceC1351n interfaceC1351n = ((ActionMenuView) this.f9233b).f9477D;
                if (interfaceC1351n == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((C0879c) interfaceC1351n).f13742a;
                Iterator it = ((CopyOnWriteArrayList) toolbar.f9570K.f5712c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = false;
                    } else if (((C0767E) it.next()).f13132a.p()) {
                        z2 = true;
                    }
                }
                if (z2) {
                    onMenuItemSelected = true;
                } else {
                    W0 w02 = toolbar.f9572O;
                    onMenuItemSelected = w02 != null ? ((C1019C) ((C0882f) w02).f13748b).f14505c.f14621a.onMenuItemSelected(0, menuItem) : false;
                }
                return onMenuItemSelected;
        }
    }

    public void u() {
        ((C0791v) this.f9233b).f13394d.P();
    }

    public void v(Exception exc) {
        AbstractC1550k.l(StubApp.getString2(8320), StubApp.getString2(8321), exc);
        C1803F c1803f = ((v) this.f9233b).f22794X0;
        Handler handler = (Handler) c1803f.f21581a;
        if (handler != null) {
            handler.post(new x0.e(c1803f, exc, 4));
        }
    }

    public JSONObject w() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        String string2 = StubApp.getString2(8322);
        String string22 = StubApp.getString2(280);
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable(string22, 3)) {
            Log.d(string22, StubApp.getString2(8323), null);
        }
        try {
            File file = (File) this.f9233b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(c5.f.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e(string22, StubApp.getString2("8325"), e);
                        c5.f.b(fileInputStream, string2);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    c5.f.b(fileInputStream2, string2);
                    throw th;
                }
            } else {
                String string23 = StubApp.getString2("8324");
                if (Log.isLoggable(string22, 2)) {
                    Log.v(string22, string23, null);
                }
                jSONObject = null;
            }
            c5.f.b(fileInputStream2, string2);
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            c5.f.b(fileInputStream2, string2);
            throw th;
        }
    }

    public void x(String str) {
        o().edit().remove(str).apply();
        SharedPreferences o5 = o();
        String string2 = StubApp.getString2(8326);
        String string = o5.getString(string2, "");
        if (string.isEmpty()) {
            return;
        }
        o().edit().putString(string2, string.replace(str.concat(StubApp.getString2(321)), "")).apply();
    }

    public /* synthetic */ C0379a(Object obj, int i3) {
        this.f9232a = i3;
        this.f9233b = obj;
    }

    public C0379a(F1 f12) {
        this.f9232a = 14;
        Objects.requireNonNull(f12);
        this.f9233b = f12;
    }

    public C0379a(y7.b options) {
        this.f9232a = 24;
        Intrinsics.checkNotNullParameter(options, "options");
        this.f9233b = options;
    }

    public C0379a(Za.d dVar) {
        this.f9232a = 8;
        this.f9233b = new BasicMessageChannel(dVar, StubApp.getString2(8313), JSONMessageCodec.INSTANCE);
    }

    public C0379a(C1059c c1059c) {
        this.f9232a = 12;
        this.f9233b = new File((File) c1059c.f14844c, StubApp.getString2(8314));
    }

    public C0379a(int i3) {
        this.f9232a = i3;
        switch (i3) {
            case 22:
                this.f9233b = new q4.n();
                break;
            default:
                this.f9233b = Handler.createAsync(Looper.getMainLooper());
                break;
        }
    }

    public C0379a(C1428c c1428c) {
        this.f9232a = 21;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1428c.f18128a).setFlags(0).setUsage(1);
        int i3 = AbstractC1560u.f20190a;
        if (i3 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i3 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f9233b = usage.build();
    }

    public C0379a(EditText editText) {
        this.f9232a = 0;
        this.f9233b = new V6.b(editText);
    }
}
