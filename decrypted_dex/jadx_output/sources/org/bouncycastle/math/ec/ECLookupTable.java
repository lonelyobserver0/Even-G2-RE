package org.bouncycastle.math.ec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public interface ECLookupTable {
    int getSize();

    ECPoint lookup(int i3);

    ECPoint lookupVar(int i3);
}
