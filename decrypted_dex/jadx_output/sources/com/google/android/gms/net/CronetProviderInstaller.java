package com.google.android.gms.net;

import S3.D;
import a4.a;
import a4.d;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import com.stub.StubApp;
import java.lang.reflect.Method;
import l4.O0;
import org.chromium.net.ApiVersion;
import q4.j;
import q4.k;
import q4.s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class CronetProviderInstaller {
    public static final String PROVIDER_NAME = StubApp.getString2(12431);
    private static final String zza = StubApp.getString2(12432);
    private static final e zzb = e.getInstance();
    private static final Object zzc = new Object();
    private static d zzd = null;
    private static String zze = StubApp.getString2(824);

    private CronetProviderInstaller() {
    }

    public static j installProvider(Context context) {
        D.i(context, StubApp.getString2(5965));
        k kVar = new k();
        boolean isInstalled = isInstalled();
        s sVar = kVar.f20051a;
        if (isInstalled) {
            kVar.b(null);
            return sVar;
        }
        new Thread(new O0(6, context, kVar)).start();
        return sVar;
    }

    public static boolean isInstalled() {
        return zza() != null;
    }

    public static d zza() {
        d dVar;
        synchronized (zzc) {
            dVar = zzd;
        }
        return dVar;
    }

    public static String zzb() {
        String str;
        synchronized (zzc) {
            str = zze;
        }
        return str;
    }

    @Deprecated
    public static void zzc(Context context) throws f, g {
        synchronized (zzc) {
            try {
                if (isInstalled()) {
                    return;
                }
                D.i(context, StubApp.getString2("5965"));
                ClassLoader classLoader = CronetProviderInstaller.class.getClassLoader();
                D.h(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    e eVar = zzb;
                    eVar.verifyGooglePlayServicesIsAvailable(context, 11925000);
                    try {
                        d c10 = d.c(context, d.f9258b, StubApp.getString2("12433"));
                        try {
                            Class<?> loadClass = c10.f9271a.getClassLoader().loadClass(StubApp.getString2("12434"));
                            if (loadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                                Log.e(zza, StubApp.getString2("12442"));
                                throw new f();
                            }
                            Method method = loadClass.getMethod(StubApp.getString2("12435"), new Class[0]);
                            Method method2 = loadClass.getMethod(StubApp.getString2("12436"), new Class[0]);
                            Integer num = (Integer) method.invoke(null, new Object[0]);
                            D.h(num);
                            int intValue = num.intValue();
                            String str = (String) method2.invoke(null, new Object[0]);
                            D.h(str);
                            zze = str;
                            if (apiLevel <= intValue) {
                                zzd = c10;
                                return;
                            }
                            if (eVar.getErrorResolutionIntent(context, 2, StubApp.getString2("12437")) == null) {
                                Log.e(zza, StubApp.getString2("12438"));
                                throw new f();
                            }
                            String str2 = zze;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb2.append(StubApp.getString2("12439"));
                            sb2.append(apiLevel);
                            sb2.append(StubApp.getString2("12440"));
                            sb2.append(intValue);
                            sb2.append(StubApp.getString2("12441"));
                            sb2.append(str2);
                            throw new g(sb2.toString());
                        } catch (Exception e10) {
                            Log.e(zza, StubApp.getString2("12443"), e10);
                            throw ((f) new f().initCause(e10));
                        }
                    } catch (a e11) {
                        Log.e(zza, StubApp.getString2("12444"), e11);
                        throw ((f) new f().initCause(e11));
                    }
                } catch (ClassNotFoundException e12) {
                    Log.e(zza, StubApp.getString2("12445"));
                    throw ((f) new f().initCause(e12));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
