package H1;

import android.content.res.AssetManager;
import android.os.Build;
import com.stub.StubApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f2670a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2671b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2672c;

    /* renamed from: d, reason: collision with root package name */
    public final File f2673d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2674e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2675f = false;

    /* renamed from: g, reason: collision with root package name */
    public I0.e[] f2676g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f2677h;

    public b(AssetManager assetManager, Executor executor, c cVar, String str, File file) {
        byte[] bArr;
        this.f2670a = executor;
        this.f2671b = cVar;
        this.f2674e = str;
        this.f2673d = file;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31) {
            switch (i3) {
                case 28:
                case 29:
                case 30:
                    bArr = d.f2682e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = d.f2681d;
        }
        this.f2672c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains(StubApp.getString2(2490))) {
                return null;
            }
            this.f2671b.g();
            return null;
        }
    }

    public final void b(int i3, Serializable serializable) {
        this.f2670a.execute(new a(i3, 0, this, serializable));
    }
}
