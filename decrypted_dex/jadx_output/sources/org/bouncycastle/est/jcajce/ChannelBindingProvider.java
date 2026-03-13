package org.bouncycastle.est.jcajce;

import java.net.Socket;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ChannelBindingProvider {
    boolean canAccessChannelBinding(Socket socket);

    byte[] getChannelBinding(Socket socket, String str);
}
