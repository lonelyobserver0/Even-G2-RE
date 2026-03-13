package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.stub.StubApp;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t.C1692e;

/* renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0708y2 implements C2 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0629i2 f11770b = new C0629i2(3);

    /* renamed from: a, reason: collision with root package name */
    public final Object f11771a;

    public /* synthetic */ C0708y2(Object obj) {
        this.f11771a = obj;
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public boolean a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((C2[]) this.f11771a)[i3].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.C2
    public K2 b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            C2 c22 = ((C2[]) this.f11771a)[i3];
            if (c22.a(cls)) {
                return c22.b(cls);
            }
        }
        throw new UnsupportedOperationException(StubApp.getString2(12321).concat(cls.getName()));
    }

    public Object c() {
        H1 h12 = (H1) this.f11771a;
        ContentResolver contentResolver = h12.f11279a;
        Uri uri = h12.f11280b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        String string2 = StubApp.getString2(12322);
        try {
            if (acquireUnstableContentProviderClient == null) {
                Log.w(string2, StubApp.getString2(12323));
                return Collections.EMPTY_MAP;
            }
            Cursor query = acquireUnstableContentProviderClient.query(uri, H1.f11278i, null, null, null);
            try {
                if (query == null) {
                    Log.w(string2, StubApp.getString2("12324"));
                    return Collections.EMPTY_MAP;
                }
                int count = query.getCount();
                if (count == 0) {
                    Map map = Collections.EMPTY_MAP;
                    query.close();
                    return map;
                }
                Map c1692e = count <= 256 ? new C1692e(count) : new HashMap(count, 1.0f);
                while (query.moveToNext()) {
                    c1692e.put(query.getString(0), query.getString(1));
                }
                if (query.isAfterLast()) {
                    query.close();
                    return c1692e;
                }
                Log.w(string2, StubApp.getString2("12325"));
                Map map2 = Collections.EMPTY_MAP;
                query.close();
                return map2;
            } finally {
            }
        } catch (RemoteException e10) {
            Log.w(string2, "ContentProvider query failed, using default values", e10);
            return Collections.EMPTY_MAP;
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    public void d(int i3, Object obj, L2 l22) {
        V1 v12 = (V1) obj;
        C0599c2 c0599c2 = (C0599c2) this.f11771a;
        c0599c2.N((i3 << 3) | 2);
        c0599c2.N(v12.b(l22));
        l22.d(v12, c0599c2.f11463e);
    }

    public void e(int i3, Object obj, L2 l22) {
        C0599c2 c0599c2 = (C0599c2) this.f11771a;
        c0599c2.E(i3, 3);
        l22.d((V1) obj, c0599c2.f11463e);
        c0599c2.E(i3, 4);
    }

    public C0708y2(int i3) {
        switch (i3) {
            case 1:
                this.f11771a = new HashMap();
                break;
            default:
                I2 i22 = I2.f11287c;
                C0708y2 c0708y2 = new C0708y2(new C2[]{C0629i2.f11586b, f11770b});
                Charset charset = AbstractC0673r2.f11652a;
                this.f11771a = c0708y2;
                break;
        }
    }

    public C0708y2(C0599c2 c0599c2) {
        Charset charset = AbstractC0673r2.f11652a;
        this.f11771a = c0599c2;
        c0599c2.f11463e = this;
    }
}
