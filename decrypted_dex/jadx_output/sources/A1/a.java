package A1;

import B3.j;
import D5.v;
import E9.k;
import H5.C0084q;
import H5.InterfaceC0086t;
import L0.InterfaceC0129z;
import L0.W;
import M4.I;
import N.InterfaceC0167m;
import N.c0;
import T0.o;
import T0.r;
import W4.q;
import W4.s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.util.Base64;
import android.view.View;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.ResultCallback;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import o0.C1406C;
import o0.C1417N;
import q1.C1505a;
import q4.InterfaceC1521b;
import r0.InterfaceC1542c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class a implements r, L4.e, y3.g, InterfaceC1521b, y3.e, Expected.Transformer, W4.e, I3.f, ResultCallback, InterfaceC0167m, InterfaceC1542c, F5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38a;

    public /* synthetic */ a(int i3) {
        this.f38a = i3;
    }

    public static Bitmap g(int i3, byte[] bArr) {
        try {
            return Tc.d.f(i3, bArr);
        } catch (C1406C e10) {
            throw new D0.d(StubApp.getString2(72) + bArr.length + StubApp.getString2(73) + i3 + StubApp.getString2(74), e10);
        } catch (IOException e11) {
            throw new D0.d(e11);
        }
    }

    @Override // T0.r
    public o[] a() {
        return new o[]{new e()};
    }

    @Override // r0.InterfaceC1542c
    public void accept(Object obj) {
        switch (this.f38a) {
            case 21:
                ((W) obj).f4006b.getClass();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    @Override // L4.e, y3.e, I3.f
    public Object apply(Object obj) {
        switch (this.f38a) {
            case 1:
                B0.r rVar = (B0.r) obj;
                rVar.h();
                return I.m(M4.r.u(rVar.f531O.f4094b, new a(22)));
            case 7:
                E5.e eVar = (E5.e) obj;
                a5.c cVar = v.f1462a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.k(byteArrayOutputStream, eVar);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 15:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery(StubApp.getString2(75), new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (rawQuery.moveToNext()) {
                        Q2.g a3 = j.a();
                        a3.T(rawQuery.getString(1));
                        a3.f5713d = L3.a.b(rawQuery.getInt(2));
                        String string = rawQuery.getString(3);
                        a3.f5712c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a3.u());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 17:
                return I.q(Integer.valueOf(((M0.h) obj).f4470a));
            case 19:
                o oVar = (o) obj;
                oVar.getClass();
                return oVar.getClass().getSimpleName();
            case 20:
                return I.m(M4.r.u(((InterfaceC0129z) obj).s().f4094b, new a(22)));
            case 22:
                return Integer.valueOf(((C1417N) obj).f18069c);
            case 25:
                return Long.valueOf(((C1505a) obj).f19880b);
            default:
                return Long.valueOf(((C1505a) obj).f19881c);
        }
    }

    @Override // F5.d
    public String b(Context context) {
        switch (this.f38a) {
            case 28:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            default:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
        }
    }

    @Override // y3.g
    public void c(Exception exc) {
    }

    @Override // N.InterfaceC0167m
    public c0 d(View view, c0 c0Var) {
        Bitmap.CompressFormat compressFormat = UCropActivity.f12959w0;
        F.c f10 = c0Var.f4771a.f(519);
        view.setPaddingRelative(f10.f2165a, f10.f2166b, f10.f2167c, 0);
        return c0Var;
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        switch (this.f38a) {
            case 5:
                return 403;
            default:
                return -1;
        }
    }

    @Override // W4.e
    public Object h(s sVar) {
        C0084q components$lambda$0;
        InterfaceC0086t components$lambda$1;
        switch (this.f38a) {
            case 12:
                Set f10 = sVar.f(q.a(F5.a.class));
                F5.c cVar = F5.c.f2236c;
                if (cVar == null) {
                    synchronized (F5.c.class) {
                        try {
                            cVar = F5.c.f2236c;
                            if (cVar == null) {
                                cVar = new F5.c(0);
                                F5.c.f2236c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new F5.b(f10, cVar);
            case 13:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(sVar);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(sVar);
                return components$lambda$1;
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }

    @Override // com.mapbox.common.ResultCallback
    public void run(boolean z2) {
    }

    public /* synthetic */ a(F9.a aVar, k kVar, F9.b bVar) {
        this.f38a = 10;
    }
}
