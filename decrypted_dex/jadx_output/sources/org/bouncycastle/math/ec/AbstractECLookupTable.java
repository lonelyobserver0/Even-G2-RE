package org.bouncycastle.math.ec;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractECLookupTable implements ECLookupTable {
    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i3) {
        return lookup(i3);
    }
}
