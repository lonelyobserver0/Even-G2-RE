package org.chromium.net;

import android.content.Context;
import android.util.Log;
import com.stub.StubApp;
import i2.u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class CronetProvider {
    private static final String GMS_CORE_CRONET_PROVIDER_CLASS = StubApp.getString2(35183);
    private static final String JAVA_CRONET_PROVIDER_CLASS = StubApp.getString2(35184);
    private static final String NATIVE_CRONET_PROVIDER_CLASS = StubApp.getString2(35185);
    private static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = StubApp.getString2(35182);
    public static final String PROVIDER_NAME_APP_PACKAGED = StubApp.getString2(35193);
    public static final String PROVIDER_NAME_FALLBACK = StubApp.getString2(13773);
    private static final String RES_KEY_CRONET_IMPL_CLASS = StubApp.getString2(35181);
    private static final String TAG = StubApp.getString2(35194);
    protected final Context mContext;

    public CronetProvider(Context context) {
        if (context == null) {
            throw new IllegalArgumentException(StubApp.getString2(5965));
        }
        this.mContext = context;
    }

    private static boolean addCronetProviderFromResourceFile(Context context, Set<CronetProvider> set) {
        int identifier = context.getResources().getIdentifier(StubApp.getString2(35181), StubApp.getString2(983), context.getPackageName());
        boolean z2 = false;
        if (identifier == 0) {
            return false;
        }
        String string = context.getResources().getString(identifier);
        if (string != null && !string.equals(StubApp.getString2(35182)) && !string.equals(StubApp.getString2(35183)) && !string.equals(StubApp.getString2(35184)) && !string.equals(StubApp.getString2(35185))) {
            z2 = true;
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                Log.e(TAG, StubApp.getString2(35186) + string + StubApp.getString2(35187));
            }
        }
        return z2;
    }

    private static boolean addCronetProviderImplByClassName(Context context, String str, Set<CronetProvider> set, boolean z2) {
        try {
            set.add((CronetProvider) context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException e10) {
            logReflectiveOperationException(str, z2, e10);
            return false;
        } catch (IllegalAccessException e11) {
            logReflectiveOperationException(str, z2, e11);
            return false;
        } catch (InstantiationException e12) {
            logReflectiveOperationException(str, z2, e12);
            return false;
        } catch (NoSuchMethodException e13) {
            logReflectiveOperationException(str, z2, e13);
            return false;
        } catch (InvocationTargetException e14) {
            logReflectiveOperationException(str, z2, e14);
            return false;
        }
    }

    public static List<CronetProvider> getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, StubApp.getString2(35182), linkedHashSet, false);
        addCronetProviderImplByClassName(context, StubApp.getString2(35183), linkedHashSet, false);
        addCronetProviderImplByClassName(context, StubApp.getString2(35185), linkedHashSet, false);
        addCronetProviderImplByClassName(context, StubApp.getString2(35184), linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    private static void logReflectiveOperationException(String str, boolean z2, Exception exc) {
        if (z2) {
            Log.e(TAG, StubApp.getString2(35188) + str, exc);
            return;
        }
        String str2 = TAG;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, StubApp.getString2(35189) + str + StubApp.getString2(35190));
        }
    }

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public String toString() {
        String name = getClass().getName();
        String name2 = getName();
        String version = getVersion();
        boolean isEnabled = isEnabled();
        StringBuilder t3 = u.t(StubApp.getString2(35191), name, StubApp.getString2(1065), name2, StubApp.getString2(2014));
        t3.append(version);
        t3.append(StubApp.getString2(35192));
        t3.append(isEnabled);
        t3.append(StubApp.getString2(511));
        return t3.toString();
    }
}
