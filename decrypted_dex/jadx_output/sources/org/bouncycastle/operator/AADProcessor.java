package org.bouncycastle.operator;

import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface AADProcessor {
    OutputStream getAADStream();

    byte[] getMAC();
}
