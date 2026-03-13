package O9;

import Xa.AbstractActivityC0364d;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c implements PluginRegistry.ActivityResultListener {

    /* renamed from: l, reason: collision with root package name */
    public static final int f5294l = (j.class.hashCode() + 43) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5295m = (j.class.hashCode() + 83) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0364d f5296a;

    /* renamed from: e, reason: collision with root package name */
    public String f5300e;

    /* renamed from: h, reason: collision with root package name */
    public String[] f5303h;
    public EventChannel.EventSink j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f5304k;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5298c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5299d = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5301f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f5302g = 20;

    /* renamed from: b, reason: collision with root package name */
    public i f5297b = null;

    public c(AbstractActivityC0364d abstractActivityC0364d) {
        this.f5296a = abstractActivityC0364d;
    }

    public final void a(boolean z2) {
        if (this.j == null || this.f5300e.equals(StubApp.getString2(4472))) {
            return;
        }
        new b(this, Looper.getMainLooper(), z2).obtainMessage().sendToTarget();
    }

    public final void b(String str, String str2) {
        if (this.f5297b == null) {
            return;
        }
        a(false);
        this.f5297b.error(str, str2, null);
        this.f5297b = null;
    }

    public final void c(Serializable serializable) {
        a(false);
        if (this.f5297b != null) {
            if (serializable != null && !(serializable instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) serializable).iterator();
                while (it.hasNext()) {
                    a aVar = (a) it.next();
                    aVar.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put(StubApp.getString2(1251), aVar.f5287a);
                    hashMap.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), aVar.f5288b);
                    hashMap.put(StubApp.getString2(4473), Long.valueOf(aVar.f5290d));
                    hashMap.put(StubApp.getString2(1034), aVar.f5291e);
                    hashMap.put(StubApp.getString2(4474), aVar.f5289c.toString());
                    arrayList.add(hashMap);
                }
                serializable = arrayList;
            }
            this.f5297b.success(serializable);
            this.f5297b = null;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i3, int i10, Intent intent) {
        int i11 = f5295m;
        String string2 = StubApp.getString2(4475);
        if (i3 == i11) {
            if (i10 == -1) {
                if (intent != null) {
                    a(true);
                    Uri data = intent.getData();
                    if (data != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                        sb2.append(File.separator);
                        AbstractActivityC0364d abstractActivityC0364d = this.f5296a;
                        sb2.append(W.a.k(abstractActivityC0364d, data));
                        String sb3 = sb2.toString();
                        try {
                            OutputStream openOutputStream = abstractActivityC0364d.getContentResolver().openOutputStream(data);
                            if (openOutputStream != null) {
                                openOutputStream.write(this.f5304k);
                                openOutputStream.flush();
                                openOutputStream.close();
                            }
                            c(sb3);
                            return true;
                        } catch (IOException e10) {
                            String string22 = StubApp.getString2(4476);
                            Log.i(string2, string22, e10);
                            b(string22, e10.getMessage());
                        }
                    }
                }
            }
            if (i10 == 0) {
                Log.i(string2, StubApp.getString2(4477));
                c(null);
            }
        } else if (this.f5300e != null) {
            int i12 = f5294l;
            if (i3 == i12 && i10 == -1) {
                a(true);
                new Thread(new Q4.b(this, intent, 7, false)).start();
                return true;
            }
            if (i3 == i12 && i10 == 0) {
                Log.i(string2, StubApp.getString2(4478));
                c(null);
                return true;
            }
            if (i3 == i12) {
                b(StubApp.getString2(4479), StubApp.getString2(4480));
            }
        }
        return false;
    }
}
