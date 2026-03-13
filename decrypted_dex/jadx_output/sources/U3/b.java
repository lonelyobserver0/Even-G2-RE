package U3;

import Q3.i;
import Q3.j;
import R3.r;
import S3.C0283q;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.stub.StubApp;
import f4.C0874B;
import f4.p;
import i5.C1059c;
import o4.C1458a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Ec.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7451d;

    @Override // Ec.d
    public Q3.c n(Context context, Looper looper, C1059c c1059c, Object obj, i iVar, j jVar) {
        switch (this.f7451d) {
            case 3:
                c1059c.getClass();
                Integer num = (Integer) c1059c.f14848g;
                Bundle bundle = new Bundle();
                bundle.putParcelable(StubApp.getString2(6328), null);
                if (num != null) {
                    bundle.putInt(StubApp.getString2(6329), num.intValue());
                }
                bundle.putBoolean(StubApp.getString2(6330), false);
                bundle.putBoolean(StubApp.getString2(6331), false);
                bundle.putString(StubApp.getString2(6332), null);
                bundle.putBoolean(StubApp.getString2(6333), true);
                bundle.putBoolean(StubApp.getString2(6334), false);
                bundle.putString(StubApp.getString2(6335), null);
                bundle.putString(StubApp.getString2(6336), null);
                bundle.putBoolean(StubApp.getString2(6337), false);
                return new C1458a(context, looper, c1059c, bundle, iVar, jVar);
            case 4:
                throw com.mapbox.common.b.d(obj);
            default:
                return super.n(context, looper, c1059c, obj, iVar, jVar);
        }
    }

    @Override // Ec.d
    public Q3.c o(Context context, Looper looper, C1059c c1059c, Object obj, r rVar, r rVar2) {
        switch (this.f7451d) {
            case 0:
                return new d(context, looper, c1059c, (C0283q) obj, rVar, rVar2);
            case 1:
                return new C0874B(context, looper, 23, c1059c, rVar, rVar2);
            case 2:
                return new p(context, looper, c1059c, rVar, rVar2);
            default:
                return super.o(context, looper, c1059c, obj, rVar, rVar2);
        }
    }
}
