package io.flutter.plugins.firebase.core;

import R4.h;
import androidx.annotation.Keep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import q4.j;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public interface FlutterFirebasePlugin {
    public static final ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

    j didReinitializeFirebaseCore();

    j getPluginConstantsForFirebaseApp(h hVar);
}
