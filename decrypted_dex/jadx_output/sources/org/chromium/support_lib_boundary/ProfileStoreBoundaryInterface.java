package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public interface ProfileStoreBoundaryInterface {
    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    InvocationHandler getOrCreateProfile(String str);

    InvocationHandler getProfile(String str);
}
