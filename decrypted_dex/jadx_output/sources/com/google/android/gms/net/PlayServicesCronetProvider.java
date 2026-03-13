package com.google.android.gms.net;

import S3.D;
import a4.d;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = StubApp.getString2(12449);
    private static final String TAG = StubApp.getString2(12446);

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        String string2 = StubApp.getString2(12446);
        try {
            CronetProviderInstaller.zzc(this.mContext);
        } catch (f unused) {
            if (Log.isLoggable(string2, 4)) {
                Log.i(string2, StubApp.getString2(12447));
            }
        } catch (g unused2) {
            if (Log.isLoggable(string2, 4)) {
                Log.i(string2, StubApp.getString2(12448));
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            CronetProviderInstaller.zzc(this.mContext);
            Throwable th = null;
            try {
                d zza = CronetProviderInstaller.zza();
                D.h(zza);
                ClassLoader classLoader = zza.f9271a.getClassLoader();
                D.h(classLoader);
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(StubApp.getString2("12449")).asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                builder = null;
                th = e10;
            }
            if (th != null) {
                throw new RuntimeException(StubApp.getString2(12451), th);
            }
            D.i(builder, StubApp.getString2(12450));
            return builder;
        } catch (f e11) {
            throw new IllegalStateException(StubApp.getString2(12452), e11);
        } catch (g e12) {
            throw new IllegalStateException(StubApp.getString2(12453), e12);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public String getName() {
        return StubApp.getString2(12431);
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public String getVersion() {
        tryToInstallCronetProvider();
        return CronetProviderInstaller.zzb();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return CronetProviderInstaller.isInstalled();
    }
}
