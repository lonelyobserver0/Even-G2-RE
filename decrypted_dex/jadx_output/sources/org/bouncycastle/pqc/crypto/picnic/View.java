package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class View {
    byte[] communicatedBits;
    int[] inputShare;
    int[] outputShare;

    public View(PicnicEngine picnicEngine) {
        int i3 = picnicEngine.stateSizeBytes;
        this.inputShare = new int[i3];
        this.communicatedBits = new byte[picnicEngine.andSizeBytes];
        this.outputShare = new int[i3];
    }
}
