package com.mapbox.common.module.cronet;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.stub.StubApp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.CronetProvider;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"CRONET_PLAY_SERVICES_INSTALLER_CLASS", "", "canInstallFromGooglePlay", "Ljava/util/concurrent/atomic/AtomicBoolean;", "disabledProviders", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getDisabledProviders$annotations", "()V", "getDisabledProviders", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "isPlayServicesCronetProviderInstallerAvailable", "", "findCronetProvider", "Lorg/chromium/net/CronetProvider;", "context", "Landroid/content/Context;", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class LazyEngineKt {
    private static final String CRONET_PLAY_SERVICES_INSTALLER_CLASS = StubApp.getString2(13774);
    private static final AtomicBoolean canInstallFromGooglePlay;
    private static final CopyOnWriteArraySet<String> disabledProviders;
    private static final boolean isPlayServicesCronetProviderInstallerAvailable;

    static {
        Object m40constructorimpl;
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        copyOnWriteArraySet.add(StubApp.getString2(13773));
        disabledProviders = copyOnWriteArraySet;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = CronetProviderInstaller.PROVIDER_NAME;
            m40constructorimpl = Result.m40constructorimpl(CronetProviderInstaller.class);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m40constructorimpl = Result.m40constructorimpl(ResultKt.createFailure(th));
        }
        boolean m47isSuccessimpl = Result.m47isSuccessimpl(m40constructorimpl);
        isPlayServicesCronetProviderInstallerAvailable = m47isSuccessimpl;
        canInstallFromGooglePlay = new AtomicBoolean(m47isSuccessimpl);
    }

    public static final CronetProvider findCronetProvider(Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
        Intrinsics.checkNotNullExpressionValue(allProviders, "getAllProviders(context)");
        Iterator<T> it = allProviders.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CronetProvider cronetProvider = (CronetProvider) obj;
            try {
                if (cronetProvider.isEnabled() && !disabledProviders.contains(cronetProvider.getName())) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        return (CronetProvider) obj;
    }

    public static final CopyOnWriteArraySet<String> getDisabledProviders() {
        return disabledProviders;
    }

    public static /* synthetic */ void getDisabledProviders$annotations() {
    }
}
